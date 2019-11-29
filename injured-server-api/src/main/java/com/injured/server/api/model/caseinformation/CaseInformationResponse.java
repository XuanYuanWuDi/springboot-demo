package com.injured.server.api.model.caseinformation;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author zlu
 * @title: CaseInformationResponse
 * @projectName injured
 * @description: 案件详情
 * @date 2019/7/3116:58
 */
@Getter
@Setter
@ToString
public class CaseInformationResponse implements Serializable {

    //案件类型
    private String caseType;

    //报案时间 报案表
    private Date notificationTime;


    //报案人  报案表
    private String reporter;


    //报案电话 报案表
    private String informantMobilTel;


    //出险原因 查勘表
    private String dangerCause;


    //出险时间 报案表
    private Date dangerTime;


    //事故原因 报案表
    private String eventReasonType;


    //事故类型 查勘表
    private String eventType;


    //出险地址 查勘表
    private String dangerAddress;


    //是否异地 报案表
    private String isOutofLocalClaim;


    //报案类型  报案表
    private String reportType;


    //事故经过 查勘表
    private String  dangerDesc;


    //是否与保单相符 查勘
    private String isCarInsurance;

    //车牌号码 车辆表
    private String licensePlateNo;


    //号牌底色 车辆表
    private String plateColor;


    //厂牌型号 车辆表
    private String brandModel;


    //车架号 车辆表
    private String vin;


    //发动机号 车辆表
    private String engineNo;


    //使用性质 车辆表
    private String usingProperties;


    //是否年检期内
    private String isCarAnnual;


    //是否酒后驾车
    private String isDrinkingDriving;


    //驾驶员姓名 驾驶员表
    private String driverName;


    //驾驶员性别 驾驶员表
    private String driverSex;


    //驾驶员年龄 驾驶员表
    private Integer driverAge;


    //驾驶员电话 驾驶员表
    private String  driverPhone;


    //驾照类型 驾驶员表
    private String drivingIdentifyType;


    //证件类型 驾驶员表
    private String  identifyType;


    //证件号码 驾驶员表
    private String identifyNumber;


    //出险险种
    private Integer lossLiability;

    //道路类型 报案表
    private String eventAddressType;


    //出险地点分类
    private String dangerAddressType;


    //是否已报交警 报案表
    private String isPolice;


    //伤者人数 报案表
    private Integer hurtNum;


    //事故处理方式 查勘表
    private String eventProcessMode;


    //事故责任划分 查勘表
    private String eventAccidentLiability;



    //事故责任比例 查勘表
    private BigDecimal eventDutyRatio;



    //是否有事故证明



    //事故处理程序


    //证件审核 查勘表
    private String driverReview;



    //是否约定驾驶员 查勘表
    private String  isAppointDriver;



    //是否现场查勘 查勘表
    private Integer isFirstScene;



    //伤者信息
    List<HuManInfoResponse> huManInfos;


    //是否有交强险保单
    private String jiaoQiangIsExist;


    //是否有商业险保单
    private String shangYeIsExist;

    //报案号
    private String claimNotificationNo;
}
