package com.ccctop.cloud;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

// 扫描Mybatis的Mapper接口所在的包
@MapperScan("com.ccctop.cloud.mapper")
@SpringBootApplication
@EnableEurekaClient
public class CrowdMysqlProviderMainType {
    public static void main(String[] args) {
        SpringApplication.run(CrowdMysqlProviderMainType.class, args);
    }
}
