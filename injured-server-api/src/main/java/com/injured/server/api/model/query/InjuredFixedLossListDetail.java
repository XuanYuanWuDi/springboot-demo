package com.injured.server.api.model.query;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * 定损清单详情
 * @author cli
 *
 */
@Getter
@Setter
@ToString
public class InjuredFixedLossListDetail implements Serializable {
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
     * 序号
     */
    private Integer serialNum;

    /**
     * 定核损基本信息id
     */
    private Long fixedDamageId;

    /**
     * 关联基本信息表ID
     */
    private Long infoId;

    /**
     * 任务编号(查勘表ID)
     */
    private Long surveyId;

    /**
     * 保险公司ID
     */
    private Long companyId;

    /**
     * 保险公司CODE
     */
    private String compantCode;

    /**
     * 定损次数
     */
    private Integer damagesNum;

    /**
     * 案件类型
     */
    private Byte lossType;

    /**
     * 人伤损失项目(CE)（码表见数据字典《定损损失项目》）
     */
    private String injuryLossItemType;

    /**
     * 人伤损失项目ID(关联字典表ID)(CE)（码表见数据字典《定损损失项目》）
     */
    private Long injuryLossItemId;

    /**
     * 计算公式（计算公式待补充）
     */
    private String calculatFormulaInfo;

    /**
     * 计算公式ID（关联字典表ID）
     */
    private Long calculatFormulaId;

    /**
     * 报损金额
     */
    private BigDecimal reportLossAmount;

    /**
     * 调解金额
     */
    private BigDecimal adjustAmount;

    /**
     * 定损金额
     */
    private BigDecimal fixedLossAmount;

    /**
     * 核损金额
     */
    private BigDecimal damageAmount;

    /**
     * 追加原因
     */
    private BigDecimal additReason;

    /**
     * 调整说明
     */
    private String adjustInstruct;

    /**
     * 定损类型1(CE)  0-小额快赔；1-现场定损；2-快处中心；3-修理厂定损；4-定损中心；5-其他（码表见数据字典《定损类型》）
     */
    private Long fixedLossTypeFirst;

    /**
     * 定损类型2(CE)  0-小额快赔；1-现场定损；2-快处中心；3-修理厂定损；4-定损中心；5-其他（码表见数据字典《定损类型》）
     */
    private Long fixedLossTypeSecond;

    /**
     * 备注
     */
    private String remark;

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

    public Integer getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Integer serialNum) {
        this.serialNum = serialNum;
    }

    public Long getFixedDamageId() {
        return fixedDamageId;
    }

    public void setFixedDamageId(Long fixedDamageId) {
        this.fixedDamageId = fixedDamageId;
    }

    public Long getInfoId() {
        return infoId;
    }

    public void setInfoId(Long infoId) {
        this.infoId = infoId;
    }

    public Long getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Long surveyId) {
        this.surveyId = surveyId;
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

    public Integer getDamagesNum() {
        return damagesNum;
    }

    public void setDamagesNum(Integer damagesNum) {
        this.damagesNum = damagesNum;
    }

    public Byte getLossType() {
        return lossType;
    }

    public void setLossType(Byte lossType) {
        this.lossType = lossType;
    }

    public String getInjuryLossItemType() {
        return injuryLossItemType;
    }

    public void setInjuryLossItemType(String injuryLossItemType) {
        this.injuryLossItemType = injuryLossItemType;
    }

    public Long getInjuryLossItemId() {
        return injuryLossItemId;
    }

    public void setInjuryLossItemId(Long injuryLossItemId) {
        this.injuryLossItemId = injuryLossItemId;
    }

    public String getCalculatFormulaInfo() {
        return calculatFormulaInfo;
    }

    public void setCalculatFormulaInfo(String calculatFormulaInfo) {
        this.calculatFormulaInfo = calculatFormulaInfo;
    }

    public Long getCalculatFormulaId() {
        return calculatFormulaId;
    }

    public void setCalculatFormulaId(Long calculatFormulaId) {
        this.calculatFormulaId = calculatFormulaId;
    }

    public BigDecimal getReportLossAmount() {
        return reportLossAmount;
    }

    public void setReportLossAmount(BigDecimal reportLossAmount) {
        this.reportLossAmount = reportLossAmount;
    }

    public BigDecimal getAdjustAmount() {
        return adjustAmount;
    }

    public void setAdjustAmount(BigDecimal adjustAmount) {
        this.adjustAmount = adjustAmount;
    }

    public BigDecimal getFixedLossAmount() {
        return fixedLossAmount;
    }

    public void setFixedLossAmount(BigDecimal fixedLossAmount) {
        this.fixedLossAmount = fixedLossAmount;
    }

    public BigDecimal getDamageAmount() {
        return damageAmount;
    }

    public void setDamageAmount(BigDecimal damageAmount) {
        this.damageAmount = damageAmount;
    }

    public BigDecimal getAdditReason() {
        return additReason;
    }

    public void setAdditReason(BigDecimal additReason) {
        this.additReason = additReason;
    }

    public String getAdjustInstruct() {
        return adjustInstruct;
    }

    public void setAdjustInstruct(String adjustInstruct) {
        this.adjustInstruct = adjustInstruct;
    }

    public Long getFixedLossTypeFirst() {
        return fixedLossTypeFirst;
    }

    public void setFixedLossTypeFirst(Long fixedLossTypeFirst) {
        this.fixedLossTypeFirst = fixedLossTypeFirst;
    }

    public Long getFixedLossTypeSecond() {
        return fixedLossTypeSecond;
    }

    public void setFixedLossTypeSecond(Long fixedLossTypeSecond) {
        this.fixedLossTypeSecond = fixedLossTypeSecond;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
}