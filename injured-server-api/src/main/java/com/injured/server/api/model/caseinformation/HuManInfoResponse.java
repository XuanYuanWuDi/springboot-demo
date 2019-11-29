package com.injured.server.api.model.caseinformation;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zlu
 * @title: HuManInfoResponse
 * @projectName injured
 * @description: 伤者信息
 * @date 2019/8/111:23
 */
@Getter
@Setter
@ToString
public class HuManInfoResponse implements Serializable {


    //查勘员
    private String checkerName;

    //查勘时间
    private Date checkEndTime;

    //定损人姓名 快陪表
    private String damageName;

    //定损金额 快陪表
    private BigDecimal fixedLossAmount;

    //定损提交时间 快陪表
    private Date fixedLossReceivTime;


    //审核状态 快陪表
    private Integer reviewStatus;


    //定损状态 快陪表
    private Integer taskStatus;

    //伤者姓名
    private  String humanName;


    //伤者属性
    private Integer humanType;

    //核损金额
    private BigDecimal damageAmount;

    //核损人姓名
    private String reviewerName;

    //核损时间
    private Date reviewerSubmitTime;
}
