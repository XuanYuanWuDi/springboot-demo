package com.injured.server.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class CeRegist implements Serializable {
    /**
     * 序号
     */
    private Long id;

    /**
     * 公司编码
     */
    private String companyCode;

    /**
     * 公司ID
     */
    private Integer companyId;

    /**
     * 报案号
     */
    private String claimNotificationNo;

    /**
     * 案件状态
     */
    private String caseStatus;

    /**
     * 报案注销原因
     */
    private String cancelReason;

    /**
     * 报案注销日期
     */
    private Date cancelDate;

    /**
     * 天气
     */
    private String weather;

    /**
     * 受伤人数
     */
    private Integer hurtNum;

    /**
     * 受理标志
     */
    private String acceptInd;

    /**
     * 是否有物损
     */
    private String isPersonInjured;

    /**
     * 是否有人伤
     */
    private String isProtectLoss;

    /**
     * 是否异地
     */
    private String isOutofLocalClaim;

    /**
     * 是否要求代位
     */
    private String subrogationFlag;

    /**
     * 是否结案
     */
    private String isClosed;

    /**
     * 是否简易案件
     */
    private String isSimpleClaim;

    /**
     * 是否第一现场
     */
    private String firstSceneInd;

    /**
     * 事故责任
     */
    private String accidentLiability;

    /**
     * 事故原因
     */
    private String eventReasonType;

    /**
     * 事故处理方式
     */
    private String eventProcessMode;

    /**
     * 联系人手机
     */
    private String contactPhone;

    /**
     * 联系人电话
     */
    private String contactTel;

    /**
     * 联系人
     */
    private String contactPerson;

    /**
     * 客户等级
     */
    private String customerLevel;

    /**
     * 是否已报交警
     */
    private String isPolice;

    /**
     * 驾驶员姓名
     */
    private String driverName;

    /**
     * 驾驶员性别
     */
    private String driverGender;

    /**
     * 互碰自赔
     */
    private String isMutualCollisionSelfCompensation;

    /**
     * 道路类型
     */
    private String eventAddressType;

    /**
     * 出险原因
     */
    private String dangerCause;

    /**
     * 出险所在地
     */
    private String dangerAddress;

    /**
     * 出险时间
     */
    private Date dangerTime;

    /**
     * 出险区域
     */
    private String dangerArea;

    /**
     * 出险经过
     */
    private String dangerDesc;

    /**
     * 出险地点分类
     */
    private String dangerAddressType;

    /**
     * 备注
     */
    private String remark;

    /**
     * 报案形式
     */
    private String reportType;

    /**
     * 报案日期
     */
    private Date notificationTime;

    /**
     * 报案人姓名
     */
    private String reporter;

    /**
     * 报案人手机
     */
    private String informantMobilTel;

    /**
     * 报案人是否驾驶员
     */
    private String informantIsDriver;

    /**
     * 报案人是否被保险人
     */
    private String informantIsNsured;

    /**
     * 报案人身份号码
     */
    private String informantIdentity;

    /**
     * 报案人电话
     */
    private String reporterPhone;

    /**
     * 报案所在省
     */
    private String reportProvince;

    /**
     * 报案所在市
     */
    private String reportCity;

    /**
     * 报案所在区/县
     */
    private String reportDistrict;

    /**
     * 报案详细地址
     */
    private String reportAddress;

    /**
     * 案件状态
     */
    private String status;

    /**
     * 代赔类型
     */
    private String lindicator;

    /**
     * 巨灾名称
     */
    private String catastropheName;

    /**
     * 巨灾类型
     */
    private String catastropheType;

    /**
     * 巨灾代码
     */
    private String catastropheCode;

    /**
     * 标的车是否可正常行驶
     */
    private String isSubjectNormal;

    /**
     * 是否进行相关施救
     */
    private String isRescue;

    /**
     * 是否自助查勘
     */
    private String isSelfSurvey;

    /**
     * 是否垫付
     */
    private String isPayment;

    /**
     * 驾驶员是否在现场
     */
    private String isDriverLocale;

    /**
     * 是否即时生效期出险
     */
    private String isTakeEffect;

    /**
     * 是否主挂车补报案
     */
    private String isMainReport;

    /**
     * 客户是否要求第一现场查勘
     */
    private String isLocaleSurvey;

    /**
     * 代勘标识
     */
    private String replaceSurveyMark;

    /**
     * 是否补报案
     */
    private String isEditReport;

    /**
     * 是否提供被保险人电话
     */
    private String isInsuredPhone;

    /**
     * 任务流程环节
     */
    private String taskWorkflow;

    /**
     * 接收时间
     */
    private Date receiveTime;

    /**
     * 标识
     */
    private Integer isFlag;

    /**
     * 报案来源
     */
    private String registSource;

    /**
     * 案件类型
     */
    private String caseType;

    private String groupId;

    /**
     * 扩展属性
     */
    private String ext;

    /**
     * 是否删除
     */
    private Boolean isDelete;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getClaimNotificationNo() {
        return claimNotificationNo;
    }

    public void setClaimNotificationNo(String claimNotificationNo) {
        this.claimNotificationNo = claimNotificationNo;
    }

    public String getCaseStatus() {
        return caseStatus;
    }

    public void setCaseStatus(String caseStatus) {
        this.caseStatus = caseStatus;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public Integer getHurtNum() {
        return hurtNum;
    }

    public void setHurtNum(Integer hurtNum) {
        this.hurtNum = hurtNum;
    }

    public String getAcceptInd() {
        return acceptInd;
    }

    public void setAcceptInd(String acceptInd) {
        this.acceptInd = acceptInd;
    }

    public String getIsPersonInjured() {
        return isPersonInjured;
    }

    public void setIsPersonInjured(String isPersonInjured) {
        this.isPersonInjured = isPersonInjured;
    }

    public String getIsProtectLoss() {
        return isProtectLoss;
    }

    public void setIsProtectLoss(String isProtectLoss) {
        this.isProtectLoss = isProtectLoss;
    }

    public String getIsOutofLocalClaim() {
        return isOutofLocalClaim;
    }

    public void setIsOutofLocalClaim(String isOutofLocalClaim) {
        this.isOutofLocalClaim = isOutofLocalClaim;
    }

    public String getSubrogationFlag() {
        return subrogationFlag;
    }

    public void setSubrogationFlag(String subrogationFlag) {
        this.subrogationFlag = subrogationFlag;
    }

    public String getIsClosed() {
        return isClosed;
    }

    public void setIsClosed(String isClosed) {
        this.isClosed = isClosed;
    }

    public String getIsSimpleClaim() {
        return isSimpleClaim;
    }

    public void setIsSimpleClaim(String isSimpleClaim) {
        this.isSimpleClaim = isSimpleClaim;
    }

    public String getFirstSceneInd() {
        return firstSceneInd;
    }

    public void setFirstSceneInd(String firstSceneInd) {
        this.firstSceneInd = firstSceneInd;
    }

    public String getAccidentLiability() {
        return accidentLiability;
    }

    public void setAccidentLiability(String accidentLiability) {
        this.accidentLiability = accidentLiability;
    }

    public String getEventReasonType() {
        return eventReasonType;
    }

    public void setEventReasonType(String eventReasonType) {
        this.eventReasonType = eventReasonType;
    }

    public String getEventProcessMode() {
        return eventProcessMode;
    }

    public void setEventProcessMode(String eventProcessMode) {
        this.eventProcessMode = eventProcessMode;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }

    public String getIsPolice() {
        return isPolice;
    }

    public void setIsPolice(String isPolice) {
        this.isPolice = isPolice;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverGender() {
        return driverGender;
    }

    public void setDriverGender(String driverGender) {
        this.driverGender = driverGender;
    }

    public String getIsMutualCollisionSelfCompensation() {
        return isMutualCollisionSelfCompensation;
    }

    public void setIsMutualCollisionSelfCompensation(String isMutualCollisionSelfCompensation) {
        this.isMutualCollisionSelfCompensation = isMutualCollisionSelfCompensation;
    }

    public String getEventAddressType() {
        return eventAddressType;
    }

    public void setEventAddressType(String eventAddressType) {
        this.eventAddressType = eventAddressType;
    }

    public String getDangerCause() {
        return dangerCause;
    }

    public void setDangerCause(String dangerCause) {
        this.dangerCause = dangerCause;
    }

    public String getDangerAddress() {
        return dangerAddress;
    }

    public void setDangerAddress(String dangerAddress) {
        this.dangerAddress = dangerAddress;
    }

    public Date getDangerTime() {
        return dangerTime;
    }

    public void setDangerTime(Date dangerTime) {
        this.dangerTime = dangerTime;
    }

    public String getDangerArea() {
        return dangerArea;
    }

    public void setDangerArea(String dangerArea) {
        this.dangerArea = dangerArea;
    }

    public String getDangerDesc() {
        return dangerDesc;
    }

    public void setDangerDesc(String dangerDesc) {
        this.dangerDesc = dangerDesc;
    }

    public String getDangerAddressType() {
        return dangerAddressType;
    }

    public void setDangerAddressType(String dangerAddressType) {
        this.dangerAddressType = dangerAddressType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public Date getNotificationTime() {
        return notificationTime;
    }

    public void setNotificationTime(Date notificationTime) {
        this.notificationTime = notificationTime;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getInformantMobilTel() {
        return informantMobilTel;
    }

    public void setInformantMobilTel(String informantMobilTel) {
        this.informantMobilTel = informantMobilTel;
    }

    public String getInformantIsDriver() {
        return informantIsDriver;
    }

    public void setInformantIsDriver(String informantIsDriver) {
        this.informantIsDriver = informantIsDriver;
    }

    public String getInformantIsNsured() {
        return informantIsNsured;
    }

    public void setInformantIsNsured(String informantIsNsured) {
        this.informantIsNsured = informantIsNsured;
    }

    public String getInformantIdentity() {
        return informantIdentity;
    }

    public void setInformantIdentity(String informantIdentity) {
        this.informantIdentity = informantIdentity;
    }

    public String getReporterPhone() {
        return reporterPhone;
    }

    public void setReporterPhone(String reporterPhone) {
        this.reporterPhone = reporterPhone;
    }

    public String getReportProvince() {
        return reportProvince;
    }

    public void setReportProvince(String reportProvince) {
        this.reportProvince = reportProvince;
    }

    public String getReportCity() {
        return reportCity;
    }

    public void setReportCity(String reportCity) {
        this.reportCity = reportCity;
    }

    public String getReportDistrict() {
        return reportDistrict;
    }

    public void setReportDistrict(String reportDistrict) {
        this.reportDistrict = reportDistrict;
    }

    public String getReportAddress() {
        return reportAddress;
    }

    public void setReportAddress(String reportAddress) {
        this.reportAddress = reportAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLindicator() {
        return lindicator;
    }

    public void setLindicator(String lindicator) {
        this.lindicator = lindicator;
    }

    public String getCatastropheName() {
        return catastropheName;
    }

    public void setCatastropheName(String catastropheName) {
        this.catastropheName = catastropheName;
    }

    public String getCatastropheType() {
        return catastropheType;
    }

    public void setCatastropheType(String catastropheType) {
        this.catastropheType = catastropheType;
    }

    public String getCatastropheCode() {
        return catastropheCode;
    }

    public void setCatastropheCode(String catastropheCode) {
        this.catastropheCode = catastropheCode;
    }

    public String getIsSubjectNormal() {
        return isSubjectNormal;
    }

    public void setIsSubjectNormal(String isSubjectNormal) {
        this.isSubjectNormal = isSubjectNormal;
    }

    public String getIsRescue() {
        return isRescue;
    }

    public void setIsRescue(String isRescue) {
        this.isRescue = isRescue;
    }

    public String getIsSelfSurvey() {
        return isSelfSurvey;
    }

    public void setIsSelfSurvey(String isSelfSurvey) {
        this.isSelfSurvey = isSelfSurvey;
    }

    public String getIsPayment() {
        return isPayment;
    }

    public void setIsPayment(String isPayment) {
        this.isPayment = isPayment;
    }

    public String getIsDriverLocale() {
        return isDriverLocale;
    }

    public void setIsDriverLocale(String isDriverLocale) {
        this.isDriverLocale = isDriverLocale;
    }

    public String getIsTakeEffect() {
        return isTakeEffect;
    }

    public void setIsTakeEffect(String isTakeEffect) {
        this.isTakeEffect = isTakeEffect;
    }

    public String getIsMainReport() {
        return isMainReport;
    }

    public void setIsMainReport(String isMainReport) {
        this.isMainReport = isMainReport;
    }

    public String getIsLocaleSurvey() {
        return isLocaleSurvey;
    }

    public void setIsLocaleSurvey(String isLocaleSurvey) {
        this.isLocaleSurvey = isLocaleSurvey;
    }

    public String getReplaceSurveyMark() {
        return replaceSurveyMark;
    }

    public void setReplaceSurveyMark(String replaceSurveyMark) {
        this.replaceSurveyMark = replaceSurveyMark;
    }

    public String getIsEditReport() {
        return isEditReport;
    }

    public void setIsEditReport(String isEditReport) {
        this.isEditReport = isEditReport;
    }

    public String getIsInsuredPhone() {
        return isInsuredPhone;
    }

    public void setIsInsuredPhone(String isInsuredPhone) {
        this.isInsuredPhone = isInsuredPhone;
    }

    public String getTaskWorkflow() {
        return taskWorkflow;
    }

    public void setTaskWorkflow(String taskWorkflow) {
        this.taskWorkflow = taskWorkflow;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public Integer getIsFlag() {
        return isFlag;
    }

    public void setIsFlag(Integer isFlag) {
        this.isFlag = isFlag;
    }

    public String getRegistSource() {
        return registSource;
    }

    public void setRegistSource(String registSource) {
        this.registSource = registSource;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}