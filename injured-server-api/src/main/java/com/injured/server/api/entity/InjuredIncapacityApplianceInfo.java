package com.injured.server.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class InjuredIncapacityApplianceInfo implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 报案id
     */
    private Long registId;

    /**
     * 关联调解基本信息表ID
     */
    private Long medBasicInfoId;

    /**
     * 报案编号
     */
    private String claimNotificationNo;

    /**
     * 伤者ID
     */
    private Long surveyWouId;

    /**
     * 任务编号(查勘表ID)
     */
    private Long surveyId;

    /**
     * 伤残信息id
     */
    private Long incapacityId;

    /**
     * 保险公司ID
     */
    private Long companyId;

    /**
     * 保险公司CODE
     */
    private String compantCode;

    /**
     * 辅助器具名称(CE)（码表见数据字典《辅助器具》）
     */
    private String helperDeviceName;

    /**
     * 是否已配置(CE)（码表见数据字典《是否判断》）
     */
    private Byte isConfig;

    /**
     * 配置评估日期
     */
    private Date evaluationAgencyTime;

    /**
     * 残疾用具单价
     */
    private BigDecimal disabilitAppPrice;

    /**
     * 需按装次数
     */
    private Integer needInstallTimes;

    /**
     * 年维修费率
     */
    private BigDecimal annualMainRate;

    /**
     * 配置评估机构
     */
    private String evaluationAgency;

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

    public String getClaimNotificationNo() {
        return claimNotificationNo;
    }

    public void setClaimNotificationNo(String claimNotificationNo) {
        this.claimNotificationNo = claimNotificationNo;
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

    public Long getIncapacityId() {
        return incapacityId;
    }

    public void setIncapacityId(Long incapacityId) {
        this.incapacityId = incapacityId;
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

    public String getHelperDeviceName() {
        return helperDeviceName;
    }

    public void setHelperDeviceName(String helperDeviceName) {
        this.helperDeviceName = helperDeviceName;
    }

    public Byte getIsConfig() {
        return isConfig;
    }

    public void setIsConfig(Byte isConfig) {
        this.isConfig = isConfig;
    }

    public Date getEvaluationAgencyTime() {
        return evaluationAgencyTime;
    }

    public void setEvaluationAgencyTime(Date evaluationAgencyTime) {
        this.evaluationAgencyTime = evaluationAgencyTime;
    }

    public BigDecimal getDisabilitAppPrice() {
        return disabilitAppPrice;
    }

    public void setDisabilitAppPrice(BigDecimal disabilitAppPrice) {
        this.disabilitAppPrice = disabilitAppPrice;
    }

    public Integer getNeedInstallTimes() {
        return needInstallTimes;
    }

    public void setNeedInstallTimes(Integer needInstallTimes) {
        this.needInstallTimes = needInstallTimes;
    }

    public BigDecimal getAnnualMainRate() {
        return annualMainRate;
    }

    public void setAnnualMainRate(BigDecimal annualMainRate) {
        this.annualMainRate = annualMainRate;
    }

    public String getEvaluationAgency() {
        return evaluationAgency;
    }

    public void setEvaluationAgency(String evaluationAgency) {
        this.evaluationAgency = evaluationAgency;
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