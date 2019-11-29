package com.injured.server.api.model.request.fast;

import com.injured.server.api.annotations.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author zlu
 * @title: Loss
 * @projectName injured
 * @description: 物损信息
 * @date 2019/7/2315:37
 */
@Getter
@Setter
@ToString
public class Loss implements Serializable {

    //物损项目名称
    private String lossName;

    //范围/数量
    @NotNull(groups = { "fastInfo" })
    private String lossScope;

    //损失描述
    @NotNull(groups = { "fastInfo" })
    private String lossDesc;

    //联系人
    @NotNull(groups = { "fastInfo" })
    private String contactPerson;

    //联系人电话
    private String contactMobile;

    //预估损失总金额
    private BigDecimal estimatedLossAmount;
}
