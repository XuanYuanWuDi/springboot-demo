package com.injured.server.api.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class CeInsuranceSpecial implements Serializable {
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
     * 内容序号
     */
    private String order;

    /**
     * 约定详情
     */
    private String content;

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

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}