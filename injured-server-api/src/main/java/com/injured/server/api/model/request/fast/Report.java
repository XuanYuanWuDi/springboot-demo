package com.injured.server.api.model.request.fast;

import com.injured.server.api.annotations.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zlu
 * @title: Report
 * @projectName injured
 * @description: 报案信息
 * @date 2019/7/2213:26
 */
@Getter
@Setter
@ToString
public class Report implements Serializable {

    //受伤人数
    @NotNull(groups = { "fastInfo" })
    private Integer hurtNum;

    //是否有物损
    private String isPersonInjured;

    //是否有人伤
    @NotNull(groups = { "fastInfo" })
    private String isProtectLoss;

    //联系人
    private String contactPerson;

    //联系人电话
    private String contactTel;

    //出险地址
    @NotNull(groups = { "fastInfo" })
    private String eventAddress;

    //道路类型
    @NotNull(groups = { "fastInfo" })
    private String eventAddressType;

    //出险时间
    @NotNull(groups = { "fastInfo" })
    private Date eventDate;

    //出险经过
    @NotNull(groups = { "fastInfo" })
    private String eventDescription;

    //出险原因
    private String eventReason;

    //事故原因
    private String eventReasonType;

    //责任类型
    private String eventResponsibility;

    //报案人
    @NotNull(groups = { "fastInfo" })
    private String informant;

    //报案人是否是驾驶员
    private String informantIsDriver;

    //报案人是否是被保险人
    private String informantIsInsured;

    //报案人电话
    @NotNull(groups = { "fastInfo" })
    private String informantTel;

    //是否结案
    private String isClosed;

    //是否现场报案
    @NotNull(groups = { "fastInfo" })
    private String registSource;

    //报案日期
    @NotNull(groups = { "fastInfo" })
    private Date reportDate;

    //是否已报交警
    @NotNull(groups = { "fastInfo" })
    private String isPolice;




    //是否异地
    @NotNull(groups = { "fastInfo" })
    private String isOutofLocalClaim;

    //是否要求代位
    private String subrogationFlag;

    //是否简易案件
    @NotNull(groups = { "fastInfo" })
    private String isSimpleClaim;

    //是否第一现场
    private String firstSceneInd;

    //标的车是否可正常行驶
    private String isSubjectNormal;

    //是否进行相关施救
    private String isRescue;

    //是否自助查勘
    private String  isSelfSurvey;

    //是否垫付
    private  String  isPayment;

    //驾驶员是否在现场
    private String isDriverLocale;

    //是否主挂车补报案
    private String isMainReport;

    //客户是否要求第一现场查勘
    private String isLocaleSurvey;

    //是否提供被保险人电话
    private String isInsuredPhone;



    //驾驶员姓名
    private String driverName;


    //驾驶员性别
    private String driverGender;


    //案件类型
    private String caseType;


    //出险地类型
    @NotNull(groups = { "fastInfo" })
    private String dangerAddressType;

}
