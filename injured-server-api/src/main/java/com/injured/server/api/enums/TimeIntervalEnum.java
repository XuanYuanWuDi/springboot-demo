package com.injured.server.api.enums;

/**
 * 时间段
 * @author cli
 *
 */
public enum TimeIntervalEnum {

	ALL(1,"全部"),
	THREE_DAY(2,"3日内"),
	THREE_SEVEN_DAY(3,"3-7日"),
	SEVEN_DAY(4,"超七日"),
	;

    private int code;

    private String msg;

    TimeIntervalEnum(int code,String msg){
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
