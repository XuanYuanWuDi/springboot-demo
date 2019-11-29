package com.injured.server.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONObject;
import com.injured.commons.ReflectionUtils;
import com.injured.server.api.annotations.CheckNull;
import com.injured.server.api.contract.FastCompensatContract;
import com.injured.server.api.entity.*;
import com.injured.server.api.enums.DictEnum;
import com.injured.server.api.enums.ResultEnum;
import com.injured.server.api.enums.ReviewStatusEnum;
import com.injured.server.api.enums.TaskStatusEnum;
import com.injured.server.api.exception.BusinessException;
import com.injured.server.api.model.request.fast.*;
import com.injured.server.api.model.response.BaseResponse;
import com.injured.server.api.model.response.ResponseUtil;
import com.injured.server.provider.aop.validation.CheckNullForList;
import com.injured.server.provider.db.annotation.DataSource;
import com.injured.server.provider.mapper.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author zlu
 * @title: FastCompensatServiceImpl
 * @projectName injured
 * @description: 快赔案件
 * @date 2019/7/2215:12
 */
@Service
public class FastCompensatServiceImpl implements FastCompensatContract {


    private static Logger logger = LogManager.getLogger(FastCompensatServiceImpl.class);

    @Autowired
    private CeRegistMapper ceRegistMapper;

    @Autowired
    private CeRegistSurveyMapper ceRegistSurveyMapper;

    @Autowired
    private CeRegistSurveyCarMapper ceRegistSurveyCarMapper;

    @Autowired
    private CeRegistSurveyCarDriverMapper ceRegistSurveyCarDriverMapper;

    @Autowired
    private CeRegistSurveyLossMapper ceRegistSurveyLossMapper;

    @Autowired
    private CeInsuranceMapper ceInsuranceMapper;

    @Autowired
    private CeInsuranceItemMapper ceInsuranceItemMapper;

    @Autowired
    private CeInsuranceModificationMapper ceInsuranceModificationMapper;

    @Autowired
    private CeInsuranceSpecialMapper ceInsuranceSpecialMapper;

    @Autowired
    private InjuredFastCompensatInfoMapper injuredFastCompensatInfoMapper;

    @Autowired
    private CeDictConvertMapper ceDictConvertMapper;

    @Autowired
    private CeInsuranceCompanyMapper ceInsuranceCompanyMapper;

    @Autowired
    private CeInsuranceDangerHistMapper ceInsuranceDangerHistMapper;

    @Autowired
    private CompanyCityMapper companyCityMapper;

    @Autowired
    private InjuredTreatDiagnosisInfoMapper injuredTreatDiagnosisInfoMapper;

    @Autowired
    private CeRegistMessageMapper ceRegistMessageMapper;


    @Autowired
    private CompanyAgencyMapper companyAgencyMapper;

    /**
    　　* @description: 1.保存ce_regist表,报案基础信息
                        2.保存ce_regist_survey表,查勘信息表
                        3.保存ce_regist_survey_car表,查勘车辆信息表
                        4.保存ce_regist_survey_car_driver表,查勘车辆驾驶员信息表
                        5.保存ce_regist_survey_loss表,物损表
                        6.保存ce_insurance表,保单信息表
                        7.保存ce_insurance_item表,保单险别信息表
                        8.保存ce_insurance_modification表,保单险别信息
                        9.保存ce_insurance_special表,保单特别约定信息,事务结束
                        10.保存injured_fast_compensat_info表,快赔信息表
    　　* @param [fastCompensatInfoRequest]
    　　* @return com.injured.server.api.model.response.BaseResponse
    　　* @throws
    　　* @author LZX
    　　* @date 2019/7/22 15:17 
    　　*/
    @Override
    @CheckNull
    public BaseResponse fastCompensat(@CheckNull(group = "fastInfo")FastCompensatInfoRequest fastCompensatInfoRequest)throws Exception {
        BaseResponse baseResponse = new BaseResponse();

        InjuredFastCompensatInfoExample example = new InjuredFastCompensatInfoExample();
        example.createCriteria().andTaskNoEqualTo(fastCompensatInfoRequest.getTaskNo());
        List<InjuredFastCompensatInfo> infos = injuredFastCompensatInfoMapper.selectByExample(example);

        if(infos != null && infos.size() != 0){
            return ResponseUtil.error(ResultEnum.TASK_NO_IS_EXSIT);
        }

        logger.info("保险公司{}订单号为{}请求快赔业务参数校验BEGIN",fastCompensatInfoRequest.getInsuranceCompanyID(),
                fastCompensatInfoRequest.getTaskNo());
        String result = checkListParam(fastCompensatInfoRequest);
        if(StringUtils.isNotBlank(result)){
            baseResponse.setCode(ResultEnum.PARAM_NULL.getCode());
            baseResponse.setMsg(result);
            return baseResponse;
        }
        logger.info("保险公司{}订单号为{}请求快赔业务参数校验BEGIN",fastCompensatInfoRequest.getInsuranceCompanyID(),
                fastCompensatInfoRequest.getTaskNo());

        //-----------------------------------------------------------------------------------------------------------------------

        logger.info("保险公司{}订单号为{}请求快赔业务接口处理BEGIN",fastCompensatInfoRequest.getInsuranceCompanyID(),
                fastCompensatInfoRequest.getTaskNo());


        if(StringUtils.isNotBlank(baseResponse.getCode())){
            logger.info("保险公司{}订单号为{}请求快赔业务接口处理检查参数失败",fastCompensatInfoRequest.getInsuranceCompanyID(),
                    fastCompensatInfoRequest.getTaskNo());
            return baseResponse;
        }

        //进行转码
        logger.info("保险公司{}订单号为{}请求快赔业务接口处理转码BEGIN",fastCompensatInfoRequest.getInsuranceCompanyID(),
                fastCompensatInfoRequest.getTaskNo());
        transcoding(fastCompensatInfoRequest);
        logger.info("保险公司{}订单号为{}请求快赔业务接口处理转码END",fastCompensatInfoRequest.getInsuranceCompanyID(),
                fastCompensatInfoRequest.getTaskNo());

        //-----------------------------------------------------------------------------------------------------------------------

        //插入数据
        logger.info("保险公司{}订单号为{}请求快赔业务接口处理CE基础信息表BEGIN",fastCompensatInfoRequest.getInsuranceCompanyID(),
                fastCompensatInfoRequest.getTaskNo());
        Map<String,Long> resultMap = ((FastCompensatServiceImpl) AopContext.currentProxy()).ceTableExecutor(fastCompensatInfoRequest);
        if(resultMap.size() != 2){
            baseResponse = ResponseUtil.error(ResultEnum.FAILED);
            return baseResponse;
        }
        logger.info("保险公司{}订单号为{}请求快赔业务接口处理CE基础信息表END",fastCompensatInfoRequest.getInsuranceCompanyID(),
                fastCompensatInfoRequest.getTaskNo());

        //-----------------------------------------------------------------------------------------------------------------------

        logger.info("保险公司{}订单号为{}请求快赔业务接口处理快赔信息表BEGIN",fastCompensatInfoRequest.getInsuranceCompanyID(),
                fastCompensatInfoRequest.getTaskNo());
        try {
            ((FastCompensatServiceImpl) AopContext.currentProxy()).injuredTableExecutor(fastCompensatInfoRequest, resultMap);
            logger.info("保险公司{}订单号为{}请求快赔业务接口处理快赔信息表END", fastCompensatInfoRequest.getInsuranceCompanyID(),
                    fastCompensatInfoRequest.getTaskNo());
        }catch (Exception e){
            e.printStackTrace();
            Long registId = resultMap.get("registId");
            Long surveyId = resultMap.get("surveyId");
            ((FastCompensatServiceImpl) AopContext.currentProxy()).removeCeTable(registId,surveyId);
            return ResponseUtil.error(ResultEnum.EXCEPTION);
        }

        //-----------------------------------------------------------------------------------------------------------------------

        baseResponse = ResponseUtil.success("");
        logger.info("保险公司{}订单号为{}请求快赔业务接口处理END",fastCompensatInfoRequest.getInsuranceCompanyID(),
                fastCompensatInfoRequest.getTaskNo());
        return baseResponse;
    }

    //验证对象中多级List对象参数中参数必填
    private String checkListParam(FastCompensatInfoRequest fastCompensatInfoRequest) {
        try {
            //保单信息
            List<CommercialInsurance> commercialInsurances = fastCompensatInfoRequest.getCommercialInsurances();
            String result = CheckNullForList.checkListObjectParamNull(commercialInsurances);

            if(StringUtils.isNotBlank(result)){
                return result;
            }

            //物损信息
            List<Loss> losses = fastCompensatInfoRequest.getLosses();
            result = CheckNullForList.checkListObjectParamNull(losses);

            if(StringUtils.isNotBlank(result)){
                return result;
            }

            for (CommercialInsurance commercialInsurance:commercialInsurances ) {
                 //出险记录
                 List<HistoricalClaim> historicalClaims  = commercialInsurance.getHistoricalClaims();
                 result = CheckNullForList.checkListObjectParamNull(historicalClaims);

                 if(StringUtils.isNotBlank(result)){
                    return result;
                 }

                 //险种信息
                 List<InsuranceItem> insuranceItems = commercialInsurance.getInsuranceItems();

                 result = CheckNullForList.checkListObjectParamNull(insuranceItems);

                 if(StringUtils.isNotBlank(result)){
                    return result;
                 }


                  //批单信息
                 List<InsuranceModification> insuranceModifications = commercialInsurance.getInsuranceModifications();
                 result = CheckNullForList.checkListObjectParamNull(insuranceModifications);

                 if(StringUtils.isNotBlank(result)){
                    return result;
                 }


                 //特别约定
                 List<SpecialAgreement> specialAgreements = commercialInsurance.getSpecialAgreements();
                 result = CheckNullForList.checkListObjectParamNull(insuranceModifications);

                 if(StringUtils.isNotBlank(result)){
                    return result;
                 }
            }

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return null;
    }


    //转码
    public void transcoding(FastCompensatInfoRequest fastCompensatInfoRequest)throws Exception{
        String companyId = fastCompensatInfoRequest.getInsuranceCompanyID();
        //基础字典转换(多层对象)
        for(DictEnum dictEnum:DictEnum.values()){
            dict(companyId,dictEnum,fastCompensatInfoRequest);
        }
        //转换List对象
        List<CommercialInsurance> commercialInsurances = fastCompensatInfoRequest.getCommercialInsurances();
        for (DictEnum dictEnum:DictEnum.values()) {
            if(dictEnum != DictEnum.insuranceItemCode && dictEnum != DictEnum.theInsuredNoType &&
               dictEnum != DictEnum.isContinuousPolicy && dictEnum != DictEnum.vehicleColor &&
               dictEnum != DictEnum.channels && dictEnum != DictEnum.isTransfer && dictEnum != DictEnum.InsuranceItem ){
                continue;
            }
            for (CommercialInsurance commercialInsurance:commercialInsurances) {
                if(dictEnum == DictEnum.InsuranceItem){
                    List<InsuranceItem> insuranceItems = commercialInsurance.getInsuranceItems();
                    for (InsuranceItem insuranceItem:insuranceItems) {
                         dict(companyId,dictEnum,insuranceItem);
                    }
                }else{
                    //险种
                    dict(companyId,dictEnum,commercialInsurance);
                }
            }
        }
        //诊断信息
        List<TreatDiagnosisInfo> treatDiagnosisInfos = fastCompensatInfoRequest.getInjury().getTreatDiagnosisInfos();
        if(treatDiagnosisInfos != null) {
            for (TreatDiagnosisInfo treatDiagnosisInfo:treatDiagnosisInfos) {
                for (DictEnum dictEnum : DictEnum.values()) {
                    if (dictEnum == DictEnum.damageSite ||
                            dictEnum == DictEnum.damageSiteSecond ||
                            dictEnum == DictEnum.damageType ||
                            dictEnum == DictEnum.primaryDiagnosis) {
                         dict(companyId, dictEnum, treatDiagnosisInfo);
                    }
                }
            }

        }
        //省市区码转换
        Injury injury = fastCompensatInfoRequest.getInjury();
        if(StringUtils.isNotBlank(injury.getPerResidenceProvince())){
            CompanyCityExample example = new CompanyCityExample();
            example.createCriteria().andCompanyIdEqualTo(Long.valueOf(companyId))
                                    .andIdEqualTo(injury.getPerResidenceProvince());
            List<CompanyCity> citys = companyCityMapper.selectByExample(example);
            if(citys != null && citys.size() >0) {
                CompanyCity city = citys.get(0);
                injury.setPerResidenceProvince(city.getCeCityId());
                fastCompensatInfoRequest.setInjury(injury);
            }
        }

        if(StringUtils.isNotBlank(injury.getPerResidenceCity())){
            CompanyCityExample example = new CompanyCityExample();
            example.createCriteria().andCompanyIdEqualTo(Long.valueOf(companyId))
                    .andIdEqualTo(injury.getPerResidenceCity());
            List<CompanyCity> citys = companyCityMapper.selectByExample(example);
            if(citys != null && citys.size() >0) {
                CompanyCity city = citys.get(0);
                injury.setPerResidenceCity(city.getCeCityId());
                fastCompensatInfoRequest.setInjury(injury);
            }
        }

        if(StringUtils.isNotBlank(injury.getPerResidenceDistrict())){
            CompanyCityExample example = new CompanyCityExample();
            example.createCriteria().andCompanyIdEqualTo(Long.valueOf(companyId))
                    .andIdEqualTo(injury.getPerResidenceDistrict());
            List<CompanyCity> citys = companyCityMapper.selectByExample(example);
            if(citys != null && citys.size() >0) {
                CompanyCity city = citys.get(0);
                injury.setPerResidenceDistrict(city.getCeCityId());
                fastCompensatInfoRequest.setInjury(injury);
            }
        }

        if(StringUtils.isNotBlank(injury.getPerResidenceTown())){
            CompanyCityExample example = new CompanyCityExample();
            example.createCriteria().andCompanyIdEqualTo(Long.valueOf(companyId))
                    .andIdEqualTo(injury.getPerResidenceTown());
            List<CompanyCity> citys = companyCityMapper.selectByExample(example);
            if(citys != null && citys.size() >0) {
                CompanyCity city = citys.get(0);
                injury.setPerResidenceTown(city.getCeCityId());
                fastCompensatInfoRequest.setInjury(injury);
            }
        }

        if(StringUtils.isNotBlank(injury.getClaimProvince())){
            CompanyCityExample example = new CompanyCityExample();
            example.createCriteria().andCompanyIdEqualTo(Long.valueOf(companyId))
                    .andIdEqualTo(injury.getClaimProvince());
            List<CompanyCity> citys = companyCityMapper.selectByExample(example);
            if(citys != null && citys.size() >0) {
                CompanyCity city = citys.get(0);
                injury.setClaimProvince(city.getCeCityId());
                fastCompensatInfoRequest.setInjury(injury);
            }
        }


        if(StringUtils.isNotBlank(injury.getClaimCity())){
            CompanyCityExample example = new CompanyCityExample();
            example.createCriteria().andCompanyIdEqualTo(Long.valueOf(companyId))
                    .andIdEqualTo(injury.getClaimCity());
            List<CompanyCity> citys = companyCityMapper.selectByExample(example);
            if(citys != null && citys.size() >0) {
                CompanyCity city = citys.get(0);
                injury.setClaimCity(city.getCeCityId());
                fastCompensatInfoRequest.setInjury(injury);
            }
        }
    }

    public void dict(String companyId,DictEnum dictEnum,Object object)throws  Exception{
        CeDictConvertExample example = new CeDictConvertExample();
        example.createCriteria().andCompanyIdEqualTo(Integer.valueOf(companyId))
                .andCeTypeCodeEqualTo(dictEnum.getCeTypeCode());
        List<CeDictConvert> dictConverts = ceDictConvertMapper.selectByExample(example);
        if(object == null || dictConverts == null || dictConverts.size() == 0) {
            return;
        }
        Object obj = ReflectionUtils.getObjectParam(object, dictEnum.getInsuranceDictCode());
        for (CeDictConvert ceDictConvert : dictConverts) {
            if (ceDictConvert.getInsuranceDictCode().equals(obj)) {
                Map<String, Object> map = new HashMap<>();
                logger.info("转码处理中,该次处理转码为{},保险公司码为{},CE码为{}", dictEnum.getInsuranceDictCode(),
                        ceDictConvert.getInsuranceDictCode(), ceDictConvert.getCeDictCode());
                map.put(dictEnum.getInsuranceDictCode(), ceDictConvert.getCeDictCode());
                if(dictEnum == DictEnum.InsuranceItem){
                    map.put("name", ceDictConvert.getInsuranceDictName());
                }
                ReflectionUtils.setPrivateParam(object, map);
            }
        }
    }

    //操作Injured表
    @Override
    @Transactional
    @DataSource("master")
    public void injuredTableExecutor(FastCompensatInfoRequest fastCompensatInfoRequest,Map<String,Long> resultMap){
        Long registId = resultMap.get("registId");
        Long surveyId = resultMap.get("surveyId");

        Injury injury = fastCompensatInfoRequest.getInjury();

        InjuredFastCompensatInfo injuredFastCompensatInfo = new InjuredFastCompensatInfo();
        injuredFastCompensatInfo.setRegistId(registId);
        injuredFastCompensatInfo.setClaimNotificationNo(fastCompensatInfoRequest.getClaimNumber());
        injuredFastCompensatInfo.setTaskNo(fastCompensatInfoRequest.getTaskNo());
        injuredFastCompensatInfo.setSurveyId(surveyId);
        injuredFastCompensatInfo.setCompantCode(fastCompensatInfoRequest.getInsuranceCompanyCode());
        if (StringUtils.isNotBlank(fastCompensatInfoRequest.getInsuranceCompanyID())) {
            injuredFastCompensatInfo.setCompanyId(Long.valueOf(fastCompensatInfoRequest.getInsuranceCompanyID()));
        }
        injuredFastCompensatInfo.setCompanyAgencyCode(fastCompensatInfoRequest.getBranchCompanyCode());


        CompanyAgencyReq req = companyAgencyMapper.findAgencyByCodeOrName(fastCompensatInfoRequest.getBranchCompanyCode(),null,
                Long.valueOf(fastCompensatInfoRequest.getInsuranceCompanyID()));

        if(req == null){
            logger.info("保险公司{}订单号为{}请求快赔业务接口查询机构信息为空",fastCompensatInfoRequest.getInsuranceCompanyID(),
                    fastCompensatInfoRequest.getTaskNo());
            throw new BusinessException(ResultEnum.NULL);
        }
        injuredFastCompensatInfo.setCompanyAgencyId(req.getId());
        //转码
        if (StringUtils.isNotBlank(injury.getMainDrivingStatus())) {
            injuredFastCompensatInfo.setMainDrivingStatus(Integer.valueOf(injury.getMainDrivingStatus()));
        }
        //转码
        if (StringUtils.isNotBlank(injury.getWouTransportat())) {
            injuredFastCompensatInfo.setWouTransportat(Integer.valueOf(injury.getWouTransportat()));
        }
        //转码
        if (StringUtils.isNotBlank(injury.getSurveyFirstAddress())) {
            injuredFastCompensatInfo.setSurveyFirstAddress(Integer.valueOf(injury.getSurveyFirstAddress()));
        }
        injuredFastCompensatInfo.setVisitTime(injury.getVisitTime());
        injuredFastCompensatInfo.setMedicalExpensesFee(injury.getMedicalExpensesFee());
        //转码
        if (StringUtils.isNotBlank(injury.getIncomeStatus())) {
            injuredFastCompensatInfo.setIncomeStatus(Integer.valueOf(injury.getIncomeStatus()));
        }
        //转码
        if (StringUtils.isNotBlank(injury.getEngagedIndustry())) {
            injuredFastCompensatInfo.setEngagedIndustry(Integer.valueOf(injury.getEngagedIndustry()));
        }
        injuredFastCompensatInfo.setMonthlyIncome(injury.getMonthlyIncome());
        injuredFastCompensatInfo.setReceiptName(injury.getReceiptName());
        injuredFastCompensatInfo.setReceiptAccount(injury.getReceiptAccount());
        injuredFastCompensatInfo.setReceiptBank(injury.getReceiptBank());
        
        /**
         * 默认值
         */
        injuredFastCompensatInfo.setLossFirstType("A02");//调解
        injuredFastCompensatInfo.setLossSecondType("A0201");//现场

        injuredFastCompensatInfo.setAveragePayAmount(injury.getA0veragePayAmount());
        //转码
        if (StringUtils.isNotBlank(injury.getHumanInjury())) {
            injuredFastCompensatInfo.setHumanInjury(Integer.valueOf(injury.getHumanInjury()));
        }
        //转码
        if (StringUtils.isNotBlank(injury.getHumanType())) {
            injuredFastCompensatInfo.setHumanType(Integer.valueOf(injury.getHumanType()));
        }
        //转码
        if (StringUtils.isNotBlank(injury.getSendDoctorType())) {
            injuredFastCompensatInfo.setSendDoctorType(Integer.valueOf(injury.getSendDoctorType()));
        }
        injuredFastCompensatInfo.setHumanName(injury.getHumanName());
        //转码
        if (StringUtils.isNotBlank(injury.getIdCardType())) {
            injuredFastCompensatInfo.setIdCardType(injury.getIdCardType());
        }
        injuredFastCompensatInfo.setIdCard(injury.getIdCard());
        //转码
        if (StringUtils.isNotBlank(injury.getHumanSex())) {
            injuredFastCompensatInfo.setHumanSex(Integer.valueOf(injury.getHumanSex()));
        }
        injuredFastCompensatInfo.setBirthDate(injury.getBirthDate());
        injuredFastCompensatInfo.setHumanAge(injury.getHumanAge());
        injuredFastCompensatInfo.setContacNumber(injury.getContacNumber());
        //转码
        if (StringUtils.isNotBlank(injury.getResideNature())) {
            injuredFastCompensatInfo.setResideNature(Integer.valueOf(injury.getResideNature()));
        }
        //转码
        if (StringUtils.isNotBlank(injury.getPerResidenceProvince())) {
            injuredFastCompensatInfo.setPerResidenceProvince(injury.getPerResidenceProvince());
        }
        //转码
        if (StringUtils.isNotBlank(injury.getPerResidenceCity())) {
            injuredFastCompensatInfo.setPerResidenceCity(injury.getPerResidenceCity());
        }
        //转码
        if (StringUtils.isNotBlank(injury.getPerResidenceDistrict())) {
            injuredFastCompensatInfo.setPerResidenceDistrict(injury.getPerResidenceDistrict());
        }
        //转码
        if (StringUtils.isNotBlank(injury.getPerResidenceTown())) {
            injuredFastCompensatInfo.setPerResidenceTown(injury.getPerResidenceTown());
        }
        injuredFastCompensatInfo.setPerResidenceAddress(injury.getPerResidenceAddress());
        injuredFastCompensatInfo.setHospitalName(injury.getHospitalName());
        injuredFastCompensatInfo.setSendDoctorTime(injury.getSendDoctorTime());
        //转码
        if (StringUtils.isNotBlank(injury.getHospitalDepartmentFirst())) {
            injuredFastCompensatInfo.setHospitalDepartmentFirst(injury.getHospitalDepartmentFirst());
        }
        injuredFastCompensatInfo.setHospitalDepartmentFirstName(injury.getHospitalDepartmentFirstName());
        //转码
        if (StringUtils.isNotBlank(injury.getHospitalDepartmentSecond())) {
            injuredFastCompensatInfo.setHospitalDepartmentSecond(injury.getHospitalDepartmentSecond());
        }
        injuredFastCompensatInfo.setHospitalDepartmentSecondName(injury.getHospitalDepartmentSecondName());

        injuredFastCompensatInfo.setDamageDesc(injury.getDamageDesc());
        injuredFastCompensatInfo.setDamageName(injury.getDamageName());
        injuredFastCompensatInfo.setDamageNo(injury.getDamageNo());
        injuredFastCompensatInfo.setFixedLossReceivTime(new Date());
        injuredFastCompensatInfo.setTaskStatus(TaskStatusEnum.TO_PROCESSED.getCode());
        injuredFastCompensatInfo.setCreateTime(new Date());
        injuredFastCompensatInfo.setNotifyUrl(fastCompensatInfoRequest.getNotifyUrl());
        injuredFastCompensatInfo.setReturnUrl(fastCompensatInfoRequest.getReturnUrl());

        //转码
        if (StringUtils.isNotBlank(injury.getAccidentLiability())) {
            injuredFastCompensatInfo.setAccidentLiability(injury.getAccidentLiability());
        }
        //转码
        if (StringUtils.isNotBlank(injury.getCeAccidentType())) {
            injuredFastCompensatInfo.setCeAccidentType(injury.getCeAccidentType());
        }
        //转码
        injuredFastCompensatInfo.setClaimProvince(injury.getClaimProvince());
        //转码
        injuredFastCompensatInfo.setClaimCity(injury.getClaimCity());
        injuredFastCompensatInfo.setCreateTime(new Date());

        injuredFastCompensatInfo.setTheInsuredName(injury.getTheInsuredName());
        injuredFastCompensatInfo.setClaimsAgency(injury.getClaimsAgency());
        injuredFastCompensatInfo.setReportDate(fastCompensatInfoRequest.getReport().getReportDate());
        injuredFastCompensatInfo.setCompanyAgencyName(fastCompensatInfoRequest.getBranchCompanyname());
        injuredFastCompensatInfo.setLossTime(fastCompensatInfoRequest.getReport().getEventDate());

        //查询所有历史金额,计算例均赔付金额
        //InjuredFastCompensatInfoExample example = new InjuredFastCompensatInfoExample();
//        example.createCriteria().andCompanyIdEqualTo(Long.valueOf(fastCompensatInfoRequest.getInsuranceCompanyID()))
//                                .andReviewStatusEqualTo(ReviewStatusEnum.SECOND_REVIEWED.getCode());
        //List<InjuredFastCompensatInfo> infos = injuredFastCompensatInfoMapper.selectByExample(example);

       /* BigDecimal averagePayAmount = new BigDecimal(0.00);

        for (InjuredFastCompensatInfo info:infos) {
             if(info.getDamageAmount() != null) {
                 averagePayAmount = info.getDamageAmount().add(averagePayAmount);
             }
        }*/
        //injuredFastCompensatInfo.setAveragePayAmount(averagePayAmount);
        injuredFastCompensatInfo.setLossLiability(injury.getLossLiability());
        injuredFastCompensatInfo.setTaskTypeFirst(fastCompensatInfoRequest.getTaskType());

        int result = injuredFastCompensatInfoMapper.insertSelective(injuredFastCompensatInfo);
        if (result != 1) {
            logger.info("保险公司{}订单号为{}请求快赔业务接口处理快赔信息表失败",fastCompensatInfoRequest.getInsuranceCompanyID(),
                    fastCompensatInfoRequest.getTaskNo());
            throw new BusinessException(ResultEnum.INSERT_TALBLE_ERROR);
        }


        //保存诊断信息
        List<TreatDiagnosisInfo>  treatDiagnosisInfos = fastCompensatInfoRequest.getInjury().getTreatDiagnosisInfos();

        if(treatDiagnosisInfos != null){
            for (TreatDiagnosisInfo treatDiagnosisInfo:treatDiagnosisInfos) {
                InjuredTreatDiagnosisInfo injuredTreatDiagnosisInfo = new InjuredTreatDiagnosisInfo();
                BeanUtils.copyProperties(treatDiagnosisInfo,injuredTreatDiagnosisInfo);
                injuredTreatDiagnosisInfo.setCreateTime(new Date());
                injuredTreatDiagnosisInfo.setClaimNotificationNo(injuredFastCompensatInfo.getClaimNotificationNo());
                injuredTreatDiagnosisInfo.setRegistId(injuredFastCompensatInfo.getRegistId());
                injuredTreatDiagnosisInfo.setInfoId(injuredFastCompensatInfo.getId());
                injuredTreatDiagnosisInfo.setCompantCode(injuredFastCompensatInfo.getCompantCode());
                injuredTreatDiagnosisInfo.setCompanyId(injuredFastCompensatInfo.getCompanyId());
                int infoResult  = injuredTreatDiagnosisInfoMapper.insertSelective(injuredTreatDiagnosisInfo);
                if (infoResult != 1) {
                    logger.info("保险公司{}订单号为{}请求快赔业务接口处理快赔信息表失败",fastCompensatInfoRequest.getInsuranceCompanyID(),
                            fastCompensatInfoRequest.getTaskNo());
                    throw new BusinessException(ResultEnum.INSERT_TALBLE_ERROR);
                }
            }
        }
    }


    //操作CE表
    @Override
    @Transactional
    @DataSource("slave")
    public Map<String,Long> ceTableExecutor(FastCompensatInfoRequest fastCompensatInfoRequest){
        Map<String, Long> resultMap = new HashMap<>();

        Report report = fastCompensatInfoRequest.getReport();
        //报案号
        String claimNotificationNo = fastCompensatInfoRequest.getClaimNumber();
        String registrationNumber = fastCompensatInfoRequest.getRegistrationNumber();
        Driver driver = fastCompensatInfoRequest.getCheck().getDriver();
        Check check = fastCompensatInfoRequest.getCheck();
        Vehicle vehicle = fastCompensatInfoRequest.getVehicle();


        //查询报案和查勘信息是否已存在
        CeRegistExample ceRegistExample = new CeRegistExample();
        ceRegistExample.createCriteria().andClaimNotificationNoEqualTo(claimNotificationNo);
        List<CeRegist> ceRegists = ceRegistMapper.selectByExample(ceRegistExample);

        if(ceRegists != null && !ceRegists.isEmpty()){
            Long registId = ceRegists.get(0).getId();
            resultMap.put("registId", registId);
            CeRegistSurveyExample ceRegistSurveyExample = new CeRegistSurveyExample();
            ceRegistSurveyExample.createCriteria().andRegistIdEqualTo(registId);
            List<CeRegistSurvey> ceRegistSurveys = ceRegistSurveyMapper.selectByExample(ceRegistSurveyExample);
            if(ceRegistSurveys != null && !ceRegists.isEmpty()) {
                resultMap.put("surveyId", ceRegistSurveys.get(0).getId());
            }
            return resultMap;
        }

        CeInsuranceCompanyExample ceInsuranceCompanyExample = new CeInsuranceCompanyExample();
        ceInsuranceCompanyExample.createCriteria().andIdEqualTo(Integer.valueOf(fastCompensatInfoRequest.
                getInsuranceCompanyID()));
        List<CeInsuranceCompany> companys = ceInsuranceCompanyMapper.selectByExample(ceInsuranceCompanyExample);
        if(companys == null || companys.size() == 0){
            return resultMap;
        }
        CeInsuranceCompany company = companys.get(0);

        //----------------------------------------------------报案表BEGIN--------------------------------------------------
        CeRegist ceRegist = new CeRegist();
        ceRegist.setClaimNotificationNo(claimNotificationNo);
        ceRegist.setHurtNum(report.getHurtNum());
        //转码
        ceRegist.setIsPersonInjured(report.getIsPersonInjured());
        //转码
        ceRegist.setIsProtectLoss(report.getIsProtectLoss());
        ceRegist.setContactPerson(report.getContactPerson());
        ceRegist.setContactTel(report.getContactTel());
        ceRegist.setDangerAddress(report.getEventAddress());
        //转码
        ceRegist.setEventAddressType(report.getEventAddressType());
        ceRegist.setDangerTime(report.getEventDate());
        ceRegist.setDangerDesc(report.getEventDescription());
        //转码
        ceRegist.setDangerCause(report.getEventReason());
        //转码
        ceRegist.setEventReasonType(report.getEventReasonType());
        //转码
        ceRegist.setAccidentLiability(report.getEventResponsibility());
        ceRegist.setReporter(report.getInformant());
        //转码
        ceRegist.setInformantIsDriver(report.getInformantIsDriver());
        //转码
        ceRegist.setInformantIsNsured(report.getInformantIsInsured());
        ceRegist.setReporterPhone(report.getInformantTel());
        //转码
        ceRegist.setIsClosed(report.getIsClosed());
        //转码
        ceRegist.setRegistSource(report.getRegistSource());
        ceRegist.setNotificationTime(report.getReportDate());
        ceRegist.setCreateTime(new Date());
        ceRegist.setIsPolice(report.getIsPolice());
        ceRegist.setCompanyCode(company.getCode());
        ceRegist.setCompanyId(company.getId());
        ceRegist.setDriverName(report.getDriverName());
        ceRegist.setDriverGender(report.getDriverGender());
        ceRegist.setCaseType(report.getCaseType());
        ceRegist.setIsLocaleSurvey(report.getIsLocaleSurvey());
        ceRegist.setIsOutofLocalClaim(report.getIsOutofLocalClaim());
        ceRegist.setSubrogationFlag(report.getSubrogationFlag());
        ceRegist.setIsSimpleClaim(report.getIsSimpleClaim());
        ceRegist.setFirstSceneInd(report.getFirstSceneInd());
        ceRegist.setIsSubjectNormal(report.getIsSubjectNormal());
        ceRegist.setIsRescue(report.getIsRescue());
        ceRegist.setIsSelfSurvey(report.getIsSelfSurvey());
        ceRegist.setIsPayment(report.getIsPayment());
        ceRegist.setIsDriverLocale(report.getIsDriverLocale());
        ceRegist.setIsMainReport(report.getIsMainReport());
        ceRegist.setIsLocaleSurvey(report.getIsLocaleSurvey());
        ceRegist.setIsInsuredPhone(report.getIsInsuredPhone());
        ceRegist.setReportType(report.getRegistSource());
        ceRegist.setInformantMobilTel(report.getInformantTel());
        ceRegist.setCaseType(report.getCaseType());
        ceRegist.setDangerAddressType(report.getDangerAddressType());

        int registResult = ceRegistMapper.insertSelective(ceRegist);
        if (registResult != 1) {
            logger.info("保险公司{}订单号为{}请求快赔业务接口处理报案信息表失败",fastCompensatInfoRequest.getInsuranceCompanyID(),
                    fastCompensatInfoRequest.getTaskNo());
            throw new BusinessException(ResultEnum.INSERT_TALBLE_ERROR);
        }
        Long registId = ceRegist.getId();
        //----------------------------------------------------报案表END--------------------------------------------------
        //----------------------------------------------------查勘表BEGIN--------------------------------------------------
        CeRegistSurvey ceRegistSurvey = new CeRegistSurvey();
        ceRegistSurvey.setRegistId(registId);
        ceRegistSurvey.setClaimNotificationNo(claimNotificationNo);
        ceRegistSurvey.setCheckAddr(check.getCheckAddress());
        ceRegistSurvey.setCheckerName(check.getCheckEmployee1Name());
        ceRegistSurvey.setCheckerCode(check.getCheckEmployee1Code());
        ceRegistSurvey.setCheckerPhone1(check.getCheckEmployee1Phone());
        ceRegistSurvey.setCheckerName2(check.getCheckEmployee2Name());
        ceRegistSurvey.setCheckerCode2(check.getCheckEmployee2Code());
        ceRegistSurvey.setCheckerPhone2(check.getCheckEmployee2Phone());
        //转码
        ceRegistSurvey.setCheckType(check.getCheckType());
        ceRegistSurvey.setContactPerson(check.getContactPerson());
        ceRegistSurvey.setContactTel(check.getContactTel());
        //转码
        ceRegistSurvey.setEventProcessMode(check.getDisposeType());
        //转码
        ceRegistSurvey.setEventAddressType(check.getEventAddressType());
        //转码
        ceRegistSurvey.setDangerCause(check.getEventReason());
        //转码
        ceRegistSurvey.setEventAccidentLiability(check.getEventResponsibility());
        //转码
        ceRegistSurvey.setEventType(check.getEventType());
        //转码
        if(StringUtils.isNotBlank(check.getIsPersonInjured())) {
            ceRegistSurvey.setIsPersonInjured("0".equals(check.getIsPersonInjured())?false:true);
        }
        ceRegistSurvey.setDangerDesc(check.getLossPass());
        //转码
        ceRegistSurvey.setIsCarAnnual(check.getIsCarAnnual());
        //转码
        ceRegistSurvey.setDriverReview(check.getDriverReview());
        ceRegistSurvey.setDriverName(driver.getName());
        ceRegistSurvey.setCreateTime(new Date());
        ceRegistSurvey.setCheckStartTime(check.getCheckStartTime());
        ceRegistSurvey.setCheckEndTime(check.getCheckEndTime());
        ceRegistSurvey.setCaseType(check.getCaseType());
        ceRegistSurvey.setNoFaultCompensate(fastCompensatInfoRequest.getIsPayBackForOthers());
        ceRegistSurvey.setSubrogationFlag(check.getSubrogationFlag());
        ceRegistSurvey.setIsMutualCollisionSelfCompensation(check.getIsMutualCollisionSelfCompensation());
        ceRegistSurvey.setIsCarInsurance(check.getIsCarInsurance());
        ceRegistSurvey.setSubCertiType(check.getSubCertiType());
        ceRegistSurvey.setEventDutyRatio(check.getEventDutyRatio());
        ceRegistSurvey.setDangerAddress(check.getEventAddress());
        ceRegistSurvey.setIsAppointDriver(check.getIsAppointDriver());
        ceRegistSurvey.setCaseType(check.getCaseType());

        if(StringUtils.isNotBlank(check.getIsFirstScene())) {
            ceRegistSurvey.setIsFirstScene(Integer.valueOf(check.getIsFirstScene()));
        }


        int surveyResult = ceRegistSurveyMapper.insertSelective(ceRegistSurvey);
        if (surveyResult != 1) {
            logger.info("保险公司{}订单号为{}请求快赔业务接口处理查勘信息表失败",fastCompensatInfoRequest.getInsuranceCompanyID(),
                    fastCompensatInfoRequest.getTaskNo());
            throw new BusinessException(ResultEnum.INSERT_TALBLE_ERROR);
        }
        Long surveyId = ceRegistSurvey.getId();
        //----------------------------------------------------查勘表END--------------------------------------------------
        //交强险单号
        String bzPolicyNo = null;
        //交强险公司
        String bzCompanyCode = null;

        //----------------------------------------------------保单表BEGIN--------------------------------------------------
        List<CommercialInsurance> commercialInsurances = fastCompensatInfoRequest.getCommercialInsurances();
        for (CommercialInsurance commercialInsurance : commercialInsurances) {
            CeInsurance ceInsurance = new CeInsurance();
            ceInsurance.setRegistId(registId);
            ceInsurance.setClaimNotificationNo(claimNotificationNo);
            ceInsurance.setCompanyCode(fastCompensatInfoRequest.getInsuranceCompanyID());
            ceInsurance.setCompanyCode(company.getCode());
            //ceInsurance.setCompanyName(company.getShortName());
            ceInsurance.setInsuranceCategory(commercialInsurance.getInsuranceType());
            if ("1".equals(commercialInsurance.getInsuranceType())) {
                bzPolicyNo = commercialInsurance.getInsuranceNumber();
                bzCompanyCode = company.getCode();
            }
            ceInsurance.setStartDate(commercialInsurance.getInsuranceStartDate());
            ceInsurance.setEndDate(commercialInsurance.getInsuranceEndDate());
            ceInsurance.setPolicyHolder(commercialInsurance.getPolicyHolder());
            ceInsurance.setBearTel(commercialInsurance.getPolicyHolderPhone());
            ceInsurance.setSignDate(commercialInsurance.getSignDate());
            ceInsurance.setInsuredName(commercialInsurance.getTheInsuredName());
            ceInsurance.setFirstRegistrationDate(commercialInsurance.getFirstRegistrationDate());
            ceInsurance.setPassengerVolume(commercialInsurance.getSeatCount());
            ceInsurance.setPayloadMass(commercialInsurance.getApprovedCapacity());
            ceInsurance.setPolicyNo(commercialInsurance.getInsuranceNumber());
            ceInsurance.setInsuredIdentifyNo(commercialInsurance.getTheInsuredNo());
            ceInsurance.setInsuredIdentifyType(commercialInsurance.getTheInsuredNoType());
            ceInsurance.setAgencyName(commercialInsurance.getAgent());
            ceInsurance.setChannels(commercialInsurance.getChannels());
            ceInsurance.setIsContinuousPolicy(commercialInsurance.getIsContinuousPolicy());
            ceInsurance.setCompanyName(commercialInsurance.getCompanyName());
            ceInsurance.setVehicleColor(commercialInsurance.getVehicleColor());
            ceInsurance.setImportDomestic(commercialInsurance.getImportDomestic());
            ceInsurance.setUsedYears(commercialInsurance.getUsedYears());
            ceInsurance.setVehiclePrice(commercialInsurance.getVehiclePrice());
            ceInsurance.setIsTransfer(commercialInsurance.getIsTransfer());
            ceInsurance.setLicensePlateNo(registrationNumber);
            ceInsurance.setPlateColor(commercialInsurance.getLicensePlateColor());
            ceInsurance.setModelName(commercialInsurance.getModelName());
            ceInsurance.setBrandModel(commercialInsurance.getBrandModel());
            ceInsurance.setVehicleColor(commercialInsurance.getVehicleColor());
            ceInsurance.setVehicleFrameNo(commercialInsurance.getVin());
            ceInsurance.setEngineNo(commercialInsurance.getEngineNo());
            ceInsurance.setNewVehiclePrice(commercialInsurance.getNewVehiclePrice());
            ceInsurance.setUsingProperties(commercialInsurance.getTypeOfUsage());
            ceInsurance.setOwner(commercialInsurance.getOwner());
            ceInsurance.setCarKindCode(commercialInsurance.getVehicleType());
            ceInsurance.setInsuranceCategory(commercialInsurance.getInsuranceCategory());

            int insuranceResult = ceInsuranceMapper.insertSelective(ceInsurance);
            if (insuranceResult != 1) {
                logger.info("保险公司{}订单号为{}请求快赔业务接口处理保单信息表失败",fastCompensatInfoRequest.getInsuranceCompanyID(),
                        fastCompensatInfoRequest.getTaskNo());
                throw new BusinessException(ResultEnum.INSERT_TALBLE_ERROR);
            }
            Long insuranceId = ceInsurance.getId();

            //险别信息
            List<InsuranceItem> insuranceItems = commercialInsurance.getInsuranceItems();
            if (insuranceItems != null) {
                insertCeInsuranceItem(insuranceItems, insuranceId, registId);
            }
            //出险记录信息
            List<HistoricalClaim> historicalClaims = commercialInsurance.getHistoricalClaims();
            if (historicalClaims != null) {
                insertHistoricalClaim(historicalClaims, company, driver, insuranceId, registId, claimNotificationNo, registrationNumber);
            }
            //批单信息
            List<InsuranceModification> insuranceModifications = commercialInsurance.getInsuranceModifications();
            if (insuranceModifications != null) {
                insertInsuranceModification(insuranceModifications, insuranceId, registId);
            }
            //特别约定
            List<SpecialAgreement> specialAgreements = commercialInsurance.getSpecialAgreements();
            if (specialAgreements != null) {
                insertSpecialAgreement(specialAgreements, insuranceId, registId);
            }
        }
        //----------------------------------------------------保单表END--------------------------------------------------
        //----------------------------------------------------车辆BEGIN--------------------------------------------------

        if (vehicle != null) {
            CeRegistSurveyCar ceRegistSurveyCar = new CeRegistSurveyCar();
            ceRegistSurveyCar.setRegistId(registId);
            ceRegistSurveyCar.setClaimNotificationNo(claimNotificationNo);
            ceRegistSurveyCar.setCeRegistSurveyId(surveyId);
            ceRegistSurveyCar.setSubjectThird("0");//只有标的车
            ceRegistSurveyCar.setLicensePlateNo(vehicle.getLicensePlate());
            ceRegistSurveyCar.setOwner(vehicle.getOwner());
            ceRegistSurveyCar.setInsuredName(vehicle.getInsuredName());
            ceRegistSurveyCar.setBzPolicyNo(bzPolicyNo);
            ceRegistSurveyCar.setBzCompanyCode(bzCompanyCode);
            ceRegistSurveyCar.setSubCompanyName(vehicle.getSubCompanyName());
            //转码
            ceRegistSurveyCar.setModelCode(vehicle.getModelCode());
            ceRegistSurveyCar.setModelName(vehicle.getModelName());
            ceRegistSurveyCar.setVin(vehicle.getVin());
            //转码
            ceRegistSurveyCar.setCarKindCode(vehicle.getVehicleType());
            //转码
            ceRegistSurveyCar.setLicensePlateType(vehicle.getLicensePlateType());
            ceRegistSurveyCar.setEngineNo(vehicle.getEngineNumber());
            //转码
            ceRegistSurveyCar.setPlateColor(vehicle.getLicensePlateColor());
            ceRegistSurveyCar.setSeatCount(vehicle.getSeatCount());
            ceRegistSurveyCar.setBrandModel(vehicle.getBrand());
            //转码
            ceRegistSurveyCar.setIsPersonInjured(vehicle.getIsPersonInjured());
            //转码
            ceRegistSurveyCar.setIsProtectLoss(vehicle.getIsProtectLoss());

            ceRegistSurveyCar.setUsingProperties(vehicle.getTypeOfUsage());

            ceRegistSurveyCar.setIsRescue(vehicle.getIsRescue());

            ceRegistSurveyCar.setIsDisassemble(vehicle.getIsDisassemble());

            //转码
            //ceRegistSurveyCar.setIsMortgage(vehicle.getIsMortgage());
            //转码
            //ceRegistSurveyCar.setIsTelemarketing(vehicle.getIsTelemarketing());


            int ceRegistSurveyCarResult = ceRegistSurveyCarMapper.insertSelective(ceRegistSurveyCar);
            if (ceRegistSurveyCarResult != 1) {
                logger.info("保险公司{}订单号为{}请求快赔业务接口处理车辆信息表失败",fastCompensatInfoRequest.getInsuranceCompanyID(),
                        fastCompensatInfoRequest.getTaskNo());
                throw new BusinessException(ResultEnum.INSERT_TALBLE_ERROR);
            }
            Long ceRegistSurveyCarId = ceRegistSurveyCar.getId();
            //----------------------------------------------------车辆END--------------------------------------------------
            //----------------------------------------------------驾驶员BEGIN--------------------------------------------------
            CeRegistSurveyCarDriver ceRegistSurveyCarDriver = new CeRegistSurveyCarDriver();
            ceRegistSurveyCarDriver.setRegistId(registId);
            ceRegistSurveyCarDriver.setCeRegistSurveyCarId(ceRegistSurveyCarId);
            ceRegistSurveyCarDriver.setClaimNotificationNo(claimNotificationNo);
            ceRegistSurveyCarDriver.setLicensePlateNo(fastCompensatInfoRequest.getRegistrationNumber());
            ceRegistSurveyCarDriver.setDriverName(driver.getName());
            ceRegistSurveyCarDriver.setDriverBirth(driver.getDriverBirth());
            //转码
            ceRegistSurveyCarDriver.setIdentifyType(driver.getIdentifyType());
            ceRegistSurveyCarDriver.setIdentifyNumber(driver.getIdentifyNumber());
            ceRegistSurveyCarDriver.setDrivingLicenseNo(driver.getDriverLicenseNo());
            //转码
            ceRegistSurveyCarDriver.setDrivingIdentifyType(driver.getDriverAllowedVehicleType());
            //转码
            ceRegistSurveyCarDriver.setDriverSex(driver.getDriverSex());
            ceRegistSurveyCarDriver.setDriverAge(driver.getDriverAge());
            if(driver.getIsDrinkingDriving() != null) {
                ceRegistSurveyCarDriver.setIsDrinkingDriving(driver.getIsDrinkingDriving());
            }
            ceRegistSurveyCarDriver.setCreateTime(new Date());
            ceRegistSurveyCarDriver.setDriverPhone(driver.getDriverPhone());
            ceRegistSurveyCarDriver.setAllowDrivingVehicle(driver.getDriverAllowedVehicleType());

            int driverResult = ceRegistSurveyCarDriverMapper.insertSelective(ceRegistSurveyCarDriver);
            if (driverResult != 1) {
                logger.info("保险公司{}订单号为{}请求快赔业务接口处理驾驶员信息表失败",fastCompensatInfoRequest.getInsuranceCompanyID(),
                        fastCompensatInfoRequest.getTaskNo());
                throw new BusinessException(ResultEnum.INSERT_TALBLE_ERROR);
            }
        }
        //----------------------------------------------------驾驶员END--------------------------------------------------
        //----------------------------------------------------物损BEGIN--------------------------------------------------
        List<Loss> losses = fastCompensatInfoRequest.getLosses();
        if (losses != null) {
            for (Loss loss : losses) {
                CeRegistSurveyLoss ceRegistSurveyLoss = new CeRegistSurveyLoss();
                ceRegistSurveyLoss.setRegistId(registId);
                ceRegistSurveyLoss.setClaimNotificationNo(claimNotificationNo);
                ceRegistSurveyLoss.setLossName(loss.getLossName());
                ceRegistSurveyLoss.setLossDesc(loss.getLossDesc());
                ceRegistSurveyLoss.setLossScope(loss.getLossScope());
                ceRegistSurveyLoss.setContactPerson(loss.getContactPerson());
                ceRegistSurveyLoss.setContactTel(loss.getContactMobile());
                ceRegistSurveyLoss.setEstimatedLossAmount(loss.getEstimatedLossAmount());
                ceRegistSurveyLoss.setCreateTime(new Date());

                int lossResult = ceRegistSurveyLossMapper.insertSelective(ceRegistSurveyLoss);
                if (lossResult != 1) {
                    logger.info("保险公司{}订单号为{}请求快赔业务接口处理物损信息表失败",fastCompensatInfoRequest.getInsuranceCompanyID(),
                            fastCompensatInfoRequest.getTaskNo());
                    throw new BusinessException(ResultEnum.INSERT_TALBLE_ERROR);
                }
            }
        }
        //----------------------------------------------------物损END--------------------------------------------------

        //----------------------------------------------------报文表BEGIN--------------------------------------------------
        CeRegistMessage ceRegistMessage = new CeRegistMessage();
        ceRegistMessage.setClaimNotificationNo(claimNotificationNo);
        ceRegistMessage.setCompanyCode(company.getCode());
        ceRegistMessage.setCompanyId(company.getId());
        ceRegistMessage.setCreateTime(new Date());
        ceRegistMessage.setInsuranceMessage(JSONObject.toJSONString(fastCompensatInfoRequest));
        ceRegistMessage.setRegistId(registId);
        ceRegistMessage.setTaskNo(fastCompensatInfoRequest.getTaskNo());
        ceRegistMessage.setRegistStatus("快赔定损");
        int result = ceRegistMessageMapper.insertSelective(ceRegistMessage);
        if(result != 1){
            logger.info("保险公司{}订单号为{}请求快赔业务接口处理报文信息表失败",fastCompensatInfoRequest.getInsuranceCompanyID(),
                    fastCompensatInfoRequest.getTaskNo());
            throw new BusinessException(ResultEnum.INSERT_TALBLE_ERROR);
        }
        //----------------------------------------------------报文表END--------------------------------------------------
        resultMap.put("registId", registId);
        resultMap.put("surveyId", surveyId);

        return resultMap;
    }

    private void insertSpecialAgreement(List<SpecialAgreement> specialAgreements, Long insuranceId, Long registId) {
        for(SpecialAgreement specialAgreement:specialAgreements){
            CeInsuranceSpecial ceInsuranceSpecial = new CeInsuranceSpecial();
            ceInsuranceSpecial.setRegistId(registId);
            ceInsuranceSpecial.setInsuranceId(insuranceId);
            ceInsuranceSpecial.setContent(specialAgreement.getContent());
            ceInsuranceSpecial.setOrder(specialAgreement.getOrder());

            int result =  ceInsuranceSpecialMapper.insertSelective(ceInsuranceSpecial);
            if (result != 1) {
                logger.info("处理报案号为{}的保单特别约定表失败",registId);
                throw new BusinessException(ResultEnum.INSERT_TALBLE_ERROR);
            }

        }
    }

    private void insertInsuranceModification(List<InsuranceModification> insuranceModifications, Long insuranceId, Long registId) {
        for(InsuranceModification insuranceModification:insuranceModifications) {
            CeInsuranceModification ceInsuranceModification = new CeInsuranceModification();
            ceInsuranceModification.setRegistId(registId);
            ceInsuranceModification.setInsuranceId(insuranceId);
            ceInsuranceModification.setModificationBillNo(insuranceModification.getModificationBillNo());
            ceInsuranceModification.setModificationTime(insuranceModification.getMofificationDate());
            ceInsuranceModification.setContent(insuranceModification.getContent());
            ceInsuranceModification.setCreateTime(new Date());

            int result = ceInsuranceModificationMapper.insertSelective(ceInsuranceModification);
            if (result != 1) {
                logger.info("处理报案号为{}的保单批单信息表失败",registId);
                throw new BusinessException(ResultEnum.INSERT_TALBLE_ERROR);
            }
        }
    }

    private void insertCeInsuranceItem(List<InsuranceItem> insuranceItems, Long insuranceId, Long registId) {
        for(InsuranceItem insuranceItem:insuranceItems){
            CeInsuranceItem ceInsuranceItem = new CeInsuranceItem();
            ceInsuranceItem.setRegistId(registId);
            ceInsuranceItem.setInsuranceId(insuranceId);
            ceInsuranceItem.setDeductibleRate(insuranceItem.getDeductibleRate());
            ceInsuranceItem.setInsuranceAmout(insuranceItem.getInsuranceAmount());
            ceInsuranceItem.setInsuranceFee(insuranceItem.getInsuranceFee());
            ceInsuranceItem.setCode(insuranceItem.getInsuranceItemCode());
            ceInsuranceItem.setName(insuranceItem.getName());
            ceInsuranceItem.setNonDeductible(insuranceItem.getNonDeductible());
            ceInsuranceItem.setUnitCount(insuranceItem.getUnitCount());
            ceInsuranceItem.setUnitAmount(insuranceItem.getUnitAmount());
            ceInsuranceItem.setDeductibleMoney(insuranceItem.getDeductibleMoney());
            ceInsuranceItem.setCreateTime(new Date());
            ceInsuranceItem.setPremiums(insuranceItem.getPremiums());
            ceInsuranceItem.setRemark(insuranceItem.getRemark());
            int result = ceInsuranceItemMapper.insertSelective(ceInsuranceItem);
            if (result != 1) {
                logger.info("处理报案号为{}的保单险种表失败",registId);
                throw new BusinessException(ResultEnum.INSERT_TALBLE_ERROR);
            }

        }
    }


    public void insertHistoricalClaim(List<HistoricalClaim> historicalClaims,CeInsuranceCompany company,
                                      Driver driver,Long insuranceId, Long registId,String claimNotificationNo,String registrationNumber) {
        for (HistoricalClaim historicalClaim : historicalClaims) {
            CeInsuranceDangerHist ceInsuranceDangerHist = new CeInsuranceDangerHist();
            ceInsuranceDangerHist.setRegistId(registId);
            ceInsuranceDangerHist.setInsuranceId(insuranceId);
            ceInsuranceDangerHist.setCompanyId(company.getId());
            ceInsuranceDangerHist.setCompanyCode(company.getCode());
            ceInsuranceDangerHist.setPayClaimNumber(historicalClaim.getPayClaimNumber());
            ceInsuranceDangerHist.setClaimEndDate(historicalClaim.getClaimEndDate());
            ceInsuranceDangerHist.setClaimNotificationNo(claimNotificationNo);
            ceInsuranceDangerHist.setReportDate(historicalClaim.getReportDate());
            ceInsuranceDangerHist.setReporterTel(historicalClaim.getReporterTel());
            ceInsuranceDangerHist.setReporter(historicalClaim.getReporter());
            ceInsuranceDangerHist.setLicensePlateNo(registrationNumber);
            ceInsuranceDangerHist.setDriverName(driver.getName());
            ceInsuranceDangerHist.setClaimDate(historicalClaim.getClaimDate());
            ceInsuranceDangerHist.setEventAddress(historicalClaim.getEventAddress());
            ceInsuranceDangerHist.setInsuranceCategory(historicalClaim.getInsuranceCategory());
            ceInsuranceDangerHist.setEstimateAmount(historicalClaim.getEstimateAmount());
            ceInsuranceDangerHist.setPaidAmount(historicalClaim.getPaidAmount());
            ceInsuranceDangerHist.setDangerDesc(historicalClaim.getDangerDesc());
            ceInsuranceDangerHist.setPaidTimes(historicalClaim.getPaidTimes());
            ceInsuranceDangerHist.setCreateTime(new Date());

            int result = ceInsuranceDangerHistMapper.insertSelective(ceInsuranceDangerHist);
            if (result != 1) {
                logger.info("处理报案号为{}的保单出险历史表失败",registId);
                throw new BusinessException(ResultEnum.INSERT_TALBLE_ERROR);
            }

        }
    }


    //操作CE表
    @Override
    @Transactional
    @DataSource("slave")
    public void removeCeTable(Long registId, Long surveyId){

        //----------------------------------------------------报案表BEGIN--------------------------------------------------
        ceRegistMapper.deleteByPrimaryKey(registId);
        //----------------------------------------------------报案表END--------------------------------------------------
        //----------------------------------------------------查勘表BEGIN--------------------------------------------------
        ceRegistSurveyMapper.deleteByPrimaryKey(surveyId);
        //----------------------------------------------------查勘表END--------------------------------------------------
        //----------------------------------------------------保单表BEGIN--------------------------------------------------
        CeInsuranceExample ceInsuranceExample = new CeInsuranceExample();
        ceInsuranceExample.createCriteria().andRegistIdEqualTo(registId);
        ceInsuranceMapper.deleteByExample(ceInsuranceExample);

        CeInsuranceItemExample ceInsuranceItemExample = new CeInsuranceItemExample();
        ceInsuranceItemExample.createCriteria().andRegistIdEqualTo(registId);
        ceInsuranceItemMapper.deleteByExample(ceInsuranceItemExample);

        //出险记录信息
        CeInsuranceDangerHistExample ceInsuranceDangerHistExample = new CeInsuranceDangerHistExample();
        ceInsuranceDangerHistExample.createCriteria().andRegistIdEqualTo(registId);
        ceInsuranceDangerHistMapper.deleteByExample(ceInsuranceDangerHistExample);

        //批单信息
        CeInsuranceModificationExample ceInsuranceModificationExample = new CeInsuranceModificationExample();
        ceInsuranceModificationExample.createCriteria().andRegistIdEqualTo(registId);
        ceInsuranceModificationMapper.deleteByExample(ceInsuranceModificationExample);

        //特别约定
        CeInsuranceSpecialExample ceInsuranceSpecialExample = new CeInsuranceSpecialExample();
        ceInsuranceSpecialExample.createCriteria().andRegistIdEqualTo(registId);
        ceInsuranceSpecialMapper.deleteByExample(ceInsuranceSpecialExample);

        //----------------------------------------------------保单表END--------------------------------------------------
        //----------------------------------------------------车辆BEGIN--------------------------------------------------
        CeRegistSurveyCarExample ceRegistSurveyCarExample = new CeRegistSurveyCarExample();
        ceRegistSurveyCarExample.createCriteria().andRegistIdEqualTo(registId);
        ceRegistSurveyCarMapper.deleteByExample(ceRegistSurveyCarExample);
        //----------------------------------------------------车辆END--------------------------------------------------
        //----------------------------------------------------驾驶员BEGIN--------------------------------------------------
        CeRegistSurveyCarDriverExample ceRegistSurveyCarDriverExample = new CeRegistSurveyCarDriverExample();
        ceRegistSurveyCarDriverExample.createCriteria().andRegistIdEqualTo(registId);
        ceRegistSurveyCarDriverMapper.deleteByExample(ceRegistSurveyCarDriverExample);
        //----------------------------------------------------驾驶员END--------------------------------------------------
        //----------------------------------------------------物损BEGIN--------------------------------------------------
        CeRegistSurveyLossExample ceRegistSurveyLossExample = new CeRegistSurveyLossExample();
        ceRegistSurveyLossExample.createCriteria().andRegistIdEqualTo(registId);
        ceRegistSurveyLossMapper.deleteByExample(ceRegistSurveyLossExample);
        //----------------------------------------------------物损END--------------------------------------------------
    }


}
