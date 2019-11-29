package com.injured.server.api.enums;

/**
 * @author zlu
 * @title: IncomeStatusEnum
 * @projectName injured
 * @description: 收入情况
 * @date 2019/8/1316:01
 */
public enum IncomeStatusEnum {

    FIXED_INCOME_FEE(1,"固定收入"),NO_FIXED_INCOME_FEE(2,"无固定收入"),
    NO_INCOME_FEE(3,"无收入");


    private int code;

    private String msg;

    IncomeStatusEnum(int code,String msg){
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
