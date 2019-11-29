package com.injured.server.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class InjuredFixedOpinion implements Serializable {
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
     * 任务编号(查勘表ID)
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
     * 定核损基本信息id
     */
    private Long fixedDamageId;

    /**
     * 保险公司ID
     */
    private Long companyId;

    /**
     * 保险公司CODE
     */
    private String compantCode;

    /**
     * 核损人姓名
     */
    private String nucName;

    /**
     * 核损人工号
     */
    private Long nucNo;

    /**
     * 核损接收时间
     */
    private Date nucTime;

    /**
     * 核损提交时间
     */
    private Date nucSubmitTime;

    /**
     * 核损金额合计
     */
    private BigDecimal nucTotalAmount;

    /**
     * 核损意见(CE)  0-不同意，1-同意
     */
    private String nucOpinion;

    /**
     * 核损说明
     */
    private String nucDesc;

    /**
     * 任务类型(CE) （码表见数据字典《任务名称》）
     */
    private Byte taskType;

    /**
     * 任务状态(CE) 1-待处理；2-处理中；3-待审核；4-审核中；5-处理结束；6-审核结束；7-查勘结束 （码表见数据字典《任务状态》）
     */
    private Integer taskStatus;

    /**
     * 调解类型(CE) 1-损失调解；2-赔偿调解（码表见数据字典《调解类型》）
     */
    private Integer medType;

    /**
     * 理算公式
     */
    private String adjustmentFormula;

    /**
     * 赔偿金额
     */
    private BigDecimal compensationAmount;

    /**
     * 定损人姓名
     */
    private String fixName;

    /**
     * 定损人工号
     */
    private Long fixNo;

    /**
     * 定损接收时间
     */
    private Date fixTime;

    /**
     * 定损提交时间
     */
    private Date fixSubmitTime;

    /**
     * 定损说明
     */
    private String fixDesc;

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

    public Long getFixedDamageId() {
        return fixedDamageId;
    }

    public void setFixedDamageId(Long fixedDamageId) {
        this.fixedDamageId = fixedDamageId;
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

    public String getNucName() {
        return nucName;
    }

    public void setNucName(String nucName) {
        this.nucName = nucName;
    }

    public Long getNucNo() {
        return nucNo;
    }

    public void setNucNo(Long nucNo) {
        this.nucNo = nucNo;
    }

    public Date getNucTime() {
        return nucTime;
    }

    public void setNucTime(Date nucTime) {
        this.nucTime = nucTime;
    }

    public Date getNucSubmitTime() {
        return nucSubmitTime;
    }

    public void setNucSubmitTime(Date nucSubmitTime) {
        this.nucSubmitTime = nucSubmitTime;
    }

    public BigDecimal getNucTotalAmount() {
        return nucTotalAmount;
    }

    public void setNucTotalAmount(BigDecimal nucTotalAmount) {
        this.nucTotalAmount = nucTotalAmount;
    }

    public String getNucOpinion() {
        return nucOpinion;
    }

    public void setNucOpinion(String nucOpinion) {
        this.nucOpinion = nucOpinion;
    }

    public String getNucDesc() {
        return nucDesc;
    }

    public void setNucDesc(String nucDesc) {
        this.nucDesc = nucDesc;
    }

    public Byte getTaskType() {
        return taskType;
    }

    public void setTaskType(Byte taskType) {
        this.taskType = taskType;
    }

    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Integer getMedType() {
        return medType;
    }

    public void setMedType(Integer medType) {
        this.medType = medType;
    }

    public String getAdjustmentFormula() {
        return adjustmentFormula;
    }

    public void setAdjustmentFormula(String adjustmentFormula) {
        this.adjustmentFormula = adjustmentFormula;
    }

    public BigDecimal getCompensationAmount() {
        return compensationAmount;
    }

    public void setCompensationAmount(BigDecimal compensationAmount) {
        this.compensationAmount = compensationAmount;
    }

    public String getFixName() {
        return fixName;
    }

    public void setFixName(String fixName) {
        this.fixName = fixName;
    }

    public Long getFixNo() {
        return fixNo;
    }

    public void setFixNo(Long fixNo) {
        this.fixNo = fixNo;
    }

    public Date getFixTime() {
        return fixTime;
    }

    public void setFixTime(Date fixTime) {
        this.fixTime = fixTime;
    }

    public Date getFixSubmitTime() {
        return fixSubmitTime;
    }

    public void setFixSubmitTime(Date fixSubmitTime) {
        this.fixSubmitTime = fixSubmitTime;
    }

    public String getFixDesc() {
        return fixDesc;
    }

    public void setFixDesc(String fixDesc) {
        this.fixDesc = fixDesc;
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