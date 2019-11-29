package com.injured.server.api.enums;

/**
 * @author zlu
 * @title: DictEnum
 * @projectName injured
 * @description: 字典转换枚举
 * @date 2019/7/2297:26
 */
public enum DictEnum {

    //人伤快赔系统转码
    MainDrivingStatus(80,"Injury_mainDrivingStatus"),
    WouTransportat(81,"Injury_wouTransportat"),
    SurveyFirstAddress(82,"Injury_surveyFirstAddress"),
    IncomeStatus(71,"Injury_incomeStatus"),
    EngagedIndustry(72,"Injury_engagedIndustry"),
    LossFirstType(76,"Injury_lossFirstType"),
    lossSecondType(76,"Injury_lossSecondType"),
    HumanInjury(68,"Injury_humanInjury"),
    HumanType(67,"Injury_humanType"),
    SendDoctorType(83,"Injury_sendDoctorType"),
    IdCardType(22,"Injury_idCardType"),
    HumanSex(23,"Injury_humanSex"),
    ResideNature(69,"Injury_resideNature"),
    HospitalDepartmentFirst(70,"Injury_hospitalDepartmentFirst"),
    HospitalDepartmentSecond(70,"Injury_hospitalDepartmentSecond"),
    DamageSite(98,"Injury_damageSite"),
    DamageSiteSecond(98,"Injury_damageSiteSecond"),
    DamageType(99,"Injury_damageType"),
    AccidentLiability(7,"Injury_accidentLiability"),
    CeAccidentType(16,"Injury_ceAccidentType"),
    LossLiability(57,"Injury_lossLiability"),


    //报案相关
    IsPersonInjured(29,"Report_isPersonInjured"),
    IsProtectLoss(29,"Report_isProtectLoss"),
    EventAddressType(8,"Report_eventAddressType"),
    EventReason(9,"Report_eventReason"),
    EventResponsibility(7,"Report_eventResponsibility"),
    InformantIsDriver(29,"Report_informantIsDriver"),
    InformantIsInsured(29,"Report_informantIsInsured"),
    IsClosed(29,"Report_isClosed"),
    IsScene(29,"Report_isScene"),
    IsPolice(29,"Report_isPolice"),
    isOutofLocalClaim(29,"Report_isOutofLocalClaim"),
    subrogationFlag(29,"Report_subrogationFlag"),
    isSimpleClaim(29,"Report_isSimpleClaim"),
    firstSceneInd(29,"Report_firstSceneInd"),
    isSubjectNormal(29,"Report_isSubjectNormal"),
    isRescue(29,"Report_isRescue"),
    isSelfSurvey(29,"Report_isSelfSurvey"),
    isPayment(29,"Report_isPayment"),
    isDriverLocale(29,"Report_isDriverLocale"),
    isMainReport(29,"Report_isMainReport"),
    isLocaleSurvey(29,"Report_isLocaleSurvey"),
    isInsuredPhone(29,"Report_isInsuredPhone"),
    Report_driverGender(23,"Report_driverGender"),
    Report_caseType(60,"Report_caseType"),
    Report_dangerAddressType(62,"Report_dangerAddressType"),


    //查勘相关
    CheckType(19,"Check_checkType"),
    DisposeType(17,"Check_disposeType"),
    CHECK_EventAddressType(8,"Check_eventAddressType"),
    CHECK_EventReason(9,"Check_eventReason"),
    CHECK_EventResponsibility(7,"Check_eventResponsibility"),
    EventType(16,"Check_eventType"),
    IsFirstScene(29,"Check_isFirstScene"),
    IsCarAnnual(29,"Check_isCarAnnual"),
    CaseType(61,"Check_caseType"),
    CHECk_noFaultCompensate(29,"Check_noFaultCompensate"),
    CHECk_subrogationFlag(29,"Check_subrogationFlag"),
    CHECk_isMutualCollisionSelfCompensation(29,"Check_isMutualCollisionSelfCompensation"),
    CHECk_isCarInsurance(29,"Check_isCarInsurance"),
    CHECk_subCertiType(18,"Check_subCertiType"),
    CHECk_caseType(60,"Check_caseType"),
    CHECK_isPersonInjured(29,"Check_isPersonInjured"),

    //车辆信息
    VehicleType(5,"Vehicle_vehicleType"),
    LicensePlateType(14,"Vehicle_licensePlateType"),
    LicensePlateColor(24,"Vehicle_licensePlateColor"),
    CAR_IsPersonInjured(29,"Vehicle_isPersonInjured"),
    CAR_IsProtectLoss(29,"Vehicle_isProtectLoss"),
    IsMortgage(29,"Vehicle_isMortgage"),
    IsTelemarketing(29,"Vehicle_isTelemarketing"),
    CAR_typeOfUsage(3,"Vehicle_typeOfUsage"),
    CAR_isRescue(29,"Vehicle_isRescue"),
    CAR_isDisassemble(29,"Vehicle_isDisassemble"),


    //驾驶员
    IdentifyType(22,"Check_Driver_identifyType"),
    DriverAllowedVehicleType(37,"Check_Driver_driverAllowedVehicleType"),
    DriverSex(23,"Check_Driver_driverSex"),


    //保单相关
    insuranceItemCode(57,"insuranceCategory"),
    theInsuredNoType(22,"theInsuredNoType"),
    isContinuousPolicy(29,"isContinuousPolicy"),
    vehicleColor(4,"vehicleColor"),
    channels(2,"channels"),
    isTransfer(29,"isTransfer"),
    insurance_typeOfUsage(3,"typeOfUsage"),
    insurance_vehicleType(5,"vehicleType"),


    //出险记录
    InsuranceItem(6," insuranceItemCode"),


    //伤情诊断相关
    damageSite(98,"damageSite"),
    damageSiteSecond(98,"damageSiteSecond"),
    damageType(99,"damageType"),
    primaryDiagnosis(29,"primaryDiagnosis");


    DictEnum(Integer ceTypeCode,String insuranceDictCode){
          this.ceTypeCode = ceTypeCode;
          this.insuranceDictCode = insuranceDictCode;
    }

    //CE字典枚举ID
    private Integer ceTypeCode;

    //保险公司字典编码
    private String insuranceDictCode;


    public Integer getCeTypeCode() {
        return ceTypeCode;
    }

    public void setCeTypeCode(Integer ceTypeCode) {
        this.ceTypeCode = ceTypeCode;
    }

    public String getInsuranceDictCode() {
        return insuranceDictCode;
    }

    public void setInsuranceDictCode(String insuranceDictCode) {
        this.insuranceDictCode = insuranceDictCode;
    }
}
