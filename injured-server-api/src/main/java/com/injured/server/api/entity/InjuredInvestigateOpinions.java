package com.injured.server.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class InjuredInvestigateOpinions implements Serializable {
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
     * 受害人或亲属笔录 0-否，1-是
     */
    private Integer victimRecordPhoto;

    /**
     * 理赔告知书与合影 0-否，1-是
     */
    private Integer claimGroupPhoto;

    /**
     * 实地调查报告 0-否，1-是
     */
    private Integer actualSurveyReport;

    /**
     * 意见说明
     */
    private String statementOpinions;

    /**
     * 调查接收时间
     */
    private Date surveyReceptionTime;

    /**
     * 调查提交时间
     */
    private Date surveySubmitTime;

    /**
     * 任务状态
     */
    private Integer taskStatus;

    /**
     * 调解类型
     */
    private Integer adjustType;

    /**
     * 理算公式
     */
    private String adjustmentFormula;

    /**
     * 赔偿金额
     */
    private BigDecimal amountCompensation;

    /**
     * 确认意见 0-不同意，1-同意
     */
    private Integer confirmationOpinions;

    /**
     * 确认说明
     */
    private String confirmationNote;

    /**
     * 序号
     */
    private Integer serialNum;

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

    public Integer getVictimRecordPhoto() {
        return victimRecordPhoto;
    }

    public void setVictimRecordPhoto(Integer victimRecordPhoto) {
        this.victimRecordPhoto = victimRecordPhoto;
    }

    public Integer getClaimGroupPhoto() {
        return claimGroupPhoto;
    }

    public void setClaimGroupPhoto(Integer claimGroupPhoto) {
        this.claimGroupPhoto = claimGroupPhoto;
    }

    public Integer getActualSurveyReport() {
        return actualSurveyReport;
    }

    public void setActualSurveyReport(Integer actualSurveyReport) {
        this.actualSurveyReport = actualSurveyReport;
    }

    public String getStatementOpinions() {
        return statementOpinions;
    }

    public void setStatementOpinions(String statementOpinions) {
        this.statementOpinions = statementOpinions;
    }

    public Date getSurveyReceptionTime() {
        return surveyReceptionTime;
    }

    public void setSurveyReceptionTime(Date surveyReceptionTime) {
        this.surveyReceptionTime = surveyReceptionTime;
    }

    public Date getSurveySubmitTime() {
        return surveySubmitTime;
    }

    public void setSurveySubmitTime(Date surveySubmitTime) {
        this.surveySubmitTime = surveySubmitTime;
    }

    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Integer getAdjustType() {
        return adjustType;
    }

    public void setAdjustType(Integer adjustType) {
        this.adjustType = adjustType;
    }

    public String getAdjustmentFormula() {
        return adjustmentFormula;
    }

    public void setAdjustmentFormula(String adjustmentFormula) {
        this.adjustmentFormula = adjustmentFormula;
    }

    public BigDecimal getAmountCompensation() {
        return amountCompensation;
    }

    public void setAmountCompensation(BigDecimal amountCompensation) {
        this.amountCompensation = amountCompensation;
    }

    public Integer getConfirmationOpinions() {
        return confirmationOpinions;
    }

    public void setConfirmationOpinions(Integer confirmationOpinions) {
        this.confirmationOpinions = confirmationOpinions;
    }

    public String getConfirmationNote() {
        return confirmationNote;
    }

    public void setConfirmationNote(String confirmationNote) {
        this.confirmationNote = confirmationNote;
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