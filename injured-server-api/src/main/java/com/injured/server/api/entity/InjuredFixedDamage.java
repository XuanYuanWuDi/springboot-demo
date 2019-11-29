package com.injured.server.api.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class InjuredFixedDamage implements Serializable {
    /**
     * 主键
     */
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
     * 伤者id
     */
    private Long surveyWouId;

    /**
     * 查勘id
     */
    private Long surveyId;

    /**
     * 保险公司ID
     */
    private Long companyId;

    /**
     * 保险公司CODE
     */
    private String compantCode;

    /**
     * 序号
     */
    private Integer serialNum;

    /**
     * 伤者姓名
     */
    private String wouName;

    /**
     * 性别(CE) 0-未知的性别;1-男性；2-女性
     */
    private Byte wouSex;

    /**
     * 年龄
     */
    private Long wouAge;

    /**
     * 证件类型（CE)（码表见数据字典《证件类型代码》）
     */
    private Byte idCardType;

    /**
     * 证件号码
     */
    private String idCardNo;

    /**
     * 银行卡号
     */
    private String bankCardNumber;

    /**
     * 联系电话
     */
    private String contacNumber;

    /**
     * 伤者属性（CE)  1-主车驾驶员;2-主车乘客; 3-三者步行人; 4-三者骑乘人; 5-三者车上人 （码表见数据字典《伤者属性》）
     */
    private Byte humanType;

    /**
     * 人伤类型(CE) 1-简易调解; 2-普通门诊; 3-普通住院;  4-涉及伤残; 5-现场死亡; 6-救治死亡 （码表见数据字典《人伤类型》）
     */
    private Byte humanInjury;

    /**
     * 索赔年度
     */
    private String claimYear;

    /**
     * 索赔地省（CE)
     */
    private String claimProvince;

    /**
     * 索赔地市（CE)
     */
    private String claimCity;

    /**
     * 是否诉讼(CE) 0-否，1-是
     */
    private Byte isPublicProsecution;

    /**
     * 代理人姓名
     */
    private String agentName;

    /**
     * 代理人电话
     */
    private String agentPhone;

    /**
     * 事故类型(CE)（码表见数据字典《ce事故类型》）
     */
    private Byte accidentType;

    /**
     * 事故责任(CE)（码表见数据字典《事故责任》）
     */
    private String accidentLiability;

    /**
     * 责任比例
     */
    private String liabilityRatio;

    /**
     * 户籍性质(CE) 1-农村；2-城镇；3-城乡结合；4-农村按城镇（码表见数据字典《户籍性质》）
     */
    private Byte resideNature;

    /**
     * 户籍地省(CE)
     */
    private String resideProvince;

    /**
     * 户籍地市(CE)
     */
    private String resideCity;

    /**
     * 户籍地区县(CE)
     */
    private String resideDistrict;

    /**
     * 户籍地乡镇(CE)
     */
    private String resideTown;

    /**
     * 户籍地详址
     */
    private String resideAddress;

    /**
     * 是否合格(CE) 0-否，1-是（码表见数据字典《是否判断》）
     */
    private Integer whetherPassed;

    /**
     * 所属行业(CE)（码表见数据字典《所属行业》）
     */
    private Byte industry;

    /**
     * 误工天数
     */
    private Integer lossWorkDays;

    /**
     * 住院天数
     */
    private Integer hospitalDays;

    /**
     * 护理天数
     */
    private Integer nurseDays;

    /**
     * 出院时间
     */
    private Date dischargeTime;

    /**
     * 主要伤情诊断（诊断表待补充）
     */
    private Integer diagnosisInjury;

    /**
     * 医院名称
     */
    private String hospitalName;

    /**
     * 鉴定机构名称
     */
    private String accreditatBodiesName;

    /**
     * 最高评残条文（评残条文表待补充）
     */
    private String assessDisabilitPro;

    /**
     * 最高伤残级别(CE)（码表见数据字典《伤残等级》）
     */
    private Byte disabilitLevel;

    /**
     * 死亡原因(CE)（码表见数据字典《死亡原因》）
     */
    private Byte deathCause;

    /**
     * 死亡日期
     */
    private Date deathTime;

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

    public Integer getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Integer serialNum) {
        this.serialNum = serialNum;
    }

    public String getWouName() {
        return wouName;
    }

    public void setWouName(String wouName) {
        this.wouName = wouName;
    }

    public Byte getWouSex() {
        return wouSex;
    }

    public void setWouSex(Byte wouSex) {
        this.wouSex = wouSex;
    }

    public Long getWouAge() {
        return wouAge;
    }

    public void setWouAge(Long wouAge) {
        this.wouAge = wouAge;
    }

    public Byte getIdCardType() {
        return idCardType;
    }

    public void setIdCardType(Byte idCardType) {
        this.idCardType = idCardType;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getBankCardNumber() {
        return bankCardNumber;
    }

    public void setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber;
    }

    public String getContacNumber() {
        return contacNumber;
    }

    public void setContacNumber(String contacNumber) {
        this.contacNumber = contacNumber;
    }

    public Byte getHumanType() {
        return humanType;
    }

    public void setHumanType(Byte humanType) {
        this.humanType = humanType;
    }

    public Byte getHumanInjury() {
        return humanInjury;
    }

    public void setHumanInjury(Byte humanInjury) {
        this.humanInjury = humanInjury;
    }

    public String getClaimYear() {
        return claimYear;
    }

    public void setClaimYear(String claimYear) {
        this.claimYear = claimYear;
    }

    public String getClaimProvince() {
        return claimProvince;
    }

    public void setClaimProvince(String claimProvince) {
        this.claimProvince = claimProvince;
    }

    public String getClaimCity() {
        return claimCity;
    }

    public void setClaimCity(String claimCity) {
        this.claimCity = claimCity;
    }

    public Byte getIsPublicProsecution() {
        return isPublicProsecution;
    }

    public void setIsPublicProsecution(Byte isPublicProsecution) {
        this.isPublicProsecution = isPublicProsecution;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentPhone() {
        return agentPhone;
    }

    public void setAgentPhone(String agentPhone) {
        this.agentPhone = agentPhone;
    }

    public Byte getAccidentType() {
        return accidentType;
    }

    public void setAccidentType(Byte accidentType) {
        this.accidentType = accidentType;
    }

    public String getAccidentLiability() {
        return accidentLiability;
    }

    public void setAccidentLiability(String accidentLiability) {
        this.accidentLiability = accidentLiability;
    }

    public String getLiabilityRatio() {
        return liabilityRatio;
    }

    public void setLiabilityRatio(String liabilityRatio) {
        this.liabilityRatio = liabilityRatio;
    }

    public Byte getResideNature() {
        return resideNature;
    }

    public void setResideNature(Byte resideNature) {
        this.resideNature = resideNature;
    }

    public String getResideProvince() {
        return resideProvince;
    }

    public void setResideProvince(String resideProvince) {
        this.resideProvince = resideProvince;
    }

    public String getResideCity() {
        return resideCity;
    }

    public void setResideCity(String resideCity) {
        this.resideCity = resideCity;
    }

    public String getResideDistrict() {
        return resideDistrict;
    }

    public void setResideDistrict(String resideDistrict) {
        this.resideDistrict = resideDistrict;
    }

    public String getResideTown() {
        return resideTown;
    }

    public void setResideTown(String resideTown) {
        this.resideTown = resideTown;
    }

    public String getResideAddress() {
        return resideAddress;
    }

    public void setResideAddress(String resideAddress) {
        this.resideAddress = resideAddress;
    }

    public Integer getWhetherPassed() {
        return whetherPassed;
    }

    public void setWhetherPassed(Integer whetherPassed) {
        this.whetherPassed = whetherPassed;
    }

    public Byte getIndustry() {
        return industry;
    }

    public void setIndustry(Byte industry) {
        this.industry = industry;
    }

    public Integer getLossWorkDays() {
        return lossWorkDays;
    }

    public void setLossWorkDays(Integer lossWorkDays) {
        this.lossWorkDays = lossWorkDays;
    }

    public Integer getHospitalDays() {
        return hospitalDays;
    }

    public void setHospitalDays(Integer hospitalDays) {
        this.hospitalDays = hospitalDays;
    }

    public Integer getNurseDays() {
        return nurseDays;
    }

    public void setNurseDays(Integer nurseDays) {
        this.nurseDays = nurseDays;
    }

    public Date getDischargeTime() {
        return dischargeTime;
    }

    public void setDischargeTime(Date dischargeTime) {
        this.dischargeTime = dischargeTime;
    }

    public Integer getDiagnosisInjury() {
        return diagnosisInjury;
    }

    public void setDiagnosisInjury(Integer diagnosisInjury) {
        this.diagnosisInjury = diagnosisInjury;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getAccreditatBodiesName() {
        return accreditatBodiesName;
    }

    public void setAccreditatBodiesName(String accreditatBodiesName) {
        this.accreditatBodiesName = accreditatBodiesName;
    }

    public String getAssessDisabilitPro() {
        return assessDisabilitPro;
    }

    public void setAssessDisabilitPro(String assessDisabilitPro) {
        this.assessDisabilitPro = assessDisabilitPro;
    }

    public Byte getDisabilitLevel() {
        return disabilitLevel;
    }

    public void setDisabilitLevel(Byte disabilitLevel) {
        this.disabilitLevel = disabilitLevel;
    }

    public Byte getDeathCause() {
        return deathCause;
    }

    public void setDeathCause(Byte deathCause) {
        this.deathCause = deathCause;
    }

    public Date getDeathTime() {
        return deathTime;
    }

    public void setDeathTime(Date deathTime) {
        this.deathTime = deathTime;
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