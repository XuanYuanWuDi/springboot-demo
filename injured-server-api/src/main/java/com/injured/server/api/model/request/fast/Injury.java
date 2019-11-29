package com.injured.server.api.model.request.fast;

import com.injured.server.api.annotations.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author zlu
 * @title: Injury
 * @projectName injured
 * @description: 人伤信息
 * @date 2019/7/2214:11
 */
@Getter
@Setter
@ToString
public class Injury implements Serializable {

     //主车行驶情况 1直行 2拐弯 3起步 4倒车 5停放 6其他
     private String mainDrivingStatus;

     //伤者交通方式 1徒步 2骑乘（两轮、三轮） 3乘坐（汽车）
     private String wouTransportat;

     //人伤首勘地 1事故现场 2医院 3住所 4其他区域
     private String surveyFirstAddress;

     //初诊时间
     private Date visitTime;

     //已发生医药费
     private BigDecimal medicalExpensesFee;

     //收入类型 1固定收入 2无固定收入 3无收入
     private String incomeStatus;

     //从事行业
     private String engagedIndustry;

     //月收入
     private BigDecimal monthlyIncome;

     //收款人姓名
     private String receiptName;

     //收款人账户
     private String receiptAccount;

     //开户支行
     private String receiptBank;

     //定损类型一级 1常规 2调解 3诉讼
     private String lossFirstType;

     //定损类型二级 1现场 2非现场
     private String lossSecondType;

     //例均赔付金额
     private BigDecimal a0veragePayAmount;

     //人伤类型 1简易调解 2普通门诊 3普通住院 4涉及伤残 5现场死亡 6救治死亡
     private String humanInjury;

     //伤者属性 1主车驾驶员 2主车乘客 3三者步行人 4三者骑乘人 5三者车上人
     @NotNull(groups = { "fastInfo" })
     private String humanType;


     //就诊类型 1未治疗 2门急诊治疗 3住院治疗
     private String  sendDoctorType;


     //伤者姓名
     @NotNull(groups = { "fastInfo" })
     private String humanName;


     //证件类型 1居民身份证 2居民户口薄 3驾驶证 4军官证 5士兵证 6 军官离退休证 7中国护照 8异常身份证 9港澳通行证
     // 10台湾通行证 11回乡证 12外国护照 13旅行证 14居留证件 15组织机构代码证 16税务登记证 17营业执照 18其他证件
     private String idCardType;

     //身份证号
     private String idCard;

     //伤者性别
     @NotNull(groups = { "fastInfo" })
     private String humanSex;

     //伤者生日
     private Date birthDate;

     //伤者年龄
     @NotNull(groups = { "fastInfo" })
     private Integer humanAge;

     //联系人电话
     private String contacNumber;

     //户籍性质 1农村 2城镇 3城乡结合 4农村按城镇
     private String resideNature;

     //常住地省
     private String perResidenceProvince;

     //常住地市
     private String perResidenceCity;

     //常住地区县
     private String perResidenceDistrict;

     //常住地乡镇
     private String perResidenceTown;

     //常住地详细地址
     private String perResidenceAddress;

     //医院名称
     private String hospitalName;

     //就诊时间
     private Date sendDoctorTime;

     //科室
     private String hospitalDepartmentFirst;

     //二级科室
     private String hospitalDepartmentSecond;

     //科室名称
     private String hospitalDepartmentFirstName;

     //二级科室名称
     private String hospitalDepartmentSecondName;

     //定损说明
     private String damageDesc;

     //定损员名称
     @NotNull(groups = { "fastInfo" })
     private String damageName;

     //定损员工号
     @NotNull(groups = { "fastInfo" })
     private String damageNo;

     //事故责任划分
     private String accidentLiability;

     //事故责任类型
     private String ceAccidentType;

     //索赔省
     private String claimProvince;

     //索赔市区
     private String claimCity;

     //被保险人
     private String theInsuredName;

     //理赔机构名称
     private String claimsAgency;

     //损失险种责任
     private Integer lossLiability;

     //伤情诊断
     private List<TreatDiagnosisInfo>  treatDiagnosisInfos;
}
