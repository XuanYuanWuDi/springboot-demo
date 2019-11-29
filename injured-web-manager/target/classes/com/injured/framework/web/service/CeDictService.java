package com.injured.framework.web.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.injured.common.utils.StringUtils;
import com.injured.server.api.contract.CeDictContract;
import com.injured.server.api.entity.CeDictionaries;
import com.injured.server.api.entity.City;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zlu
 * @title: CeDictService
 * @projectName injured
 * @description: CE字典初始化
 * @date 2019/7/1910:29
 */
@Service("ce_dict")
public class CeDictService {

    @Reference(timeout = 60000)
    private CeDictContract ceDictContract;


    public List<CeDictionaries> getType(String dictType)
    {
        return ceDictContract.selectDictByType(dictType);
    }

    public List<CeDictionaries> getParents(String dictType)
    {
        return ceDictContract.selectDictIsParent(dictType);
    }

    public List<CeDictionaries> getChild(Integer id)
    {
        return ceDictContract.selectDictByParentId(id);
    }

    public CeDictionaries getDictByTypeAndCode(String dictType,String dictCode){
        return ceDictContract.getDictByTypeAndCode(dictType,dictCode);
    }
    
    public String getDictNameByTypeAndCode(String dictType,String dictCode){
        if(StringUtils.isBlank(dictCode) || StringUtils.isBlank(dictType)){
            return "";
        }
        CeDictionaries ceDictionaries = getDictByTypeAndCode(dictType,dictCode);
        if(ceDictionaries != null) {
        	return ceDictionaries.getName();
        }
		return "";
    }

    public City getCityByCityCode(String cityCode){
        City city = ceDictContract.getCityByCityCode(cityCode);
        if(city == null){
            return new City();
        }
        return city;
    }
}
