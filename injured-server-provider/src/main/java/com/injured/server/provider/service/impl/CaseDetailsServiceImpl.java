package com.injured.server.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.injured.commons.DateUtil;
import com.injured.server.api.contract.CaseDetailsContract;
import com.injured.server.api.entity.*;
import com.injured.server.api.enums.ResultEnum;
import com.injured.server.api.enums.TaskStatusEnum;
import com.injured.server.api.model.caseinformation.CaseInformationResponse;
import com.injured.server.api.model.caseinformation.HuManInfoResponse;
import com.injured.server.api.model.response.BaseResponse;
import com.injured.server.api.model.response.ResponseUtil;
import com.injured.server.provider.mapper.*;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zlu
 * @title: CaseDetailsServiceImpl
 * @projectName injured
 * @description: 案件详情
 * @date 2019/8/111:08
 */
@Service(timeout = 60000)
public class CaseDetailsServiceImpl implements CaseDetailsContract {

    private static Logger logger = LogManager.getLogger(CaseDetailsServiceImpl.class);

    @Autowired
    private InjuredFastCompensatInfoMapper injuredFastCompensatInfoMapper;

    @Autowired
    private InjuredFastCompensatReviewOpinionMapper injuredFastCompensatReviewOpinionMapper;

    @Autowired
    private CeRegistMapper ceRegistMapper;

    @Autowired
    private CeRegistSurveyMapper ceRegistSurveyMapper;

    @Autowired
    private CeRegistSurveyCarMapper ceRegistSurveyCarMapper;

    @Autowired
    private CeRegistSurveyCarDriverMapper ceRegistSurveyCarDriverMapper;



    @Override
    public BaseResponse detail(Long fastInfoId) {

        CaseInformationResponse response = new CaseInformationResponse();

        long beginTime = System.currentTimeMillis();
        InjuredFastCompensatInfo injuredFastCompensatInfo = injuredFastCompensatInfoMapper.selectByPrimaryKey(fastInfoId);
        long endTime = System.currentTimeMillis();
        logger.info("服务端查询伤者信息耗时为{}毫秒",(endTime-beginTime));
        if (injuredFastCompensatInfo == null){
            return ResponseUtil.error(ResultEnum.NULL);
        }

        //查询报案信息表
        CeRegistExample ceRegistExample = new CeRegistExample();
        ceRegistExample.createCriteria().andIdEqualTo(injuredFastCompensatInfo.getRegistId());
        beginTime = System.currentTimeMillis();
        List<CeRegist> ceRegists = ceRegistMapper.selectByExample(ceRegistExample);
        endTime = System.currentTimeMillis();
        logger.info("服务端查询报案信息耗时为{}毫秒",(endTime-beginTime));
        if(ceRegists == null ||ceRegists.size() == 0){
            return ResponseUtil.error(ResultEnum.NULL);
        }
        CeRegist ceRegist = ceRegists.get(0);


        beginTime = System.currentTimeMillis();
        BeanUtils.copyProperties(ceRegist,response);
        endTime = System.currentTimeMillis();
        logger.info("服务端拷贝报案信息耗时为{}毫秒",(endTime-beginTime));

        //查询查勘信息表
        CeRegistSurveyExample ceRegistSurveyExample = new CeRegistSurveyExample();
        ceRegistSurveyExample.createCriteria().andRegistIdEqualTo(ceRegist.getId());

        beginTime = System.currentTimeMillis();
        List<CeRegistSurvey> ceRegistSurveys = ceRegistSurveyMapper.selectByExample(ceRegistSurveyExample);
        endTime = System.currentTimeMillis();
        logger.info("服务端查询查勘信息耗时为{}毫秒",(endTime-beginTime));

        if(ceRegistSurveys == null ||ceRegistSurveys.size() == 0){
            return ResponseUtil.error(ResultEnum.NULL);
        }
        CeRegistSurvey ceRegistSurvey = ceRegistSurveys.get(0);

        response.setEventType(ceRegistSurvey.getEventType());
        response.setDangerAddress(ceRegistSurvey.getDangerAddress());
        response.setEventProcessMode(ceRegistSurvey.getEventProcessMode());
        response.setCaseType(ceRegistSurvey.getCaseType());
        response.setEventAccidentLiability(ceRegistSurvey.getEventAccidentLiability());
        response.setEventDutyRatio(ceRegistSurvey.getEventDutyRatio());
        response.setDriverReview(ceRegistSurvey.getDriverReview());
        response.setIsAppointDriver(ceRegistSurvey.getIsAppointDriver());
        response.setIsFirstScene(ceRegistSurvey.getIsFirstScene());
        response.setIsCarInsurance(ceRegistSurvey.getIsCarInsurance());
        response.setIsCarAnnual(ceRegistSurvey.getIsCarAnnual());
        response.setDangerCause(ceRegistSurvey.getDangerCause());
        response.setDangerDesc(ceRegistSurvey.getDangerDesc());


        //车辆信息
        CeRegistSurveyCarExample ceRegistSurveyCarExample = new CeRegistSurveyCarExample();
        ceRegistSurveyCarExample.createCriteria().andRegistIdEqualTo(ceRegist.getId());

        beginTime = System.currentTimeMillis();
        List<CeRegistSurveyCar> ceRegistSurveyCars = ceRegistSurveyCarMapper.selectByExample(ceRegistSurveyCarExample);
        endTime = System.currentTimeMillis();
        logger.info("服务端查询车辆信息耗时为{}毫秒",(endTime-beginTime));

        if(ceRegistSurveyCars != null && ceRegistSurveyCars.size() != 0){
            CeRegistSurveyCar ceRegistSurveyCar = ceRegistSurveyCars.get(0);
            response.setLicensePlateNo(ceRegistSurveyCar.getLicensePlateNo());
            response.setPlateColor(ceRegistSurveyCar.getPlateColor());
            response.setBrandModel(ceRegistSurveyCar.getBrandModel());
            response.setVin(ceRegistSurveyCar.getVin());
            response.setEngineNo(ceRegistSurveyCar.getEngineNo());
            response.setUsingProperties(ceRegistSurveyCar.getUsingProperties());
            response.setLicensePlateNo(ceRegistSurveyCar.getLicensePlateNo());
        }


        //驾驶员信息
        CeRegistSurveyCarDriverExample ceRegistSurveyCarDriverExample = new CeRegistSurveyCarDriverExample();
        ceRegistSurveyCarDriverExample.createCriteria().andRegistIdEqualTo(ceRegist.getId());

        beginTime = System.currentTimeMillis();
        List<CeRegistSurveyCarDriver> ceRegistSurveyCarDrivers = ceRegistSurveyCarDriverMapper.selectByExample(ceRegistSurveyCarDriverExample);
        endTime = System.currentTimeMillis();
        logger.info("服务端查询驾驶员信息耗时为{}毫秒",(endTime-beginTime));

        if(ceRegistSurveyCarDrivers != null && ceRegistSurveyCarDrivers.size() != 0){
            CeRegistSurveyCarDriver ceRegistSurveyCarDriver = ceRegistSurveyCarDrivers.get(0);
            response.setDriverName(ceRegistSurveyCarDriver.getDriverName());
            response.setDriverSex(ceRegistSurveyCarDriver.getDriverSex());
            response.setDriverAge(ceRegistSurveyCarDriver.getDriverAge());
            response.setDriverPhone(ceRegistSurveyCarDriver.getDriverPhone());
            response.setDrivingIdentifyType(ceRegistSurveyCarDriver.getDrivingIdentifyType());
            response.setIdentifyType(ceRegistSurveyCarDriver.getIdentifyType());
            response.setIdentifyNumber(ceRegistSurveyCarDriver.getIdentifyNumber());
            response.setIsDrinkingDriving(ceRegistSurveyCarDriver.getIsDrinkingDriving().toString());
        }


        //查询该案件下的所有人伤信息
        List<HuManInfoResponse> huManInfoResponses = new ArrayList<>();

        InjuredFastCompensatInfoExample injuredFastCompensatInfoExample = new InjuredFastCompensatInfoExample();
        injuredFastCompensatInfoExample.createCriteria().andClaimNotificationNoEqualTo(ceRegist.getClaimNotificationNo());

        beginTime = System.currentTimeMillis();
        List<InjuredFastCompensatInfo> injuredFastCompensatInfos = injuredFastCompensatInfoMapper.selectByExample(injuredFastCompensatInfoExample);
        endTime = System.currentTimeMillis();
        logger.info("服务端查询人伤关联伤者信息耗时为{}毫秒",(endTime-beginTime));

        if(injuredFastCompensatInfos != null && injuredFastCompensatInfos.size() != 0){
            for (InjuredFastCompensatInfo fastCompensatInfo:injuredFastCompensatInfos) {
                 HuManInfoResponse huManInfoResponse = new HuManInfoResponse();
                 //查询该案件下的查勘信息
                 CeRegistSurveyExample ceRegistSurveyExample_2 = new CeRegistSurveyExample();
                 ceRegistSurveyExample_2.createCriteria().andRegistIdEqualTo(fastCompensatInfo.getRegistId());
                 beginTime = System.currentTimeMillis();
                 List<CeRegistSurvey> ceRegistSurveys_2 = ceRegistSurveyMapper.selectByExample(ceRegistSurveyExample_2);
                 endTime = System.currentTimeMillis();
                 logger.info("服务端查询人伤关联伤者查勘信息耗时为{}毫秒",(endTime-beginTime));

                 if(ceRegistSurveys_2 == null ||ceRegistSurveys_2.size() == 0){
                    return ResponseUtil.error(ResultEnum.NULL);
                 }
                 CeRegistSurvey ceRegistSurvey_2 = ceRegistSurveys_2.get(0);

                 beginTime = System.currentTimeMillis();
                 BeanUtils.copyProperties(fastCompensatInfo,huManInfoResponse);
                 endTime = System.currentTimeMillis();
                 logger.info("服务端拷贝人伤关联伤者查勘信息耗时为{}毫秒",(endTime-beginTime));

                if (fastCompensatInfo.getTaskStatus() != TaskStatusEnum.PROCESSED.getCode()) {
                    huManInfoResponse.setTaskStatus(fastCompensatInfo.getTaskStatus());
                }else{
                    huManInfoResponse.setTaskStatus(fastCompensatInfo.getReviewStatus());
                }
                 huManInfoResponse.setCheckEndTime(ceRegistSurvey_2.getCheckEndTime());
                 if(StringUtils.isBlank(ceRegistSurvey_2.getCheckerName())){
                     huManInfoResponse.setCheckerName(ceRegistSurvey_2.getCheckerName2());
                 }else {
                     huManInfoResponse.setCheckerName(ceRegistSurvey_2.getCheckerName());
                 }

                 if(huManInfoResponse.getFixedLossAmount() != null &&
                         new BigDecimal(0).compareTo(huManInfoResponse.getFixedLossAmount()) == 0){
                     huManInfoResponse.setFixedLossAmount(null);
                 }

                if(huManInfoResponse.getDamageAmount() != null &&
                        new BigDecimal(0).compareTo(huManInfoResponse.getDamageAmount()) == 0){
                    huManInfoResponse.setDamageAmount(null);
                }

                 //查询核损信息
                 InjuredFastCompensatReviewOpinionExample opinionExample = new InjuredFastCompensatReviewOpinionExample();
                 opinionExample.createCriteria().andFastInfoIdEqualTo(fastCompensatInfo.getId());
                 opinionExample.setOrderByClause("create_time desc");

                 List<InjuredFastCompensatReviewOpinion> opinions = injuredFastCompensatReviewOpinionMapper.selectByExample(opinionExample);

                 if(opinions != null && opinions.size() != 0){
                     InjuredFastCompensatReviewOpinion opinion = opinions.get(0);
                     huManInfoResponse.setReviewerName(opinion.getReviewerName());
                     huManInfoResponse.setReviewerSubmitTime(opinion.getReviewerSubmitTime());
                 }

                 huManInfoResponses.add(huManInfoResponse);
            }
        }
        response.setHuManInfos(huManInfoResponses);
        return ResponseUtil.success(response);
    }



	@Override
	public InjuredFastCompensatInfo getInjuredFastCompensatInfoDetial(Long fastInfoId) {
		return injuredFastCompensatInfoMapper.selectByPrimaryKey(fastInfoId);
	}
}
