package com.injured.server.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.injured.server.provider.db.aop.DynamicDataSourceAnnotationAdvisor;
import com.injured.server.provider.db.aop.DynamicDataSourceAnnotationInterceptor;
import com.injured.server.provider.db.register.DynamicDataSourceRegister;
import com.injured.server.provider.listener.AviatorFormulaListener;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableDubbo
@Import(DynamicDataSourceRegister.class)
@MapperScan(basePackages = "com.injured.server.provider.mapper")
@SpringBootApplication(scanBasePackages = "com.injured.*")
@EnableTransactionManagement
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class InjuredServerProviderApplication {

    @Bean
    public DynamicDataSourceAnnotationAdvisor dynamicDatasourceAnnotationAdvisor() {
        return new DynamicDataSourceAnnotationAdvisor(new DynamicDataSourceAnnotationInterceptor());
    }

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(InjuredServerProviderApplication.class);
        springApplication.addListeners(new AviatorFormulaListener());
        springApplication.run(args);
    }

}
