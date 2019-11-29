package com.injured.server.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class InjuredDamagesite implements Serializable {
    private Long id;

    private String dictCode;

    private String dictName;

    /**
     * 未治疗医疗费
     */
    private BigDecimal untreatedMedical;

    /**
     * 未治疗续医费
     */
    private BigDecimal untreatedRenewalFee;

    /**
     * 续医费
     */
    private BigDecimal renewalFee;

    /**
     * 交通费天数
     */
    private BigDecimal trafficDays;

    /**
     * 误工费天数
     */
    private BigDecimal incomeDays;

    /**
     * 护理期天数
     */
    private BigDecimal nursingDays;

    /**
     * 营养期天数
     */
    private BigDecimal nutritionDays;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public BigDecimal getUntreatedMedical() {
        return untreatedMedical;
    }

    public void setUntreatedMedical(BigDecimal untreatedMedical) {
        this.untreatedMedical = untreatedMedical;
    }

    public BigDecimal getUntreatedRenewalFee() {
        return untreatedRenewalFee;
    }

    public void setUntreatedRenewalFee(BigDecimal untreatedRenewalFee) {
        this.untreatedRenewalFee = untreatedRenewalFee;
    }

    public BigDecimal getRenewalFee() {
        return renewalFee;
    }

    public void setRenewalFee(BigDecimal renewalFee) {
        this.renewalFee = renewalFee;
    }

    public BigDecimal getTrafficDays() {
        return trafficDays;
    }

    public void setTrafficDays(BigDecimal trafficDays) {
        this.trafficDays = trafficDays;
    }

    public BigDecimal getIncomeDays() {
        return incomeDays;
    }

    public void setIncomeDays(BigDecimal incomeDays) {
        this.incomeDays = incomeDays;
    }

    public BigDecimal getNursingDays() {
        return nursingDays;
    }

    public void setNursingDays(BigDecimal nursingDays) {
        this.nursingDays = nursingDays;
    }

    public BigDecimal getNutritionDays() {
        return nutritionDays;
    }

    public void setNutritionDays(BigDecimal nutritionDays) {
        this.nutritionDays = nutritionDays;
    }


}