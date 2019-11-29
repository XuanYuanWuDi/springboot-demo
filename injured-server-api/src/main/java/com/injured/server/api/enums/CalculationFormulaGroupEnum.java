package com.injured.server.api.enums;

/**
 * @author zlu
 * @title: CalculationFormulaGroupEnum
 * @projectName injured
 * @description: 计算公式分组公式类型枚举
 * @date 2019/7/309:52
 */
public enum CalculationFormulaGroupEnum {

    ACCUMULATE(1,"结果累加"),WHETHER_TO_JUDGE(2,"是否判断"),SUBSTITUTING_ACCUMULATE(3,"代入累加"),
    SUBSTITUTING_ADD(4,"代入加");

    private int code;

    private String msg;

    CalculationFormulaGroupEnum(int code,String msg){
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

    public static String getMsg(int code) {
        for (HumanTypeEnum enums : HumanTypeEnum.values()) {
            if (enums.getCode() == code) {
                return enums.getMsg();
            }
        }
        return null;
    }
}
