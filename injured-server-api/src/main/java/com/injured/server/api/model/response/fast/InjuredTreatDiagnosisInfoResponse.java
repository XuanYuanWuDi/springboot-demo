package com.injured.server.api.model.response.fast;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author zlu
 * @title: InjuredTreatDiagnosisInfoResponse
 * @projectName injured
 * @description: 伤情诊断信息返回数据
 * @date 2019/8/2810:25
 */
@Getter
@Setter
@ToString
public class InjuredTreatDiagnosisInfoResponse implements Serializable {


    /**
     * 是否主诊断 0-否，1-是
     */
    private Integer primaryDiagnosis;

    /**
     * 左右：0未知；1左；2右
     */
    private Byte around;

    /**
     * 损伤部位
     */
    private Integer damageSite;

    /**
     * 损伤部位二级
     */
    private Integer damageSiteSecond;

    /**
     * 损伤类型
     */
    private Integer damageType;

}
