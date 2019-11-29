package com.injured.server.api.model.insurance;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zlu
 * @title: InsuranceModificationResponse
 * @projectName injured
 * @description: 批改信息
 * @date 2019/7/3115:31
 */
@Getter
@Setter
@ToString
public class InsuranceModificationResponse implements Serializable {

    //批改内容
    private String content;

    //批单号
    private String modificationBillNo;

    //批改日期
    private String mofificationDate;
}
