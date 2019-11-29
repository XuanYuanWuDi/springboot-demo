package com.injured.web.api.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.injured.server.api.contract.CompanyAgencyContract;
import com.injured.server.api.contract.DemoContract;
import com.injured.server.api.entity.CompanyAgency;
import com.injured.server.api.model.query.DemoQuery;
import com.injured.server.api.model.response.BaseResponse;
import com.injured.server.api.model.response.ResponseUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: lzx
 * @Date: 2019/3/6 18:33
 * @Description:
 */
@RestController
public class UserController {

    @Reference(timeout = 60000)
    private CompanyAgencyContract companyAgencyContract;

    @GetMapping("/node")
    public BaseResponse getUser(CompanyAgency companyAgency){
          List<CompanyAgency> result = companyAgencyContract.findChildNode(companyAgency);
          return ResponseUtil.success(result);
    }
}
