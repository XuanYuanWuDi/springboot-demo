package com.injured.server.api.enums;

/**
 * 
 * 审核任务状态
 * @author cli
 *
 */
public enum TaskStatusEnum {

	TO_PROCESSED(6,"待处理"),
	PROCESSING(7,"处理中"),
	PROCESSED(8,"处理结束"),
	;

    private int code;

    private String msg;

    TaskStatusEnum(int code,String msg){
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
