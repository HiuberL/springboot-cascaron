package com.example.demo.utils;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
public class LogUtils {
    public static final Logger LOGGER = LoggerFactory.getLogger(LogUtils.class);

    public void info(String message){
        LOGGER.info(message);
    }
    public void warn(String message){
        LOGGER.warn(message);
    }
    public void debug(String message){
        LOGGER.debug(message);
    }
    public void trace(String message){
        LOGGER.trace(message);
    }
    public void error(String message){
        LOGGER.error(message);
    }
    public void error(String message,Throwable t){
        LOGGER.error(message,t);
    }    
}
