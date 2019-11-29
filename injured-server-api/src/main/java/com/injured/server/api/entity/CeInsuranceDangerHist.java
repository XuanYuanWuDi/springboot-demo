package com.injured.server.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class CeInsuranceDangerHist implements Serializable {
    /**
     * 序号
     */
    private Long id;

    /**
     * 报案ID
     */
    private Long registId;

    /**
     * 保单ID
     */
    private Long insuranceId;

    /**
     * 承保公司ID
     */
    private Integer companyId;

    /**
     * 承保公司编码
     */
    private String companyCode;

    /**
     * 保单号
     */
    private String policyNo;

    /**
     * 案件状态
     */
    private String status;

    /**
     * 险种
     */
    private String insuranceCategory;

    /**
     * 赔付次数
     */
    private Integer paidTimes;

    /**
     * 赔案号
     */
    private String payClaimNumber;

    /**
     * 结案时间
     */
    private Date claimEndDate;

    /**
     * 结案类型
     */
    private Byte claimResult;

    /**
     * 驾驶员
     */
    private String driverName;

    /**
     * 估损金额
     */
    private BigDecimal estimateAmount;

    /**
     * 出险时间
     */
    private Date claimDate;

    /**
     * 出险地点
     */
    private String eventAddress;

    /**
     * 车牌号
     */
    private String licensePlateNo;

    /**
     * 报案时间
     */
    private Date reportDate;

    /**
     * 报案人联系电话
     */
    private String reporterTel;

    /**
     * 报案人
     */
    private String reporter;

    /**
     * 报案号
     */
    private String claimNotificationNo;

    /**
     * 保单结案金额
     */
    private BigDecimal paidAmount;

    /**
     * 出险经过
     */
    private String dangerDesc;

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

    public Long getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(Long insuranceId) {
        this.insuranceId = insuranceId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInsuranceCategory() {
        return insuranceCategory;
    }

    public void setInsuranceCategory(String insuranceCategory) {
        this.insuranceCategory = insuranceCategory;
    }

    public Integer getPaidTimes() {
        return paidTimes;
    }

    public void setPaidTimes(Integer paidTimes) {
        this.paidTimes = paidTimes;
    }

    public String getPayClaimNumber() {
        return payClaimNumber;
    }

    public void setPayClaimNumber(String payClaimNumber) {
        this.payClaimNumber = payClaimNumber;
    }

    public Date getClaimEndDate() {
        return claimEndDate;
    }

    public void setClaimEndDate(Date claimEndDate) {
        this.claimEndDate = claimEndDate;
    }

    public Byte getClaimResult() {
        return claimResult;
    }

    public void setClaimResult(Byte claimResult) {
        this.claimResult = claimResult;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public BigDecimal getEstimateAmount() {
        return estimateAmount;
    }

    public void setEstimateAmount(BigDecimal estimateAmount) {
        this.estimateAmount = estimateAmount;
    }

    public Date getClaimDate() {
        return claimDate;
    }

    public void setClaimDate(Date claimDate) {
        this.claimDate = claimDate;
    }

    public String getEventAddress() {
        return eventAddress;
    }

    public void setEventAddress(String eventAddress) {
        this.eventAddress = eventAddress;
    }

    public String getLicensePlateNo() {
        return licensePlateNo;
    }

    public void setLicensePlateNo(String licensePlateNo) {
        this.licensePlateNo = licensePlateNo;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public String getReporterTel() {
        return reporterTel;
    }

    public void setReporterTel(String reporterTel) {
        this.reporterTel = reporterTel;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getClaimNotificationNo() {
        return claimNotificationNo;
    }

    public void setClaimNotificationNo(String claimNotificationNo) {
        this.claimNotificationNo = claimNotificationNo;
    }

    public BigDecimal getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(BigDecimal paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getDangerDesc() {
        return dangerDesc;
    }

    public void setDangerDesc(String dangerDesc) {
        this.dangerDesc = dangerDesc;
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