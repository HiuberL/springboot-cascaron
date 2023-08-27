package com.example.demo.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ConfigurationProperties(prefix = "demo")
public class ApplicationConfigs {
    private TrustStore truststore;

    @Getter
    @Setter 
    public static class TrustStore{
        private String path;
        private String type;
        private String password;
    }
    
}
