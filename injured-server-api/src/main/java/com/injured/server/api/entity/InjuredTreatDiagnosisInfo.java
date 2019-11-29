package com.injured.server.api.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
@Getter
@Setter
@ToString
public class InjuredTreatDiagnosisInfo implements Serializable {
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
     * 快赔信息id
     */
    private Long infoId;

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
     * 是否主诊断 0-否，1-是
     */
    private Integer primaryDiagnosis;

    /**
     * 左右：0未知；1左；2右
     */
    private Byte around;

    /**
     * 损伤部位
     */
    private Integer damageSite;

    /**
     * 损伤部位二级
     */
    private Integer damageSiteSecond;

    /**
     * 损伤类型
     */
    private Integer damageType;

    /**
     * 伤情诊断
     */
    private Integer diagnosisInjury;

    /**
     * 治疗方式
     */
    private Integer treatment;

    /**
     * 手术名称
     */
    private Integer surgicalName;

    /**
     * 是否再次手术：0-否，1-是
     */
    private Integer surgeryAgain;

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

    public Long getInfoId() {
        return infoId;
    }

    public void setInfoId(Long infoId) {
        this.infoId = infoId;
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

    public Integer getPrimaryDiagnosis() {
        return primaryDiagnosis;
    }

    public void setPrimaryDiagnosis(Integer primaryDiagnosis) {
        this.primaryDiagnosis = primaryDiagnosis;
    }

    public Byte getAround() {
        return around;
    }

    public void setAround(Byte around) {
        this.around = around;
    }

    public Integer getDamageSite() {
        return damageSite;
    }

    public void setDamageSite(Integer damageSite) {
        this.damageSite = damageSite;
    }

    public Integer getDamageSiteSecond() {
        return damageSiteSecond;
    }

    public void setDamageSiteSecond(Integer damageSiteSecond) {
        this.damageSiteSecond = damageSiteSecond;
    }

    public Integer getDamageType() {
        return damageType;
    }

    public void setDamageType(Integer damageType) {
        this.damageType = damageType;
    }

    public Integer getDiagnosisInjury() {
        return diagnosisInjury;
    }

    public void setDiagnosisInjury(Integer diagnosisInjury) {
        this.diagnosisInjury = diagnosisInjury;
    }

    public Integer getTreatment() {
        return treatment;
    }

    public void setTreatment(Integer treatment) {
        this.treatment = treatment;
    }

    public Integer getSurgicalName() {
        return surgicalName;
    }

    public void setSurgicalName(Integer surgicalName) {
        this.surgicalName = surgicalName;
    }

    public Integer getSurgeryAgain() {
        return surgeryAgain;
    }

    public void setSurgeryAgain(Integer surgeryAgain) {
        this.surgeryAgain = surgeryAgain;
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