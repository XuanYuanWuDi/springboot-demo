package com.injured.server.api.model.query;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.injured.server.api.entity.InjuredFixedLossList;
import com.injured.server.api.entity.InjuredTreatDiagnosisInfo;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author 
 */
@Getter
@Setter
@ToString
public class InjuredFastCompensatInfoDetail implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 报案编号
     */
    private String claimNotificationNo;

    /**
     * 保险公司任务编号
     */
    private String taskNo;

    /**
     * 报案id
     */
    private Long registId;

    /**
     * 查勘id
     */
    private Long surveyId;

    /**
     * 保险公司CODE
     */
    private String compantCode;

    /**
     * 保险公司ID
     */
    private Long companyId;

    /**
     * 保险公司机构code
     */
    private String companyAgencyCode;

    /**
     * 保险公司机构名称
     */
    private String companyAgencyName;

    /**
     * 保险公司机构ID
     */
    private Long companyAgencyId;

    /**
     * 序号
     */
    private Integer serialNum;

    /**
     * 主车行驶情况 1直行 2拐弯 3起步 4倒车 5停放 6其他
     */
    private Integer mainDrivingStatus;

    /**
     * 伤者交通方式 1徒步 2骑乘（两轮、三轮） 3乘坐（汽车）
     */
    private Integer wouTransportat;

    /**
     * 备注
     */
    private String remark;

    /**
     * 人伤首勘地 1事故现场 2医院 3住所 4其他区域
     */
    private Integer surveyFirstAddress;

    /**
     * 初诊时间
     */
    private Date visitTime;

    /**
     * 已发生医药费
     */
    private BigDecimal medicalExpensesFee;

    /**
     * 收入类型 1固定收入 2无固定收入 3无收入
     */
    private Integer incomeStatus;

    /**
     * 从事行业
     */
    private Integer engagedIndustry;

    /**
     * 月均收入
     */
    private BigDecimal monthlyIncome;

    /**
     * 收款名
     */
    private String receiptName;

    /**
     * 收款账号
     */
    private String receiptAccount;

    /**
     * 收款开户行
     */
    private String receiptBank;

    /**
     * 定损类型一级 1常规 2调解 3诉讼
     */
    private String lossFirstType;

    /**
     * 定损类型二级 1现场 2非现场
     */
    private String lossSecondType;

    /**
     * 例均赔付金额
     */
    private BigDecimal averagePayAmount;

    /**
     * 建议金额
     */
    private BigDecimal recommendAmount;

    /**
     * 定损金额
     */
    private BigDecimal fixedLossAmount;

    /**
     * 核损金额
     */
    private BigDecimal damageAmount;

    /**
     * 人伤类型 1简易调解 2普通门诊 3普通住院 4涉及伤残 5现场死亡 6救治死亡
     */
    private Integer humanInjury;

    /**
     * 伤者属性 1主车驾驶员 2主车乘客 3三者步行人 4三者骑乘人 5三者车上人
     */
    private Integer humanType;

    /**
     * 就诊类型 1未治疗 2门急诊治疗 3住院治疗
     */
    private Integer sendDoctorType;

    /**
     * 伤者姓名
     */
    private String humanName;

    /**
     * 证件类型 1居民身份证 2居民户口薄 3驾驶证 4军官证 5士兵证 6 军官离退休证 7中国护照 8异常身份证 9港澳通行证 10台湾通行证 11回乡证 12外国护照 13旅行证 14居留证件 15组织机构代码证 16税务登记证 17营业执照 18其他证件
     */
    private String idCardType;

    /**
     * 证件号码
     */
    private String idCard;

    /**
     * 伤者性别 0未知 1男 2女
     */
    private Integer humanSex;

    /**
     * 出生年月
     */
    private Date birthDate;

    /**
     * 伤者年龄
     */
    private Integer humanAge;

    /**
     * 联系电话
     */
    private String contacNumber;

    /**
     * 户籍性质 1农村 2城镇 3城乡结合 4农村按城镇
     */
    private Integer resideNature;

    /**
     * 常住地省
     */
    private String perResidenceProvince;

    /**
     * 常住地市
     */
    private String perResidenceCity;

    /**
     * 常住地区县
     */
    private String perResidenceDistrict;

    /**
     * 常住地乡镇
     */
    private String perResidenceTown;

    /**
     * 常住地详址
     */
    private String perResidenceAddress;

    /**
     * 医院名称
     */
    private String hospitalName;

    /**
     * 就诊时间
     */
    private Date sendDoctorTime;

    /**
     * 科室
     */
    private String hospitalDepartmentFirst;

    /**
     * 科室二
     */
    private String hospitalDepartmentSecond;

    /**
     * 科室名称
     */
    private String hospitalDepartmentFirstName;

    /**
     * 科室名称二
     */
    private String hospitalDepartmentSecondName;

    /**
     * 损伤部位
     */
    private String damageSite;

    /**
     * 损伤部位二级
     */
    private String damageSiteSecond;

    /**
     * 损伤类型
     */
    private String damageType;

    /**
     * 伤情诊断
     */
    private String diagnosisInjury;

    /**
     * 定损说明
     */
    private String damageDesc;

    /**
     * 定损人姓名
     */
    private String damageName;

    /**
     * 定损人工号
     */
    private String damageNo;

    /**
     * 定损接收时间
     */
    private Date fixedLossReceivTime;

    /**
     * 定损提交时间
     */
    private Date fixedLossSubmitTime;

    /**
     * 审核状态 1待审核 2初级审核中 3初级审核完成 4终极审核中  5审核完成
     */
    private Integer reviewStatus;

    /**
     * 任务状态 1待处理 2处理中 3处理结束
     */
    private Integer taskStatus;

    /**
     * 创建人
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private String updateUser;

    /**
     * 修改时间
     */
    private Date updtaeTime;

    /**
     * 是否删除 0否 1是
     */
    private Integer isDeleted;

    /**
     * 事故责任划分，字典信息《事故责任》
     */
    private String accidentLiability;

    /**
     * 事故类型-保险事故分类，字典信息《事故类型》
     */
    private String ceAccidentType;

    /**
     * 索赔地省
     */
    private String claimProvince;

    /**
     * 索赔地市
     */
    private String claimCity;

    /**
     * 审核人ID（派工用）
     */
    private Long reviewerId;

    /**
     * 被保险人
     */
    private String theInsuredName;

    /**
     * 报案时间
     */
    private Date reportDate;

    /**
     * 理赔机构
     */
    private String claimsAgency;

    /**
     * 异步通知地址
     */
    private String notifyUrl;

    /**
     * 同步返回地址
     */
    private String returnUrl;

    /**
     * 出险时间
     */
    private Date lossTime;

    /**
     * 损失险种责任 见数据字典《险种》
     */
    private Integer lossLiability;

    /**
     * 任务类型 见数据字典<任务类型>
     */
    private String taskTypeFirst;

    /**
     * 任务类型二级 见数据字典
     */
    private String taskTypeSecond;
    
    //超时时长
    private Long timeOut = 0L;
    
    /**
     * 定损清单
     */
    private List<InjuredFixedLossList> injuredFixedLossList;
    
    /**
     * 诊疗信息-诊断信息表
     */
    private List<InjuredTreatDiagnosisInfo> injuredTreatDiagnosisInfo;

    private static final long serialVersionUID = 1L;

}