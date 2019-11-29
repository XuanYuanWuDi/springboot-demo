package com.injured.server.api.enums;

/**
 * 任务状态
 * @author cli
 *
 */
public enum ReviewStatusEnum {

	TO_REVIEWED(1,"待审核"),
	PRIMARY_REVIEWING(2,"初级审核中"),
	PRIMARY_REVIEWED(3,"初级审核完成"),
	UITIMATE_REVIEWING(4,"终极审核中"),
	REVIEWED(5,"审核结束"),
	;

    private int code;

    private String msg;

    ReviewStatusEnum(int code,String msg){
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
