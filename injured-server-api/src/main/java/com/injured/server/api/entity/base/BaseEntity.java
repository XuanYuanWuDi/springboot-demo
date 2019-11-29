package com.injured.server.api.entity.base;

import com.alibaba.fastjson.JSONObject;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Map;

/**
 * @author zlu
 * @title: BaseDubboPowersRequest
 * @projectName injured
 * @description: TODO
 * @date 2019/7/111:44
 */
@Getter
@Setter
public class BaseEntity implements Serializable {

    //数据权限
    private JSONObject basePowers;

    //保险公司编号
    private String baseCompany;

    /** SQL */
    private String powersScope;
}
