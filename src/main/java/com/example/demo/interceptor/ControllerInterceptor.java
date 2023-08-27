package com.example.demo.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.dao.GenericResponse;
import com.example.demo.utils.LogUtils;
import com.example.demo.utils.dictionaries.ResponseEnum;

@ControllerAdvice
public class ControllerInterceptor extends ResponseEntityExceptionHandler {
    @Autowired
    LogUtils logs;

    @ExceptionHandler(Exception.class)
    public ResponseEntity<GenericResponse<String>> handleNotExpect(Exception ex) {
        GenericResponse<String> response = new GenericResponse<>(ResponseEnum.NOTEXPECT);
        return new ResponseEntity<>(response, response.getHttpCode());
    }    
}
