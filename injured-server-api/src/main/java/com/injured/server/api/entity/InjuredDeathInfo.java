package com.injured.server.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class InjuredDeathInfo implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 伤者ID
     */
    private Long surveyWouId;

    /**
     * 任务编号(查勘表ID)
     */
    private Long surveyId;

    /**
     * 关联调解基本信息表ID
     */
    private Long medBasicInfoId;

    /**
     * 报案id
     */
    private Long registId;

    /**
     * 报案编号
     */
    private String claimNotificationNo;

    /**
     * 保险公司CODE
     */
    private String compantCode;

    /**
     * 保险公司ID
     */
    private Long companyId;

    /**
     * 是否实地调查 0-否，1-是
     */
    private Byte isFieldSurvey;

    /**
     * 死亡原因 1机械性损伤 2出血休克致死 3感染休克致死 4全身衰竭致死 5机械性窒息 6其他死因
     */
    private Byte deathCause;

    /**
     * 外伤死亡关系 1无因果关系 2次要因果关系 3共同因果关系 4主要因果关系 5完全因果关系
     */
    private Date deathTime;

    /**
     * 残疾用具单价
     */
    private BigDecimal deathTraumaParticipat;

    /**
     * 赔偿系数
     */
    private String compensCoe;

    /**
     * 死亡赔偿年限
     */
    private String deathCompensatPeriod;

    /**
     * 职工年度平均工资
     */
    private BigDecimal annualEmployeesSalary;

    /**
     * 事故处理人数
     */
    private Integer handledPeopNum;

    /**
     * 事故处理天数
     */
    private Integer handledDays;

    /**
     * 事故处理人月均收入
     */
    private BigDecimal handledPeopIncome;

    /**
     * 是否合格 0-否，1-是
     */
    private Integer whetherPassed;

    /**
     * 死亡相关自身疾病
     */
    private String deathRelatedDisease;

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
     * 是否删除 0-否，1-是
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

    public Byte getIsFieldSurvey() {
        return isFieldSurvey;
    }

    public void setIsFieldSurvey(Byte isFieldSurvey) {
        this.isFieldSurvey = isFieldSurvey;
    }

    public Byte getDeathCause() {
        return deathCause;
    }

    public void setDeathCause(Byte deathCause) {
        this.deathCause = deathCause;
    }

    public Date getDeathTime() {
        return deathTime;
    }

    public void setDeathTime(Date deathTime) {
        this.deathTime = deathTime;
    }

    public BigDecimal getDeathTraumaParticipat() {
        return deathTraumaParticipat;
    }

    public void setDeathTraumaParticipat(BigDecimal deathTraumaParticipat) {
        this.deathTraumaParticipat = deathTraumaParticipat;
    }

    public String getCompensCoe() {
        return compensCoe;
    }

    public void setCompensCoe(String compensCoe) {
        this.compensCoe = compensCoe;
    }

    public String getDeathCompensatPeriod() {
        return deathCompensatPeriod;
    }

    public void setDeathCompensatPeriod(String deathCompensatPeriod) {
        this.deathCompensatPeriod = deathCompensatPeriod;
    }

    public BigDecimal getAnnualEmployeesSalary() {
        return annualEmployeesSalary;
    }

    public void setAnnualEmployeesSalary(BigDecimal annualEmployeesSalary) {
        this.annualEmployeesSalary = annualEmployeesSalary;
    }

    public Integer getHandledPeopNum() {
        return handledPeopNum;
    }

    public void setHandledPeopNum(Integer handledPeopNum) {
        this.handledPeopNum = handledPeopNum;
    }

    public Integer getHandledDays() {
        return handledDays;
    }

    public void setHandledDays(Integer handledDays) {
        this.handledDays = handledDays;
    }

    public BigDecimal getHandledPeopIncome() {
        return handledPeopIncome;
    }

    public void setHandledPeopIncome(BigDecimal handledPeopIncome) {
        this.handledPeopIncome = handledPeopIncome;
    }

    public Integer getWhetherPassed() {
        return whetherPassed;
    }

    public void setWhetherPassed(Integer whetherPassed) {
        this.whetherPassed = whetherPassed;
    }

    public String getDeathRelatedDisease() {
        return deathRelatedDisease;
    }

    public void setDeathRelatedDisease(String deathRelatedDisease) {
        this.deathRelatedDisease = deathRelatedDisease;
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