package com.injured.server.api.model.request.fast;

import com.injured.server.api.annotations.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zlu
 * @title: Check
 * @projectName injured
 * @description: 查勘信息
 * @date 2019/7/2211:18
 */
@Getter
@Setter
@ToString
public class Check implements Serializable {

    //查勘地址
    @NotNull(groups = { "fastInfo" })
    private String checkAddress;

    //查勘员1代码
    @NotNull(groups = { "fastInfo" })
    private String checkEmployee1Code;

    //查勘员1名称
    @NotNull(groups = { "fastInfo" })
    private String checkEmployee1Name;

    //查勘员1手机
    @NotNull(groups = { "fastInfo" })
    private String checkEmployee1Phone;

    //查勘员2代码
    private String checkEmployee2Code;

    //查勘员2名称
    private String checkEmployee2Name;

    //查勘员2手机
    private String checkEmployee2Phone;

    //查勘开始时间
    @NotNull(groups = { "fastInfo" })
    private Date checkStartTime;

    //查勘结束时间
    @NotNull(groups = { "fastInfo" })
    private Date checkEndTime;

    //查勘类型（请参考所涉枚举） 请传贵司代码
    @NotNull(groups = { "fastInfo" })
    private String checkType;

    //联系人姓名
    private String contactPerson;

    //联系人电话
    private String contactTel;

    //事故处理方式
    private String disposeType;

    //道路类型
    @NotNull(groups = { "fastInfo" })
    private String eventAddressType;

    //出险原因
    private String eventReason;

    //责任类型
    private String eventResponsibility;

    //事故责任比例
    private BigDecimal eventDutyRatio;

    //事故类型
    private String eventType;

    //是否第一现场查勘
    @NotNull(groups = { "fastInfo" })
    private String isFirstScene;

    //证件审核
    private String driverReview;

    //出险经过
    @NotNull(groups = { "fastInfo" })
    private String lossPass;

    //驾驶员信息
    @NotNull(groups = { "fastInfo" },havingChild = true)
    private Driver driver;

    //是否年检期
    @NotNull(groups = { "fastInfo" })
    private String isCarAnnual;

    //案件类型
    private String caseType;

    //是否为互碰自赔
    private String isMutualCollisionSelfCompensation;

    //车辆信息是否与保单相符
    @NotNull(groups = { "fastInfo" })
    private String isCarInsurance;


    //责任认定书类型
    private String subCertiType;


    //是否为约定驾驶员
    private String isAppointDriver;


    //是否有物损
    private String isPersonInjured;


    //是否要求代位
    private String subrogationFlag;

    //出险地址
    private String eventAddress;

}
