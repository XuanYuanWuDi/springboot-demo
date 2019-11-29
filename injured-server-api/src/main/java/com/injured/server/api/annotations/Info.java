package com.injured.server.api.annotations;


import java.util.Objects;

/**
 * @author zlu
 * @title: Info
 * @projectName injured
 * @description: TODO
 * @date 2019/7/3014:35
 */
public class Info {

    /** 类名 */
    private String className;

    /** 方法名 */
    private String methodName;

    /** 参数名 */
    private String paramName;

    /** 属性名 */
    private String fieldName;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if (Objects.nonNull(fieldName)) {
            builder.append("属性").append(fieldName).append("为空");
        }
        return builder.toString();
    }
}
