package com.injured.server.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class InjuredInfo implements Serializable {
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
     * 受伤时间
     */
    private Date injuryTime;

    /**
     * 肇事车牌
     */
    private String anecdotePlate;

    /**
     * 肇事省
     */
    private String anecdoteProvince;

    /**
     * 肇事市
     */
    private String anecdoteCity;

    /**
     * 肇事区县
     */
    private String anecdoteDistrict;

    /**
     * 肇事乡镇
     */
    private String anecdoteTown;

    /**
     * 肇事详细地址
     */
    private String anecdoteAddress;

    /**
     * 受伤人数
     */
    private Integer injuryPersonSum;

    /**
     * 轻伤人数
     */
    private Integer minorInjuryPersonSum;

    /**
     * 重伤人数
     */
    private Integer seriousInjuryPersonSum;

    /**
     * 肇事车方向
     */
    private String anecdoteCarDirection;

    /**
     * 伤者方向
     */
    private String woundedDirection;

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

    public Date getInjuryTime() {
        return injuryTime;
    }

    public void setInjuryTime(Date injuryTime) {
        this.injuryTime = injuryTime;
    }

    public String getAnecdotePlate() {
        return anecdotePlate;
    }

    public void setAnecdotePlate(String anecdotePlate) {
        this.anecdotePlate = anecdotePlate;
    }

    public String getAnecdoteProvince() {
        return anecdoteProvince;
    }

    public void setAnecdoteProvince(String anecdoteProvince) {
        this.anecdoteProvince = anecdoteProvince;
    }

    public String getAnecdoteCity() {
        return anecdoteCity;
    }

    public void setAnecdoteCity(String anecdoteCity) {
        this.anecdoteCity = anecdoteCity;
    }

    public String getAnecdoteDistrict() {
        return anecdoteDistrict;
    }

    public void setAnecdoteDistrict(String anecdoteDistrict) {
        this.anecdoteDistrict = anecdoteDistrict;
    }

    public String getAnecdoteTown() {
        return anecdoteTown;
    }

    public void setAnecdoteTown(String anecdoteTown) {
        this.anecdoteTown = anecdoteTown;
    }

    public String getAnecdoteAddress() {
        return anecdoteAddress;
    }

    public void setAnecdoteAddress(String anecdoteAddress) {
        this.anecdoteAddress = anecdoteAddress;
    }

    public Integer getInjuryPersonSum() {
        return injuryPersonSum;
    }

    public void setInjuryPersonSum(Integer injuryPersonSum) {
        this.injuryPersonSum = injuryPersonSum;
    }

    public Integer getMinorInjuryPersonSum() {
        return minorInjuryPersonSum;
    }

    public void setMinorInjuryPersonSum(Integer minorInjuryPersonSum) {
        this.minorInjuryPersonSum = minorInjuryPersonSum;
    }

    public Integer getSeriousInjuryPersonSum() {
        return seriousInjuryPersonSum;
    }

    public void setSeriousInjuryPersonSum(Integer seriousInjuryPersonSum) {
        this.seriousInjuryPersonSum = seriousInjuryPersonSum;
    }

    public String getAnecdoteCarDirection() {
        return anecdoteCarDirection;
    }

    public void setAnecdoteCarDirection(String anecdoteCarDirection) {
        this.anecdoteCarDirection = anecdoteCarDirection;
    }

    public String getWoundedDirection() {
        return woundedDirection;
    }

    public void setWoundedDirection(String woundedDirection) {
        this.woundedDirection = woundedDirection;
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