package com.injured.server.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class InjuredMedReviewOpinion implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 任务编号(查勘表ID)
     */
    private Long surveyId;

    /**
     * 伤者ID
     */
    private Long surveyWouId;

    /**
     * 保险公司ID
     */
    private Long companyId;

    /**
     * 保险公司CODE
     */
    private String compantCode;

    /**
     * 审核人姓名
     */
    private String reviewerName;

    /**
     * 审核人工号
     */
    private String reviewerNo;

    /**
     * 审核接收时间
     */
    private Date reviewerTime;

    /**
     * 审核提交时间
     */
    private Date reviewerSubmitTime;

    /**
     * 建议人伤类型(CE)（码表见数据字典《人伤类型》）
     */
    private Byte injuryRecommendedType;

    /**
     * 查勘是否合格(CE)（码表见数据字典《是否判断》）
     */
    private Byte isQualificatSurvey;

    /**
     * 是否继续调查(CE)（码表见数据字典《是否判断》）
     */
    private Byte isFeildInvestigation;

    /**
     * 实地调查项目编号,前端项目编号逗号分隔
     */
    private String fieldInvestigationType;

    /**
     * 审核意见(CE)（码表见数据字典《是否判断》）
     */
    private String auditOpinion;

    /**
     * 审核说明
     */
    private String auditInstruc;

    /**
     * 默认系统
     */
    private String defaultSystem;

    private String investigatorName;

    /**
     * 下次调查人工号
     */
    private String investigatorNo;

    /**
     * 下次调查方式(CE)（码表见数据字典《调查方式》）
     */
    private Byte nextTrackType;

    /**
     * 下次调查时间
     */
    private Date nextTrackTime;

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

    /**
     * 报案id
     */
    private Long registId;

    /**
     * 关联调查基本信息表ID
     */
    private Long medBasicInfoId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Long surveyId) {
        this.surveyId = surveyId;
    }

    public Long getSurveyWouId() {
        return surveyWouId;
    }

    public void setSurveyWouId(Long surveyWouId) {
        this.surveyWouId = surveyWouId;
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

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public String getReviewerNo() {
        return reviewerNo;
    }

    public void setReviewerNo(String reviewerNo) {
        this.reviewerNo = reviewerNo;
    }

    public Date getReviewerTime() {
        return reviewerTime;
    }

    public void setReviewerTime(Date reviewerTime) {
        this.reviewerTime = reviewerTime;
    }

    public Date getReviewerSubmitTime() {
        return reviewerSubmitTime;
    }

    public void setReviewerSubmitTime(Date reviewerSubmitTime) {
        this.reviewerSubmitTime = reviewerSubmitTime;
    }

    public Byte getInjuryRecommendedType() {
        return injuryRecommendedType;
    }

    public void setInjuryRecommendedType(Byte injuryRecommendedType) {
        this.injuryRecommendedType = injuryRecommendedType;
    }

    public Byte getIsQualificatSurvey() {
        return isQualificatSurvey;
    }

    public void setIsQualificatSurvey(Byte isQualificatSurvey) {
        this.isQualificatSurvey = isQualificatSurvey;
    }

    public Byte getIsFeildInvestigation() {
        return isFeildInvestigation;
    }

    public void setIsFeildInvestigation(Byte isFeildInvestigation) {
        this.isFeildInvestigation = isFeildInvestigation;
    }

    public String getFieldInvestigationType() {
        return fieldInvestigationType;
    }

    public void setFieldInvestigationType(String fieldInvestigationType) {
        this.fieldInvestigationType = fieldInvestigationType;
    }

    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
    }

    public String getAuditInstruc() {
        return auditInstruc;
    }

    public void setAuditInstruc(String auditInstruc) {
        this.auditInstruc = auditInstruc;
    }

    public String getDefaultSystem() {
        return defaultSystem;
    }

    public void setDefaultSystem(String defaultSystem) {
        this.defaultSystem = defaultSystem;
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

    public Byte getNextTrackType() {
        return nextTrackType;
    }

    public void setNextTrackType(Byte nextTrackType) {
        this.nextTrackType = nextTrackType;
    }

    public Date getNextTrackTime() {
        return nextTrackTime;
    }

    public void setNextTrackTime(Date nextTrackTime) {
        this.nextTrackTime = nextTrackTime;
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

    public Long getRegistId() {
        return registId;
    }

    public void setRegistId(Long registId) {
        this.registId = registId;
    }

    public Long getMedBasicInfoId() {
        return medBasicInfoId;
    }

    public void setMedBasicInfoId(Long medBasicInfoId) {
        this.medBasicInfoId = medBasicInfoId;
    }
}