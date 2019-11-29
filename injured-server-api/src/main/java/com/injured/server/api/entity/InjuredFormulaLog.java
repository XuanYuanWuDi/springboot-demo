package com.injured.server.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class InjuredFormulaLog implements Serializable {
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
     * 保险公司id
     */
    private Long companyId;

    /**
     * 任务ID
     */
    private Long fastInfoId;

    /**
     * 定损员姓名
     */
    private String damageName;

    /**
     * 定损员工号
     */
    private String damageNo;

    /**
     * 医疗费用
     */
    private BigDecimal medicalFee;

    /**
     * 续医费
     */
    private BigDecimal renewalFee;

    /**
     * 营养费
     */
    private BigDecimal nutritionFee;

    /**
     * 误工费
     */
    private BigDecimal incomeFee;

    /**
     * 护理费
     */
    private BigDecimal nursingFee;

    /**
     * 交通费
     */
    private BigDecimal trafficFee;

    /**
     * 总费用
     */
    private BigDecimal sumFee;

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

    public String getClaimNotificationNo() {
        return claimNotificationNo;
    }

    public void setClaimNotificationNo(String claimNotificationNo) {
        this.claimNotificationNo = claimNotificationNo;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getFastInfoId() {
        return fastInfoId;
    }

    public void setFastInfoId(Long fastInfoId) {
        this.fastInfoId = fastInfoId;
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

    public BigDecimal getMedicalFee() {
        return medicalFee;
    }

    public void setMedicalFee(BigDecimal medicalFee) {
        this.medicalFee = medicalFee;
    }

    public BigDecimal getRenewalFee() {
        return renewalFee;
    }

    public void setRenewalFee(BigDecimal renewalFee) {
        this.renewalFee = renewalFee;
    }

    public BigDecimal getNutritionFee() {
        return nutritionFee;
    }

    public void setNutritionFee(BigDecimal nutritionFee) {
        this.nutritionFee = nutritionFee;
    }

    public BigDecimal getIncomeFee() {
        return incomeFee;
    }

    public void setIncomeFee(BigDecimal incomeFee) {
        this.incomeFee = incomeFee;
    }

    public BigDecimal getNursingFee() {
        return nursingFee;
    }

    public void setNursingFee(BigDecimal nursingFee) {
        this.nursingFee = nursingFee;
    }

    public BigDecimal getTrafficFee() {
        return trafficFee;
    }

    public void setTrafficFee(BigDecimal trafficFee) {
        this.trafficFee = trafficFee;
    }

    public BigDecimal getSumFee() {
        return sumFee;
    }

    public void setSumFee(BigDecimal sumFee) {
        this.sumFee = sumFee;
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