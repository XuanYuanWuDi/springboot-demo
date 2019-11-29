package com.injured.server.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.injured.commons.redis.RedisUtil;
import com.injured.commons.string.StringUtils;
import com.injured.server.api.contract.CeDictContract;
import com.injured.server.api.entity.CeDictionaries;
import com.injured.server.api.entity.CeDictionariesTypeExample;
import com.injured.server.api.entity.City;
import com.injured.server.provider.mapper.CeDictionariesMapper;
import com.injured.server.provider.mapper.CityMapper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author zlu
 * @title: CeDictServiceImpl
 * @projectName injured
 * @description: CE字典
 * @date 2019/7/1910:32
 */
@Service(timeout = 60000)
public class CeDictServiceImpl implements CeDictContract {

    private static Logger logger = LogManager.getLogger(CeDictServiceImpl.class);

    private static List<Object> KEYDATA = new ArrayList<>();

    private static List<Object> KEY_CITYDATA = new ArrayList<>();
    
    private static List<Object> KEY_PROVINCE_CITYDATA = new ArrayList<>();

    private static Integer timeout = 3600;

    @Autowired
    private RedisUtil redisUtil;

    private static final String KEY = "CE_DICT_LIST_KEY";
    
    private static final String KEY_CITY = "CE_CITY_LIST_KEY";
    
    private static final String KEY_PROVINCE_CITY = "CE_CITY_LIST_PROVINCE_KEY";

    @Autowired
    private CeDictionariesMapper ceDictionariesMapper;
    
    @Autowired
    private CityMapper cityMapper;

    @Override
    public List<CeDictionaries> selectDictByType(String type) {
        List<CeDictionaries> result = new ArrayList<>();
        if(StringUtils.isEmpty(type)){
            return null;
        }
        if(KEYDATA != null && KEYDATA.size() == 0){
            KEYDATA = redisUtil.lGet(KEY,0,-1);
        }else if(KEYDATA == null){
            KEYDATA = redisUtil.lGet(KEY,0,-1);
        }
        if(KEYDATA != null && KEYDATA.size() >0){
            List<CeDictionaries> allData = (List<CeDictionaries>) KEYDATA.get(0);
            result = allData.stream().filter(dict -> type.equals(dict.getType())).collect(Collectors.toList());
        }else{
            result =  ceDictionariesMapper.selectDictByType(type);
            List<CeDictionaries> all = ceDictionariesMapper.selectAll();
            redisUtil.lSet(KEY,all,timeout);
        }
        return result;
    }

    @Override
    public List<CeDictionaries> selectDictByParentId(Integer parenId) {
        List<CeDictionaries> result = new ArrayList<>();
        if(parenId == null){
            return null;
        }
        if(KEYDATA != null && KEYDATA.size() == 0){
            KEYDATA = redisUtil.lGet(KEY,0,-1);
        }else if(KEYDATA == null){
            KEYDATA= redisUtil.lGet(KEY,0,-1);
        }
        if(KEYDATA != null && KEYDATA.size() >0){
            List<CeDictionaries> allData = (List<CeDictionaries>) KEYDATA.get(0);
            result = allData.stream().filter(dict -> parenId.equals(dict.getParentId())).collect(Collectors.toList());
        }else{
            result =  ceDictionariesMapper.selectDictByParentId(parenId);
            List<CeDictionaries> all = ceDictionariesMapper.selectAll();
            redisUtil.lSet(KEY,all,timeout);
        }
        return result;
    }


    @Override
    public List<CeDictionaries> selectDictIsParent(String type) {
        List<CeDictionaries> result = new ArrayList<>();
        if(StringUtils.isEmpty(type)){
            return null;
        }
        if(KEYDATA != null && KEYDATA.size() == 0){
            KEYDATA = redisUtil.lGet(KEY,0,-1);
        }else if(KEYDATA == null){
            KEYDATA = redisUtil.lGet(KEY,0,-1);
        }
        if(KEYDATA != null && KEYDATA.size() >0){
            List<CeDictionaries> allData = (List<CeDictionaries>) KEYDATA.get(0);
            result = allData.stream().filter(dict -> type.equals(dict.getType())).collect(Collectors.toList());
        }else{
            result =  ceDictionariesMapper.selectDictByType(type);
            List<CeDictionaries> all = ceDictionariesMapper.selectAll();
            redisUtil.lSet(KEY,all,timeout);
        }
        result = result.stream().filter(dict -> dict.getParentId() == null).collect(Collectors.toList());
        return result;
    }

    @Override
    public List<CeDictionaries> findAgencyByPCode(String parentCode) {
        List<CeDictionaries> result = ceDictionariesMapper.selectAgencyByPCode(parentCode);
        return result;
    }

    @Override
    public List<CeDictionaries> selectAll() {
        return ceDictionariesMapper.selectAll();
    }

    @Override
    public List<City> selectCityAll() {
        List<City> result = new ArrayList<>();
        if(KEY_CITYDATA != null && KEY_CITYDATA.size() == 0){
            KEY_CITYDATA = redisUtil.lGet(KEY_CITY,0,-1);
        }else if(KEY_CITYDATA == null){
            KEY_CITYDATA = redisUtil.lGet(KEY_CITY,0,-1);
        }
        if(KEY_CITYDATA != null && KEY_CITYDATA.size() >0){
            result = (List<City>) KEY_CITYDATA.get(0);
        }else{
            result = cityMapper.selectAll();
            redisUtil.lSet(KEY_CITY,result,timeout);
        }
        return result;
    }
    
    @Override
    public List<City> selectProvinceCitys() {
        List<City> result = new ArrayList<>();
        if(KEY_PROVINCE_CITYDATA != null && KEY_PROVINCE_CITYDATA.size() == 0){
        	KEY_PROVINCE_CITYDATA = redisUtil.lGet(KEY_PROVINCE_CITY,0,-1);
        }else if(KEY_PROVINCE_CITYDATA == null){
        	KEY_PROVINCE_CITYDATA = redisUtil.lGet(KEY_PROVINCE_CITY,0,-1);
        }
        if(KEY_PROVINCE_CITYDATA != null && KEY_PROVINCE_CITYDATA.size() >0){
            result = (List<City>) KEY_PROVINCE_CITYDATA.get(0);
        }else{
            result = cityMapper.selectProvinceCitys();
            redisUtil.lSet(KEY_PROVINCE_CITY,result,timeout);
        }
        return result;
    }

    @Override
	public List<City> selectProvinces() {
        return selectCityByPid("0");
	}

	@Override
	public List<City> selectCityByParentId(String parenId) {
        return selectCityByPid(parenId);
	}
	
	private  List<City> selectCityByPid(String parenId){
		List<City> result = new ArrayList<>();
        if(KEY_CITYDATA != null && KEY_CITYDATA.size() == 0){
            KEY_CITYDATA = redisUtil.lGet(KEY_CITY,0,-1);
        }else if(KEY_CITYDATA == null){
            KEY_CITYDATA = redisUtil.lGet(KEY_CITY,0,-1);
        }
        if(KEY_CITYDATA != null && KEY_CITYDATA.size() >0){
            List<City> allData = (List<City>) KEY_CITYDATA.get(0);
            result = allData.stream().filter(city -> parenId.equals(city.getPid())).collect(Collectors.toList());
        }else{
            result =  cityMapper.selectProvince(parenId);
            List<City> all = cityMapper.selectAll();
            redisUtil.lSet(KEY_CITY,all,timeout);
        }
        return result;
	}

    @Override
    public CeDictionaries getDictByTypeAndCode(String dictType,String dictCode){
        CeDictionaries result = null;
        if(StringUtils.isEmpty(dictType) || StringUtils.isEmpty(dictCode) ){
            return null;
        }
        if(KEYDATA != null && KEYDATA.size() == 0){
            KEYDATA = redisUtil.lGet(KEY,0,-1);
        }else if(KEYDATA == null){
            KEYDATA = redisUtil.lGet(KEY,0,-1);
        }
        if(KEYDATA != null && KEYDATA.size() >0){
            List<CeDictionaries> allData = (List<CeDictionaries>) KEYDATA.get(0);
            Optional<CeDictionaries> optional= allData.stream().
                    filter(dict -> dictType.equals(dict.getType()) && dictCode.equals(dict.getCode())).findFirst();
            if(optional.isPresent()) {
            	result = optional.get();
            }
        }else{
            result =  ceDictionariesMapper.getDictByTypeAndCode(dictType,dictCode);
        }
        return result;
    }

    @Override
    public City getCityByCityCode(String cityCode) {
        City result = null;
        if(KEY_CITYDATA != null && KEY_CITYDATA.size() == 0){
            KEY_CITYDATA = redisUtil.lGet(KEY_CITY,0,-1);
        }else if(KEY_CITYDATA == null){
            KEY_CITYDATA = redisUtil.lGet(KEY_CITY,0,-1);
        }
        if(KEY_CITYDATA != null && KEY_CITYDATA.size() >0){
            List<City> allData = (List<City>) KEY_CITYDATA.get(0);
            Optional<City> optional = allData.stream().filter(city -> cityCode.equals(city.getId())).findFirst();
            result = optional.get();
        }else{
            result =  cityMapper.selectByPrimaryKey(cityCode);
        }
        return result;
    }


}
