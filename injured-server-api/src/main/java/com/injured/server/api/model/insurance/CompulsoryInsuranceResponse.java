package com.injured.server.api.model.insurance;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author zlu
 * @title: CommercialInsuranceResponse
 * @projectName injured
 * @description: 保单信息
 * @date 2019/7/3113:16
 */
@Getter
@Setter
@ToString
public class CompulsoryInsuranceResponse implements Serializable {

    //险种
    private String insuranceCategory;

    //保单号
    private String policyNo;

    //报案号
    private String claimNotificationNo;

    //被保险人
    private String insuredName;

    //车牌号
    private String licensePlateNo;

    //号牌底色
    private String plateColor;

    //被保险人证件类型
    private String insuredIdentifyType;

    //被保险人证件号码
    private String insuredIdentifyNo;

    //代理人/公司
    private String agencyName;

    //车型名称
    private String modelName;

    //厂牌型号
    private String brandModel;

    //车身颜色
    private String vehicleColor;

    //车架号
    private String vehicleFrameNo;

    //发动机号
    private String engineNo;


    //国产车/进口车
    private String importDomestic;

    //初登日期
    private String firstRegistrationDate;


    //核定载客质量
    private String seatsQualities;


    //车辆使用年限
    private Byte usedYears;


    //新车购置价格
    private BigDecimal newVehiclePrice;


    //实际价格
    private BigDecimal vehiclePrice;


    //车辆使用性质
    private String usingProperties;


    //车主
    private String owner;


    //车辆种类
    private String carKindCode;


    //是否过户车
    private String isTransfer;


    //投保人
    private String policyHolder;


    //业务渠道
    private String channels;


    //是否续保业务
    private String isContinuousPolicy;


    //起保日期
    private String  startDate;


    //终保日期
    private String endDate;


    //承保机构
    private String companyName;


    //签单日期
    private String signDate;


    //险种信息
    private List<InsuranceItemResponse> insuranceItems;


    //特别约定
    private List<SpecialAgreementResponse> specialAgreements;


    //批改信息
    private List<InsuranceModificationResponse> insuranceModifications;


    //出险记录
    private List<HistoricalClaimResponse>  historicalClaims;

}
