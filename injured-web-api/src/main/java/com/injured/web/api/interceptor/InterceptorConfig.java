package com.injured.web.api.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * @author zlu
 * @title: InterceptorConfig
 * @projectName injured
 * @description: 保险公司数据拦截
 * @date 2019/7/2517:45
 */
@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private InterfaceAuthCheckInterceptor interfaceAuthCheckInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //registry.addInterceptor(interfaceAuthCheckInterceptor).addPathPatterns("/api/**");
        //super.addInterceptors(registry);
    }

}
