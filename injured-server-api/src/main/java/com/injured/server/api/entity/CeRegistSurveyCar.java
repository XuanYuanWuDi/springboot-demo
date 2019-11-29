package com.injured.server.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class CeRegistSurveyCar implements Serializable {
    /**
     * 序号
     */
    private Long id;

    /**
     * 报案表ID
     */
    private Long registId;

    /**
     * 查勘表ID
     */
    private Long ceRegistSurveyId;

    /**
     * 报案号
     */
    private String claimNotificationNo;

    /**
     * 是否标的
     */
    private String subjectThird;

    /**
     * 车牌号码
     */
    private String licensePlateNo;

    /**
     * 粤港澳车牌号码
     */
    private String hkmacLicensePlateNo;

    /**
     * 车主
     */
    private String owner;

    /**
     * 被保险人
     */
    private String insuredName;

    /**
     * 交强险保单号
     */
    private String bzPolicyNo;

    /**
     * 交强险承保公司
     */
    private String bzCompanyCode;

    /**
     * 承保分公司名称
     */
    private String subCompanyName;

    /**
     * 车辆型号
     */
    private String modelCode;

    /**
     * 车型名称
     */
    private String modelName;

    /**
     * 车辆品牌
     */
    private String vehicleBrandCode;

    /**
     * 车系
     */
    private String vehicleSeriesCode;

    /**
     * 车组
     */
    private String groupVehCode;

    /**
     * 厂商编码
     */
    private String manuCode;

    /**
     * 变速器类型
     */
    private String transmissionCode;

    /**
     * 变速器类型名称
     */
    private String transmissionName;

    /**
     * 车架号
     */
    private String vin;

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
     * 厂牌型号
     */
    private String brandModel;

    /**
     * 号牌种类
     */
    private String licensePlateType;

    /**
     * 发动机号
     */
    private String engineNo;

    /**
     * 号牌底色
     */
    private String plateColor;

    /**
     * 核定载客
     */
    private Integer seatCount;

    /**
     * 车身颜色
     */
    private String vehicleColor;

    /**
     * 是否改装或加装
     */
    private Boolean isModification;

    /**
     * 行驶本地址
     */
    private String drivingLicenseAddress;

    /**
     * 行驶证初登日期
     */
    private Date drivingFirstDate;

    /**
     * 注册日期
     */
    private Date registrationDate;

    /**
     * 年检日期
     */
    private Date asDate;

    /**
     * 查勘次数
     */
    private Integer checkNum;

    /**
     * 预约定损地点类型
     */
    private String reserveEstimateAddress;

    /**
     * 新车购置价
     */
    private BigDecimal newVehiclePrice;

    /**
     * 有无损失
     */
    private Boolean isLoss;

    /**
     * 是否全损车
     */
    private String isTotalLoss;

    /**
     * 损失程度
     */
    private String lossDegree;

    /**
     * 损失部位
     */
    private String lossPartData;

    /**
     * 是否运载危险品
     */
    private Boolean isCarryingDangerousGoods;

    /**
     * 是否已上牌
     */
    private Boolean hasCarLicense;

    /**
     * 是否包含人伤
     */
    private String isPersonInjured;

    /**
     * 是否包含物损
     */
    private String isProtectLoss;

    /**
     * 是否需施救
     */
    private String isRescue;

    /**
     * 是否需拆解
     */
    private String isDisassemble;

    /**
     * 使用性质
     */
    private String usingProperties;

    /**
     * 施救单位
     */
    private String rescueCompany;

    /**
     * 施救方式
     */
    private String rescueWay;

    /**
     * 施救路况
     */
    private String rescueTraffic;

    /**
     * 施救距离（千米）
     */
    private BigDecimal rescueDistance;

    /**
     * 特殊因素
     */
    private String specificFactor;

    /**
     * 施救金额
     */
    private BigDecimal rescueAmount;

    /**
     * 估损金额
     */
    private BigDecimal estimatedLossAmount;

    /**
     * 备注
     */
    private String remark;

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

    public Long getCeRegistSurveyId() {
        return ceRegistSurveyId;
    }

    public void setCeRegistSurveyId(Long ceRegistSurveyId) {
        this.ceRegistSurveyId = ceRegistSurveyId;
    }

    public String getClaimNotificationNo() {
        return claimNotificationNo;
    }

    public void setClaimNotificationNo(String claimNotificationNo) {
        this.claimNotificationNo = claimNotificationNo;
    }

    public String getSubjectThird() {
        return subjectThird;
    }

    public void setSubjectThird(String subjectThird) {
        this.subjectThird = subjectThird;
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }

    public String getBzPolicyNo() {
        return bzPolicyNo;
    }

    public void setBzPolicyNo(String bzPolicyNo) {
        this.bzPolicyNo = bzPolicyNo;
    }

    public String getBzCompanyCode() {
        return bzCompanyCode;
    }

    public void setBzCompanyCode(String bzCompanyCode) {
        this.bzCompanyCode = bzCompanyCode;
    }

    public String getSubCompanyName() {
        return subCompanyName;
    }

    public void setSubCompanyName(String subCompanyName) {
        this.subCompanyName = subCompanyName;
    }

    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getVehicleBrandCode() {
        return vehicleBrandCode;
    }

    public void setVehicleBrandCode(String vehicleBrandCode) {
        this.vehicleBrandCode = vehicleBrandCode;
    }

    public String getVehicleSeriesCode() {
        return vehicleSeriesCode;
    }

    public void setVehicleSeriesCode(String vehicleSeriesCode) {
        this.vehicleSeriesCode = vehicleSeriesCode;
    }

    public String getGroupVehCode() {
        return groupVehCode;
    }

    public void setGroupVehCode(String groupVehCode) {
        this.groupVehCode = groupVehCode;
    }

    public String getManuCode() {
        return manuCode;
    }

    public void setManuCode(String manuCode) {
        this.manuCode = manuCode;
    }

    public String getTransmissionCode() {
        return transmissionCode;
    }

    public void setTransmissionCode(String transmissionCode) {
        this.transmissionCode = transmissionCode;
    }

    public String getTransmissionName() {
        return transmissionName;
    }

    public void setTransmissionName(String transmissionName) {
        this.transmissionName = transmissionName;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
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

    public String getBrandModel() {
        return brandModel;
    }

    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel;
    }

    public String getLicensePlateType() {
        return licensePlateType;
    }

    public void setLicensePlateType(String licensePlateType) {
        this.licensePlateType = licensePlateType;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public String getPlateColor() {
        return plateColor;
    }

    public void setPlateColor(String plateColor) {
        this.plateColor = plateColor;
    }

    public Integer getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(Integer seatCount) {
        this.seatCount = seatCount;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public Boolean getIsModification() {
        return isModification;
    }

    public void setIsModification(Boolean isModification) {
        this.isModification = isModification;
    }

    public String getDrivingLicenseAddress() {
        return drivingLicenseAddress;
    }

    public void setDrivingLicenseAddress(String drivingLicenseAddress) {
        this.drivingLicenseAddress = drivingLicenseAddress;
    }

    public Date getDrivingFirstDate() {
        return drivingFirstDate;
    }

    public void setDrivingFirstDate(Date drivingFirstDate) {
        this.drivingFirstDate = drivingFirstDate;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getAsDate() {
        return asDate;
    }

    public void setAsDate(Date asDate) {
        this.asDate = asDate;
    }

    public Integer getCheckNum() {
        return checkNum;
    }

    public void setCheckNum(Integer checkNum) {
        this.checkNum = checkNum;
    }

    public String getReserveEstimateAddress() {
        return reserveEstimateAddress;
    }

    public void setReserveEstimateAddress(String reserveEstimateAddress) {
        this.reserveEstimateAddress = reserveEstimateAddress;
    }

    public BigDecimal getNewVehiclePrice() {
        return newVehiclePrice;
    }

    public void setNewVehiclePrice(BigDecimal newVehiclePrice) {
        this.newVehiclePrice = newVehiclePrice;
    }

    public Boolean getIsLoss() {
        return isLoss;
    }

    public void setIsLoss(Boolean isLoss) {
        this.isLoss = isLoss;
    }

    public String getIsTotalLoss() {
        return isTotalLoss;
    }

    public void setIsTotalLoss(String isTotalLoss) {
        this.isTotalLoss = isTotalLoss;
    }

    public String getLossDegree() {
        return lossDegree;
    }

    public void setLossDegree(String lossDegree) {
        this.lossDegree = lossDegree;
    }

    public String getLossPartData() {
        return lossPartData;
    }

    public void setLossPartData(String lossPartData) {
        this.lossPartData = lossPartData;
    }

    public Boolean getIsCarryingDangerousGoods() {
        return isCarryingDangerousGoods;
    }

    public void setIsCarryingDangerousGoods(Boolean isCarryingDangerousGoods) {
        this.isCarryingDangerousGoods = isCarryingDangerousGoods;
    }

    public Boolean getHasCarLicense() {
        return hasCarLicense;
    }

    public void setHasCarLicense(Boolean hasCarLicense) {
        this.hasCarLicense = hasCarLicense;
    }

    public String getIsPersonInjured() {
        return isPersonInjured;
    }

    public void setIsPersonInjured(String isPersonInjured) {
        this.isPersonInjured = isPersonInjured;
    }

    public String getIsProtectLoss() {
        return isProtectLoss;
    }

    public void setIsProtectLoss(String isProtectLoss) {
        this.isProtectLoss = isProtectLoss;
    }

    public String getIsRescue() {
        return isRescue;
    }

    public void setIsRescue(String isRescue) {
        this.isRescue = isRescue;
    }

    public String getIsDisassemble() {
        return isDisassemble;
    }

    public void setIsDisassemble(String isDisassemble) {
        this.isDisassemble = isDisassemble;
    }

    public String getUsingProperties() {
        return usingProperties;
    }

    public void setUsingProperties(String usingProperties) {
        this.usingProperties = usingProperties;
    }

    public String getRescueCompany() {
        return rescueCompany;
    }

    public void setRescueCompany(String rescueCompany) {
        this.rescueCompany = rescueCompany;
    }

    public String getRescueWay() {
        return rescueWay;
    }

    public void setRescueWay(String rescueWay) {
        this.rescueWay = rescueWay;
    }

    public String getRescueTraffic() {
        return rescueTraffic;
    }

    public void setRescueTraffic(String rescueTraffic) {
        this.rescueTraffic = rescueTraffic;
    }

    public BigDecimal getRescueDistance() {
        return rescueDistance;
    }

    public void setRescueDistance(BigDecimal rescueDistance) {
        this.rescueDistance = rescueDistance;
    }

    public String getSpecificFactor() {
        return specificFactor;
    }

    public void setSpecificFactor(String specificFactor) {
        this.specificFactor = specificFactor;
    }

    public BigDecimal getRescueAmount() {
        return rescueAmount;
    }

    public void setRescueAmount(BigDecimal rescueAmount) {
        this.rescueAmount = rescueAmount;
    }

    public BigDecimal getEstimatedLossAmount() {
        return estimatedLossAmount;
    }

    public void setEstimatedLossAmount(BigDecimal estimatedLossAmount) {
        this.estimatedLossAmount = estimatedLossAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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