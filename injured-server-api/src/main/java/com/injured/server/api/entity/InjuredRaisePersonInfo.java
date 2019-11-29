package com.injured.server.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class InjuredRaisePersonInfo implements Serializable {
    /**
     * 主键
     */
    private Long id;

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
     * 被扶养人姓名
     */
    private String raisePersonName;

    /**
     * 性别(CE)（码表见数据字典《性别代码》）0-未知，1-男，2-女
     */
    private Integer raisePersonSex;

    /**
     * 年龄
     */
    private Integer raisePersonAge;

    /**
     * 身份证号
     */
    private String idCardNo;

    /**
     * 与伤者关系(CE)（码表见数据字典《与伤者关系》）
     */
    private Integer injuRelation;

    /**
     * 需抚养年限
     */
    private Integer raiseYears;

    /**
     * 共同抚养人数
     */
    private Integer coRaiseNum;

    /**
     * 户籍性质(CE)（码表见数据字典《户籍性质》）
     */
    private Integer resideNature;

    /**
     * 赔偿标准
     */
    private Integer appUserStandard;

    /**
     * 其它收入来源(CE)（码表见数据字典《是否判断》）
     */
    private Integer isOtherSourcesIncome;

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

    public String getRaisePersonName() {
        return raisePersonName;
    }

    public void setRaisePersonName(String raisePersonName) {
        this.raisePersonName = raisePersonName;
    }

    public Integer getRaisePersonSex() {
        return raisePersonSex;
    }

    public void setRaisePersonSex(Integer raisePersonSex) {
        this.raisePersonSex = raisePersonSex;
    }

    public Integer getRaisePersonAge() {
        return raisePersonAge;
    }

    public void setRaisePersonAge(Integer raisePersonAge) {
        this.raisePersonAge = raisePersonAge;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public Integer getInjuRelation() {
        return injuRelation;
    }

    public void setInjuRelation(Integer injuRelation) {
        this.injuRelation = injuRelation;
    }

    public Integer getRaiseYears() {
        return raiseYears;
    }

    public void setRaiseYears(Integer raiseYears) {
        this.raiseYears = raiseYears;
    }

    public Integer getCoRaiseNum() {
        return coRaiseNum;
    }

    public void setCoRaiseNum(Integer coRaiseNum) {
        this.coRaiseNum = coRaiseNum;
    }

    public Integer getResideNature() {
        return resideNature;
    }

    public void setResideNature(Integer resideNature) {
        this.resideNature = resideNature;
    }

    public Integer getAppUserStandard() {
        return appUserStandard;
    }

    public void setAppUserStandard(Integer appUserStandard) {
        this.appUserStandard = appUserStandard;
    }

    public Integer getIsOtherSourcesIncome() {
        return isOtherSourcesIncome;
    }

    public void setIsOtherSourcesIncome(Integer isOtherSourcesIncome) {
        this.isOtherSourcesIncome = isOtherSourcesIncome;
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