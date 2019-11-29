package com.injured.server.api.enums;

/**
 * 返回结果枚举
 */
public enum ResultEnum {

    //系统相关
    SUCCESS("0000","成功"),FAILED("0001","请求失败"),EXCEPTION("0002","系统异常"),
    NULL("0003","必要信息查询为空"),PARAM_NULL("0004","请求参数必填项不能为空"),


    //保险公司接口验证相关
    TOKEN_IS_NULL("1000","请求TOKEN获取为空"),AUTH_ID_IS_NULL("1001","请求AUTH_ID获取为空"),
    COMPANY_IS_NULL("1002","获取保险公司信息失败"),TOEKN_CHECK_ERROR("1003","TOKEN校验失败"),
    TASK_NO_IS_EXSIT("1004","任务已存在"),

    //系统处理业务节点相关
    INSERT_TALBLE_ERROR("2000","系统繁忙"),UPDATE_TABLES_ERROR("2001","更新失败")
    ,REVIEW_STATUS_NOT_PERMISSION("2002","任务已经入终审环节,用户无权限")
    ,REVIEW_STATUS_ERROR("2003","任务已结束,不可重复提交"),

    //文件传输相关
    FILE_UPLOAD_ERROR("3000","文件上传失败"),FILE_INSERT_ERROR("3001","文件保存失败"),

    //改派
    USER_IS_NOT_PERMISSION("4000","用户无权限"),USER_STATUS_IS_LOCK("4001","你的账号已锁定，请联系管理员！");

    private String code;

    private String msg;

    ResultEnum(String code,String msg){
         this.code = code;
         this.msg = msg;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
