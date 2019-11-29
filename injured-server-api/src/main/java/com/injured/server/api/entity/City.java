package com.injured.server.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class City implements Serializable {
    private String id;

    /**
     * 城市名称
     */
    private String cname;

    /**
     * 父ID
     */
    private String pid;

    /**
     * 无收入误工标准
     */
    private BigDecimal noIncomeFee;

    /**
     * 无固定收入误工标准
     */
    private BigDecimal noFixedIncomeFee;

    /**
     * 固定收入误工标准
     */
    private BigDecimal fixedIncomeFee;

    /**
     * 护理费用标准
     */
    private BigDecimal nursingFee;

    /**
     * 营养费标准
     */
    private BigDecimal nutritionFee;

    /**
     * 交通费标准
     */
    private BigDecimal trafficFee;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public BigDecimal getNoIncomeFee() {
        return noIncomeFee;
    }

    public void setNoIncomeFee(BigDecimal noIncomeFee) {
        this.noIncomeFee = noIncomeFee;
    }

    public BigDecimal getNoFixedIncomeFee() {
        return noFixedIncomeFee;
    }

    public void setNoFixedIncomeFee(BigDecimal noFixedIncomeFee) {
        this.noFixedIncomeFee = noFixedIncomeFee;
    }

    public BigDecimal getFixedIncomeFee() {
        return fixedIncomeFee;
    }

    public void setFixedIncomeFee(BigDecimal fixedIncomeFee) {
        this.fixedIncomeFee = fixedIncomeFee;
    }

    public BigDecimal getNursingFee() {
        return nursingFee;
    }

    public void setNursingFee(BigDecimal nursingFee) {
        this.nursingFee = nursingFee;
    }

    public BigDecimal getNutritionFee() {
        return nutritionFee;
    }

    public void setNutritionFee(BigDecimal nutritionFee) {
        this.nutritionFee = nutritionFee;
    }

    public BigDecimal getTrafficFee() {
        return trafficFee;
    }

    public void setTrafficFee(BigDecimal trafficFee) {
        this.trafficFee = trafficFee;
    }
}