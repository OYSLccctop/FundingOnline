package com.ccctop.crowd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class  CrowdProjectMain {
    public static void main(String[] args) {
        SpringApplication.run(CrowdProjectMain.class, args);
    }
}
