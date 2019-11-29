package com.injured.server.api.model.insurance;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zlu
 * @title: HistoricalClaimResponse
 * @projectName injured
 * @description: 出险记录
 * @date 2019/7/3115:32
 */
@Getter
@Setter
@ToString
public class HistoricalClaimResponse implements Serializable {


    //出险时间
    private String claimDate;


    //结案金额
    private BigDecimal paidAmount;


    //结案时间
    private String claimEndDate;


    //出险经过
    private String dangerDesc;
}
