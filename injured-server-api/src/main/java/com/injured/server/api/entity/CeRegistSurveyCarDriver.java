package com.injured.server.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class CeRegistSurveyCarDriver implements Serializable {
    /**
     * 序号
     */
    private Long id;

    /**
     * 查勘车辆ID
     */
    private Long ceRegistSurveyCarId;

    /**
     * 报案表ID
     */
    private Long registId;

    /**
     * 报案号
     */
    private String claimNotificationNo;

    /**
     * 车牌号
     */
    private String licensePlateNo;

    /**
     * 粤港澳车牌号码
     */
    private String hkmacLicensePlateNo;

    /**
     * 驾驶员姓名
     */
    private String driverName;

    /**
     * 出生日期
     */
    private Date driverBirth;

    /**
     * 证件类型
     */
    private String identifyType;

    /**
     * 身份证号码
     */
    private String identifyNumber;

    /**
     * 驾驶证号码
     */
    private String drivingLicenseNo;

    /**
     * 驾驶证档案编码
     */
    private String drivingLicenseArchivesNo;

    /**
     * 驾照类型
     */
    private String drivingIdentifyType;

    /**
     * 准驾车型
     */
    private String allowDrivingVehicle;

    /**
     * 驾驶员职业
     */
    private String driverOccupation;

    /**
     * 驾驶员性别
     */
    private String driverSex;

    /**
     * 驾驶员年龄
     */
    private Integer driverAge;

    /**
     * 驾驶员联系电话
     */
    private String driverPhone;

    /**
     * 驾驶员的驾驶证是否有效
     */
    private Boolean isDrivingLicenseEffective;

    /**
     * 驾驶员单位或家庭地址
     */
    private String driverAddress;

    /**
     * 初次领证日期
     */
    private Date drivingLicenseDate;

    /**
     * 颁证机关
     */
    private String driverLicenseInstitution;

    /**
     * 是否为酒后驾车
     */
    private Byte isDrinkingDriving;

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

    public Long getCeRegistSurveyCarId() {
        return ceRegistSurveyCarId;
    }

    public void setCeRegistSurveyCarId(Long ceRegistSurveyCarId) {
        this.ceRegistSurveyCarId = ceRegistSurveyCarId;
    }

    public Long getRegistId() {
        return registId;
    }

    public void setRegistId(Long registId) {
        this.registId = registId;
    }

    public String getClaimNotificationNo() {
        return claimNotificationNo;
    }

    public void setClaimNotificationNo(String claimNotificationNo) {
        this.claimNotificationNo = claimNotificationNo;
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

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public Date getDriverBirth() {
        return driverBirth;
    }

    public void setDriverBirth(Date driverBirth) {
        this.driverBirth = driverBirth;
    }

    public String getIdentifyType() {
        return identifyType;
    }

    public void setIdentifyType(String identifyType) {
        this.identifyType = identifyType;
    }

    public String getIdentifyNumber() {
        return identifyNumber;
    }

    public void setIdentifyNumber(String identifyNumber) {
        this.identifyNumber = identifyNumber;
    }

    public String getDrivingLicenseNo() {
        return drivingLicenseNo;
    }

    public void setDrivingLicenseNo(String drivingLicenseNo) {
        this.drivingLicenseNo = drivingLicenseNo;
    }

    public String getDrivingLicenseArchivesNo() {
        return drivingLicenseArchivesNo;
    }

    public void setDrivingLicenseArchivesNo(String drivingLicenseArchivesNo) {
        this.drivingLicenseArchivesNo = drivingLicenseArchivesNo;
    }

    public String getDrivingIdentifyType() {
        return drivingIdentifyType;
    }

    public void setDrivingIdentifyType(String drivingIdentifyType) {
        this.drivingIdentifyType = drivingIdentifyType;
    }

    public String getAllowDrivingVehicle() {
        return allowDrivingVehicle;
    }

    public void setAllowDrivingVehicle(String allowDrivingVehicle) {
        this.allowDrivingVehicle = allowDrivingVehicle;
    }

    public String getDriverOccupation() {
        return driverOccupation;
    }

    public void setDriverOccupation(String driverOccupation) {
        this.driverOccupation = driverOccupation;
    }

    public String getDriverSex() {
        return driverSex;
    }

    public void setDriverSex(String driverSex) {
        this.driverSex = driverSex;
    }

    public Integer getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(Integer driverAge) {
        this.driverAge = driverAge;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public Boolean getIsDrivingLicenseEffective() {
        return isDrivingLicenseEffective;
    }

    public void setIsDrivingLicenseEffective(Boolean isDrivingLicenseEffective) {
        this.isDrivingLicenseEffective = isDrivingLicenseEffective;
    }

    public String getDriverAddress() {
        return driverAddress;
    }

    public void setDriverAddress(String driverAddress) {
        this.driverAddress = driverAddress;
    }

    public Date getDrivingLicenseDate() {
        return drivingLicenseDate;
    }

    public void setDrivingLicenseDate(Date drivingLicenseDate) {
        this.drivingLicenseDate = drivingLicenseDate;
    }

    public String getDriverLicenseInstitution() {
        return driverLicenseInstitution;
    }

    public void setDriverLicenseInstitution(String driverLicenseInstitution) {
        this.driverLicenseInstitution = driverLicenseInstitution;
    }

    public Byte getIsDrinkingDriving() {
        return isDrinkingDriving;
    }

    public void setIsDrinkingDriving(Byte isDrinkingDriving) {
        this.isDrinkingDriving = isDrinkingDriving;
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