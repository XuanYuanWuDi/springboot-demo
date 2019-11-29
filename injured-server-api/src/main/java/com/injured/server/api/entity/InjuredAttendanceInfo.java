package com.injured.server.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class InjuredAttendanceInfo implements Serializable {
    private Long id;

    /**
     * 报案编号
     */
    private String claimNotificationNo;

    /**
     * 报案id
     */
    private Long registId;

    /**
     * 伤者id
     */
    private Long surveyWouId;

    /**
     * 查勘基本信息id
     */
    private Long surveyId;

    /**
     * 调查基本信息ID
     */
    private Long medBasicInfoId;

    /**
     * 保险公司ID
     */
    private Long companyId;

    /**
     * 保险公司Code
     */
    private String compantCode;

    /**
     * 序号
     */
    private Integer serialNum;

    /**
     * 是否护理 0-否，1-是
     */
    private Byte isCare;

    /**
     * 是否实地调查 0-否，1-是
     */
    private Byte isFieldSurvey;

    /**
     * 是否长期护理 0-否，1-是
     */
    private Byte isLongCare;

    /**
     * 护理依赖程度 1部分护理依赖 2大部分护理依赖 3完全护理依赖
     */
    private Byte nurseLevelCare;

    /**
     * 护理依赖系数
     */
    private String nurseCoeffCare;

    /**
     * 是否合格 0-否，1-是
     */
    private Byte whetherPassed;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否删除  0-否，1-是
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

    public String getClaimNotificationNo() {
        return claimNotificationNo;
    }

    public void setClaimNotificationNo(String claimNotificationNo) {
        this.claimNotificationNo = claimNotificationNo;
    }

    public Long getRegistId() {
        return registId;
    }

    public void setRegistId(Long registId) {
        this.registId = registId;
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

    public Integer getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Integer serialNum) {
        this.serialNum = serialNum;
    }

    public Byte getIsCare() {
        return isCare;
    }

    public void setIsCare(Byte isCare) {
        this.isCare = isCare;
    }

    public Byte getIsFieldSurvey() {
        return isFieldSurvey;
    }

    public void setIsFieldSurvey(Byte isFieldSurvey) {
        this.isFieldSurvey = isFieldSurvey;
    }

    public Byte getIsLongCare() {
        return isLongCare;
    }

    public void setIsLongCare(Byte isLongCare) {
        this.isLongCare = isLongCare;
    }

    public Byte getNurseLevelCare() {
        return nurseLevelCare;
    }

    public void setNurseLevelCare(Byte nurseLevelCare) {
        this.nurseLevelCare = nurseLevelCare;
    }

    public String getNurseCoeffCare() {
        return nurseCoeffCare;
    }

    public void setNurseCoeffCare(String nurseCoeffCare) {
        this.nurseCoeffCare = nurseCoeffCare;
    }

    public Byte getWhetherPassed() {
        return whetherPassed;
    }

    public void setWhetherPassed(Byte whetherPassed) {
        this.whetherPassed = whetherPassed;
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