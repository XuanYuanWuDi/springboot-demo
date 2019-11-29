package com.injured.server.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class InjuredInvestigateHistory implements Serializable {
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
     * 调查次数
     */
    private Integer countInvestigations;

    /**
     * 调查人姓名
     */
    private String investigatorName;

    /**
     * 调查人工号
     */
    private String investigatorNo;

    /**
     * 调查接收时间
     */
    private Date surveyReceptionTime;

    /**
     * 调查完成时间
     */
    private Date surveySubmitTime;

    /**
     * 调查方式
     */
    private Integer adjustType;

    /**
     * 审核人
     */
    private String reviewer;

    /**
     * 审核时间
     */
    private Date reviewerTime;

    /**
     * 建议人伤类型
     */
    private Integer humanInjury;

    /**
     * 审核金额
     */
    private BigDecimal reviewerAmount;

    /**
     * 审核意见 0-不同意，1-同意
     */
    private Integer reviewerOpinion;

    /**
     * 下次跟踪时间
     */
    private Date nextTrackTime;

    /**
     * 任务状态
     */
    private Integer taskStatus;

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

    public Integer getCountInvestigations() {
        return countInvestigations;
    }

    public void setCountInvestigations(Integer countInvestigations) {
        this.countInvestigations = countInvestigations;
    }

    public String getInvestigatorName() {
        return investigatorName;
    }

    public void setInvestigatorName(String investigatorName) {
        this.investigatorName = investigatorName;
    }

    public String getInvestigatorNo() {
        return investigatorNo;
    }

    public void setInvestigatorNo(String investigatorNo) {
        this.investigatorNo = investigatorNo;
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

    public Integer getAdjustType() {
        return adjustType;
    }

    public void setAdjustType(Integer adjustType) {
        this.adjustType = adjustType;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public Date getReviewerTime() {
        return reviewerTime;
    }

    public void setReviewerTime(Date reviewerTime) {
        this.reviewerTime = reviewerTime;
    }

    public Integer getHumanInjury() {
        return humanInjury;
    }

    public void setHumanInjury(Integer humanInjury) {
        this.humanInjury = humanInjury;
    }

    public BigDecimal getReviewerAmount() {
        return reviewerAmount;
    }

    public void setReviewerAmount(BigDecimal reviewerAmount) {
        this.reviewerAmount = reviewerAmount;
    }

    public Integer getReviewerOpinion() {
        return reviewerOpinion;
    }

    public void setReviewerOpinion(Integer reviewerOpinion) {
        this.reviewerOpinion = reviewerOpinion;
    }

    public Date getNextTrackTime() {
        return nextTrackTime;
    }

    public void setNextTrackTime(Date nextTrackTime) {
        this.nextTrackTime = nextTrackTime;
    }

    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
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