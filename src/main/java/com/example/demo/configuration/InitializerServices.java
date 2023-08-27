package com.example.demo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.utils.LogUtils;

import jakarta.annotation.PostConstruct;

@Component
public class InitializerServices {

    @Autowired
    ApplicationConfigs applicationConfigs;

    @Autowired
    LogUtils logs;

    @PostConstruct
    private void init() {
        logs.info("Cargando Trustore");
        System.setProperty("javax.net.ssl.trustStore", applicationConfigs.getTruststore().getPath());
		System.setProperty("javax.net.ssl.trustStorePassword", applicationConfigs.getTruststore().getPassword() );
		System.setProperty("javax.net.ssl.trustStoreType", applicationConfigs.getTruststore().getType());       
        logs.info("Carga Correcta");

    }
}
