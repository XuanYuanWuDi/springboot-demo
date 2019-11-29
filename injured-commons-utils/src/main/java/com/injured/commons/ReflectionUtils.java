package com.injured.commons;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/**
 * @author zlu
 * @title: ReflectionUtils
 * @projectName injured
 * @description: 反射工具类
 * @date 2019/7/249:29
 */
public class ReflectionUtils {

    /**
     * 用于对类的字段赋值，无视private,project修饰符,无视set/get方法
     * 目前只处理三种情况
     * 1.直接对对象里的对象进行赋值
     * 2.递归循环对多级对象进行赋值,用_分隔,前面对象级别首字母大写,属性首字母小写
     * 3.对对象中List集合类型的对象赋值,用-分隔,前面对象级别首字母大写,属性首字母小写
     * @param args 类的字段名和值 每个字段名和值用英文逗号隔开
     * @return
     */
    @SuppressWarnings("unchecked")
    public static Object setPrivateParam(Object object, Map<String,Object> args) {
        try {
            Class<?> obj = object.getClass();
            Field[] fields = obj.getDeclaredFields();
            for(String key:args.keySet()){
                if(!key.contains("_")) {
                     for (Field field:fields) {
                         if (field.getName().equals(key)) {
                             field.setAccessible(true);
                             field.set(object, args.get(key));
                             break;
                         }
                     }
                }else if(key.contains("_")){
                     String [] keys = key.split("_");
                     int x = 0;
                     Object childObject = object;
                     while(x != keys.length -1){
                         childObject = multistageGetPrivateParam(keys[x],childObject);
                         x++;
                     }

                     if(childObject != object){
                         Class<?> clazz = childObject.getClass();
                         Field[] clazzFields = clazz.getDeclaredFields();
                         for (Field field:clazzFields) {
                             if (field.getName().equals(keys[x])) {
                                 field.setAccessible(true);
                                 field.set(childObject,args.get(key));
                                 break;
                             }
                         }
                     }

                }
            }
            return object;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    //多级递归寻找属性
    private static Object multistageGetPrivateParam(String key,Object childObject) throws Exception {
        Class<?> clazz = childObject.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field:fields) {
            if (field.getName().equalsIgnoreCase(key)) {
                return getGetMethod(childObject,key);
            }
        }
        return null;
    }


    /**
     * 根据属性，获取get方法
     * @param ob 对象
     * @param name 属性名
     * @return
     * @throws Exception
     */
    public static Object getGetMethod(Object ob,String name)throws Exception{
        Method[] m = ob.getClass().getMethods();
        for(int i = 0;i < m.length;i++){
            if(("get"+name).toLowerCase().equals(m[i].getName().toLowerCase())){
                return m[i].invoke(ob);
            }
        }
        return null;
    }


    /**
     * 根据属性，获取get方法
     * @param ob 对象
     * @param name 属性名
     * @return
     * @throws Exception
     */
    public static Object getObjectParam(Object ob,String name)throws Exception{
         String [] names = name.split("_");
         int x = 0;
         while(x != names.length -1){
             ob = getGetMethod(ob,names[x]);
             x++;
         }
        return getGetMethod(ob,names[x]);
    }
}
