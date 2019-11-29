package com.injured.server.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class InjuredHouseholdRegistInfo implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 报案id
     */
    private Long registId;

    /**
     * 报案编号
     */
    private String claimNotificationNo;

    /**
     * 伤者ID
     */
    private Long surveyWouId;

    /**
     * 任务编号(查勘表ID)
     */
    private Long surveyId;

    /**
     * 关联调解基本信息表ID
     */
    private Long medBasicInfoId;

    /**
     * 保险公司ID
     */
    private Long companyId;

    /**
     * 保险公司CODE
     */
    private String compantCode;

    /**
     * 是否实地调查(CE)（码表见数据字典《是否判断》） 0-否，1-是
     */
    private Byte isFieldSurvey;

    /**
     * 适用户籍性质(CE)（码表见数据字典《户籍性质》）
     */
    private Byte resideNature;

    /**
     * 是否居住户籍地(CE)（码表见数据字典《是否判断》）
     */
    private Byte isResident;

    /**
     * 户籍地省(CE)  全国统一地域编码
     */
    private Long resideProvince;

    /**
     * 户籍地市(CE)
     */
    private Long resideCity;

    /**
     * 户籍地区县(CE)
     */
    private Long resideDistrict;

    /**
     * 户籍地乡镇(CE)
     */
    private Long resideTown;

    /**
     * 户籍地详址
     */
    private String resideAddress;

    /**
     * 常住地省(CE)
     */
    private Long perResidenceProvince;

    /**
     * 常住地市(CE)
     */
    private Long perResidenceCity;

    /**
     * 常住地区县(CE)
     */
    private Long perResidenceDistrict;

    /**
     * 常住地乡镇(CE)
     */
    private Long perResidenceTown;

    /**
     * 常住地详址
     */
    private String perResidenceAddress;

    /**
     * 常住时间
     */
    private Date perResidenceTime;

    /**
     * 是否合格(CE)（码表见数据字典《是否判断》）
     */
    private Integer whetherPassed;

    /**
     * 残亡赔偿标准
     */
    private BigDecimal compensatStandard;

    /**
     * 序号
     */
    private Integer serialNum;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 是否删除
     */
    private Byte isDeleted;

    /**
     * 备注
     */
    private String remark;

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

    public String getClaimNotificationNo() {
        return claimNotificationNo;
    }

    public void setClaimNotificationNo(String claimNotificationNo) {
        this.claimNotificationNo = claimNotificationNo;
    }

    public Long getSurveyWouId() {
        return surveyWouId;
    }

    public void setSurveyWouId(Long surveyWouId) {
        this.surveyWouId = surveyWouId;
    }

    public Long getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Long surveyId) {
        this.surveyId = surveyId;
    }

    public Long getMedBasicInfoId() {
        return medBasicInfoId;
    }

    public void setMedBasicInfoId(Long medBasicInfoId) {
        this.medBasicInfoId = medBasicInfoId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompantCode() {
        return compantCode;
    }

    public void setCompantCode(String compantCode) {
        this.compantCode = compantCode;
    }

    public Byte getIsFieldSurvey() {
        return isFieldSurvey;
    }

    public void setIsFieldSurvey(Byte isFieldSurvey) {
        this.isFieldSurvey = isFieldSurvey;
    }

    public Byte getResideNature() {
        return resideNature;
    }

    public void setResideNature(Byte resideNature) {
        this.resideNature = resideNature;
    }

    public Byte getIsResident() {
        return isResident;
    }

    public void setIsResident(Byte isResident) {
        this.isResident = isResident;
    }

    public Long getResideProvince() {
        return resideProvince;
    }

    public void setResideProvince(Long resideProvince) {
        this.resideProvince = resideProvince;
    }

    public Long getResideCity() {
        return resideCity;
    }

    public void setResideCity(Long resideCity) {
        this.resideCity = resideCity;
    }

    public Long getResideDistrict() {
        return resideDistrict;
    }

    public void setResideDistrict(Long resideDistrict) {
        this.resideDistrict = resideDistrict;
    }

    public Long getResideTown() {
        return resideTown;
    }

    public void setResideTown(Long resideTown) {
        this.resideTown = resideTown;
    }

    public String getResideAddress() {
        return resideAddress;
    }

    public void setResideAddress(String resideAddress) {
        this.resideAddress = resideAddress;
    }

    public Long getPerResidenceProvince() {
        return perResidenceProvince;
    }

    public void setPerResidenceProvince(Long perResidenceProvince) {
        this.perResidenceProvince = perResidenceProvince;
    }

    public Long getPerResidenceCity() {
        return perResidenceCity;
    }

    public void setPerResidenceCity(Long perResidenceCity) {
        this.perResidenceCity = perResidenceCity;
    }

    public Long getPerResidenceDistrict() {
        return perResidenceDistrict;
    }

    public void setPerResidenceDistrict(Long perResidenceDistrict) {
        this.perResidenceDistrict = perResidenceDistrict;
    }

    public Long getPerResidenceTown() {
        return perResidenceTown;
    }

    public void setPerResidenceTown(Long perResidenceTown) {
        this.perResidenceTown = perResidenceTown;
    }

    public String getPerResidenceAddress() {
        return perResidenceAddress;
    }

    public void setPerResidenceAddress(String perResidenceAddress) {
        this.perResidenceAddress = perResidenceAddress;
    }

    public Date getPerResidenceTime() {
        return perResidenceTime;
    }

    public void setPerResidenceTime(Date perResidenceTime) {
        this.perResidenceTime = perResidenceTime;
    }

    public Integer getWhetherPassed() {
        return whetherPassed;
    }

    public void setWhetherPassed(Integer whetherPassed) {
        this.whetherPassed = whetherPassed;
    }

    public BigDecimal getCompensatStandard() {
        return compensatStandard;
    }

    public void setCompensatStandard(BigDecimal compensatStandard) {
        this.compensatStandard = compensatStandard;
    }

    public Integer getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Integer serialNum) {
        this.serialNum = serialNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}