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
public class InjuredFastCompensatReviewOpinion implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 报案id
     */
    private Long registId;

    /**
     * 快赔基本信息id
     */
    private Long fastInfoId;

    /**
     * 任务编号(查勘表ID)
     */
    private Long surveyId;

    /**
     * 序号
     */
    private Integer serialNum;

    /**
     * 保险公司ID
     */
    private Long companyId;

    /**
     * 保险公司CODE
     */
    private String compantCode;

    /**
     * 备注
     */
    private String remark;

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
     * 建议人伤类型
     */
    private Byte injuryRecommendedType;

    /**
     * 查勘是否合格
     */
    private Byte isQualificatSurvey;

    /**
     * 审核意见
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

    /**
     * 下次调查方式
     */
    private Byte nextTrackType;

    /**
     * 下次跟踪时间
     */
    private Date nextTrackTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 是否删除 0否 1是
     */
    private Integer isDeleted;

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

    public Long getFastInfoId() {
        return fastInfoId;
    }

    public void setFastInfoId(Long fastInfoId) {
        this.fastInfoId = fastInfoId;
    }

    public Long getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Long surveyId) {
        this.surveyId = surveyId;
    }

    public Integer getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Integer serialNum) {
        this.serialNum = serialNum;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}