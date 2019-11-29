package com.injured.server.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class CeRegistSurveyLoss implements Serializable {
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
     * 损失项目名称
     */
    private String lossName;

    /**
     * 新旧度
     */
    private String newOldDegree;

    /**
     * 范围/数量
     */
    private String lossScope;

    /**
     * 损失描述
     */
    private String lossDesc;

    /**
     * 是否需施救
     */
    private String isRescue;

    /**
     * 联系人
     */
    private String contactPerson;

    /**
     * 联系电话
     */
    private String contactTel;

    /**
     * 预估损失总金额
     */
    private BigDecimal estimatedLossAmount;

    /**
     * 备注
     */
    private String remark;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 创建日期
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

    public String getLossName() {
        return lossName;
    }

    public void setLossName(String lossName) {
        this.lossName = lossName;
    }

    public String getNewOldDegree() {
        return newOldDegree;
    }

    public void setNewOldDegree(String newOldDegree) {
        this.newOldDegree = newOldDegree;
    }

    public String getLossScope() {
        return lossScope;
    }

    public void setLossScope(String lossScope) {
        this.lossScope = lossScope;
    }

    public String getLossDesc() {
        return lossDesc;
    }

    public void setLossDesc(String lossDesc) {
        this.lossDesc = lossDesc;
    }

    public String getIsRescue() {
        return isRescue;
    }

    public void setIsRescue(String isRescue) {
        this.isRescue = isRescue;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public BigDecimal getEstimatedLossAmount() {
        return estimatedLossAmount;
    }

    public void setEstimatedLossAmount(BigDecimal estimatedLossAmount) {
        this.estimatedLossAmount = estimatedLossAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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