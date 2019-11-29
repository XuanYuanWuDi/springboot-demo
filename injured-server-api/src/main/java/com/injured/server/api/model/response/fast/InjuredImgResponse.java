package com.injured.server.api.model.response.fast;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author zlu
 * @title: InjuredImgResponse
 * @projectName injured
 * @description: 照片信息返回数据
 * @date 2019/8/2810:27
 */
@Getter
@Setter
@ToString
public class InjuredImgResponse implements Serializable {


    /**
     * 图片地址
     */
    private String imgUrl;

    /**
     * 1医院名称 2科室名称 3伤者全貌 4受伤部位 5发票原件 6费用清单 7病历资料 8伤者证件 9检查资料 10误工资料 11法医报告 12其他资料
     */
    private Integer imgType;

    /**
     * 上传人姓名
     */
    private String uploadName;

    /**
     * 上传人工号
     */
    private String uploadNumber;
}
