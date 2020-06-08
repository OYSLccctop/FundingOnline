package com.ccctop.crowd.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
@ConfigurationProperties(prefix = "short.messages")
public class ShortMessageProperties {
    private String host;
    private String path;
    private String method;
    private String appcode;
    private String sign;
    private String skin;
}
