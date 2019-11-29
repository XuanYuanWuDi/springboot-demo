package com.injured.web.api.handler;

import com.injured.server.api.enums.ResultEnum;
import com.injured.server.api.exception.BusinessException;
import com.injured.server.api.model.response.BaseResponse;
import com.injured.server.api.model.response.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: lzx
 * @Date: 2019/3/7 15:01
 * @Description:
 */
@ControllerAdvice
public class ExceptionHandle {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public BaseResponse handle(Exception e) {
        if (e instanceof BusinessException) {
            BusinessException businessException = (BusinessException) e;
            return ResponseUtil.error(businessException.getErrorCode(),businessException.getErrorMsg());
        }else {
            logger.error("【系统异常】{}", e);
            return ResponseUtil.error(ResultEnum.EXCEPTION.getCode(), "未知错误");
        }
    }
}
