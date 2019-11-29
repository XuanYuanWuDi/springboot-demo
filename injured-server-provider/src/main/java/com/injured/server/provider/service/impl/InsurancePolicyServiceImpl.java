package com.injured.server.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.injured.commons.DateUtil;
import com.injured.server.api.contract.InsurancePolicyContract;
import com.injured.server.api.entity.*;
import com.injured.server.api.enums.ResultEnum;
import com.injured.server.api.model.insurance.*;
import com.injured.server.api.model.response.BaseResponse;
import com.injured.server.api.model.response.ResponseUtil;
import com.injured.server.provider.db.annotation.DataSource;
import com.injured.server.provider.mapper.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zlu
 * @title: InsurancePolicyServiceImpl
 * @projectName injured
 * @description: 保单信息
 * @date 2019/7/3115:39
 */
@Service(timeout = 60000)
public class InsurancePolicyServiceImpl implements InsurancePolicyContract {

    private static Logger logger = LogManager.getLogger(InsurancePolicyServiceImpl.class);

    @Autowired
    private InjuredFastCompensatInfoMapper injuredFastCompensatInfoMapper;

    @Autowired
    private CeInsuranceMapper ceInsuranceMapper;

    @Autowired
    private CeInsuranceItemMapper ceInsuranceItemMapper;

    @Autowired
    private CeInsuranceSpecialMapper ceInsuranceSpecialMapper;

    @Autowired
    private CeInsuranceModificationMapper ceInsuranceModificationMapper;

    @Autowired
    private CeInsuranceDangerHistMapper ceInsuranceDangerHistMapper;

    @Override
    public BaseResponse detail(Long fastInfoId){
        logger.info("查询快赔任务ID为{}下的保单信息BEGIN",fastInfoId);
        try {
            InjuredFastCompensatInfo injuredFastCompensatInfo =
                    injuredFastCompensatInfoMapper.selectByPrimaryKey(fastInfoId);

            if (injuredFastCompensatInfo == null) {
                return ResponseUtil.error(ResultEnum.NULL);
            }

            Long registId = injuredFastCompensatInfo.getRegistId();

            //查询CE_TABLE信息
            InsuranceResponse insuranceResponse =
                    ceTableSelect(registId);

            if (insuranceResponse == null) {
                return ResponseUtil.error(ResultEnum.NULL);
            }
            return ResponseUtil.success(insuranceResponse);
        }catch(Exception e){
            e.printStackTrace();
            return ResponseUtil.error(ResultEnum.EXCEPTION);
        }
    }


    @DataSource("slave")
    private InsuranceResponse ceTableSelect(Long registId) throws Exception{
    	InsuranceResponse response = new InsuranceResponse();    
              
    	 CompulsoryInsuranceResponse compulsoryInsuranceResponse = new CompulsoryInsuranceResponse();
		 CommercialInsuranceResponse commercialInsuranceResponse =  new CommercialInsuranceResponse();
    	
        //查询保单表
        CeInsuranceExample ceInsuranceExample = new CeInsuranceExample();
        ceInsuranceExample.createCriteria().andRegistIdEqualTo(registId);
        List<CeInsurance> ceInsurances = ceInsuranceMapper.selectByExample(ceInsuranceExample);

        if(ceInsurances == null || ceInsurances.size() == 0){
            return  null;
        }

        for(CeInsurance ceInsurance : ceInsurances) {
        	/**
        	 * 1、交强险 2、商业险
        	 */
        	if("1".equals(ceInsurance.getInsuranceCategory())) {      	
        		CommercialInsuranceResponse commercialInsuranceResponse_new =  new CommercialInsuranceResponse();
        		BeanUtils.copyProperties(getInsurances(ceInsurance,commercialInsuranceResponse_new),compulsoryInsuranceResponse);
        		if(ceInsurance.getPassengerVolume() != null && ceInsurance.getPayloadMass() != null) {
                    compulsoryInsuranceResponse.setSeatsQualities(ceInsurance.getPassengerVolume() + "人/"+ceInsurance.getPayloadMass()+"千克");
                }
        	}else if("2".equals(ceInsurance.getInsuranceCategory())) {
        		commercialInsuranceResponse = getInsurances(ceInsurance,commercialInsuranceResponse);
                if(ceInsurance.getPassengerVolume() != null && ceInsurance.getPayloadMass() != null) {
                    commercialInsuranceResponse.setSeatsQualities(ceInsurance.getPassengerVolume() + "人/"+ceInsurance.getPayloadMass()+"千克");
                }
        	}
        }
        response.setCompulsoryInsuranceResponse(compulsoryInsuranceResponse);
        response.setCommercialInsuranceResponse(commercialInsuranceResponse);
        return response;
    }
    
    public CommercialInsuranceResponse getInsurances(CeInsurance ceInsurance,CommercialInsuranceResponse response) {
    	
    	BeanUtils.copyProperties(ceInsurance,response);

        response.setEndDate(DateUtil.formatDate(ceInsurance.getEndDate(),"yyyy-MM-dd"));
        response.setFirstRegistrationDate(DateUtil.formatDate(ceInsurance.getFirstRegistrationDate(),
                "yyyy-MM-dd"));
        response.setStartDate(DateUtil.formatDate(ceInsurance.getStartDate(),
                "yyyy-MM-dd"));
        response.setSignDate(DateUtil.formatDate(ceInsurance.getSignDate(),
                "yyyy-MM-dd"));

        //查询险种表
        CeInsuranceItemExample ceInsuranceItemExample = new CeInsuranceItemExample();
        ceInsuranceItemExample.createCriteria().andInsuranceIdEqualTo(ceInsurance.getId());
        List<CeInsuranceItem> ceInsuranceItems = ceInsuranceItemMapper.selectByExample(ceInsuranceItemExample);

        List<InsuranceItemResponse> items = new ArrayList<>();

        if(ceInsuranceItems != null){
            for (CeInsuranceItem ceInsuranceItem:ceInsuranceItems) {
                 InsuranceItemResponse itemResponse = new InsuranceItemResponse();
                 BeanUtils.copyProperties(ceInsuranceItem,itemResponse);
                 items.add(itemResponse);
            }
        }
    	//查询特别约定表
        CeInsuranceSpecialExample  ceInsuranceSpecialExample = new CeInsuranceSpecialExample();
        ceInsuranceSpecialExample.createCriteria().andInsuranceIdEqualTo(ceInsurance.getId());
        List<CeInsuranceSpecial> ceInsuranceSpecials = ceInsuranceSpecialMapper.selectByExample(ceInsuranceSpecialExample);

        List<SpecialAgreementResponse> specials = new ArrayList<>();

        if(ceInsuranceSpecials != null){
            for (CeInsuranceSpecial ceInsuranceSpecial:ceInsuranceSpecials) {
                SpecialAgreementResponse specialResponse = new SpecialAgreementResponse();
                BeanUtils.copyProperties(ceInsuranceSpecial,specialResponse);
                specials.add(specialResponse);
            }
        }

        //查询批改信息
        CeInsuranceModificationExample  ceInsuranceModificationExample = new CeInsuranceModificationExample();
        ceInsuranceModificationExample.createCriteria().andInsuranceIdEqualTo(ceInsurance.getId());
        List<CeInsuranceModification> ceInsuranceModifications =
                ceInsuranceModificationMapper.selectByExample(ceInsuranceModificationExample);

        List<InsuranceModificationResponse> modifications = new ArrayList<>();

        if(ceInsuranceModifications != null){
            for (CeInsuranceModification ceInsuranceModification:ceInsuranceModifications) {
                InsuranceModificationResponse insuranceModificationResponse = new InsuranceModificationResponse();
                BeanUtils.copyProperties(ceInsuranceModification,insuranceModificationResponse);
                insuranceModificationResponse.setMofificationDate(DateUtil.formatDate(ceInsuranceModification.getModificationTime(),
                        "yyyy-MM-dd HH:mm:ss"));
                modifications.add(insuranceModificationResponse);
            }
        }

        //查询出险记录
        CeInsuranceDangerHistExample  ceInsuranceDangerHistExample = new CeInsuranceDangerHistExample();
        ceInsuranceDangerHistExample.createCriteria().andInsuranceIdEqualTo(ceInsurance.getId());
        List<CeInsuranceDangerHist> ceInsuranceDangerHists =
                ceInsuranceDangerHistMapper.selectByExample(ceInsuranceDangerHistExample);

        List<HistoricalClaimResponse> historicalClaims = new ArrayList<>();

        if(ceInsuranceDangerHists != null){
            for (CeInsuranceDangerHist ceInsuranceDangerHist:ceInsuranceDangerHists) {
                HistoricalClaimResponse historicalClaimResponse = new HistoricalClaimResponse();
                BeanUtils.copyProperties(ceInsuranceDangerHist,historicalClaimResponse);
                historicalClaimResponse.setClaimDate(DateUtil.formatDate(ceInsuranceDangerHist.getClaimDate(),
                        "yyyy-MM-dd HH:mm:ss"));
                historicalClaimResponse.setClaimEndDate(DateUtil.formatDate(ceInsuranceDangerHist.getClaimEndDate(),
                        "yyyy-MM-dd HH:mm:ss"));
                historicalClaims.add(historicalClaimResponse);
            }
        }

        //汇总
        response.setHistoricalClaims(historicalClaims);
        response.setInsuranceItems(items);
        response.setInsuranceModifications(modifications);
        response.setSpecialAgreements(specials);
		return response;
    }

}
