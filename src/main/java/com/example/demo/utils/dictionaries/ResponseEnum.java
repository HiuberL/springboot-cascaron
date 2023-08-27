package com.example.demo.utils.dictionaries;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public enum ResponseEnum {
        OK(0, "Respuesta Exitosa", "Respuesta Exitosa", HttpStatus.OK),
        NOTFOUND(100, "No se ha encontrado información relacionada.", "No se ha encontrado información relacionada.",
                        HttpStatus.NOT_FOUND),
        NOPASSVALID(101, "", "Los datos ingresados no pasaron la validación",
                        HttpStatus.BAD_REQUEST),
        BADREQUEST(404, "", "",
                        HttpStatus.BAD_REQUEST),
        NOTCONNECTION(500, "Problemas al conectarse con la base de datos.",
                        "Problemas al conectarse con la base de datos.",
                        HttpStatus.SERVICE_UNAVAILABLE),
        SQLERROR(501, "Esta opción no está disponible por el momento", "",
                        HttpStatus.SERVICE_UNAVAILABLE),
        NOTEXPECT(999, "Problemas en el servicio por el momento", "",
                        HttpStatus.SERVICE_UNAVAILABLE);

        private int codeError;
        private String messageUser;
        private String messageSystem;
        private HttpStatus responsehttp;

        ResponseEnum(int codeError, String messageUser, String messageSystem, HttpStatus responsehttp) {
                this.codeError = codeError;
                this.messageUser = messageUser;
                this.messageSystem = messageSystem;
                this.responsehttp = responsehttp;
        }
}
