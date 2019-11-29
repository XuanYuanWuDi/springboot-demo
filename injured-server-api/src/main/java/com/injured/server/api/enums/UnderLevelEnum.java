package com.injured.server.api.enums;

/**
 * 审核级别
 * @author cli
 *
 */
public enum UnderLevelEnum {

	OEN(1,"一审制"),
	TWO(2,"二审制"),
	;

    private int code;

    private String msg;

    UnderLevelEnum(int code,String msg){
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
