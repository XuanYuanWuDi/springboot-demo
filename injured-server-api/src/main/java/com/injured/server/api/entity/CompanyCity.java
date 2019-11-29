package com.injured.server.api.entity;

import java.io.Serializable;

/**
 * @author 
 */
public class CompanyCity implements Serializable {
    private String id;

    private String cname;

    private String ceCityId;

    private Long companyId;

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

    public String getCeCityId() {
        return ceCityId;
    }

    public void setCeCityId(String ceCityId) {
        this.ceCityId = ceCityId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
}