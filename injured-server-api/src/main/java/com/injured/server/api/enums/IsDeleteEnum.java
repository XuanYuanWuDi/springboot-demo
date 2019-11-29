package com.injured.server.api.enums;

/**
 * 时间段
 * @author cli
 *
 */
public enum IsDeleteEnum {

	NO(0,"否"),
	YES(1,"是"),
	;

    private int code;

    private String msg;

    IsDeleteEnum(int code,String msg){
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
