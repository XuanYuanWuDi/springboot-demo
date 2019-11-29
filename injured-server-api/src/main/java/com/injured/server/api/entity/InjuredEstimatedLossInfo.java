package com.injured.server.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class InjuredEstimatedLossInfo implements Serializable {
    /**
     * 主键
     */
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
     * 预估总表id
     */
    private Long estimatedLossId;

    /**
     * 任务编号(查勘表ID)
     */
    private Long surveyId;

    /**
     * 伤者ID
     */
    private Long surveyWouId;

    /**
     * 保险公司CODE
     */
    private String compantCode;

    /**
     * 保险公司ID
     */
    private Long companyId;

    /**
     * 损失项目 1交通费 2住宿费 3事故处理人员误工费 4营养费 5交通费 6康复费 7整容费 8其他费用
     */
    private Long lossItemType;

    /**
     * 预估金额
     */
    private BigDecimal estimateAmount;

    /**
     * 调解金额
     */
    private BigDecimal mediationAmount;

    /**
     * 审核金额
     */
    private BigDecimal reviewAmount;

    /**
     * 计算公式(CE)（计算公式待补充）
     */
    private String calculationFormula;

    /**
     * 计算公式id
     */
    private Long calculationFormulaId;

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

    public Long getEstimatedLossId() {
        return estimatedLossId;
    }

    public void setEstimatedLossId(Long estimatedLossId) {
        this.estimatedLossId = estimatedLossId;
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

    public String getCompantCode() {
        return compantCode;
    }

    public void setCompantCode(String compantCode) {
        this.compantCode = compantCode;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getLossItemType() {
        return lossItemType;
    }

    public void setLossItemType(Long lossItemType) {
        this.lossItemType = lossItemType;
    }

    public BigDecimal getEstimateAmount() {
        return estimateAmount;
    }

    public void setEstimateAmount(BigDecimal estimateAmount) {
        this.estimateAmount = estimateAmount;
    }

    public BigDecimal getMediationAmount() {
        return mediationAmount;
    }

    public void setMediationAmount(BigDecimal mediationAmount) {
        this.mediationAmount = mediationAmount;
    }

    public BigDecimal getReviewAmount() {
        return reviewAmount;
    }

    public void setReviewAmount(BigDecimal reviewAmount) {
        this.reviewAmount = reviewAmount;
    }

    public String getCalculationFormula() {
        return calculationFormula;
    }

    public void setCalculationFormula(String calculationFormula) {
        this.calculationFormula = calculationFormula;
    }

    public Long getCalculationFormulaId() {
        return calculationFormulaId;
    }

    public void setCalculationFormulaId(Long calculationFormulaId) {
        this.calculationFormulaId = calculationFormulaId;
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