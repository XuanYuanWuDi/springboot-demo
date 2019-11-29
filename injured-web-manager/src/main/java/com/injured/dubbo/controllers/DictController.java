package com.injured.dubbo.controllers;

import com.alibaba.dubbo.config.annotation.Reference;
import com.injured.project.system.user.domain.User;
import com.injured.server.api.contract.CeDictContract;
import com.injured.server.api.entity.CeDictionaries;
import com.injured.server.api.entity.CompanyAgency;
import com.injured.server.api.model.response.BaseResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author zlu
 * @title: DictController
 * @projectName injured
 * @description: CE字典
 * @date 2019/8/514:44
 */
@Controller
@RequestMapping("/cedict")
public class DictController {

    @Reference
    private CeDictContract ceDictContract;


    /**
     * 根据父id查询机构列表
     * @return
     */
    @GetMapping("/findAgencyByParentId")
    @ResponseBody
    public List<CeDictionaries> findAgencyByPCode(Integer parentId){
        List<CeDictionaries> dicts= ceDictContract.
                selectDictByParentId(parentId);
        return dicts;
    }
}
