package com.injured.server.api.model.request.fast;

import com.injured.server.api.annotations.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zlu
 * @title: Driver
 * @projectName injured
 * @description: 驾驶员
 * @date 2019/7/2211:30
 */
@Getter
@Setter
@ToString
public class Driver implements Serializable {

    //驾驶员姓名
    @NotNull(groups = { "fastInfo" })
    private String name;

    //驾驶证号码
    private String driverLicenseNo;

    //驾照类型
    @NotNull(groups = { "fastInfo" })
    private String driverAllowedVehicleType;

    //是否酒后驾车
    @NotNull(groups = { "fastInfo" })
    private Byte isDrinkingDriving;

    //驾驶员出生日期
    private Date driverBirth;

    //证件类型
    private String identifyType;

    //身份证号码
    private String identifyNumber;

    //驾驶员性别
    private String driverSex;

    //驾驶员年龄
    private Integer driverAge;

    //驾驶员手机号
    @NotNull(groups = { "fastInfo" })
    private String driverPhone;

}
