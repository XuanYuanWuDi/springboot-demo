package com.injured.server.api.model.request.fast;

import com.injured.server.api.annotations.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author zlu
 * @title: CommercialInsurance
 * @projectName injured
 * @description: 保险单信息
 * @date 2019/7/2211:36
 */
@Getter
@Setter
@ToString
public class CommercialInsurance implements Serializable {

    //保险类型 1交强险 2商业险
    @NotNull(groups = { "fastInfo" })
    private String insuranceType;

    //购买保险时间
    @NotNull(groups = { "fastInfo" })
    private Date buyInsuranceDate;

    //初次登记日期
    @NotNull(groups = { "fastInfo" })
    private Date firstRegistrationDate;

    //总保额
    @NotNull(groups = { "fastInfo" })
    private BigDecimal insuranceAmount;

    //险别
    @NotNull(groups = { "fastInfo" })
    private String insuranceCategory;

    //终保时间
    @NotNull(groups = { "fastInfo" })
    private Date insuranceEndDate;

    //总保费
    private BigDecimal insuranceFee;

    //保单号
    @NotNull(groups = { "fastInfo" })
    private String insuranceNumber;

    //起保时间
    @NotNull(groups = { "fastInfo" })
    private Date insuranceStartDate;

    //出单日期
    @NotNull(groups = { "fastInfo" })
    private Date issueDate;

    //投保人
    @NotNull(groups = { "fastInfo" })
    private String policyHolder;

    //投保人电话
    private String policyHolderPhone;

    //签单时间
    @NotNull(groups = { "fastInfo" })
    private Date signDate;

    //被保险人
    @NotNull(groups = { "fastInfo" })
    private String  theInsuredName;

    //核定载客重量
    private Integer approvedCapacity;

    //核定载客数量
    @NotNull(groups = { "fastInfo" })
    private Integer seatCount;

    //出险记录
    private List<HistoricalClaim> historicalClaims;

    //险种
    @NotNull(groups = { "fastInfo" })
    private List<InsuranceItem> insuranceItems;

    //批单信息
    private List<InsuranceModification> insuranceModifications;

    //特别约定
    private List<SpecialAgreement> specialAgreements;




    //被保险人证件号码
    @NotNull(groups = { "fastInfo" })
    private String  theInsuredNo;

    //被保险人证件类型
    @NotNull(groups = { "fastInfo" })
    private String  theInsuredNoType;

    //代理人/公司
    private String agent;

    //业务渠道
    private String channels;

    //是否续保业务
    @NotNull(groups = { "fastInfo" })
    private String isContinuousPolicy;

    //承保机构
    @NotNull(groups = { "fastInfo" })
    private String companyName;


    //车身颜色
    private String vehicleColor;

    //进口车/国产车
    @NotNull(groups = { "fastInfo" })
    private String importDomestic;

    //车辆使用年限
    @NotNull(groups = { "fastInfo" })
    private Byte usedYears;

    //实际价值
    @NotNull(groups = { "fastInfo" })
    private BigDecimal vehiclePrice;

    //是否过户车
    @NotNull(groups = { "fastInfo" })
    private Byte isTransfer;


    //新车购置价格
    private BigDecimal newVehiclePrice;


    //车主
    private String owner;




    //VIN码
    @NotNull(groups = { "fastInfo" })
    private String vin;


    //使用性质
    @NotNull(groups = { "fastInfo" })
    private String typeOfUsage;


    //车辆种类
    @NotNull(groups = { "fastInfo" })
    private String vehicleType;


    //发动机号
    @NotNull(groups = { "fastInfo" })
    private String engineNo;


    //厂牌型号
    @NotNull(groups = { "fastInfo" })
    private String brandModel;


    //车型名称
    @NotNull(groups = { "fastInfo" })
    private String modelName;


    //车牌号
    @NotNull(groups = { "fastInfo" })
    private String licensePlateColor;



}
