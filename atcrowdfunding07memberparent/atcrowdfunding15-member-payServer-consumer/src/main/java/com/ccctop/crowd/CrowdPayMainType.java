package com.ccctop.crowd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @ClassName CrowdPayMainType
 * @Description TODO
 * @Auther OY
 * @Date 2020/6/6 13:51
 * @Version 1.0
 **/
@EnableFeignClients
@SpringBootApplication
public class CrowdPayMainType {
    public static void main(String[] args) {
        SpringApplication.run(CrowdPayMainType.class, args);
    }
}
