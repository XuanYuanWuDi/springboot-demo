package com.injured.server.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class InjuredMedBasicInfo implements Serializable {
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
     * 序号
     */
    private Integer serialNum;

    /**
     * 保险公司ID
     */
    private Long companyId;

    /**
     * 保险公司Code
     */
    private String compantCode;

    /**
     * 伤者姓名
     */
    private String wouName;

    /**
     * 性别 0-未知，1-男，2-女
     */
    private Byte wouSex;

    /**
     * 伤者年龄
     */
    private String wouAge;

    /**
     * 伤者属性
     */
    private Byte wouType;

    /**
     * 人伤类型
     */
    private Byte wouInjury;

    /**
     * 证件类型
     */
    private Byte idCardType;

    /**
     * 证件号码
     */
    private String idCardNo;

    /**
     * 银行卡号
     */
    private String bankCardNumber;

    /**
     * 联系电话
     */
    private String contacNumber;

    /**
     * 索赔年度
     */
    private String claimYear;

    /**
     * 索赔地省
     */
    private String claimProvince;

    /**
     * 索赔地市
     */
    private String claimCity;

    /**
     * 是否诉讼 0-否，1-是
     */
    private Byte isPublicProsecution;

    /**
     * 代理人姓名
     */
    private String agentName;

    /**
     * 代理人电话
     */
    private String agentPhone;

    /**
     * 事故类型
     */
    private Byte accidentType;

    /**
     * 事故责任
     */
    private Byte accidentLiability;

    /**
     * 责任比例
     */
    private String liabilityRatio;

    /**
     * 户籍性质
     */
    private Byte resideNature;

    /**
     * 户籍地省
     */
    private String resideProvince;

    /**
     * 户籍地市
     */
    private String resideCity;

    /**
     * 户籍地区县
     */
    private String resideDistrict;

    /**
     * 户籍地乡镇
     */
    private String resideTown;

    /**
     * 户籍地详址
     */
    private String resideAddress;

    /**
     * 是否合格 0-否，1-是
     */
    private Byte whetherPassed;

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

    public Integer getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Integer serialNum) {
        this.serialNum = serialNum;
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

    public String getWouName() {
        return wouName;
    }

    public void setWouName(String wouName) {
        this.wouName = wouName;
    }

    public Byte getWouSex() {
        return wouSex;
    }

    public void setWouSex(Byte wouSex) {
        this.wouSex = wouSex;
    }

    public String getWouAge() {
        return wouAge;
    }

    public void setWouAge(String wouAge) {
        this.wouAge = wouAge;
    }

    public Byte getWouType() {
        return wouType;
    }

    public void setWouType(Byte wouType) {
        this.wouType = wouType;
    }

    public Byte getWouInjury() {
        return wouInjury;
    }

    public void setWouInjury(Byte wouInjury) {
        this.wouInjury = wouInjury;
    }

    public Byte getIdCardType() {
        return idCardType;
    }

    public void setIdCardType(Byte idCardType) {
        this.idCardType = idCardType;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getBankCardNumber() {
        return bankCardNumber;
    }

    public void setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber;
    }

    public String getContacNumber() {
        return contacNumber;
    }

    public void setContacNumber(String contacNumber) {
        this.contacNumber = contacNumber;
    }

    public String getClaimYear() {
        return claimYear;
    }

    public void setClaimYear(String claimYear) {
        this.claimYear = claimYear;
    }

    public String getClaimProvince() {
        return claimProvince;
    }

    public void setClaimProvince(String claimProvince) {
        this.claimProvince = claimProvince;
    }

    public String getClaimCity() {
        return claimCity;
    }

    public void setClaimCity(String claimCity) {
        this.claimCity = claimCity;
    }

    public Byte getIsPublicProsecution() {
        return isPublicProsecution;
    }

    public void setIsPublicProsecution(Byte isPublicProsecution) {
        this.isPublicProsecution = isPublicProsecution;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentPhone() {
        return agentPhone;
    }

    public void setAgentPhone(String agentPhone) {
        this.agentPhone = agentPhone;
    }

    public Byte getAccidentType() {
        return accidentType;
    }

    public void setAccidentType(Byte accidentType) {
        this.accidentType = accidentType;
    }

    public Byte getAccidentLiability() {
        return accidentLiability;
    }

    public void setAccidentLiability(Byte accidentLiability) {
        this.accidentLiability = accidentLiability;
    }

    public String getLiabilityRatio() {
        return liabilityRatio;
    }

    public void setLiabilityRatio(String liabilityRatio) {
        this.liabilityRatio = liabilityRatio;
    }

    public Byte getResideNature() {
        return resideNature;
    }

    public void setResideNature(Byte resideNature) {
        this.resideNature = resideNature;
    }

    public String getResideProvince() {
        return resideProvince;
    }

    public void setResideProvince(String resideProvince) {
        this.resideProvince = resideProvince;
    }

    public String getResideCity() {
        return resideCity;
    }

    public void setResideCity(String resideCity) {
        this.resideCity = resideCity;
    }

    public String getResideDistrict() {
        return resideDistrict;
    }

    public void setResideDistrict(String resideDistrict) {
        this.resideDistrict = resideDistrict;
    }

    public String getResideTown() {
        return resideTown;
    }

    public void setResideTown(String resideTown) {
        this.resideTown = resideTown;
    }

    public String getResideAddress() {
        return resideAddress;
    }

    public void setResideAddress(String resideAddress) {
        this.resideAddress = resideAddress;
    }

    public Byte getWhetherPassed() {
        return whetherPassed;
    }

    public void setWhetherPassed(Byte whetherPassed) {
        this.whetherPassed = whetherPassed;
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