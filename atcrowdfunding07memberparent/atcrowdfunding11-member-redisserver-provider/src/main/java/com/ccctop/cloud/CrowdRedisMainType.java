package com.ccctop.cloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaClient
@SpringBootApplication
public class CrowdRedisMainType {
    public static void main(String[] args) {
        SpringApplication.run(CrowdRedisMainType.class, args);
    }
}
