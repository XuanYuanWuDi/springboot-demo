package com.injured.server.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class InjuredFastCompensatInfo implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 任务状态 1待处理 2处理中 3处理结束
     */
    private Integer taskStatus;

    /**
     * 审核状态 1待审核 2初级审核中 3初级审核完成 4终极审核中  5审核完成
     */
    private Integer reviewStatus;

    /**
     * 审核人姓名
     */
    private String reviewerName;

    /**
     * 审核人ID（派工用）
     */
    private Long reviewerId;

    /**
     * 定损人姓名
     */
    private String damageName;

    /**
     * 定损人工号
     */
    private String damageNo;

    /**
     * 报案编号
     */
    private String claimNotificationNo;

    /**
     * 保险公司任务编号
     */
    private String taskNo;

    /**
     * 报案id
     */
    private Long registId;

    /**
     * 查勘id
     */
    private Long surveyId;

    /**
     * 保险公司CODE
     */
    private String compantCode;

    /**
     * 保险公司ID
     */
    private Long companyId;

    /**
     * 保险公司机构code
     */
    private String companyAgencyCode;

    /**
     * 保险公司机构名称
     */
    private String companyAgencyName;

    /**
     * 保险公司机构ID
     */
    private Long companyAgencyId;

    /**
     * 序号
     */
    private Integer serialNum;

    /**
     * 主车行驶情况 1直行 2拐弯 3起步 4倒车 5停放 6其他
     */
    private Integer mainDrivingStatus;

    /**
     * 伤者交通方式 1徒步 2骑乘（两轮、三轮） 3乘坐（汽车）
     */
    private Integer wouTransportat;

    /**
     * 备注
     */
    private String remark;

    /**
     * 人伤首勘地 1事故现场 2医院 3住所 4其他区域
     */
    private Integer surveyFirstAddress;

    /**
     * 初诊时间
     */
    private Date visitTime;

    /**
     * 已发生医药费
     */
    private BigDecimal medicalExpensesFee;

    /**
     * 收入类型 1固定收入 2无固定收入 3无收入
     */
    private Integer incomeStatus;

    /**
     * 从事行业
     */
    private Integer engagedIndustry;

    /**
     * 月均收入
     */
    private BigDecimal monthlyIncome;

    /**
     * 收款名
     */
    private String receiptName;

    /**
     * 收款账号
     */
    private String receiptAccount;

    /**
     * 收款开户行
     */
    private String receiptBank;

    /**
     * 定损类型一级 1常规 2调解 3诉讼
     */
    private String lossFirstType;

    /**
     * 定损类型二级 1现场 2非现场
     */
    private String lossSecondType;

    /**
     * 例均赔付金额
     */
    private BigDecimal averagePayAmount;

    /**
     * 建议金额
     */
    private BigDecimal recommendAmount;

    /**
     * 定损金额
     */
    private BigDecimal fixedLossAmount;

    /**
     * 核损金额
     */
    private BigDecimal damageAmount;

    /**
     * 人伤类型 1简易调解 2普通门诊 3普通住院 4涉及伤残 5现场死亡 6救治死亡
     */
    private Integer humanInjury;

    /**
     * 伤者属性 1主车驾驶员 2主车乘客 3三者步行人 4三者骑乘人 5三者车上人
     */
    private Integer humanType;

    /**
     * 就诊类型 1未治疗 2门急诊治疗 3住院治疗
     */
    private Integer sendDoctorType;

    /**
     * 伤者姓名
     */
    private String humanName;

    /**
     * 证件类型 1居民身份证 2居民户口薄 3驾驶证 4军官证 5士兵证 6 军官离退休证 7中国护照 8异常身份证 9港澳通行证 10台湾通行证 11回乡证 12外国护照 13旅行证 14居留证件 15组织机构代码证 16税务登记证 17营业执照 18其他证件
     */
    private String idCardType;

    /**
     * 证件号码
     */
    private String idCard;

    /**
     * 伤者性别 0未知 1男 2女
     */
    private Integer humanSex;

    /**
     * 出生年月
     */
    private Date birthDate;

    /**
     * 伤者年龄
     */
    private Integer humanAge;

    /**
     * 联系电话
     */
    private String contacNumber;

    /**
     * 户籍性质 1农村 2城镇 3城乡结合 4农村按城镇
     */
    private Integer resideNature;

    /**
     * 常住地省
     */
    private String perResidenceProvince;

    /**
     * 常住地市
     */
    private String perResidenceCity;

    /**
     * 常住地区县
     */
    private String perResidenceDistrict;

    /**
     * 常住地乡镇
     */
    private String perResidenceTown;

    /**
     * 常住地详址
     */
    private String perResidenceAddress;

    /**
     * 医院名称
     */
    private String hospitalName;

    /**
     * 就诊时间
     */
    private Date sendDoctorTime;

    /**
     * 科室
     */
    private String hospitalDepartmentFirst;

    /**
     * 科室二
     */
    private String hospitalDepartmentSecond;

    /**
     * 科室名称
     */
    private String hospitalDepartmentFirstName;

    /**
     * 科室名称二
     */
    private String hospitalDepartmentSecondName;

    /**
     * 损伤部位
     */
    private String damageSite;

    /**
     * 损伤部位二级
     */
    private String damageSiteSecond;

    /**
     * 损伤类型
     */
    private String damageType;

    /**
     * 伤情诊断
     */
    private String diagnosisInjury;

    /**
     * 定损说明
     */
    private String damageDesc;

    /**
     * 定损接收时间
     */
    private Date fixedLossReceivTime;

    /**
     * 定损提交时间
     */
    private Date fixedLossSubmitTime;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private String updateUser;

    /**
     * 修改时间
     */
    private Date updtaeTime;

    /**
     * 是否删除 0否 1是
     */
    private Integer isDeleted;

    /**
     * 事故责任划分，字典信息《事故责任》
     */
    private String accidentLiability;

    /**
     * 事故类型-保险事故分类，字典信息《事故类型》
     */
    private String ceAccidentType;

    /**
     * 索赔地省
     */
    private String claimProvince;

    /**
     * 索赔地市
     */
    private String claimCity;

    /**
     * 被保险人
     */
    private String theInsuredName;

    /**
     * 报案时间
     */
    private Date reportDate;

    /**
     * 理赔机构
     */
    private String claimsAgency;

    /**
     * 异步通知地址
     */
    private String notifyUrl;

    /**
     * 同步返回地址
     */
    private String returnUrl;

    /**
     * 出险时间
     */
    private Date lossTime;

    /**
     * 损失险种责任 见数据字典《险种》
     */
    private Integer lossLiability;

    /**
     * 任务类型 见数据字典<任务类型>
     */
    private String taskTypeFirst;

    /**
     * 任务类型二级 见数据字典
     */
    private String taskTypeSecond;

    //超时时长
    private Long timeOut = 0L;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
    }

    public Integer getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public Long getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(Long reviewerId) {
        this.reviewerId = reviewerId;
    }

    public String getDamageName() {
        return damageName;
    }

    public void setDamageName(String damageName) {
        this.damageName = damageName;
    }

    public String getDamageNo() {
        return damageNo;
    }

    public void setDamageNo(String damageNo) {
        this.damageNo = damageNo;
    }

    public String getClaimNotificationNo() {
        return claimNotificationNo;
    }

    public void setClaimNotificationNo(String claimNotificationNo) {
        this.claimNotificationNo = claimNotificationNo;
    }

    public String getTaskNo() {
        return taskNo;
    }

    public void setTaskNo(String taskNo) {
        this.taskNo = taskNo;
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

    public String getCompanyAgencyCode() {
        return companyAgencyCode;
    }

    public void setCompanyAgencyCode(String companyAgencyCode) {
        this.companyAgencyCode = companyAgencyCode;
    }

    public String getCompanyAgencyName() {
        return companyAgencyName;
    }

    public void setCompanyAgencyName(String companyAgencyName) {
        this.companyAgencyName = companyAgencyName;
    }

    public Long getCompanyAgencyId() {
        return companyAgencyId;
    }

    public void setCompanyAgencyId(Long companyAgencyId) {
        this.companyAgencyId = companyAgencyId;
    }

    public Integer getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Integer serialNum) {
        this.serialNum = serialNum;
    }

    public Integer getMainDrivingStatus() {
        return mainDrivingStatus;
    }

    public void setMainDrivingStatus(Integer mainDrivingStatus) {
        this.mainDrivingStatus = mainDrivingStatus;
    }

    public Integer getWouTransportat() {
        return wouTransportat;
    }

    public void setWouTransportat(Integer wouTransportat) {
        this.wouTransportat = wouTransportat;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getSurveyFirstAddress() {
        return surveyFirstAddress;
    }

    public void setSurveyFirstAddress(Integer surveyFirstAddress) {
        this.surveyFirstAddress = surveyFirstAddress;
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    public BigDecimal getMedicalExpensesFee() {
        return medicalExpensesFee;
    }

    public void setMedicalExpensesFee(BigDecimal medicalExpensesFee) {
        this.medicalExpensesFee = medicalExpensesFee;
    }

    public Integer getIncomeStatus() {
        return incomeStatus;
    }

    public void setIncomeStatus(Integer incomeStatus) {
        this.incomeStatus = incomeStatus;
    }

    public Integer getEngagedIndustry() {
        return engagedIndustry;
    }

    public void setEngagedIndustry(Integer engagedIndustry) {
        this.engagedIndustry = engagedIndustry;
    }

    public BigDecimal getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(BigDecimal monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public String getReceiptName() {
        return receiptName;
    }

    public void setReceiptName(String receiptName) {
        this.receiptName = receiptName;
    }

    public String getReceiptAccount() {
        return receiptAccount;
    }

    public void setReceiptAccount(String receiptAccount) {
        this.receiptAccount = receiptAccount;
    }

    public String getReceiptBank() {
        return receiptBank;
    }

    public void setReceiptBank(String receiptBank) {
        this.receiptBank = receiptBank;
    }

    public String getLossFirstType() {
        return lossFirstType;
    }

    public void setLossFirstType(String lossFirstType) {
        this.lossFirstType = lossFirstType;
    }

    public String getLossSecondType() {
        return lossSecondType;
    }

    public void setLossSecondType(String lossSecondType) {
        this.lossSecondType = lossSecondType;
    }

    public BigDecimal getAveragePayAmount() {
        return averagePayAmount;
    }

    public void setAveragePayAmount(BigDecimal averagePayAmount) {
        this.averagePayAmount = averagePayAmount;
    }

    public BigDecimal getRecommendAmount() {
        return recommendAmount;
    }

    public void setRecommendAmount(BigDecimal recommendAmount) {
        this.recommendAmount = recommendAmount;
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

    public Integer getSendDoctorType() {
        return sendDoctorType;
    }

    public void setSendDoctorType(Integer sendDoctorType) {
        this.sendDoctorType = sendDoctorType;
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public String getIdCardType() {
        return idCardType;
    }

    public void setIdCardType(String idCardType) {
        this.idCardType = idCardType;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getHumanSex() {
        return humanSex;
    }

    public void setHumanSex(Integer humanSex) {
        this.humanSex = humanSex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getHumanAge() {
        return humanAge;
    }

    public void setHumanAge(Integer humanAge) {
        this.humanAge = humanAge;
    }

    public String getContacNumber() {
        return contacNumber;
    }

    public void setContacNumber(String contacNumber) {
        this.contacNumber = contacNumber;
    }

    public Integer getResideNature() {
        return resideNature;
    }

    public void setResideNature(Integer resideNature) {
        this.resideNature = resideNature;
    }

    public String getPerResidenceProvince() {
        return perResidenceProvince;
    }

    public void setPerResidenceProvince(String perResidenceProvince) {
        this.perResidenceProvince = perResidenceProvince;
    }

    public String getPerResidenceCity() {
        return perResidenceCity;
    }

    public void setPerResidenceCity(String perResidenceCity) {
        this.perResidenceCity = perResidenceCity;
    }

    public String getPerResidenceDistrict() {
        return perResidenceDistrict;
    }

    public void setPerResidenceDistrict(String perResidenceDistrict) {
        this.perResidenceDistrict = perResidenceDistrict;
    }

    public String getPerResidenceTown() {
        return perResidenceTown;
    }

    public void setPerResidenceTown(String perResidenceTown) {
        this.perResidenceTown = perResidenceTown;
    }

    public String getPerResidenceAddress() {
        return perResidenceAddress;
    }

    public void setPerResidenceAddress(String perResidenceAddress) {
        this.perResidenceAddress = perResidenceAddress;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Date getSendDoctorTime() {
        return sendDoctorTime;
    }

    public void setSendDoctorTime(Date sendDoctorTime) {
        this.sendDoctorTime = sendDoctorTime;
    }

    public String getHospitalDepartmentFirst() {
        return hospitalDepartmentFirst;
    }

    public void setHospitalDepartmentFirst(String hospitalDepartmentFirst) {
        this.hospitalDepartmentFirst = hospitalDepartmentFirst;
    }

    public String getHospitalDepartmentSecond() {
        return hospitalDepartmentSecond;
    }

    public void setHospitalDepartmentSecond(String hospitalDepartmentSecond) {
        this.hospitalDepartmentSecond = hospitalDepartmentSecond;
    }

    public String getHospitalDepartmentFirstName() {
        return hospitalDepartmentFirstName;
    }

    public void setHospitalDepartmentFirstName(String hospitalDepartmentFirstName) {
        this.hospitalDepartmentFirstName = hospitalDepartmentFirstName;
    }

    public String getHospitalDepartmentSecondName() {
        return hospitalDepartmentSecondName;
    }

    public void setHospitalDepartmentSecondName(String hospitalDepartmentSecondName) {
        this.hospitalDepartmentSecondName = hospitalDepartmentSecondName;
    }

    public String getDamageSite() {
        return damageSite;
    }

    public void setDamageSite(String damageSite) {
        this.damageSite = damageSite;
    }

    public String getDamageSiteSecond() {
        return damageSiteSecond;
    }

    public void setDamageSiteSecond(String damageSiteSecond) {
        this.damageSiteSecond = damageSiteSecond;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }

    public String getDiagnosisInjury() {
        return diagnosisInjury;
    }

    public void setDiagnosisInjury(String diagnosisInjury) {
        this.diagnosisInjury = diagnosisInjury;
    }

    public String getDamageDesc() {
        return damageDesc;
    }

    public void setDamageDesc(String damageDesc) {
        this.damageDesc = damageDesc;
    }

    public Date getFixedLossReceivTime() {
        return fixedLossReceivTime;
    }

    public void setFixedLossReceivTime(Date fixedLossReceivTime) {
        this.fixedLossReceivTime = fixedLossReceivTime;
    }

    public Date getFixedLossSubmitTime() {
        return fixedLossSubmitTime;
    }

    public void setFixedLossSubmitTime(Date fixedLossSubmitTime) {
        this.fixedLossSubmitTime = fixedLossSubmitTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdtaeTime() {
        return updtaeTime;
    }

    public void setUpdtaeTime(Date updtaeTime) {
        this.updtaeTime = updtaeTime;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getAccidentLiability() {
        return accidentLiability;
    }

    public void setAccidentLiability(String accidentLiability) {
        this.accidentLiability = accidentLiability;
    }

    public String getCeAccidentType() {
        return ceAccidentType;
    }

    public void setCeAccidentType(String ceAccidentType) {
        this.ceAccidentType = ceAccidentType;
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

    public String getTheInsuredName() {
        return theInsuredName;
    }

    public void setTheInsuredName(String theInsuredName) {
        this.theInsuredName = theInsuredName;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public String getClaimsAgency() {
        return claimsAgency;
    }

    public void setClaimsAgency(String claimsAgency) {
        this.claimsAgency = claimsAgency;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public Date getLossTime() {
        return lossTime;
    }

    public void setLossTime(Date lossTime) {
        this.lossTime = lossTime;
    }

    public Integer getLossLiability() {
        return lossLiability;
    }

    public void setLossLiability(Integer lossLiability) {
        this.lossLiability = lossLiability;
    }

    public String getTaskTypeFirst() {
        return taskTypeFirst;
    }

    public void setTaskTypeFirst(String taskTypeFirst) {
        this.taskTypeFirst = taskTypeFirst;
    }

    public String getTaskTypeSecond() {
        return taskTypeSecond;
    }

    public void setTaskTypeSecond(String taskTypeSecond) {
        this.taskTypeSecond = taskTypeSecond;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        InjuredFastCompensatInfo other = (InjuredFastCompensatInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getClaimNotificationNo() == null ? other.getClaimNotificationNo() == null : this.getClaimNotificationNo().equals(other.getClaimNotificationNo()))
            && (this.getTaskNo() == null ? other.getTaskNo() == null : this.getTaskNo().equals(other.getTaskNo()))
            && (this.getRegistId() == null ? other.getRegistId() == null : this.getRegistId().equals(other.getRegistId()))
            && (this.getSurveyId() == null ? other.getSurveyId() == null : this.getSurveyId().equals(other.getSurveyId()))
            && (this.getCompantCode() == null ? other.getCompantCode() == null : this.getCompantCode().equals(other.getCompantCode()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getCompanyAgencyCode() == null ? other.getCompanyAgencyCode() == null : this.getCompanyAgencyCode().equals(other.getCompanyAgencyCode()))
            && (this.getCompanyAgencyName() == null ? other.getCompanyAgencyName() == null : this.getCompanyAgencyName().equals(other.getCompanyAgencyName()))
            && (this.getCompanyAgencyId() == null ? other.getCompanyAgencyId() == null : this.getCompanyAgencyId().equals(other.getCompanyAgencyId()))
            && (this.getSerialNum() == null ? other.getSerialNum() == null : this.getSerialNum().equals(other.getSerialNum()))
            && (this.getMainDrivingStatus() == null ? other.getMainDrivingStatus() == null : this.getMainDrivingStatus().equals(other.getMainDrivingStatus()))
            && (this.getWouTransportat() == null ? other.getWouTransportat() == null : this.getWouTransportat().equals(other.getWouTransportat()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getSurveyFirstAddress() == null ? other.getSurveyFirstAddress() == null : this.getSurveyFirstAddress().equals(other.getSurveyFirstAddress()))
            && (this.getVisitTime() == null ? other.getVisitTime() == null : this.getVisitTime().equals(other.getVisitTime()))
            && (this.getMedicalExpensesFee() == null ? other.getMedicalExpensesFee() == null : this.getMedicalExpensesFee().equals(other.getMedicalExpensesFee()))
            && (this.getIncomeStatus() == null ? other.getIncomeStatus() == null : this.getIncomeStatus().equals(other.getIncomeStatus()))
            && (this.getEngagedIndustry() == null ? other.getEngagedIndustry() == null : this.getEngagedIndustry().equals(other.getEngagedIndustry()))
            && (this.getMonthlyIncome() == null ? other.getMonthlyIncome() == null : this.getMonthlyIncome().equals(other.getMonthlyIncome()))
            && (this.getReceiptName() == null ? other.getReceiptName() == null : this.getReceiptName().equals(other.getReceiptName()))
            && (this.getReceiptAccount() == null ? other.getReceiptAccount() == null : this.getReceiptAccount().equals(other.getReceiptAccount()))
            && (this.getReceiptBank() == null ? other.getReceiptBank() == null : this.getReceiptBank().equals(other.getReceiptBank()))
            && (this.getLossFirstType() == null ? other.getLossFirstType() == null : this.getLossFirstType().equals(other.getLossFirstType()))
            && (this.getLossSecondType() == null ? other.getLossSecondType() == null : this.getLossSecondType().equals(other.getLossSecondType()))
            && (this.getAveragePayAmount() == null ? other.getAveragePayAmount() == null : this.getAveragePayAmount().equals(other.getAveragePayAmount()))
            && (this.getRecommendAmount() == null ? other.getRecommendAmount() == null : this.getRecommendAmount().equals(other.getRecommendAmount()))
            && (this.getFixedLossAmount() == null ? other.getFixedLossAmount() == null : this.getFixedLossAmount().equals(other.getFixedLossAmount()))
            && (this.getDamageAmount() == null ? other.getDamageAmount() == null : this.getDamageAmount().equals(other.getDamageAmount()))
            && (this.getHumanInjury() == null ? other.getHumanInjury() == null : this.getHumanInjury().equals(other.getHumanInjury()))
            && (this.getHumanType() == null ? other.getHumanType() == null : this.getHumanType().equals(other.getHumanType()))
            && (this.getSendDoctorType() == null ? other.getSendDoctorType() == null : this.getSendDoctorType().equals(other.getSendDoctorType()))
            && (this.getHumanName() == null ? other.getHumanName() == null : this.getHumanName().equals(other.getHumanName()))
            && (this.getIdCardType() == null ? other.getIdCardType() == null : this.getIdCardType().equals(other.getIdCardType()))
            && (this.getIdCard() == null ? other.getIdCard() == null : this.getIdCard().equals(other.getIdCard()))
            && (this.getHumanSex() == null ? other.getHumanSex() == null : this.getHumanSex().equals(other.getHumanSex()))
            && (this.getBirthDate() == null ? other.getBirthDate() == null : this.getBirthDate().equals(other.getBirthDate()))
            && (this.getHumanAge() == null ? other.getHumanAge() == null : this.getHumanAge().equals(other.getHumanAge()))
            && (this.getContacNumber() == null ? other.getContacNumber() == null : this.getContacNumber().equals(other.getContacNumber()))
            && (this.getResideNature() == null ? other.getResideNature() == null : this.getResideNature().equals(other.getResideNature()))
            && (this.getPerResidenceProvince() == null ? other.getPerResidenceProvince() == null : this.getPerResidenceProvince().equals(other.getPerResidenceProvince()))
            && (this.getPerResidenceCity() == null ? other.getPerResidenceCity() == null : this.getPerResidenceCity().equals(other.getPerResidenceCity()))
            && (this.getPerResidenceDistrict() == null ? other.getPerResidenceDistrict() == null : this.getPerResidenceDistrict().equals(other.getPerResidenceDistrict()))
            && (this.getPerResidenceTown() == null ? other.getPerResidenceTown() == null : this.getPerResidenceTown().equals(other.getPerResidenceTown()))
            && (this.getPerResidenceAddress() == null ? other.getPerResidenceAddress() == null : this.getPerResidenceAddress().equals(other.getPerResidenceAddress()))
            && (this.getHospitalName() == null ? other.getHospitalName() == null : this.getHospitalName().equals(other.getHospitalName()))
            && (this.getSendDoctorTime() == null ? other.getSendDoctorTime() == null : this.getSendDoctorTime().equals(other.getSendDoctorTime()))
            && (this.getHospitalDepartmentFirst() == null ? other.getHospitalDepartmentFirst() == null : this.getHospitalDepartmentFirst().equals(other.getHospitalDepartmentFirst()))
            && (this.getHospitalDepartmentSecond() == null ? other.getHospitalDepartmentSecond() == null : this.getHospitalDepartmentSecond().equals(other.getHospitalDepartmentSecond()))
            && (this.getHospitalDepartmentFirstName() == null ? other.getHospitalDepartmentFirstName() == null : this.getHospitalDepartmentFirstName().equals(other.getHospitalDepartmentFirstName()))
            && (this.getHospitalDepartmentSecondName() == null ? other.getHospitalDepartmentSecondName() == null : this.getHospitalDepartmentSecondName().equals(other.getHospitalDepartmentSecondName()))
            && (this.getDamageSite() == null ? other.getDamageSite() == null : this.getDamageSite().equals(other.getDamageSite()))
            && (this.getDamageSiteSecond() == null ? other.getDamageSiteSecond() == null : this.getDamageSiteSecond().equals(other.getDamageSiteSecond()))
            && (this.getDamageType() == null ? other.getDamageType() == null : this.getDamageType().equals(other.getDamageType()))
            && (this.getDiagnosisInjury() == null ? other.getDiagnosisInjury() == null : this.getDiagnosisInjury().equals(other.getDiagnosisInjury()))
            && (this.getDamageDesc() == null ? other.getDamageDesc() == null : this.getDamageDesc().equals(other.getDamageDesc()))
            && (this.getDamageName() == null ? other.getDamageName() == null : this.getDamageName().equals(other.getDamageName()))
            && (this.getDamageNo() == null ? other.getDamageNo() == null : this.getDamageNo().equals(other.getDamageNo()))
            && (this.getFixedLossReceivTime() == null ? other.getFixedLossReceivTime() == null : this.getFixedLossReceivTime().equals(other.getFixedLossReceivTime()))
            && (this.getFixedLossSubmitTime() == null ? other.getFixedLossSubmitTime() == null : this.getFixedLossSubmitTime().equals(other.getFixedLossSubmitTime()))
            && (this.getReviewStatus() == null ? other.getReviewStatus() == null : this.getReviewStatus().equals(other.getReviewStatus()))
            && (this.getTaskStatus() == null ? other.getTaskStatus() == null : this.getTaskStatus().equals(other.getTaskStatus()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getUpdtaeTime() == null ? other.getUpdtaeTime() == null : this.getUpdtaeTime().equals(other.getUpdtaeTime()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()))
            && (this.getAccidentLiability() == null ? other.getAccidentLiability() == null : this.getAccidentLiability().equals(other.getAccidentLiability()))
            && (this.getCeAccidentType() == null ? other.getCeAccidentType() == null : this.getCeAccidentType().equals(other.getCeAccidentType()))
            && (this.getClaimProvince() == null ? other.getClaimProvince() == null : this.getClaimProvince().equals(other.getClaimProvince()))
            && (this.getClaimCity() == null ? other.getClaimCity() == null : this.getClaimCity().equals(other.getClaimCity()))
            && (this.getReviewerId() == null ? other.getReviewerId() == null : this.getReviewerId().equals(other.getReviewerId()))
            && (this.getTheInsuredName() == null ? other.getTheInsuredName() == null : this.getTheInsuredName().equals(other.getTheInsuredName()))
            && (this.getReportDate() == null ? other.getReportDate() == null : this.getReportDate().equals(other.getReportDate()))
            && (this.getClaimsAgency() == null ? other.getClaimsAgency() == null : this.getClaimsAgency().equals(other.getClaimsAgency()))
            && (this.getNotifyUrl() == null ? other.getNotifyUrl() == null : this.getNotifyUrl().equals(other.getNotifyUrl()))
            && (this.getReturnUrl() == null ? other.getReturnUrl() == null : this.getReturnUrl().equals(other.getReturnUrl()))
            && (this.getLossTime() == null ? other.getLossTime() == null : this.getLossTime().equals(other.getLossTime()))
            && (this.getLossLiability() == null ? other.getLossLiability() == null : this.getLossLiability().equals(other.getLossLiability()))
            && (this.getTaskTypeFirst() == null ? other.getTaskTypeFirst() == null : this.getTaskTypeFirst().equals(other.getTaskTypeFirst()))
            && (this.getTaskTypeSecond() == null ? other.getTaskTypeSecond() == null : this.getTaskTypeSecond().equals(other.getTaskTypeSecond()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getClaimNotificationNo() == null) ? 0 : getClaimNotificationNo().hashCode());
        result = prime * result + ((getTaskNo() == null) ? 0 : getTaskNo().hashCode());
        result = prime * result + ((getRegistId() == null) ? 0 : getRegistId().hashCode());
        result = prime * result + ((getSurveyId() == null) ? 0 : getSurveyId().hashCode());
        result = prime * result + ((getCompantCode() == null) ? 0 : getCompantCode().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getCompanyAgencyCode() == null) ? 0 : getCompanyAgencyCode().hashCode());
        result = prime * result + ((getCompanyAgencyName() == null) ? 0 : getCompanyAgencyName().hashCode());
        result = prime * result + ((getCompanyAgencyId() == null) ? 0 : getCompanyAgencyId().hashCode());
        result = prime * result + ((getSerialNum() == null) ? 0 : getSerialNum().hashCode());
        result = prime * result + ((getMainDrivingStatus() == null) ? 0 : getMainDrivingStatus().hashCode());
        result = prime * result + ((getWouTransportat() == null) ? 0 : getWouTransportat().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getSurveyFirstAddress() == null) ? 0 : getSurveyFirstAddress().hashCode());
        result = prime * result + ((getVisitTime() == null) ? 0 : getVisitTime().hashCode());
        result = prime * result + ((getMedicalExpensesFee() == null) ? 0 : getMedicalExpensesFee().hashCode());
        result = prime * result + ((getIncomeStatus() == null) ? 0 : getIncomeStatus().hashCode());
        result = prime * result + ((getEngagedIndustry() == null) ? 0 : getEngagedIndustry().hashCode());
        result = prime * result + ((getMonthlyIncome() == null) ? 0 : getMonthlyIncome().hashCode());
        result = prime * result + ((getReceiptName() == null) ? 0 : getReceiptName().hashCode());
        result = prime * result + ((getReceiptAccount() == null) ? 0 : getReceiptAccount().hashCode());
        result = prime * result + ((getReceiptBank() == null) ? 0 : getReceiptBank().hashCode());
        result = prime * result + ((getLossFirstType() == null) ? 0 : getLossFirstType().hashCode());
        result = prime * result + ((getLossSecondType() == null) ? 0 : getLossSecondType().hashCode());
        result = prime * result + ((getAveragePayAmount() == null) ? 0 : getAveragePayAmount().hashCode());
        result = prime * result + ((getRecommendAmount() == null) ? 0 : getRecommendAmount().hashCode());
        result = prime * result + ((getFixedLossAmount() == null) ? 0 : getFixedLossAmount().hashCode());
        result = prime * result + ((getDamageAmount() == null) ? 0 : getDamageAmount().hashCode());
        result = prime * result + ((getHumanInjury() == null) ? 0 : getHumanInjury().hashCode());
        result = prime * result + ((getHumanType() == null) ? 0 : getHumanType().hashCode());
        result = prime * result + ((getSendDoctorType() == null) ? 0 : getSendDoctorType().hashCode());
        result = prime * result + ((getHumanName() == null) ? 0 : getHumanName().hashCode());
        result = prime * result + ((getIdCardType() == null) ? 0 : getIdCardType().hashCode());
        result = prime * result + ((getIdCard() == null) ? 0 : getIdCard().hashCode());
        result = prime * result + ((getHumanSex() == null) ? 0 : getHumanSex().hashCode());
        result = prime * result + ((getBirthDate() == null) ? 0 : getBirthDate().hashCode());
        result = prime * result + ((getHumanAge() == null) ? 0 : getHumanAge().hashCode());
        result = prime * result + ((getContacNumber() == null) ? 0 : getContacNumber().hashCode());
        result = prime * result + ((getResideNature() == null) ? 0 : getResideNature().hashCode());
        result = prime * result + ((getPerResidenceProvince() == null) ? 0 : getPerResidenceProvince().hashCode());
        result = prime * result + ((getPerResidenceCity() == null) ? 0 : getPerResidenceCity().hashCode());
        result = prime * result + ((getPerResidenceDistrict() == null) ? 0 : getPerResidenceDistrict().hashCode());
        result = prime * result + ((getPerResidenceTown() == null) ? 0 : getPerResidenceTown().hashCode());
        result = prime * result + ((getPerResidenceAddress() == null) ? 0 : getPerResidenceAddress().hashCode());
        result = prime * result + ((getHospitalName() == null) ? 0 : getHospitalName().hashCode());
        result = prime * result + ((getSendDoctorTime() == null) ? 0 : getSendDoctorTime().hashCode());
        result = prime * result + ((getHospitalDepartmentFirst() == null) ? 0 : getHospitalDepartmentFirst().hashCode());
        result = prime * result + ((getHospitalDepartmentSecond() == null) ? 0 : getHospitalDepartmentSecond().hashCode());
        result = prime * result + ((getHospitalDepartmentFirstName() == null) ? 0 : getHospitalDepartmentFirstName().hashCode());
        result = prime * result + ((getHospitalDepartmentSecondName() == null) ? 0 : getHospitalDepartmentSecondName().hashCode());
        result = prime * result + ((getDamageSite() == null) ? 0 : getDamageSite().hashCode());
        result = prime * result + ((getDamageSiteSecond() == null) ? 0 : getDamageSiteSecond().hashCode());
        result = prime * result + ((getDamageType() == null) ? 0 : getDamageType().hashCode());
        result = prime * result + ((getDiagnosisInjury() == null) ? 0 : getDiagnosisInjury().hashCode());
        result = prime * result + ((getDamageDesc() == null) ? 0 : getDamageDesc().hashCode());
        result = prime * result + ((getDamageName() == null) ? 0 : getDamageName().hashCode());
        result = prime * result + ((getDamageNo() == null) ? 0 : getDamageNo().hashCode());
        result = prime * result + ((getFixedLossReceivTime() == null) ? 0 : getFixedLossReceivTime().hashCode());
        result = prime * result + ((getFixedLossSubmitTime() == null) ? 0 : getFixedLossSubmitTime().hashCode());
        result = prime * result + ((getReviewStatus() == null) ? 0 : getReviewStatus().hashCode());
        result = prime * result + ((getTaskStatus() == null) ? 0 : getTaskStatus().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getUpdtaeTime() == null) ? 0 : getUpdtaeTime().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        result = prime * result + ((getAccidentLiability() == null) ? 0 : getAccidentLiability().hashCode());
        result = prime * result + ((getCeAccidentType() == null) ? 0 : getCeAccidentType().hashCode());
        result = prime * result + ((getClaimProvince() == null) ? 0 : getClaimProvince().hashCode());
        result = prime * result + ((getClaimCity() == null) ? 0 : getClaimCity().hashCode());
        result = prime * result + ((getReviewerId() == null) ? 0 : getReviewerId().hashCode());
        result = prime * result + ((getTheInsuredName() == null) ? 0 : getTheInsuredName().hashCode());
        result = prime * result + ((getReportDate() == null) ? 0 : getReportDate().hashCode());
        result = prime * result + ((getClaimsAgency() == null) ? 0 : getClaimsAgency().hashCode());
        result = prime * result + ((getNotifyUrl() == null) ? 0 : getNotifyUrl().hashCode());
        result = prime * result + ((getReturnUrl() == null) ? 0 : getReturnUrl().hashCode());
        result = prime * result + ((getLossTime() == null) ? 0 : getLossTime().hashCode());
        result = prime * result + ((getLossLiability() == null) ? 0 : getLossLiability().hashCode());
        result = prime * result + ((getTaskTypeFirst() == null) ? 0 : getTaskTypeFirst().hashCode());
        result = prime * result + ((getTaskTypeSecond() == null) ? 0 : getTaskTypeSecond().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", claimNotificationNo=").append(claimNotificationNo);
        sb.append(", taskNo=").append(taskNo);
        sb.append(", registId=").append(registId);
        sb.append(", surveyId=").append(surveyId);
        sb.append(", compantCode=").append(compantCode);
        sb.append(", companyId=").append(companyId);
        sb.append(", companyAgencyCode=").append(companyAgencyCode);
        sb.append(", companyAgencyName=").append(companyAgencyName);
        sb.append(", companyAgencyId=").append(companyAgencyId);
        sb.append(", serialNum=").append(serialNum);
        sb.append(", mainDrivingStatus=").append(mainDrivingStatus);
        sb.append(", wouTransportat=").append(wouTransportat);
        sb.append(", remark=").append(remark);
        sb.append(", surveyFirstAddress=").append(surveyFirstAddress);
        sb.append(", visitTime=").append(visitTime);
        sb.append(", medicalExpensesFee=").append(medicalExpensesFee);
        sb.append(", incomeStatus=").append(incomeStatus);
        sb.append(", engagedIndustry=").append(engagedIndustry);
        sb.append(", monthlyIncome=").append(monthlyIncome);
        sb.append(", receiptName=").append(receiptName);
        sb.append(", receiptAccount=").append(receiptAccount);
        sb.append(", receiptBank=").append(receiptBank);
        sb.append(", lossFirstType=").append(lossFirstType);
        sb.append(", lossSecondType=").append(lossSecondType);
        sb.append(", averagePayAmount=").append(averagePayAmount);
        sb.append(", recommendAmount=").append(recommendAmount);
        sb.append(", fixedLossAmount=").append(fixedLossAmount);
        sb.append(", damageAmount=").append(damageAmount);
        sb.append(", humanInjury=").append(humanInjury);
        sb.append(", humanType=").append(humanType);
        sb.append(", sendDoctorType=").append(sendDoctorType);
        sb.append(", humanName=").append(humanName);
        sb.append(", idCardType=").append(idCardType);
        sb.append(", idCard=").append(idCard);
        sb.append(", humanSex=").append(humanSex);
        sb.append(", birthDate=").append(birthDate);
        sb.append(", humanAge=").append(humanAge);
        sb.append(", contacNumber=").append(contacNumber);
        sb.append(", resideNature=").append(resideNature);
        sb.append(", perResidenceProvince=").append(perResidenceProvince);
        sb.append(", perResidenceCity=").append(perResidenceCity);
        sb.append(", perResidenceDistrict=").append(perResidenceDistrict);
        sb.append(", perResidenceTown=").append(perResidenceTown);
        sb.append(", perResidenceAddress=").append(perResidenceAddress);
        sb.append(", hospitalName=").append(hospitalName);
        sb.append(", sendDoctorTime=").append(sendDoctorTime);
        sb.append(", hospitalDepartmentFirst=").append(hospitalDepartmentFirst);
        sb.append(", hospitalDepartmentSecond=").append(hospitalDepartmentSecond);
        sb.append(", hospitalDepartmentFirstName=").append(hospitalDepartmentFirstName);
        sb.append(", hospitalDepartmentSecondName=").append(hospitalDepartmentSecondName);
        sb.append(", damageSite=").append(damageSite);
        sb.append(", damageSiteSecond=").append(damageSiteSecond);
        sb.append(", damageType=").append(damageType);
        sb.append(", diagnosisInjury=").append(diagnosisInjury);
        sb.append(", damageDesc=").append(damageDesc);
        sb.append(", damageName=").append(damageName);
        sb.append(", damageNo=").append(damageNo);
        sb.append(", fixedLossReceivTime=").append(fixedLossReceivTime);
        sb.append(", fixedLossSubmitTime=").append(fixedLossSubmitTime);
        sb.append(", reviewStatus=").append(reviewStatus);
        sb.append(", taskStatus=").append(taskStatus);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updtaeTime=").append(updtaeTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", accidentLiability=").append(accidentLiability);
        sb.append(", ceAccidentType=").append(ceAccidentType);
        sb.append(", claimProvince=").append(claimProvince);
        sb.append(", claimCity=").append(claimCity);
        sb.append(", reviewerId=").append(reviewerId);
        sb.append(", theInsuredName=").append(theInsuredName);
        sb.append(", reportDate=").append(reportDate);
        sb.append(", claimsAgency=").append(claimsAgency);
        sb.append(", notifyUrl=").append(notifyUrl);
        sb.append(", returnUrl=").append(returnUrl);
        sb.append(", lossTime=").append(lossTime);
        sb.append(", lossLiability=").append(lossLiability);
        sb.append(", taskTypeFirst=").append(taskTypeFirst);
        sb.append(", taskTypeSecond=").append(taskTypeSecond);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

	public Long getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(Long timeOut) {
		this.timeOut = timeOut;
	}
}