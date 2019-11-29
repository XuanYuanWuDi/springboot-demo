package com.injured.server.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class CeInsuranceCompany implements Serializable {
    private Integer id;

    /**
     * 代码
     */
    private String code;

    /**
     * 简称
     */
    private String shortName;

    /**
     * 全称
     */
    private String fullName;

    /**
     * 父级ID
     */
    private Integer parentId;

    private String province;

    private String city;

    private Boolean isDelete;

    private Date createDate;

    /**
     * 授权ip
     */
    private String authorizedIp;

    /**
     * 密钥
     */
    private String secretKey;

    /**
     * 修改时间
     */
    private Date updateDate;

    /**
     * 任务数
     */
    private Integer taskNumber;

    /**
     * 数据类型：0保险公司，1供应商
     */
    private Integer dataType;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getAuthorizedIp() {
        return authorizedIp;
    }

    public void setAuthorizedIp(String authorizedIp) {
        this.authorizedIp = authorizedIp;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(Integer taskNumber) {
        this.taskNumber = taskNumber;
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }
}