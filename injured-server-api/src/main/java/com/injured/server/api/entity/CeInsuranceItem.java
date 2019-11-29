package com.injured.server.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class CeInsuranceItem implements Serializable {
    /**
     * 序号
     */
    private Long id;

    /**
     * 报案表ID
     */
    private Long registId;

    /**
     * 保单ID
     */
    private Long insuranceId;

    /**
     * 险别代码
     */
    private String code;

    /**
     * 险别名称
     */
    private String name;

    /**
     * 保额/限额
     */
    private BigDecimal insuranceAmout;

    /**
     * 单位数量
     */
    private Integer unitCount;

    /**
     * 单位保额
     */
    private BigDecimal unitAmount;

    /**
     * 承保不计免赔
     */
    private String nonDeductible;

    /**
     * 免赔率
     */
    private BigDecimal deductibleRate;

    /**
     * 免赔额
     */
    private BigDecimal deductibleMoney;

    /**
     * 标准保费
     */
    private BigDecimal insuranceFee;

    /**
     * 保费
     */
    private BigDecimal premiums;

    /**
     * 备注
     */
    private String remark;

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

    public Long getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(Long insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getInsuranceAmout() {
        return insuranceAmout;
    }

    public void setInsuranceAmout(BigDecimal insuranceAmout) {
        this.insuranceAmout = insuranceAmout;
    }

    public Integer getUnitCount() {
        return unitCount;
    }

    public void setUnitCount(Integer unitCount) {
        this.unitCount = unitCount;
    }

    public BigDecimal getUnitAmount() {
        return unitAmount;
    }

    public void setUnitAmount(BigDecimal unitAmount) {
        this.unitAmount = unitAmount;
    }

    public String getNonDeductible() {
        return nonDeductible;
    }

    public void setNonDeductible(String nonDeductible) {
        this.nonDeductible = nonDeductible;
    }

    public BigDecimal getDeductibleRate() {
        return deductibleRate;
    }

    public void setDeductibleRate(BigDecimal deductibleRate) {
        this.deductibleRate = deductibleRate;
    }

    public BigDecimal getDeductibleMoney() {
        return deductibleMoney;
    }

    public void setDeductibleMoney(BigDecimal deductibleMoney) {
        this.deductibleMoney = deductibleMoney;
    }

    public BigDecimal getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(BigDecimal insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    public BigDecimal getPremiums() {
        return premiums;
    }

    public void setPremiums(BigDecimal premiums) {
        this.premiums = premiums;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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