package com.injured.web.api;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, DruidDataSourceAutoConfigure.class},
		scanBasePackages = {"com.injured.web.api.*","com.injured.commons.*"})
public class InjuredWebApiApplication {

	@Bean
	public MultipartResolver multipartResolver() {
		CommonsMultipartResolver resolver=new CommonsMultipartResolver();
        resolver.setDefaultEncoding("utf-8");
		resolver.setMaxInMemorySize(1048576);
		resolver.setMaxUploadSize(20971520);
		return resolver;
	}

	public static void main(String[] args) {
		SpringApplication.run(InjuredWebApiApplication.class, args);
	}

}
