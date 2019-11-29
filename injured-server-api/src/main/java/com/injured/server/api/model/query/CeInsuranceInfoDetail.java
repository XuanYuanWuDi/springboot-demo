package com.injured.server.api.model.query;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.injured.server.api.entity.CeInsuranceItem;
import com.injured.server.api.entity.CeInsuranceSpecial;

/**
 * @author 
 */
public class CeInsuranceInfoDetail implements Serializable {
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
     * 承保公司ID
     */
    private String companySubCode;

    /**
     * 承保公司编码（码表见数据字典《保险公司》）
     */
    private String companyCode;

    /**
     * 承保公司名称
     */
    private String companyName;

    /**
     * 续保单号（上次保单号）
     */
    private String renewalInsuranceNo;

    /**
     * 险种：1 交强险；2 商业险（码表见数据字典《险种类型》）
     */
    private String insuranceCategory;

    /**
     * 起保日期
     */
    private Date startDate;

    /**
     * 终保日期
     */
    private Date endDate;

    /**
     * 投保人
     */
    private String policyHolder;

    /**
     * 投保人电话
     */
    private String bearTel;

    /**
     * 所属性质，字典信息《所属性质》
     */
    private String nature;

    /**
     * 被保险人
     */
    private String insuredName;

    /**
     * 被保险人性别 0： 未知的性别 1：男性 2：女性 9：未说明
     */
    private String insuredGender;

    /**
     * 被保险人证件类型（码表见数据字典《证件类型代码》）
     */
    private String insuredIdentifyType;

    /**
     * 被保险人身份证号
     */
    private String insuredIdentify;

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
     * 被保险人邮政编码
     */
    private String insuredZipCode;

    /**
     * 被保险人单位性质（码表见数据字典《被保险人单位性质》）
     */
    private String insuredUnitNature;

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
     * 签单日期
     */
    private Date signDate;

    /**
     * 初登日期 
     */
    private Date firstRegistrationDate;

    /**
     * 承保指定驾驶员1
     */
    private String appointDriver1;

    /**
     * 承保指定驾驶员2
     */
    private String appointDriver2;

    /**
     * NCD系数
     */
    private BigDecimal ncd;

    /**
     * 折扣率（NCD * 交通违法系数 * 自主核保系数 * 核保渠道系数）
     */
    private BigDecimal discount;

    /**
     * 调整比例（保险公司人工调整比例）
     */
    private BigDecimal adjustmentRatio;

    /**
     * 车牌号 
     */
    private String licensePlateNo;

    /**
     * 港澳号码
     */
    private String hkmacVehicleRegistrationNo;

    /**
     * 车主
     */
    private String owner;

    /**
     * 车架号
     */
    private String vehicleFrameNo;

    /**
     * 发动机号
     */
    private String engineNo;

    /**
     * 号牌底色（码表见数据字典《号牌底色》）
     */
    private String plateColor;

    /**
     * 车身颜色
     */
    private String vehicleColor;

    /**
     * 车辆种类 
     */
    private String carKindCode;

    /**
     * 车身类型(车身形式)编码
     */
    private String bodyTypeCode;

    /**
     * 进口/国产车
     */
    private String importDomestic;

    /**
     * 行驶区域 
     */
    private String drivingArea;

    /**
     * 行驶里程
     */
    private BigDecimal mileage;

    /**
     * 车型名称 
     */
    private String vehicleModelName;

    /**
     * 车型代码
     */
    private String vehicleModelCode;

    /**
     * 厂牌型号(公告号)
     */
    private String brandModel;

    /**
     * 新车购置价
     */
    private BigDecimal newVehiclePrice;

    /**
     * 实际价值
     */
    private BigDecimal vehiclePrice;

    /**
     * 使用性质
     */
    private String usingProperties;

    /**
     * 核定载客载质量（人/千克）
     */
    private String seatsQualities;

    /**
     * 整备质量(车辆自重，单位：吨)
     */
    private BigDecimal tonnage;

    /**
     * 车辆已使用年限
     */
    private Byte usedYears;

    /**
     * 是否员工车
     */
    private String isEmployeeCar;

    /**
     * 基本险条款类别（码表见数据字典《基本条款类别》）
     */
    private String basicInsuranceCategory;

    /**
     * 争议解决方式（码表见数据字典《争议解决方式》）
     */
    private String disputeResolution;

    /**
     * 停驶起始日期
     */
    private Date stopStartDate;

    /**
     * 停驶结束日期
     */
    private Date stopEndDate;

    /**
     * 批改次数
     */
    private Integer modifiedTimes;

    /**
     * 赔款次数
     */
    private Integer paidTimes;

    /**
     * 赔款总计
     */
    private BigDecimal paidTotal;

    /**
     * 上年承保保险公司编码
     */
    private String lastCompanyCode;

    /**
     * 上年承保保险公司名称
     */
    private String lastCompanyName;

    /**
     * 出险次数
     */
    private Integer eventCount;

    /**
     * 出单机构编码
     */
    private String comCode;

    /**
     * 出单机构名称
     */
    private String comName;

    /**
     * 出单机构地址
     */
    private String comAddress;

    /**
     * 业务渠道（码表见数据字典《销售渠道代码》）
     */
    private String channels;

    /**
     * 代理人/公司名称
     */
    private String agencyName;

    /**
     * 是否过户车
     */
    private Byte isTransfer;

    /**
     * 是否续保业务
     */
    private String isContinuousPolicy;

    /**
     * 是否删除 0：否 1：是
     */
    private Boolean isDelete;

    /**
     * 备注
     */
    private String remark;

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
    
    /**
     * 保单特殊约定
     */
    private List<CeInsuranceSpecial> seInsuranceSpecials;
    
    /**
     * 承保险种
     */
    private List<CeInsuranceItem> ceInsuranceItems;

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

    public String getCompanySubCode() {
        return companySubCode;
    }

    public void setCompanySubCode(String companySubCode) {
        this.companySubCode = companySubCode;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getRenewalInsuranceNo() {
        return renewalInsuranceNo;
    }

    public void setRenewalInsuranceNo(String renewalInsuranceNo) {
        this.renewalInsuranceNo = renewalInsuranceNo;
    }

    public String getInsuranceCategory() {
        return insuranceCategory;
    }

    public void setInsuranceCategory(String insuranceCategory) {
        this.insuranceCategory = insuranceCategory;
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

    public String getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(String policyHolder) {
        this.policyHolder = policyHolder;
    }

    public String getBearTel() {
        return bearTel;
    }

    public void setBearTel(String bearTel) {
        this.bearTel = bearTel;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
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

    public String getInsuredIdentify() {
        return insuredIdentify;
    }

    public void setInsuredIdentify(String insuredIdentify) {
        this.insuredIdentify = insuredIdentify;
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

    public String getInsuredZipCode() {
        return insuredZipCode;
    }

    public void setInsuredZipCode(String insuredZipCode) {
        this.insuredZipCode = insuredZipCode;
    }

    public String getInsuredUnitNature() {
        return insuredUnitNature;
    }

    public void setInsuredUnitNature(String insuredUnitNature) {
        this.insuredUnitNature = insuredUnitNature;
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

    public BigDecimal getNcd() {
        return ncd;
    }

    public void setNcd(BigDecimal ncd) {
        this.ncd = ncd;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getAdjustmentRatio() {
        return adjustmentRatio;
    }

    public void setAdjustmentRatio(BigDecimal adjustmentRatio) {
        this.adjustmentRatio = adjustmentRatio;
    }

    public String getLicensePlateNo() {
        return licensePlateNo;
    }

    public void setLicensePlateNo(String licensePlateNo) {
        this.licensePlateNo = licensePlateNo;
    }

    public String getHkmacVehicleRegistrationNo() {
        return hkmacVehicleRegistrationNo;
    }

    public void setHkmacVehicleRegistrationNo(String hkmacVehicleRegistrationNo) {
        this.hkmacVehicleRegistrationNo = hkmacVehicleRegistrationNo;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getVehicleFrameNo() {
        return vehicleFrameNo;
    }

    public void setVehicleFrameNo(String vehicleFrameNo) {
        this.vehicleFrameNo = vehicleFrameNo;
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

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public String getCarKindCode() {
        return carKindCode;
    }

    public void setCarKindCode(String carKindCode) {
        this.carKindCode = carKindCode;
    }

    public String getBodyTypeCode() {
        return bodyTypeCode;
    }

    public void setBodyTypeCode(String bodyTypeCode) {
        this.bodyTypeCode = bodyTypeCode;
    }

    public String getImportDomestic() {
        return importDomestic;
    }

    public void setImportDomestic(String importDomestic) {
        this.importDomestic = importDomestic;
    }

    public String getDrivingArea() {
        return drivingArea;
    }

    public void setDrivingArea(String drivingArea) {
        this.drivingArea = drivingArea;
    }

    public BigDecimal getMileage() {
        return mileage;
    }

    public void setMileage(BigDecimal mileage) {
        this.mileage = mileage;
    }

    public String getVehicleModelName() {
        return vehicleModelName;
    }

    public void setVehicleModelName(String vehicleModelName) {
        this.vehicleModelName = vehicleModelName;
    }

    public String getVehicleModelCode() {
        return vehicleModelCode;
    }

    public void setVehicleModelCode(String vehicleModelCode) {
        this.vehicleModelCode = vehicleModelCode;
    }

    public String getBrandModel() {
        return brandModel;
    }

    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel;
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

    public String getUsingProperties() {
        return usingProperties;
    }

    public void setUsingProperties(String usingProperties) {
        this.usingProperties = usingProperties;
    }

    public String getSeatsQualities() {
        return seatsQualities;
    }

    public void setSeatsQualities(String seatsQualities) {
        this.seatsQualities = seatsQualities;
    }

    public BigDecimal getTonnage() {
        return tonnage;
    }

    public void setTonnage(BigDecimal tonnage) {
        this.tonnage = tonnage;
    }

    public Byte getUsedYears() {
        return usedYears;
    }

    public void setUsedYears(Byte usedYears) {
        this.usedYears = usedYears;
    }

    public String getIsEmployeeCar() {
        return isEmployeeCar;
    }

    public void setIsEmployeeCar(String isEmployeeCar) {
        this.isEmployeeCar = isEmployeeCar;
    }

    public String getBasicInsuranceCategory() {
        return basicInsuranceCategory;
    }

    public void setBasicInsuranceCategory(String basicInsuranceCategory) {
        this.basicInsuranceCategory = basicInsuranceCategory;
    }

    public String getDisputeResolution() {
        return disputeResolution;
    }

    public void setDisputeResolution(String disputeResolution) {
        this.disputeResolution = disputeResolution;
    }

    public Date getStopStartDate() {
        return stopStartDate;
    }

    public void setStopStartDate(Date stopStartDate) {
        this.stopStartDate = stopStartDate;
    }

    public Date getStopEndDate() {
        return stopEndDate;
    }

    public void setStopEndDate(Date stopEndDate) {
        this.stopEndDate = stopEndDate;
    }

    public Integer getModifiedTimes() {
        return modifiedTimes;
    }

    public void setModifiedTimes(Integer modifiedTimes) {
        this.modifiedTimes = modifiedTimes;
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

    public String getLastCompanyCode() {
        return lastCompanyCode;
    }

    public void setLastCompanyCode(String lastCompanyCode) {
        this.lastCompanyCode = lastCompanyCode;
    }

    public String getLastCompanyName() {
        return lastCompanyName;
    }

    public void setLastCompanyName(String lastCompanyName) {
        this.lastCompanyName = lastCompanyName;
    }

    public Integer getEventCount() {
        return eventCount;
    }

    public void setEventCount(Integer eventCount) {
        this.eventCount = eventCount;
    }

    public String getComCode() {
        return comCode;
    }

    public void setComCode(String comCode) {
        this.comCode = comCode;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getComAddress() {
        return comAddress;
    }

    public void setComAddress(String comAddress) {
        this.comAddress = comAddress;
    }

    public String getChannels() {
        return channels;
    }

    public void setChannels(String channels) {
        this.channels = channels;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public Byte getIsTransfer() {
        return isTransfer;
    }

    public void setIsTransfer(Byte isTransfer) {
        this.isTransfer = isTransfer;
    }

    public String getIsContinuousPolicy() {
        return isContinuousPolicy;
    }

    public void setIsContinuousPolicy(String isContinuousPolicy) {
        this.isContinuousPolicy = isContinuousPolicy;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

	public List<CeInsuranceSpecial> getSeInsuranceSpecials() {
		return seInsuranceSpecials;
	}

	public void setSeInsuranceSpecials(List<CeInsuranceSpecial> seInsuranceSpecials) {
		this.seInsuranceSpecials = seInsuranceSpecials;
	}

	public List<CeInsuranceItem> getCeInsuranceItems() {
		return ceInsuranceItems;
	}

	public void setCeInsuranceItems(List<CeInsuranceItem> ceInsuranceItems) {
		this.ceInsuranceItems = ceInsuranceItems;
	}
}