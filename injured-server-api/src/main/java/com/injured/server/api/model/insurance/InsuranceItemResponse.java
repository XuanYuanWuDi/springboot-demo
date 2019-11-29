package com.injured.server.api.model.insurance;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author zlu
 * @title: InsuranceItemResponse
 * @projectName injured
 * @description: 险种信息
 * @date 2019/7/3115:23
 */
@Getter
@Setter
@ToString
public class InsuranceItemResponse implements Serializable {

    //险种名称
    private String name;

    //保额/限额
    private BigDecimal insuranceAmout;

    //免赔率
    private BigDecimal deductibleRate;

    //免赔额
    private BigDecimal deductibleMoney;

    //备注
    private String remark;
}
