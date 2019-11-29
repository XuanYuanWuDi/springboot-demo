package com.injured.server.api.model.request.fast;

import com.alibaba.fastjson.JSONObject;
import com.injured.commons.encrypt.MD5;
import com.injured.server.api.annotations.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author zlu
 * @title: FastCompensatInfoRequest
 * @projectName injured
 * @description: 快赔案件保险公司入参类
 * @date 2019/7/2210:45
 */
@Getter
@Setter
@ToString
public class FastCompensatInfoRequest implements Serializable {

    //贵公司分支机构Code
    @NotNull(groups = { "fastInfo" })
    private String branchCompanyCode;

    //贵公司分支机构名称
    @NotNull(groups = { "fastInfo" })
    private String branchCompanyname;

    //该案件任务编号(异步通知用)
    @NotNull(groups = { "fastInfo" })
    private String taskNo;

    //报案号
    @NotNull(groups = { "fastInfo" })
    private String claimNumber;

    //贵公司在CE系统中的ID
    @NotNull(groups = { "fastInfo" })
    private String insuranceCompanyID;

    //贵公司在CE系统中的Code
    @NotNull(groups = { "fastInfo" })
    private String insuranceCompanyCode;

    //是否无责代赔
    private String isPayBackForOthers;

    //车牌号码
    @NotNull(groups = { "fastInfo" })
    private String registrationNumber;

    //查勘信息
    @NotNull(groups = { "fastInfo" },havingChild = true)
    private Check check;

    //保险信息
    @NotNull(groups = { "fastInfo" })
    private List<CommercialInsurance> commercialInsurances;

    //报案信息
    @NotNull(groups = { "fastInfo" },havingChild = true)
    private Report report;

    //车辆信息
    @NotNull(groups = { "fastInfo" },havingChild = true)
    private Vehicle vehicle;

    //人伤信息
    @NotNull(groups = { "fastInfo" },havingChild = true)
    private Injury injury;

    //物损信息
    private List<Loss> losses;

    //异步返回地址
    @NotNull(groups = { "fastInfo" })
    private String notifyUrl;

    //同步返回地址
    @NotNull(groups = { "fastInfo" })
    private String returnUrl;

    //任务类型 A01 移动快赔 A02 跟踪调查 A03人伤定损
    @NotNull(groups = { "fastInfo" })
    private String taskType;



}
