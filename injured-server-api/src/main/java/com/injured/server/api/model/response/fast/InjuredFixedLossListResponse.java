package com.injured.server.api.model.response.fast;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author zlu
 * @title: InjuredFixedLossListResponse
 * @projectName injured
 * @description: 损失项目返回数据
 * @date 2019/8/2810:26
 */
@Getter
@Setter
@ToString
public class InjuredFixedLossListResponse implements Serializable {


    /**
     * 人伤损失项目(CE)（码表见数据字典《定损损失项目》）
     */
    private String injuryLossItemType;

    /**
     * 计算公式（计算公式待补充）
     */
    private String calculatFormulaInfo;

    /**
     * 报损金额
     */
    private BigDecimal reportLossAmount;

    /**
     * 调解金额
     */
    private BigDecimal adjustAmount;

    /**
     * 定损金额
     */
    private BigDecimal fixedLossAmount;

    /**
     * 核损金额
     */
    private BigDecimal damageAmount;
}
