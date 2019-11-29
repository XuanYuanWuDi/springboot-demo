package com.injured.server.api.model.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Auther: lzx
 * @Date: 2019/3/7 15:06
 * @Description: 返回对象父类
 */
@Getter
@Setter
@ToString
public class BaseResponse implements Serializable {

    /**
     * 返回代码
     */
    private String code;

    /**
     * 返回信息
     */
    private String msg;

    /**
     * 返回的数据
     */
    private Object data;

    /**
     * 返回的时间（yyyy-MM-dd HH:mm:ss:SSS）
     */
    private String time;

}
