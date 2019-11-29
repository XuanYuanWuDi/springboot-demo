package com.injured.server.api.enums;

/**
 * 任务状态
 * @author cli
 *
 */
public enum InjuryLossItemEnum {

	TO_PROCESSED(1,"待处理"),
	PROCESSING(2,"处理中"),
	TO_REVIEWED(3,"待审核"),
	REVIEWING(4,"审核中"),
	PROCESSED(5,"处理结束"),
	REVIEWED(6,"审核结束"),
	SURVEYED(7,"查勘结束"),
	;

    private int code;

    private String msg;

    InjuryLossItemEnum(int code,String msg){
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
