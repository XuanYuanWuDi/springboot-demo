package com.injured.server.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class InjuredAttendancePersonInfo implements Serializable {
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
     * 护理人姓名
     */
    private String nurseName;

    /**
     * 护理类型 1护工 2亲属
     */
    private Byte nurseType;

    /**
     * 护理人长短类型 1长期 2短期
     */
    private Byte nursingType;

    /**
     * 与伤者关系 1夫妻 2父母 3子女 4兄弟姐妹 5同事 6朋友 7其他
     */
    private Byte victimRelation;

    /**
     * 收入类型 1固定收入 2无固定收入 3无收入
     */
    private Byte incomeType;

    /**
     * 月均收入
     */
    private BigDecimal incomeMoney;

    /**
     * 收费标准
     */
    private BigDecimal charges;

    /**
     * 护理天数
     */
    private Integer nurseDays;

    /**
     * 护理年限
     */
    private Integer yearsCare;

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

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    public Byte getNurseType() {
        return nurseType;
    }

    public void setNurseType(Byte nurseType) {
        this.nurseType = nurseType;
    }

    public Byte getNursingType() {
        return nursingType;
    }

    public void setNursingType(Byte nursingType) {
        this.nursingType = nursingType;
    }

    public Byte getVictimRelation() {
        return victimRelation;
    }

    public void setVictimRelation(Byte victimRelation) {
        this.victimRelation = victimRelation;
    }

    public Byte getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(Byte incomeType) {
        this.incomeType = incomeType;
    }

    public BigDecimal getIncomeMoney() {
        return incomeMoney;
    }

    public void setIncomeMoney(BigDecimal incomeMoney) {
        this.incomeMoney = incomeMoney;
    }

    public BigDecimal getCharges() {
        return charges;
    }

    public void setCharges(BigDecimal charges) {
        this.charges = charges;
    }

    public Integer getNurseDays() {
        return nurseDays;
    }

    public void setNurseDays(Integer nurseDays) {
        this.nurseDays = nurseDays;
    }

    public Integer getYearsCare() {
        return yearsCare;
    }

    public void setYearsCare(Integer yearsCare) {
        this.yearsCare = yearsCare;
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