package com.injured.server.api.model.request.fast;

import com.injured.server.api.annotations.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author zlu
 * @title: InsuranceItem
 * @projectName injured
 * @description: 险种详情
 * @date 2019/7/2211:50
 */
@Getter
@Setter
@ToString
public class InsuranceItem implements Serializable {


    //免赔率
    @NotNull(groups = { "fastInfo" })
    private BigDecimal deductibleRate;

    //免赔额
    @NotNull(groups = { "fastInfo" })
    private BigDecimal deductibleMoney;

    //保额/限额
    @NotNull(groups = { "fastInfo" })
    private BigDecimal insuranceAmount;

    //标准保费
    @NotNull(groups = { "fastInfo" })
    private BigDecimal insuranceFee;

    //险种Code
    @NotNull(groups = { "fastInfo" })
    private String insuranceItemCode;

    //险种名称
    @NotNull(groups = { "fastInfo" })
    private String name;

    //承包不计免赔
    @NotNull(groups = { "fastInfo" })
    private String nonDeductible;

    //单位数量
    @NotNull(groups = { "fastInfo" })
    private Integer unitCount;

    //单位保额
    @NotNull(groups = { "fastInfo" })
    private BigDecimal unitAmount;


    //保费
    private BigDecimal premiums;


    //备注
    private String remark;
}
