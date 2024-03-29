package com.study.gmall.ums;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * MapperScan解决错误：
   NoSuchBeanDefinitionException: No qualifying bean of type 'com.study.gmall.ums.mapper.AdminLoginLogMapper' available:
 **/
@MapperScan(basePackages = "com.study.gmall.ums.mapper")
@EnableDubbo
@SpringBootApplication
public class GmallUmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUmsApplication.class, args);
    }

}
