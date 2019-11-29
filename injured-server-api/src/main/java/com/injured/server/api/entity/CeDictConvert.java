package com.injured.server.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class CeDictConvert implements Serializable {
    private Integer id;

    /**
     * 保险公司ID
     */
    private Integer companyId;

    /**
     * 保险公司编码
     */
    private String companyCode;

    /**
     * 保险公司字典主编码
     */
    private String insuranceTypeCode;

    /**
     * 保险公司字典主名称
     */
    private String insuranceTypeName;

    /**
     * 保险公司字典编码
     */
    private String insuranceDictCode;

    /**
     * 保险公司字典名称
     */
    private String insuranceDictName;

    /**
     * CE字典主编码
     */
    private Integer ceTypeCode;

    /**
     * CE字典编码
     */
    private String ceDictCode;

    /**
     * 是否有效 0：否 1：是
     */
    private Boolean isValid;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getInsuranceTypeCode() {
        return insuranceTypeCode;
    }

    public void setInsuranceTypeCode(String insuranceTypeCode) {
        this.insuranceTypeCode = insuranceTypeCode;
    }

    public String getInsuranceTypeName() {
        return insuranceTypeName;
    }

    public void setInsuranceTypeName(String insuranceTypeName) {
        this.insuranceTypeName = insuranceTypeName;
    }

    public String getInsuranceDictCode() {
        return insuranceDictCode;
    }

    public void setInsuranceDictCode(String insuranceDictCode) {
        this.insuranceDictCode = insuranceDictCode;
    }

    public String getInsuranceDictName() {
        return insuranceDictName;
    }

    public void setInsuranceDictName(String insuranceDictName) {
        this.insuranceDictName = insuranceDictName;
    }

    public Integer getCeTypeCode() {
        return ceTypeCode;
    }

    public void setCeTypeCode(Integer ceTypeCode) {
        this.ceTypeCode = ceTypeCode;
    }

    public String getCeDictCode() {
        return ceDictCode;
    }

    public void setCeDictCode(String ceDictCode) {
        this.ceDictCode = ceDictCode;
    }

    public Boolean getIsValid() {
        return isValid;
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}