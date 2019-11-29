package com.injured.server.api.exception;

import com.injured.server.api.enums.ResultEnum;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author zlu
 * @title: BusinessException
 * @projectName injured
 * @description: 自定义业务异常
 * @date 2019/7/2613:23
 */
@ToString
public class BusinessException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private String errorCode;

    private String errorMsg;

    public BusinessException(){}

    public BusinessException(ResultEnum resultEnum){
        this.errorCode = resultEnum.getCode();
        this.errorMsg = resultEnum.getMsg();
    }

    public BusinessException(String code,String message){
        this.errorCode = code;
        this.errorMsg = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
