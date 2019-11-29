package com.injured.server.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class InjuredIncapacityIdentificationInfo implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 报案编号
     */
    private String claimNotificationNo;

    /**
     * 报案id
     */
    private Long registId;

    /**
     * 伤者ID
     */
    private Long surveyWouId;

    /**
     * 任务编号(查勘表ID)
     */
    private Long surveyId;

    /**
     * 关联调解基本信息表ID
     */
    private Long medBasicInfoId;

    /**
     * 伤残信息id
     */
    private Long incapacityId;

    /**
     * 保险公司ID
     */
    private Long companyId;

    /**
     * 保险公司CODE
     */
    private String compantCode;

    /**
     * 评定方式(CE)（码表见数据字典《评定方式》）
     */
    private Byte evaluationMethod;

    /**
     * 文件名称(CE)（码表见数据字典《适用文件名称》）
     */
    private Byte fileName;

    /**
     * 伤残级别(CE)（码表见数据字典《伤残等级》）
     */
    private Byte disabilitLevel;

    /**
     * 赔偿系数(CE)
     */
    private Integer compensCoe;

    /**
     * 评残条文(CE)（评残条文待补充）
     */
    private String assessDisabilitPro;

    /**
     * 评残日期
     */
    private Date assessDisabilitTime;

    /**
     * 鉴定机构名称
     */
    private String accreditatBodiesName;

    /**
     * 鉴定人（1）
     */
    private String accreditatNameOne;

    /**
     * 鉴定人（2）
     */
    private String accreditatNameTwo;

    /**
     * 序号
     */
    private Integer serialNum;

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

    public String getClaimNotificationNo() {
        return claimNotificationNo;
    }

    public void setClaimNotificationNo(String claimNotificationNo) {
        this.claimNotificationNo = claimNotificationNo;
    }

    public Long getRegistId() {
        return registId;
    }

    public void setRegistId(Long registId) {
        this.registId = registId;
    }

    public Long getSurveyWouId() {
        return surveyWouId;
    }

    public void setSurveyWouId(Long surveyWouId) {
        this.surveyWouId = surveyWouId;
    }

    public Long getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Long surveyId) {
        this.surveyId = surveyId;
    }

    public Long getMedBasicInfoId() {
        return medBasicInfoId;
    }

    public void setMedBasicInfoId(Long medBasicInfoId) {
        this.medBasicInfoId = medBasicInfoId;
    }

    public Long getIncapacityId() {
        return incapacityId;
    }

    public void setIncapacityId(Long incapacityId) {
        this.incapacityId = incapacityId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompantCode() {
        return compantCode;
    }

    public void setCompantCode(String compantCode) {
        this.compantCode = compantCode;
    }

    public Byte getEvaluationMethod() {
        return evaluationMethod;
    }

    public void setEvaluationMethod(Byte evaluationMethod) {
        this.evaluationMethod = evaluationMethod;
    }

    public Byte getFileName() {
        return fileName;
    }

    public void setFileName(Byte fileName) {
        this.fileName = fileName;
    }

    public Byte getDisabilitLevel() {
        return disabilitLevel;
    }

    public void setDisabilitLevel(Byte disabilitLevel) {
        this.disabilitLevel = disabilitLevel;
    }

    public Integer getCompensCoe() {
        return compensCoe;
    }

    public void setCompensCoe(Integer compensCoe) {
        this.compensCoe = compensCoe;
    }

    public String getAssessDisabilitPro() {
        return assessDisabilitPro;
    }

    public void setAssessDisabilitPro(String assessDisabilitPro) {
        this.assessDisabilitPro = assessDisabilitPro;
    }

    public Date getAssessDisabilitTime() {
        return assessDisabilitTime;
    }

    public void setAssessDisabilitTime(Date assessDisabilitTime) {
        this.assessDisabilitTime = assessDisabilitTime;
    }

    public String getAccreditatBodiesName() {
        return accreditatBodiesName;
    }

    public void setAccreditatBodiesName(String accreditatBodiesName) {
        this.accreditatBodiesName = accreditatBodiesName;
    }

    public String getAccreditatNameOne() {
        return accreditatNameOne;
    }

    public void setAccreditatNameOne(String accreditatNameOne) {
        this.accreditatNameOne = accreditatNameOne;
    }

    public String getAccreditatNameTwo() {
        return accreditatNameTwo;
    }

    public void setAccreditatNameTwo(String accreditatNameTwo) {
        this.accreditatNameTwo = accreditatNameTwo;
    }

    public Integer getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Integer serialNum) {
        this.serialNum = serialNum;
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