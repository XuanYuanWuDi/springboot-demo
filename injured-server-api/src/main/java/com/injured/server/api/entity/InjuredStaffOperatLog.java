package com.injured.server.api.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
@Getter
@Setter
@ToString
public class InjuredStaffOperatLog implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 提交人工号
     */
    private String submitNo;

    /**
     * 提交时间
     */
    private Date submitTime;

    /**
     * 提交意见(CE)（码表见数据字典《是否判断》）
     */
    private String submitOpinion;

    /**
     * 提交金额
     */
    private BigDecimal submitAmount;

    /**
     * 意见说明
     */
    private String opinionDesc;

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
     * 报案编号
     */
    private String claimNotificationNo;

    /**
     * 查勘任务号
     */
    private Long surveyId;

    /**
     * 伤者id
     */
    private Long surveyWouId;

    /**
     * 关联调解基本信息表ID
     */
    private Long medBasicInfoId;

    /**
     * 保险公司id
     */
    private Long companyId;

    /**
     * 提交任务(CE)（码表见数据字典《任务名称》）
     */
    private Integer submitTask;

    /**
     * 提交人
     */
    private String submitName;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubmitNo() {
        return submitNo;
    }

    public void setSubmitNo(String submitNo) {
        this.submitNo = submitNo;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public String getSubmitOpinion() {
        return submitOpinion;
    }

    public void setSubmitOpinion(String submitOpinion) {
        this.submitOpinion = submitOpinion;
    }

    public BigDecimal getSubmitAmount() {
        return submitAmount;
    }

    public void setSubmitAmount(BigDecimal submitAmount) {
        this.submitAmount = submitAmount;
    }

    public String getOpinionDesc() {
        return opinionDesc;
    }

    public void setOpinionDesc(String opinionDesc) {
        this.opinionDesc = opinionDesc;
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

    public String getClaimNotificationNo() {
        return claimNotificationNo;
    }

    public void setClaimNotificationNo(String claimNotificationNo) {
        this.claimNotificationNo = claimNotificationNo;
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

    public Integer getSubmitTask() {
        return submitTask;
    }

    public void setSubmitTask(Integer submitTask) {
        this.submitTask = submitTask;
    }

    public String getSubmitName() {
        return submitName;
    }

    public void setSubmitName(String submitName) {
        this.submitName = submitName;
    }
}