package com.injured.server.api.model.request.fast;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author zlu
 * @title: TreatDiagnosisInfo
 * @projectName injured
 * @description: 诊疗信息
 * @date 2019/8/110:27
 */
@Getter
@Setter
@ToString
public class TreatDiagnosisInfo implements Serializable {

    //左右
    private String around;

    //损伤部位
    private String damageSite;


    //损伤部位二级
    private String damageSiteSecond;


    //损伤类型
    private String damageType;


    //是否主诊断
    private String primaryDiagnosis;


    //伤情诊断
    private String diagnosisInjury;


    //治疗方式
    private String treatment;


    //手术名称
    private String surgicalName;

}

