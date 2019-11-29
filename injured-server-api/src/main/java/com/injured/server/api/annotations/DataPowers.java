package com.injured.server.api.annotations;


import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataPowers {

    /**
     * 表的别名
     */
    public String tableAlias() default "";

    //机构
    public String region() default  "";

    //额度
    public String quota() default "";
}
