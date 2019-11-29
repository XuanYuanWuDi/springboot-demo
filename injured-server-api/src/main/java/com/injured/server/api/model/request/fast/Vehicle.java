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
 * @title: Vehicle
 * @projectName injured
 * @description: 车辆信息
 * @date 2019/7/2213:56
 */
@Getter
@Setter
@ToString
public class Vehicle implements Serializable {

    //核定载客数量
    @NotNull(groups = { "fastInfo" })
    private Integer seatCount;

    //车辆品牌名称
    @NotNull(groups = { "fastInfo" })
    private String brand;

    //发动机号
    @NotNull(groups = { "fastInfo" })
    private String engineNumber;

    //被保险人
    @NotNull(groups = { "fastInfo" })
    private String insuredName;

    //行驶公里数
    private String mileage;

    //车辆型号Code
    @NotNull(groups = { "fastInfo" })
    private String modelCode;

    //车辆型号Name
    @NotNull(groups = { "fastInfo" })
    private String modelName;

    //新车购置价格
    private BigDecimal newCarAmount;

    //车主
    @NotNull(groups = { "fastInfo" })
    private String owner;

    //车牌号
    @NotNull(groups = { "fastInfo" })
    private String licensePlate;

    //车牌种类
    @NotNull(groups = { "fastInfo" })
    private String licensePlateType;

    //号牌底色
    @NotNull(groups = { "fastInfo" })
    private String licensePlateColor;

    //使用性质
    @NotNull(groups = { "fastInfo" })
    private String typeOfUsage;

    //车辆种类
    @NotNull(groups = { "fastInfo" })
    private String vehicleType;

    //VIN码
    @NotNull(groups = { "fastInfo" })
    private String vin;

    //是否按揭
    private String isMortgage;

    //是否电销
    private String isTelemarketing;

    //是否包含人伤
    private String isPersonInjured;

    //是否包含物损
    private String isProtectLoss;


    //承保分公司名称
    @NotNull(groups = { "fastInfo" })
    private String subCompanyName;

    //是否需施救
    private String isRescue;

    //是否需拆解
    private String isDisassemble;

}
