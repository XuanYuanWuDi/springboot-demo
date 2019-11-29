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
 * @title: HistoricalClaim
 * @projectName injured
 * @description: 保单出险记录
 * @date 2019/7/2211:43
 */
@Getter
@Setter
@ToString
public class HistoricalClaim implements Serializable {

    //出险时间
    @NotNull(groups = { "fastInfo" })
    private Date claimDate;

    //结案时间
    private Date claimEndDate;

    //报案号
    @NotNull(groups = { "fastInfo" })
    private String claimNumber;

    //驾驶员姓名
    @NotNull(groups = { "fastInfo" })
    private String driverName;

    //出险地点
    @NotNull(groups = { "fastInfo" })
    private String eventAddress;

    //险种1=交强险 2=商业险
    @NotNull(groups = { "fastInfo" })
    private String insuranceCategory;

    //保单号
    @NotNull(groups = { "fastInfo" })
    private String insuranceNumber;

    //报案时间
    @NotNull(groups = { "fastInfo" })
    private Date reportDate;

    //报案人
    @NotNull(groups = { "fastInfo" })
    private String reporter;

    //报案人电话
    private String reporterTel;

    //赔案号
    private String payClaimNumber;

    //定损金额
    @NotNull(groups = { "fastInfo" })
    private BigDecimal estimateAmount;

    //结案金额
    @NotNull(groups = { "fastInfo" })
    private BigDecimal paidAmount;

    //赔付次数
    @NotNull(groups = { "fastInfo" })
    private Integer paidTimes;

    //出险经过
    @NotNull(groups = { "fastInfo" })
    private String dangerDesc;

}
