package com.ccctop.crowd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CrowdOrderMain {
    public static void main(String[] args) {
        SpringApplication.run(CrowdOrderMain.class, args);
    }
}
