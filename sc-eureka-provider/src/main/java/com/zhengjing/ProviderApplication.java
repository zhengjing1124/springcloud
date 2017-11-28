package com.zhengjing;

import com.zhengjing.common.datasource.DynamicDataSourceRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@EnableConfigServer // 集成config配置文件
@Import({ DynamicDataSourceRegister.class }) //集成druid多数据源
@EnableTransactionManagement //开启事务
@ServletComponentScan //开启自动注解
@EnableDiscoveryClient //向Eureka注册
@SpringBootApplication //声明启动项
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}