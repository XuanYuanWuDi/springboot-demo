package com.injured.server.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONObject;
import com.injured.server.api.contract.AviatorFormulaContract;
import com.injured.server.api.entity.*;
import com.injured.server.api.enums.CalculationFormulaGroupEnum;
import com.injured.server.api.enums.IncomeStatusEnum;
import com.injured.server.api.enums.ResultEnum;
import com.injured.server.api.enums.SendDoctorTypeEnum;
import com.injured.server.api.model.response.BaseResponse;
import com.injured.server.api.model.response.ResponseUtil;
import com.injured.server.provider.aviator.AviatorUtil;
import com.injured.server.provider.mapper.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author zlu
 * @title: AviatorFormulaServiceImpl
 * @projectName injured
 * @description: 计算公式接口
 * @date 2019/7/309:19
 */
@Service
public class AviatorFormulaServiceImpl implements AviatorFormulaContract {

    private static Logger logger = LogManager.getLogger(AviatorFormulaServiceImpl.class);

    @Autowired
    private InjuredCalculationFormulaMapper injuredCalculationFormulaMapper;

    @Autowired
    private InjuredDamagesiteMapper injuredDamagesiteMapper;

    @Autowired
    private CityMapper cityMapper;


    @Autowired
    private InjuredFormulaLogMapper injuredFormulaLogMappper;


    @Autowired
    private InjuredFastCompensatInfoMapper injuredFastCompensatInfoMapper;


    public BaseResponse formula(JSONObject parameter,Long formulaId,String formulaGroupCode) {
        logger.info("计算公式执行BEGIN,参数为{},公式ID为{},分组CODE为 {}",
                JSONObject.toJSONString(parameter),formulaId,formulaGroupCode);

        BaseResponse response = new BaseResponse();

        if(formulaId != null) {
            InjuredCalculationFormula injuredCalculationFormula = injuredCalculationFormulaMapper.selectByPrimaryKey(formulaId);

            if (injuredCalculationFormula == null) {
                return ResponseUtil.error(ResultEnum.NULL);
            }
            Object result = AviatorUtil.executor(injuredCalculationFormula, parameter);
            response = ResponseUtil.success(result);
        }else{
            InjuredCalculationFormulaExample example = new InjuredCalculationFormulaExample();
            example.createCriteria().andCalculationFormulaGroupCodeEqualTo(formulaGroupCode);
            example.setOrderByClause("calculation_formula_group_sort asc");

            List<InjuredCalculationFormula> formulas = injuredCalculationFormulaMapper.selectByExample(example);

            if(formulas == null || formulas.size() == 0){
                return ResponseUtil.error(ResultEnum.NULL);
            }
            BigDecimal bigDecimal = new BigDecimal(0.00);
            for (InjuredCalculationFormula formula:formulas) {
                 //结果累加处理
                 if(CalculationFormulaGroupEnum.ACCUMULATE.getCode() == formula.getCalculationFormulaGroupType()){
                     bigDecimal = AviatorUtil.executorBigDecimal(formula, parameter).add(bigDecimal);
                 }else if(CalculationFormulaGroupEnum.WHETHER_TO_JUDGE.getCode() == formula.getCalculationFormulaGroupType()){
                     //是否判断处理
                    Boolean objResult = AviatorUtil.executorBoolean(formula, parameter);
                    if(!objResult){
                        String comment = "节点".concat(formula.getCalculationFormulaName()).concat("执行返回结果为false");
                        response = new BaseResponse();
                        response.setCode(ResultEnum.SUCCESS.getCode());
                        response.setMsg(comment);
                        response.setData(false);
                        break;
                    }
                 }else if(CalculationFormulaGroupEnum.SUBSTITUTING_ACCUMULATE.getCode() == formula.getCalculationFormulaGroupType()){
                     //代入累加
                     bigDecimal = AviatorUtil.executorBigDecimal(formula, parameter).add(bigDecimal);
                     int len = formula.getCalculationFormula().indexOf("=");
                     String key = formula.getCalculationFormula().substring(0,len);
                     parameter.put(key,bigDecimal);
                 }else if(CalculationFormulaGroupEnum.SUBSTITUTING_ADD.getCode() == formula.getCalculationFormulaGroupType()){
                     //代入加
                     bigDecimal = AviatorUtil.executorBigDecimal(formula, parameter);
                     int len = formula.getCalculationFormula().indexOf("=");
                     String key = formula.getCalculationFormula().substring(0,len);
                     parameter.put(key,bigDecimal);
                 }
            }
            if(response.getData() == null){
                response = ResponseUtil.success(bigDecimal);
            }
        }
        return response;
    }

    @Override
    public BaseResponse formula(Long infoId,String cityCode, String damageSiteCodes,
                                Integer sendDoctorType, Integer incomeStatus, BigDecimal medicalExpensesFee) {
        logger.info("快赔案件{}试运算请求参数为cityCode ={},damageSiteCodes={},sendDoctorType={}," +
                "incomeStatus={},medicalExpensesFee={}",infoId,cityCode,damageSiteCodes,sendDoctorType,incomeStatus,medicalExpensesFee);
        List<String> siteCodes = Arrays.asList(damageSiteCodes.split(","));
        InjuredDamagesiteExample example = new InjuredDamagesiteExample();
        example.createCriteria().andDictCodeIn(siteCodes);
        List<InjuredDamagesite> sites =injuredDamagesiteMapper.selectByExample(example);

        if(sites == null){
            logger.info("快赔案件{}查询damageSiteCodes为{}的数据为空",infoId,damageSiteCodes);
            return ResponseUtil.error(ResultEnum.NULL);
        }

        CityExample cityExample = new CityExample();
        cityExample.createCriteria().andIdEqualTo(cityCode);
        List<City> citys = cityMapper.selectByExample(cityExample);

        if(citys == null || citys.size() != 1){
            logger.info("快赔案件{}查询CITYCODE为{}的城市为空",infoId,cityCode);
            return ResponseUtil.error(ResultEnum.NULL);
        }

        City city = citys.get(0);

        //计算医疗费用
        BigDecimal medicalFee = calculatingMedicalExpenses(infoId,sendDoctorType,sites,medicalExpensesFee);
        logger.info("快赔案件{}计算医疗费用为{}",infoId,medicalFee);
        //计算续医费
        BigDecimal renewalFee = calculatingRenewalFee(infoId,sendDoctorType,sites);
        logger.info("快赔案件{}计算续医费用为{}",infoId,renewalFee);
        //计算营养费
        BigDecimal nutritionFee = calculatingNutritionFee(infoId,sites,city);
        logger.info("快赔案件{}计算营养费用为{}",infoId,nutritionFee);
        //计算误工费
        BigDecimal incomeFee = calculatingIncomeFee(infoId,sites,city,incomeStatus);
        logger.info("快赔案件{}计算误工费用为{}",infoId,incomeFee);
        //计算护理费
        BigDecimal nursingFee = calculatingNursingFee(infoId,sites,city);
        logger.info("快赔案件{}计算护理费用为{}",infoId,nursingFee);
        //计算交通费
        BigDecimal trafficFee = calculatingTrafficFee(infoId,sites,city);
        logger.info("快赔案件{}计算交通费用为{}",infoId,trafficFee);

        BigDecimal sumFee = medicalFee.add(renewalFee).add(nutritionFee).add(incomeFee)
                .add(nursingFee).add(trafficFee).setScale(2);
        logger.info("快赔案件{}计算总费用为{}",infoId,sumFee);

        InjuredFastCompensatInfo injuredFastCompensatInfo =injuredFastCompensatInfoMapper.selectByPrimaryKey(infoId);

        if(injuredFastCompensatInfo == null){
            ResponseUtil.error(ResultEnum.EXCEPTION);
        }

        InjuredFormulaLog injuredFormulaLog = new InjuredFormulaLog();
        injuredFormulaLog.setDamageName(injuredFastCompensatInfo.getDamageName());
        injuredFormulaLog.setDamageNo(injuredFastCompensatInfo.getDamageNo());
        injuredFormulaLog.setClaimNotificationNo(injuredFastCompensatInfo.getClaimNotificationNo());
        injuredFormulaLog.setFastInfoId(infoId);
        injuredFormulaLog.setRegistId(injuredFastCompensatInfo.getRegistId());
        injuredFormulaLog.setMedicalFee(medicalFee);
        injuredFormulaLog.setRenewalFee(renewalFee);
        injuredFormulaLog.setNutritionFee(nutritionFee);
        injuredFormulaLog.setIncomeFee(incomeFee);
        injuredFormulaLog.setNursingFee(nursingFee);
        injuredFormulaLog.setTrafficFee(trafficFee);
        injuredFormulaLog.setSumFee(sumFee);
        injuredFormulaLog.setCreateTime(new Date());

        int result = injuredFormulaLogMappper.insertSelective(injuredFormulaLog);

        if(result != 1){
            ResponseUtil.error(ResultEnum.EXCEPTION);
        }

        return ResponseUtil.success(sumFee);
    }

    private BigDecimal calculatingTrafficFee(Long infoId,List<InjuredDamagesite> sites, City city) {
        BigDecimal result = new BigDecimal(0.00);
        //基础值
        BigDecimal trafficFee = city.getTrafficFee();
        logger.info("快赔案件{},计算交通费,该用户城市{}基础交通费为{}",infoId,city.getCname(),trafficFee);
        //天数
        Optional<InjuredDamagesite> site= sites.stream().max((o1,o2) ->o1.getTrafficDays().compareTo(o2.getTrafficDays()));

        InjuredDamagesite injuredDamagesite = site.get();

        result =injuredDamagesite.getTrafficDays().multiply(trafficFee).setScale(2);

        logger.info("快赔案件{},计算交通费,伤情ID为{},交通费天数为{},交通费为{}",infoId,
                injuredDamagesite.getId(),injuredDamagesite.getTrafficDays(),result);

        return result;
    }

    private BigDecimal calculatingNursingFee(Long infoId,List<InjuredDamagesite> sites, City city) {
        BigDecimal result = new BigDecimal(0.00);
        //基础值
        BigDecimal nursingFee = city.getNursingFee();
        logger.info("快赔案件{},计算护理费,该用户城市{}基础护理费为{}",infoId,city.getCname(),nursingFee);
        //天数
        Optional<InjuredDamagesite> site= sites.stream().max((o1,o2) ->o1.getNursingDays().compareTo(o2.getNursingDays()));

        InjuredDamagesite injuredDamagesite = site.get();

        result = injuredDamagesite.getNursingDays().multiply(nursingFee).setScale(2);

        logger.info("快赔案件{},计算护理费,伤情ID为{},护理费天数为{},护理费为{}",infoId,
                injuredDamagesite.getId(),injuredDamagesite.getNursingDays(),result);
        return result;
    }

    private BigDecimal calculatingIncomeFee(Long infoId,List<InjuredDamagesite> sites, City city,Integer incomeStatus) {
        BigDecimal result = new BigDecimal(0.00);
        BigDecimal basicFee = new BigDecimal(0.00);
        if(incomeStatus == IncomeStatusEnum.FIXED_INCOME_FEE.getCode()){
            //基础值
            basicFee = city.getFixedIncomeFee();
            logger.info("快赔案件{},计算误工费,用户收入类型为固定收入," +
                    "该用户城市{}基础误工费为{}",infoId,city.getCname(),basicFee);
        }else if(incomeStatus == IncomeStatusEnum.NO_FIXED_INCOME_FEE.getCode()){
            //基础值
            basicFee = city.getNoFixedIncomeFee();
            logger.info("快赔案件{},计算误工费,用户收入类型为无固定收入," +
                    "该用户城市{}基础误工费为{}",infoId,city.getCname(),basicFee);
        }else{
            basicFee = city.getNoIncomeFee();
            logger.info("快赔案件{},计算误工费,用户收入类型为收入," +
                    "该用户城市{}基础误工费为{}",infoId,city.getCname(),basicFee);
        }
        //天数
        Optional<InjuredDamagesite> site= sites.stream().max((o1,o2) ->o1.getIncomeDays().compareTo(o2.getIncomeDays()));

        InjuredDamagesite injuredDamagesite = site.get();

        result = injuredDamagesite.getIncomeDays().multiply(basicFee).setScale(2);

        logger.info("快赔案件{},计算误工费,伤情ID为{},误工费天数为{},误工费为{}",infoId,
                injuredDamagesite.getId(),injuredDamagesite.getIncomeDays(),result);

        return result;
    }

    private BigDecimal calculatingNutritionFee(Long infoId,List<InjuredDamagesite> sites, City city) {
        BigDecimal result = new BigDecimal(0.00);
        //基础值
        BigDecimal nutritionFee = city.getNutritionFee();
        logger.info("快赔案件{},计算营养费,该用户城市{}基础营养费为{}",infoId,city.getCname(),nutritionFee);
        //天数
        Optional<InjuredDamagesite> site= sites.stream().max((o1,o2) ->o1.getNutritionDays().compareTo(o2.getNutritionDays()));

        InjuredDamagesite injuredDamagesite = site.get();

        result = injuredDamagesite.getNutritionDays().multiply(nutritionFee).setScale(2);

        logger.info("快赔案件{},计算营养费,伤情ID为{},营养费天数为{},营养费为{}",infoId,
                injuredDamagesite.getId(),injuredDamagesite.getNutritionDays(),result);

        return result;

    }

    private BigDecimal calculatingRenewalFee(Long infoId,Integer sendDoctorType, List<InjuredDamagesite> sites) {
        BigDecimal result = new BigDecimal(0.00);

        //如果送诊方式为门急诊治疗
        if(sendDoctorType == SendDoctorTypeEnum.RENEWAL_FEE.getCode()){
            Optional<InjuredDamagesite> site= sites.stream().max((o1,o2) ->o1.getRenewalFee().compareTo(o2.getRenewalFee()));
            InjuredDamagesite injuredDamagesite = site.get();
            result = site.get().getRenewalFee();
            logger.info("快赔案件{}送诊方式为门诊治疗,续医费取传递伤情中最大值,伤情ID为{},费用为{}",infoId,
                    injuredDamagesite.getId(),result);
        }else{
            //如果送诊方式为未治疗
            Optional<InjuredDamagesite> site= sites.stream().max((o1,o2) ->o1.getUntreatedRenewalFee().compareTo(o2.getUntreatedRenewalFee()));
            InjuredDamagesite injuredDamagesite = site.get();
            result = site.get().getUntreatedRenewalFee();
            logger.info("快赔案件{}送诊方式为未治疗,续医费取传递伤情中最大值,伤情ID为{},费用为{}",infoId,
                    injuredDamagesite.getId(),result);
        }
        return result;
    }


    private BigDecimal calculatingMedicalExpenses(Long infoId,Integer sendDoctorType,List<InjuredDamagesite> sites, BigDecimal medicalExpensesFee) {
       BigDecimal result = new BigDecimal(0.00);
       //如果送诊方式为门急诊治疗
       if(sendDoctorType == SendDoctorTypeEnum.RENEWAL_FEE.getCode()){
           result = medicalExpensesFee;
           logger.info("快赔案件{}送诊方式为门诊治疗,医疗费取已发生费用为{}",infoId,medicalExpensesFee);
       }else{
           //如果送诊方式为未治疗
           Optional<InjuredDamagesite> site= sites.stream().max((o1,o2) ->o1.getUntreatedMedical().compareTo(o2.getUntreatedMedical()));
           InjuredDamagesite injuredDamagesite = site.get();
           result =injuredDamagesite.getUntreatedMedical();
           logger.info("快赔案件{}送诊方式为未治疗,医疗费取传递伤情中最大值,伤情ID为{},费用为{}",infoId,
                   injuredDamagesite.getId(),result);
       }
       return result;
    }
}
