package com.injured.server.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class CeRegistSurvey implements Serializable {
    /**
     * 序号
     */
    private Long id;

    /**
     * 报案ID
     */
    private Long registId;

    /**
     * 报案号
     */
    private String claimNotificationNo;

    /**
     * CE任务编码
     */
    private String ceTaskNo;

    /**
     * 查勘开始时间
     */
    private Date checkStartTime;

    /**
     * 查勘结束时间
     */
    private Date checkEndTime;

    /**
     * 查勘地点
     */
    private String checkAddr;

    /**
     * 约定查勘地点
     */
    private String appointCheckAddr;

    /**
     * 损失任务
     */
    private String lossTask;

    /**
     * 驾驶员姓名
     */
    private String driverName;

    /**
     * 是否约定驾驶员
     */
    private String isAppointDriver;

    /**
     * 查勘人1
     */
    private String checkerName;

    /**
     * 查勘人1编码
     */
    private String checkerCode;

    /**
     * 查勘人1电话
     */
    private String checkerPhone1;

    /**
     * 查勘人2
     */
    private String checkerName2;

    /**
     * 查勘人2编码
     */
    private String checkerCode2;

    /**
     * 查勘人2电话
     */
    private String checkerPhone2;

    /**
     * 联系人
     */
    private String contactPerson;

    /**
     * 联系人手机
     */
    private String contactPhone;

    /**
     * 联系人电话
     */
    private String contactTel;

    /**
     * 出险地点
     */
    private String dangerAddress;

    /**
     * 出险原因
     */
    private String dangerCause;

    /**
     * 出险经过
     */
    private String dangerDesc;

    /**
     * 案件类型
     */
    private String caseType;

    /**
     * 事故类型
     */
    private String eventType;

    /**
     * 事故处理方式
     */
    private String eventProcessMode;

    /**
     * 事故责任划分
     */
    private String eventAccidentLiability;

    /**
     * 事故责任比例
     */
    private BigDecimal eventDutyRatio;

    /**
     * 与被保险人关系
     */
    private String insuredRelation;

    /**
     * 无责代赔
     */
    private String noFaultCompensate;

    /**
     * 水淹等级
     */
    private String waterLevel;

    /**
     * 受害方与驾驶员关系
     */
    private String fallVictimDriver;

    /**
     * 受害方与被保险人关系
     */
    private String fallVictimInsured;

    /**
     * 是否要求代位
     */
    private String subrogationFlag;

    /**
     * 是否第一现场查勘
     */
    private Integer isFirstScene;

    /**
     * 是否包含人伤
     */
    private Boolean isPersonInjured;

    /**
     * 代赔类型
     */
    private String claimType;

    /**
     * 责任认定书类型
     */
    private String subCertiType;

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
     * 检测审核人名称
     */
    private String verifierName;

    /**
     * 检测审核人编码
     */
    private String verifierCode;

    /**
     * 加扣免赔原因
     */
    private String buckleDedReason;

    /**
     * 是否为互碰自赔
     */
    private String isMutualCollisionSelfCompensation;

    /**
     * 道路类型
     */
    private String eventAddressType;

    /**
     * 证件审核
     */
    private String driverReview;

    /**
     * 车辆信息是否与保单相符
     */
    private String isCarInsurance;

    /**
     * 车辆是否年检期内
     */
    private String isCarAnnual;

    /**
     * 装载情况
     */
    private String loadingCondition;

    /**
     * 查勘意见
     */
    private String checkDesc;

    /**
     * 查勘类型
     */
    private String checkType;

    /**
     * 保险公司反馈结果内容
     */
    private String feedbackResultContent;

    /**
     * 保险公司反馈结果 
     */
    private String feedbackResult;

    /**
     * 查勘审核人名称
     */
    private String auditName;

    /**
     * 查勘审核人编码
     */
    private String auditCode;

    /**
     * 查勘审核意见
     */
    private String auditOpinion;

    /**
     * 查勘审核时间
     */
    private Date auditTime;

    /**
     * 接收时间
     */
    private Date receiptTime;

    /**
     * 提交时间
     */
    private Date submitTime;

    /**
     * 派工时间
     */
    private Date dispatchTime;

    /**
     * 风控规则状态
     */
    private String riskStatus;

    /**
     * 查勘状态
     */
    private String surveyStatus;

    /**
     * 操作业务
     */
    private String operationBusiness;

    /**
     * 是否删除
     */
    private Boolean isDelete;

    /**
     * 扩展属性
     */
    private String ext;

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

    public String getCeTaskNo() {
        return ceTaskNo;
    }

    public void setCeTaskNo(String ceTaskNo) {
        this.ceTaskNo = ceTaskNo;
    }

    public Date getCheckStartTime() {
        return checkStartTime;
    }

    public void setCheckStartTime(Date checkStartTime) {
        this.checkStartTime = checkStartTime;
    }

    public Date getCheckEndTime() {
        return checkEndTime;
    }

    public void setCheckEndTime(Date checkEndTime) {
        this.checkEndTime = checkEndTime;
    }

    public String getCheckAddr() {
        return checkAddr;
    }

    public void setCheckAddr(String checkAddr) {
        this.checkAddr = checkAddr;
    }

    public String getAppointCheckAddr() {
        return appointCheckAddr;
    }

    public void setAppointCheckAddr(String appointCheckAddr) {
        this.appointCheckAddr = appointCheckAddr;
    }

    public String getLossTask() {
        return lossTask;
    }

    public void setLossTask(String lossTask) {
        this.lossTask = lossTask;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getIsAppointDriver() {
        return isAppointDriver;
    }

    public void setIsAppointDriver(String isAppointDriver) {
        this.isAppointDriver = isAppointDriver;
    }

    public String getCheckerName() {
        return checkerName;
    }

    public void setCheckerName(String checkerName) {
        this.checkerName = checkerName;
    }

    public String getCheckerCode() {
        return checkerCode;
    }

    public void setCheckerCode(String checkerCode) {
        this.checkerCode = checkerCode;
    }

    public String getCheckerPhone1() {
        return checkerPhone1;
    }

    public void setCheckerPhone1(String checkerPhone1) {
        this.checkerPhone1 = checkerPhone1;
    }

    public String getCheckerName2() {
        return checkerName2;
    }

    public void setCheckerName2(String checkerName2) {
        this.checkerName2 = checkerName2;
    }

    public String getCheckerCode2() {
        return checkerCode2;
    }

    public void setCheckerCode2(String checkerCode2) {
        this.checkerCode2 = checkerCode2;
    }

    public String getCheckerPhone2() {
        return checkerPhone2;
    }

    public void setCheckerPhone2(String checkerPhone2) {
        this.checkerPhone2 = checkerPhone2;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
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

    public String getDangerAddress() {
        return dangerAddress;
    }

    public void setDangerAddress(String dangerAddress) {
        this.dangerAddress = dangerAddress;
    }

    public String getDangerCause() {
        return dangerCause;
    }

    public void setDangerCause(String dangerCause) {
        this.dangerCause = dangerCause;
    }

    public String getDangerDesc() {
        return dangerDesc;
    }

    public void setDangerDesc(String dangerDesc) {
        this.dangerDesc = dangerDesc;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventProcessMode() {
        return eventProcessMode;
    }

    public void setEventProcessMode(String eventProcessMode) {
        this.eventProcessMode = eventProcessMode;
    }

    public String getEventAccidentLiability() {
        return eventAccidentLiability;
    }

    public void setEventAccidentLiability(String eventAccidentLiability) {
        this.eventAccidentLiability = eventAccidentLiability;
    }

    public BigDecimal getEventDutyRatio() {
        return eventDutyRatio;
    }

    public void setEventDutyRatio(BigDecimal eventDutyRatio) {
        this.eventDutyRatio = eventDutyRatio;
    }

    public String getInsuredRelation() {
        return insuredRelation;
    }

    public void setInsuredRelation(String insuredRelation) {
        this.insuredRelation = insuredRelation;
    }

    public String getNoFaultCompensate() {
        return noFaultCompensate;
    }

    public void setNoFaultCompensate(String noFaultCompensate) {
        this.noFaultCompensate = noFaultCompensate;
    }

    public String getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(String waterLevel) {
        this.waterLevel = waterLevel;
    }

    public String getFallVictimDriver() {
        return fallVictimDriver;
    }

    public void setFallVictimDriver(String fallVictimDriver) {
        this.fallVictimDriver = fallVictimDriver;
    }

    public String getFallVictimInsured() {
        return fallVictimInsured;
    }

    public void setFallVictimInsured(String fallVictimInsured) {
        this.fallVictimInsured = fallVictimInsured;
    }

    public String getSubrogationFlag() {
        return subrogationFlag;
    }

    public void setSubrogationFlag(String subrogationFlag) {
        this.subrogationFlag = subrogationFlag;
    }

    public Integer getIsFirstScene() {
        return isFirstScene;
    }

    public void setIsFirstScene(Integer isFirstScene) {
        this.isFirstScene = isFirstScene;
    }

    public Boolean getIsPersonInjured() {
        return isPersonInjured;
    }

    public void setIsPersonInjured(Boolean isPersonInjured) {
        this.isPersonInjured = isPersonInjured;
    }

    public String getClaimType() {
        return claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }

    public String getSubCertiType() {
        return subCertiType;
    }

    public void setSubCertiType(String subCertiType) {
        this.subCertiType = subCertiType;
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

    public String getVerifierName() {
        return verifierName;
    }

    public void setVerifierName(String verifierName) {
        this.verifierName = verifierName;
    }

    public String getVerifierCode() {
        return verifierCode;
    }

    public void setVerifierCode(String verifierCode) {
        this.verifierCode = verifierCode;
    }

    public String getBuckleDedReason() {
        return buckleDedReason;
    }

    public void setBuckleDedReason(String buckleDedReason) {
        this.buckleDedReason = buckleDedReason;
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

    public String getDriverReview() {
        return driverReview;
    }

    public void setDriverReview(String driverReview) {
        this.driverReview = driverReview;
    }

    public String getIsCarInsurance() {
        return isCarInsurance;
    }

    public void setIsCarInsurance(String isCarInsurance) {
        this.isCarInsurance = isCarInsurance;
    }

    public String getIsCarAnnual() {
        return isCarAnnual;
    }

    public void setIsCarAnnual(String isCarAnnual) {
        this.isCarAnnual = isCarAnnual;
    }

    public String getLoadingCondition() {
        return loadingCondition;
    }

    public void setLoadingCondition(String loadingCondition) {
        this.loadingCondition = loadingCondition;
    }

    public String getCheckDesc() {
        return checkDesc;
    }

    public void setCheckDesc(String checkDesc) {
        this.checkDesc = checkDesc;
    }

    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public String getFeedbackResultContent() {
        return feedbackResultContent;
    }

    public void setFeedbackResultContent(String feedbackResultContent) {
        this.feedbackResultContent = feedbackResultContent;
    }

    public String getFeedbackResult() {
        return feedbackResult;
    }

    public void setFeedbackResult(String feedbackResult) {
        this.feedbackResult = feedbackResult;
    }

    public String getAuditName() {
        return auditName;
    }

    public void setAuditName(String auditName) {
        this.auditName = auditName;
    }

    public String getAuditCode() {
        return auditCode;
    }

    public void setAuditCode(String auditCode) {
        this.auditCode = auditCode;
    }

    public String getAuditOpinion() {
        return auditOpinion;
    }

    public void setAuditOpinion(String auditOpinion) {
        this.auditOpinion = auditOpinion;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public Date getReceiptTime() {
        return receiptTime;
    }

    public void setReceiptTime(Date receiptTime) {
        this.receiptTime = receiptTime;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public Date getDispatchTime() {
        return dispatchTime;
    }

    public void setDispatchTime(Date dispatchTime) {
        this.dispatchTime = dispatchTime;
    }

    public String getRiskStatus() {
        return riskStatus;
    }

    public void setRiskStatus(String riskStatus) {
        this.riskStatus = riskStatus;
    }

    public String getSurveyStatus() {
        return surveyStatus;
    }

    public void setSurveyStatus(String surveyStatus) {
        this.surveyStatus = surveyStatus;
    }

    public String getOperationBusiness() {
        return operationBusiness;
    }

    public void setOperationBusiness(String operationBusiness) {
        this.operationBusiness = operationBusiness;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
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