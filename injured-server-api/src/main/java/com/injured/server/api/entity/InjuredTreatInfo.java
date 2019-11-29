package com.injured.server.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class InjuredTreatInfo implements Serializable {
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
     * 是否医院调查 0-否，1-是
     */
    private Integer isHospitalSurvey;

    /**
     * 送诊方式
     */
    private Integer sendDoctorType;

    /**
     * 就诊时间
     */
    private Date sendDoctorTime;

    /**
     * 是否出院 0-否，1-是
     */
    private Integer dischargeStatus;

    /**
     * 住院伙补标准
     */
    private BigDecimal mealStandard;

    /**
     * 有无既往损伤 0-否，1-是
     */
    private Integer isPastDamage;

    /**
     * 既往损伤诊断
     */
    private String pastDamage;

    /**
     * 医疗费
     */
    private BigDecimal medicalFee;

    /**
     * 非医保
     */
    private BigDecimal medicalInsurance;

    /**
     * 无关用药
     */
    private BigDecimal irrelevantMedication;

    /**
     * 已报销
     */
    private BigDecimal reimbursed;

    /**
     * 续医费
     */
    private BigDecimal continuedMedicalFee;

    /**
     * 伤情和治疗说明
     */
    private String injuTreatmentRemark;

    /**
     * 是否合格 0-否，1-是
     */
    private Integer whetherPassed;

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

    public Integer getIsHospitalSurvey() {
        return isHospitalSurvey;
    }

    public void setIsHospitalSurvey(Integer isHospitalSurvey) {
        this.isHospitalSurvey = isHospitalSurvey;
    }

    public Integer getSendDoctorType() {
        return sendDoctorType;
    }

    public void setSendDoctorType(Integer sendDoctorType) {
        this.sendDoctorType = sendDoctorType;
    }

    public Date getSendDoctorTime() {
        return sendDoctorTime;
    }

    public void setSendDoctorTime(Date sendDoctorTime) {
        this.sendDoctorTime = sendDoctorTime;
    }

    public Integer getDischargeStatus() {
        return dischargeStatus;
    }

    public void setDischargeStatus(Integer dischargeStatus) {
        this.dischargeStatus = dischargeStatus;
    }

    public BigDecimal getMealStandard() {
        return mealStandard;
    }

    public void setMealStandard(BigDecimal mealStandard) {
        this.mealStandard = mealStandard;
    }

    public Integer getIsPastDamage() {
        return isPastDamage;
    }

    public void setIsPastDamage(Integer isPastDamage) {
        this.isPastDamage = isPastDamage;
    }

    public String getPastDamage() {
        return pastDamage;
    }

    public void setPastDamage(String pastDamage) {
        this.pastDamage = pastDamage;
    }

    public BigDecimal getMedicalFee() {
        return medicalFee;
    }

    public void setMedicalFee(BigDecimal medicalFee) {
        this.medicalFee = medicalFee;
    }

    public BigDecimal getMedicalInsurance() {
        return medicalInsurance;
    }

    public void setMedicalInsurance(BigDecimal medicalInsurance) {
        this.medicalInsurance = medicalInsurance;
    }

    public BigDecimal getIrrelevantMedication() {
        return irrelevantMedication;
    }

    public void setIrrelevantMedication(BigDecimal irrelevantMedication) {
        this.irrelevantMedication = irrelevantMedication;
    }

    public BigDecimal getReimbursed() {
        return reimbursed;
    }

    public void setReimbursed(BigDecimal reimbursed) {
        this.reimbursed = reimbursed;
    }

    public BigDecimal getContinuedMedicalFee() {
        return continuedMedicalFee;
    }

    public void setContinuedMedicalFee(BigDecimal continuedMedicalFee) {
        this.continuedMedicalFee = continuedMedicalFee;
    }

    public String getInjuTreatmentRemark() {
        return injuTreatmentRemark;
    }

    public void setInjuTreatmentRemark(String injuTreatmentRemark) {
        this.injuTreatmentRemark = injuTreatmentRemark;
    }

    public Integer getWhetherPassed() {
        return whetherPassed;
    }

    public void setWhetherPassed(Integer whetherPassed) {
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