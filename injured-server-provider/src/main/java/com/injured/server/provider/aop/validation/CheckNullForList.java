package com.injured.server.provider.aop.validation;

import com.injured.server.api.annotations.Info;
import com.injured.server.api.annotations.NotNull;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;

/**
 * @author zlu
 * @title: CheckNullForList
 * @projectName injured
 * @description: 校验参数中List<对象>数据类型中是否有空值</>
 * @date 2019/8/2910:15
 */
public class CheckNullForList {


    public static String checkListObjectParamNull(List<?>  list) throws Exception {

        if(list == null){
            return null;
        }

        for (Object paramValue:list) {
            Class<?> clazz = paramValue.getClass();
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                NotNull fieldAnnotation = field.getAnnotation(NotNull.class);
                // 3.1、没有注解或者注解不包含指定分组
                if (Objects.isNull(fieldAnnotation)) {
                    // 不需要校验
                    continue;
                }
                field.setAccessible(true);
                // 3.2、获取属性值
                Object value = field.get(paramValue);
                if (Objects.isNull(value)) {
                    //获取属性名
                    String name = field.getName();
                    return "参数:".concat(name).concat("不能为空");
                }

                if(!Objects.isNull(value) && "".equals(StringUtils.trim(value.toString()))){
                    //获取属性名
                    String name = field.getName();
                    return "参数:".concat(name).concat("不能为空");
                }
            }
        }
        return null;
    }

}
