package com.injured.server.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class InjuredIncapacityInfo implements Serializable {
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
     * 任务编号(查勘表ID)
     */
    private Long surveyId;

    /**
     * 伤者ID
     */
    private Long surveyWouId;

    /**
     * 关联调解基本信息表ID
     */
    private Long medBasicInfoId;

    /**
     * 保险公司ID
     */
    private Long companyId;

    /**
     * 保险公司CODE
     */
    private String compantCode;

    /**
     * 是否实地调查(CE)（码表见数据字典《是否判断》）0-否，1-是
     */
    private Byte isFieldSurvey;

    /**
     * 是否需残疾辅助器具(CE)（码表见数据字典《是否判断》） 0-否，1-是
     */
    private Byte isNeedHelper;

    /**
     * 是否合格(CE)（码表见数据字典《是否判断》） 0-否，1-是
     */
    private Integer whetherPassed;

    /**
     * 已产生器具费
     */
    private BigDecimal alreadyProducedFee;

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

    public String getCompantCode() {
        return compantCode;
    }

    public void setCompantCode(String compantCode) {
        this.compantCode = compantCode;
    }

    public Byte getIsFieldSurvey() {
        return isFieldSurvey;
    }

    public void setIsFieldSurvey(Byte isFieldSurvey) {
        this.isFieldSurvey = isFieldSurvey;
    }

    public Byte getIsNeedHelper() {
        return isNeedHelper;
    }

    public void setIsNeedHelper(Byte isNeedHelper) {
        this.isNeedHelper = isNeedHelper;
    }

    public Integer getWhetherPassed() {
        return whetherPassed;
    }

    public void setWhetherPassed(Integer whetherPassed) {
        this.whetherPassed = whetherPassed;
    }

    public BigDecimal getAlreadyProducedFee() {
        return alreadyProducedFee;
    }

    public void setAlreadyProducedFee(BigDecimal alreadyProducedFee) {
        this.alreadyProducedFee = alreadyProducedFee;
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