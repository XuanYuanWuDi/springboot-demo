package com.injured.server.api.enums;

/**
 * @author zlu
 * @title: SendDoctorTypeEnum
 * @projectName injured
 * @description: 就诊类型
 * @date 2019/8/1315:57
 */
public enum SendDoctorTypeEnum {

    UNTREATED_RENEWAL_FEE(1,"未治疗"),RENEWAL_FEE(2,"门急诊治疗"),HOSPITALIZATION(3,"住院治疗");


    private int code;

    private String msg;

    SendDoctorTypeEnum(int code,String msg){
        this.code = code;
        this.msg = msg;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
