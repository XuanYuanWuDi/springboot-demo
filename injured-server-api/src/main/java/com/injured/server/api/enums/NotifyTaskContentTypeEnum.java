package com.injured.server.api.enums;

/**
 * @author zlu
 * @title: NotifyTaskContentTypeEnum
 * @projectName injured
 * @description: TODO
 * @date 2019/7/2714:54
 */
public enum NotifyTaskContentTypeEnum {
    TEXT("0","文本格式"),
    JSON("1","json格式"),
    XML("2","xml格式");

    private String code;
    private String message;

    private NotifyTaskContentTypeEnum(String code, String message){
        this.setCode(code);
        this.setMessage(message);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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
    public static NotifyTaskContentTypeEnum matchOpCode(String codeStatus) {
        for (NotifyTaskContentTypeEnum opCode : NotifyTaskContentTypeEnum.values()) {
            if (opCode.getCode().equals(codeStatus)) {
                return opCode;
            }
        }
        return null;
    }
}