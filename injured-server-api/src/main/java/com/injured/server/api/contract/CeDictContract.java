package com.injured.server.api.contract;

import com.injured.server.api.entity.CeDictionaries;
import com.injured.server.api.entity.City;

import java.util.List;

/**
 * @author zlu
 * @title: CeDictContract
 * @projectName injured
 * @description: CE字典
 * @date 2019/7/1910:30
 */
public interface CeDictContract {

    List<CeDictionaries> selectDictByType(String type);

    List<CeDictionaries> selectDictByParentId(Integer parenId);

    List<CeDictionaries> selectAll();

    List<City> selectCityAll();

    List<City> selectProvinces();
    
    List<City> selectProvinceCitys();

    List<City> selectCityByParentId(String parenId);

    List<CeDictionaries> selectDictIsParent(String dictType);

    List<CeDictionaries> findAgencyByPCode(String parentCode);

    public CeDictionaries getDictByTypeAndCode(String dictType,String dictCode);

    City getCityByCityCode(String cityCode);
}
