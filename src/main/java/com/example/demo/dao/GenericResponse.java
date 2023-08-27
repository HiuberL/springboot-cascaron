package com.example.demo.dao;

import org.springframework.http.HttpStatus;

import com.example.demo.utils.dictionaries.ResponseEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GenericResponse<T> {
    private Integer codeError;
    private String messageSystem;
    private String messageUser;
    private T response;
    @JsonIgnore
    private HttpStatus httpCode;

    public GenericResponse(ResponseEnum responses) {
        this.codeError = responses.getCodeError();
        this.messageSystem = responses.getMessageSystem();
        this.messageUser = responses.getMessageUser();
        this.httpCode = responses.getResponsehttp();
    }

    public void initValues(ResponseEnum responses) {
        this.codeError = responses.getCodeError();
        this.messageSystem = responses.getMessageSystem();
        this.messageUser = responses.getMessageUser();
        this.httpCode = responses.getResponsehttp();
    }
}
