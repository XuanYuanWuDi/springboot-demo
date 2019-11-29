package com.injured.server.api.model.request.fast;

import com.injured.server.api.annotations.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zlu
 * @title: InsuranceModification
 * @projectName injured
 * @description: 批单信息
 * @date 2019/7/2213:16
 */
@Getter
@Setter
@ToString
public class InsuranceModification implements Serializable {

    //批改内容
    @NotNull(groups = { "fastInfo" })
    private String content;

    //批单号
    @NotNull(groups = { "fastInfo" })
    private String modificationBillNo;

    //批改日期
    @NotNull(groups = { "fastInfo" })
    private Date mofificationDate;

}
