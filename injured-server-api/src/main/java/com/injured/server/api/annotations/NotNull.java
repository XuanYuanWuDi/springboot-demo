package com.injured.server.api.annotations;


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 设置在不同目标上面有着不同的作用<br>
 * 字段：说明该字段需要校验非空<br>
 * @author lzx
 * @date 2019年7月30日
 */
@Documented
@Retention(RUNTIME)
@Target({ FIELD })
public @interface NotNull {

    /**
     * 作用于字段上，表面当前注解对哪一些组有效
     */
    String[] groups();

    public boolean havingChild () default false;

}
