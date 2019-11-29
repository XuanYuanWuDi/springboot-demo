package com.injured.server.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class CeInsurance implements Serializable {
    /**
     * 序号
     */
    private Long id;

    /**
     * 案件ID
     */
    private Long registId;

    /**
     * 保单号
     */
    private String policyNo;

    /**
     * 报案号
     */
    private String claimNotificationNo;

    /**
     * 保险公司
     */
    private String companyCode;

    /**
     * 承保公司ID
     */
    private Integer companyId;

    /**
     * 承保保险公司名称
     */
    private String companyName;

    /**
     * 号牌底色
     */
    private String plateColor;

    /**
     * 承保指定驾驶员1
     */
    private String appointDriver1;

    /**
     * 承保指定驾驶员2
     */
    private String appointDriver2;

    /**
     * 险种
     */
    private String insuranceCategory;

    /**
     * 标准保费
     */
    private BigDecimal insuranceStandardFee;

    /**
     * 总保费
     */
    private BigDecimal insuranceFee;

    /**
     * 总保额
     */
    private BigDecimal insuranceAmount;

    /**
     * 起保日期
     */
    private Date startDate;

    /**
     * 终保日期
     */
    private Date endDate;

    /**
     * 签单日期
     */
    private Date signDate;

    /**
     * 初登日期
     */
    private Date firstRegistrationDate;

    /**
     * 整备质量
     */
    private BigDecimal tonnage;

    /**
     * 折扣率
     */
    private BigDecimal discount;

    /**
     * 业务渠道
     */
    private String channels;

    /**
     * 新车购置价
     */
    private BigDecimal newVehiclePrice;

    /**
     * 实际价值
     */
    private BigDecimal vehiclePrice;

    /**
     * 投保人
     */
    private String policyHolder;

    /**
     * 所属性质
     */
    private String nature;

    /**
     * 是否即时生效保单
     */
    private String isEffectImmediately;

    /**
     * 是否续保业务
     */
    private String isContinuousPolicy;

    /**
     * 是否过户车
     */
    private Byte isTransfer;

    /**
     * 使用性质
     */
    private String usingProperties;

    /**
     * 赔款次数
     */
    private Integer paidTimes;

    /**
     * 赔款总计
     */
    private BigDecimal paidTotal;

    /**
     * 行驶里程
     */
    private BigDecimal drivingMileage;

    /**
     * 发动机号
     */
    private String engineNo;

    /**
     * 核定载客数
     */
    private Integer passengerVolume;

    /**
     * 核定载质量
     */
    private Integer payloadMass;

    /**
     * 出险次数
     */
    private Integer eventCount;

    /**
     * 出单机构编码
     */
    private String issueCompanyCode;

    /**
     * 出单机构名称
     */
    private String issueCompanyName;

    /**
     * 出单机构地址
     */
    private String issueCompanyAddress;

    /**
     * 投保人电话
     */
    private String bearTel;

    /**
     * 车主
     */
    private String owner;

    /**
     * 车型名称
     */
    private String modelName;

    /**
     * 车辆型号
     */
    private String modelCode;

    /**
     * 厂牌型号
     */
    private String brandModel;

    /**
     * 车身颜色
     */
    private String vehicleColor;

    /**
     * 是否员工车
     */
    private String isEmployeeCar;

    /**
     * 车牌号
     */
    private String licensePlateNo;

    /**
     * 港澳号码
     */
    private String hkmacLicensePlateNo;

    /**
     * 车辆种类
     */
    private String carKindCode;

    /**
     * 车身大类
     */
    private String vehTypeCode;

    /**
     * 车身类型
     */
    private String bodyTypeCode;

    /**
     * 车辆已使用年限
     */
    private Byte usedYears;

    /**
     * 进口/国产车
     */
    private String importDomestic;

    /**
     * 车架号
     */
    private String vehicleFrameNo;

    /**
     * 被保险人性别
     */
    private String insuredGender;

    /**
     * 被保险人证件类型
     */
    private String insuredIdentifyType;

    /**
     * 被保险人证件号码
     */
    private String insuredIdentifyNo;

    /**
     * 被保险人星级
     */
    private String insuredLevel;

    /**
     * 被保险人电话
     */
    private String insuredMobilephone;

    /**
     * 被保险人地址
     */
    private String insuredAddress;

    /**
     * 被保险人
     */
    private String insuredName;

    /**
     * 被保险人单位性质
     */
    private String insuredUnitNature;

    /**
     * 备注
     */
    private String remark;

    /**
     * 代理人/公司名称
     */
    private String agencyName;

    /**
     * 连续投保年数
     */
    private Integer continuousYears;

    /**
     * 历史年份投保单号，示例：83636819|2019、3722377|2018、保单号|年份
     */
    private String policyNoHist;

    /**
     * 是否删除
     */
    private Boolean isDelete;

    /**
     * 扩展属性
     */
    private String ext;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRegistId() {
        return registId;
    }

    public void setRegistId(Long registId) {
        this.registId = registId;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getClaimNotificationNo() {
        return claimNotificationNo;
    }

    public void setClaimNotificationNo(String claimNotificationNo) {
        this.claimNotificationNo = claimNotificationNo;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPlateColor() {
        return plateColor;
    }

    public void setPlateColor(String plateColor) {
        this.plateColor = plateColor;
    }

    public String getAppointDriver1() {
        return appointDriver1;
    }

    public void setAppointDriver1(String appointDriver1) {
        this.appointDriver1 = appointDriver1;
    }

    public String getAppointDriver2() {
        return appointDriver2;
    }

    public void setAppointDriver2(String appointDriver2) {
        this.appointDriver2 = appointDriver2;
    }

    public String getInsuranceCategory() {
        return insuranceCategory;
    }

    public void setInsuranceCategory(String insuranceCategory) {
        this.insuranceCategory = insuranceCategory;
    }

    public BigDecimal getInsuranceStandardFee() {
        return insuranceStandardFee;
    }

    public void setInsuranceStandardFee(BigDecimal insuranceStandardFee) {
        this.insuranceStandardFee = insuranceStandardFee;
    }

    public BigDecimal getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(BigDecimal insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    public BigDecimal getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(BigDecimal insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public Date getFirstRegistrationDate() {
        return firstRegistrationDate;
    }

    public void setFirstRegistrationDate(Date firstRegistrationDate) {
        this.firstRegistrationDate = firstRegistrationDate;
    }

    public BigDecimal getTonnage() {
        return tonnage;
    }

    public void setTonnage(BigDecimal tonnage) {
        this.tonnage = tonnage;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public String getChannels() {
        return channels;
    }

    public void setChannels(String channels) {
        this.channels = channels;
    }

    public BigDecimal getNewVehiclePrice() {
        return newVehiclePrice;
    }

    public void setNewVehiclePrice(BigDecimal newVehiclePrice) {
        this.newVehiclePrice = newVehiclePrice;
    }

    public BigDecimal getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(BigDecimal vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    public String getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(String policyHolder) {
        this.policyHolder = policyHolder;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getIsEffectImmediately() {
        return isEffectImmediately;
    }

    public void setIsEffectImmediately(String isEffectImmediately) {
        this.isEffectImmediately = isEffectImmediately;
    }

    public String getIsContinuousPolicy() {
        return isContinuousPolicy;
    }

    public void setIsContinuousPolicy(String isContinuousPolicy) {
        this.isContinuousPolicy = isContinuousPolicy;
    }

    public Byte getIsTransfer() {
        return isTransfer;
    }

    public void setIsTransfer(Byte isTransfer) {
        this.isTransfer = isTransfer;
    }

    public String getUsingProperties() {
        return usingProperties;
    }

    public void setUsingProperties(String usingProperties) {
        this.usingProperties = usingProperties;
    }

    public Integer getPaidTimes() {
        return paidTimes;
    }

    public void setPaidTimes(Integer paidTimes) {
        this.paidTimes = paidTimes;
    }

    public BigDecimal getPaidTotal() {
        return paidTotal;
    }

    public void setPaidTotal(BigDecimal paidTotal) {
        this.paidTotal = paidTotal;
    }

    public BigDecimal getDrivingMileage() {
        return drivingMileage;
    }

    public void setDrivingMileage(BigDecimal drivingMileage) {
        this.drivingMileage = drivingMileage;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public Integer getPassengerVolume() {
        return passengerVolume;
    }

    public void setPassengerVolume(Integer passengerVolume) {
        this.passengerVolume = passengerVolume;
    }

    public Integer getPayloadMass() {
        return payloadMass;
    }

    public void setPayloadMass(Integer payloadMass) {
        this.payloadMass = payloadMass;
    }

    public Integer getEventCount() {
        return eventCount;
    }

    public void setEventCount(Integer eventCount) {
        this.eventCount = eventCount;
    }

    public String getIssueCompanyCode() {
        return issueCompanyCode;
    }

    public void setIssueCompanyCode(String issueCompanyCode) {
        this.issueCompanyCode = issueCompanyCode;
    }

    public String getIssueCompanyName() {
        return issueCompanyName;
    }

    public void setIssueCompanyName(String issueCompanyName) {
        this.issueCompanyName = issueCompanyName;
    }

    public String getIssueCompanyAddress() {
        return issueCompanyAddress;
    }

    public void setIssueCompanyAddress(String issueCompanyAddress) {
        this.issueCompanyAddress = issueCompanyAddress;
    }

    public String getBearTel() {
        return bearTel;
    }

    public void setBearTel(String bearTel) {
        this.bearTel = bearTel;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public String getBrandModel() {
        return brandModel;
    }

    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public String getIsEmployeeCar() {
        return isEmployeeCar;
    }

    public void setIsEmployeeCar(String isEmployeeCar) {
        this.isEmployeeCar = isEmployeeCar;
    }

    public String getLicensePlateNo() {
        return licensePlateNo;
    }

    public void setLicensePlateNo(String licensePlateNo) {
        this.licensePlateNo = licensePlateNo;
    }

    public String getHkmacLicensePlateNo() {
        return hkmacLicensePlateNo;
    }

    public void setHkmacLicensePlateNo(String hkmacLicensePlateNo) {
        this.hkmacLicensePlateNo = hkmacLicensePlateNo;
    }

    public String getCarKindCode() {
        return carKindCode;
    }

    public void setCarKindCode(String carKindCode) {
        this.carKindCode = carKindCode;
    }

    public String getVehTypeCode() {
        return vehTypeCode;
    }

    public void setVehTypeCode(String vehTypeCode) {
        this.vehTypeCode = vehTypeCode;
    }

    public String getBodyTypeCode() {
        return bodyTypeCode;
    }

    public void setBodyTypeCode(String bodyTypeCode) {
        this.bodyTypeCode = bodyTypeCode;
    }

    public Byte getUsedYears() {
        return usedYears;
    }

    public void setUsedYears(Byte usedYears) {
        this.usedYears = usedYears;
    }

    public String getImportDomestic() {
        return importDomestic;
    }

    public void setImportDomestic(String importDomestic) {
        this.importDomestic = importDomestic;
    }

    public String getVehicleFrameNo() {
        return vehicleFrameNo;
    }

    public void setVehicleFrameNo(String vehicleFrameNo) {
        this.vehicleFrameNo = vehicleFrameNo;
    }

    public String getInsuredGender() {
        return insuredGender;
    }

    public void setInsuredGender(String insuredGender) {
        this.insuredGender = insuredGender;
    }

    public String getInsuredIdentifyType() {
        return insuredIdentifyType;
    }

    public void setInsuredIdentifyType(String insuredIdentifyType) {
        this.insuredIdentifyType = insuredIdentifyType;
    }

    public String getInsuredIdentifyNo() {
        return insuredIdentifyNo;
    }

    public void setInsuredIdentifyNo(String insuredIdentifyNo) {
        this.insuredIdentifyNo = insuredIdentifyNo;
    }

    public String getInsuredLevel() {
        return insuredLevel;
    }

    public void setInsuredLevel(String insuredLevel) {
        this.insuredLevel = insuredLevel;
    }

    public String getInsuredMobilephone() {
        return insuredMobilephone;
    }

    public void setInsuredMobilephone(String insuredMobilephone) {
        this.insuredMobilephone = insuredMobilephone;
    }

    public String getInsuredAddress() {
        return insuredAddress;
    }

    public void setInsuredAddress(String insuredAddress) {
        this.insuredAddress = insuredAddress;
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }

    public String getInsuredUnitNature() {
        return insuredUnitNature;
    }

    public void setInsuredUnitNature(String insuredUnitNature) {
        this.insuredUnitNature = insuredUnitNature;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public Integer getContinuousYears() {
        return continuousYears;
    }

    public void setContinuousYears(Integer continuousYears) {
        this.continuousYears = continuousYears;
    }

    public String getPolicyNoHist() {
        return policyNoHist;
    }

    public void setPolicyNoHist(String policyNoHist) {
        this.policyNoHist = policyNoHist;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}