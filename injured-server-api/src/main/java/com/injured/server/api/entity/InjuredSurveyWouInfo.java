package com.injured.server.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class InjuredSurveyWouInfo implements Serializable {
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
     * 查勘任务号
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
     * 伤者属性（CE)（码表见数据字典《伤者属性》）
     */
    private Integer humanInjury;

    /**
     * 人伤类型(CE)（码表见数据字典《人伤类型》）
     */
    private Integer humanType;

    /**
     * 伤者姓名
     */
    private String wouName;

    /**
     * 证件类型(CE)（码表见数据字典《证件类型代码》）
     */
    private Integer idCardType;

    /**
     * 证件号码
     */
    private String idCardNo;

    /**
     * 性别(CE)（码表见数据字典《性别代码》）
     */
    private Integer wouSex;

    /**
     * 年龄
     */
    private Integer wouAge;

    /**
     * 户籍性质(CE)（码表见数据字典《户籍性质》）
     */
    private Integer resideNature;

    /**
     * 户籍地省(CE)
     */
    private String resideProvince;

    /**
     * 户籍地市(CE)
     */
    private String resideCity;

    /**
     * 户籍地区县(CE)
     */
    private String resideDistrict;

    /**
     * 户籍地乡镇(CE)
     */
    private String resideTown;

    /**
     * 户籍地详址
     */
    private String resideAddress;

    /**
     * 常住地省(CE)
     */
    private String perProvince;

    /**
     * 常住地市(CE)
     */
    private String perCity;

    /**
     * 常住地区县(CE)
     */
    private String perDistrict;

    /**
     * 常住地乡镇(CE)
     */
    private String perTown;

    /**
     * 常住地详址
     */
    private String perResidenceAddress;

    /**
     * 同户籍地(CE)（码表见数据字典《是否判断》）
     */
    private Integer sameHousehold;

    /**
     * 医院名称
     */
    private String hospitalName;

    /**
     * 科室一级（CE)（码表见数据字典《科室》）
     */
    private Integer departmentFirst;

    /**
     * 科室二级（CE)（码表见数据字典《科室》）
     */
    private Integer departmentSecond;

    /**
     * 床位号
     */
    private String bedNumber;

    /**
     * 联系人姓名
     */
    private String contacts;

    /**
     * 联系人属性（CE)（码表见数据字典《联系人属性》）
     */
    private Integer contactAttributes;

    /**
     * 联系电话
     */
    private String contactsPhone;

    /**
     * 伤情描述
     */
    private String injuryDescription;

    /**
     * 致伤原因(CE)（码表见数据字典《致伤原因》）
     */
    private Integer injuryCause;

    /**
     * 情况说明
     */
    private String situationStatement;

    /**
     * 预估损失总金额（元）
     */
    private BigDecimal totalEstimatedAmount;

    /**
     * 损失险种责任(CE)（码表见数据字典《险种代码》）
     */
    private Integer lossLiability;

    /**
     * 预估损失金额
     */
    private BigDecimal estimatedAmount;

    /**
     * 是否删除
     */
    private Integer isDeleted;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 修改时间
     */
    private Date updtaeTime;

    /**
     * 修改人
     */
    private String updateUser;

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

    public Integer getHumanInjury() {
        return humanInjury;
    }

    public void setHumanInjury(Integer humanInjury) {
        this.humanInjury = humanInjury;
    }

    public Integer getHumanType() {
        return humanType;
    }

    public void setHumanType(Integer humanType) {
        this.humanType = humanType;
    }

    public String getWouName() {
        return wouName;
    }

    public void setWouName(String wouName) {
        this.wouName = wouName;
    }

    public Integer getIdCardType() {
        return idCardType;
    }

    public void setIdCardType(Integer idCardType) {
        this.idCardType = idCardType;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public Integer getWouSex() {
        return wouSex;
    }

    public void setWouSex(Integer wouSex) {
        this.wouSex = wouSex;
    }

    public Integer getWouAge() {
        return wouAge;
    }

    public void setWouAge(Integer wouAge) {
        this.wouAge = wouAge;
    }

    public Integer getResideNature() {
        return resideNature;
    }

    public void setResideNature(Integer resideNature) {
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

    public String getPerProvince() {
        return perProvince;
    }

    public void setPerProvince(String perProvince) {
        this.perProvince = perProvince;
    }

    public String getPerCity() {
        return perCity;
    }

    public void setPerCity(String perCity) {
        this.perCity = perCity;
    }

    public String getPerDistrict() {
        return perDistrict;
    }

    public void setPerDistrict(String perDistrict) {
        this.perDistrict = perDistrict;
    }

    public String getPerTown() {
        return perTown;
    }

    public void setPerTown(String perTown) {
        this.perTown = perTown;
    }

    public String getPerResidenceAddress() {
        return perResidenceAddress;
    }

    public void setPerResidenceAddress(String perResidenceAddress) {
        this.perResidenceAddress = perResidenceAddress;
    }

    public Integer getSameHousehold() {
        return sameHousehold;
    }

    public void setSameHousehold(Integer sameHousehold) {
        this.sameHousehold = sameHousehold;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Integer getDepartmentFirst() {
        return departmentFirst;
    }

    public void setDepartmentFirst(Integer departmentFirst) {
        this.departmentFirst = departmentFirst;
    }

    public Integer getDepartmentSecond() {
        return departmentSecond;
    }

    public void setDepartmentSecond(Integer departmentSecond) {
        this.departmentSecond = departmentSecond;
    }

    public String getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(String bedNumber) {
        this.bedNumber = bedNumber;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public Integer getContactAttributes() {
        return contactAttributes;
    }

    public void setContactAttributes(Integer contactAttributes) {
        this.contactAttributes = contactAttributes;
    }

    public String getContactsPhone() {
        return contactsPhone;
    }

    public void setContactsPhone(String contactsPhone) {
        this.contactsPhone = contactsPhone;
    }

    public String getInjuryDescription() {
        return injuryDescription;
    }

    public void setInjuryDescription(String injuryDescription) {
        this.injuryDescription = injuryDescription;
    }

    public Integer getInjuryCause() {
        return injuryCause;
    }

    public void setInjuryCause(Integer injuryCause) {
        this.injuryCause = injuryCause;
    }

    public String getSituationStatement() {
        return situationStatement;
    }

    public void setSituationStatement(String situationStatement) {
        this.situationStatement = situationStatement;
    }

    public BigDecimal getTotalEstimatedAmount() {
        return totalEstimatedAmount;
    }

    public void setTotalEstimatedAmount(BigDecimal totalEstimatedAmount) {
        this.totalEstimatedAmount = totalEstimatedAmount;
    }

    public Integer getLossLiability() {
        return lossLiability;
    }

    public void setLossLiability(Integer lossLiability) {
        this.lossLiability = lossLiability;
    }

    public BigDecimal getEstimatedAmount() {
        return estimatedAmount;
    }

    public void setEstimatedAmount(BigDecimal estimatedAmount) {
        this.estimatedAmount = estimatedAmount;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getUpdtaeTime() {
        return updtaeTime;
    }

    public void setUpdtaeTime(Date updtaeTime) {
        this.updtaeTime = updtaeTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}