package com.injured.server.api.enums;

/**
 * @author zlu
 * @title: NotifyTaskEnum
 * @projectName injured
 * @description: TODO
 * @date 2019/7/2714:49
 */
public enum NotifyTaskEnum {

    NOTIFY_TASK_STATE_WAIT(0,"未处理"),NOTIFY_TASK_STATE_SUCCESS(1,"已处理");

    private Integer code;
    private String message;

    private NotifyTaskEnum(Integer code, String message){
        this.setCode(code);
        this.setMessage(message);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /*
     * 匹配操作码
     * */
    public static NotifyTaskEnum matchOpCode(Integer codeStatus) {
        for (NotifyTaskEnum opCode : NotifyTaskEnum.values()) {
            if (opCode.getCode().equals(codeStatus)) {
                return opCode;
            }
        }
        return null;
    }
}
