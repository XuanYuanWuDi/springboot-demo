package com.injured.web.api.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.injured.server.api.contract.FastCompensatContract;
import com.injured.server.api.model.request.fast.FastCompensatInfoRequest;
import com.injured.server.api.model.response.BaseResponse;
import org.springframework.web.bind.annotation.*;

import java.net.URLDecoder;

/**
 * @author zlu
 * @title: ApiController
 * @projectName injured
 * @description: 针对保险公司的接口
 * @date 2019/7/2215:06
 */
@RestController
@RequestMapping("/api")
public class ApiController {
    @Reference(timeout = 600000)
    private FastCompensatContract fastCompensatContract;
    @PostMapping("/compensat/fast")
    public BaseResponse fastCompensat(@RequestBody String body)throws Exception{
        body = URLDecoder.decode(body,"UTF-8");
        FastCompensatInfoRequest fastCompensatInfoRequest = JSONObject.parseObject(body,FastCompensatInfoRequest.class);
            return fastCompensatContract.fastCompensat(fastCompensatInfoRequest);
    }
}
