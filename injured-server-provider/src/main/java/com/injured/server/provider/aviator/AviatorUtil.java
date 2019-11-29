package com.injured.server.provider.aviator;

import com.googlecode.aviator.Expression;
import com.injured.server.api.entity.InjuredCalculationFormula;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zlu
 * @title: AviatorUtil
 * @projectName injured
 * @description: 计算公式执行器
 * @date 2019/7/1514:49
 */
public class AviatorUtil {

    private static Map<Long,Expression> map = new ConcurrentHashMap<>();


    public static void MapPut(Long key,Expression expression){
        map.put(key,expression);
    }
    /**
    　　* @description: 除了精度运算之外其他类型执行
    　　* @param [enums, object]
    　　* @return java.lang.Object
    　　* @throws
    　　* @author LZX
    　　* @date 2019/7/15 15:35
    　　*/
    public static Object executor(InjuredCalculationFormula injuredCalculationFormula, Object object){
        if(injuredCalculationFormula == null || object == null){
            return null;
        }
        Expression expression = map.get(injuredCalculationFormula.getId());
        if(expression == null){
            return null;
        }
        Map<String,Object> param = new HashMap<>();
        param.put("entity",object);
        return expression.execute(param);
    }


    /**
     　　* @description: 关于是否的运算
     　　* @param [enums, object]
     　　* @return java.math.BigDecimal
     　　* @throws
     　　* @author LZX
     　　* @date 2019/7/15 15:35
     　　*/
    public static Boolean executorBoolean(InjuredCalculationFormula injuredCalculationFormula,Object object){
        Object obj =executor(injuredCalculationFormula,object);
        if(obj != null) {
            Boolean result = (Boolean) obj;
            return result;
        }
        return null;
    }

    /**
    　　* @description: 关于钱的精度运算,保留两位小数
    　　* @param [enums, object]
    　　* @return java.math.BigDecimal
    　　* @throws
    　　* @author LZX
    　　* @date 2019/7/15 15:35
    　　*/
    public static BigDecimal executorBigDecimal(InjuredCalculationFormula injuredCalculationFormula,Object object){
        Object obj =executor(injuredCalculationFormula,object);
        if(obj != null) {
            BigDecimal result = (BigDecimal) obj;
            return result.setScale(2,BigDecimal.ROUND_HALF_UP);
        }
        return null;
    }
}
