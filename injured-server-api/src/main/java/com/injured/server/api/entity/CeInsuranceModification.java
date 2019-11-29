package com.injured.server.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class CeInsuranceModification implements Serializable {
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
     * 批单号
     */
    private String modificationBillNo;

    /**
     * 申请人姓名
     */
    private String applicantName;

    /**
     * 申请日期
     */
    private Date applicantDate;

    /**
     * 批改时间
     */
    private Date modificationTime;

    /**
     * 批改内容
     */
    private String content;

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

    public String getModificationBillNo() {
        return modificationBillNo;
    }

    public void setModificationBillNo(String modificationBillNo) {
        this.modificationBillNo = modificationBillNo;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public Date getApplicantDate() {
        return applicantDate;
    }

    public void setApplicantDate(Date applicantDate) {
        this.applicantDate = applicantDate;
    }

    public Date getModificationTime() {
        return modificationTime;
    }

    public void setModificationTime(Date modificationTime) {
        this.modificationTime = modificationTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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