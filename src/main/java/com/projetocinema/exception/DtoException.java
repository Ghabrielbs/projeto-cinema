package com.projetocinema.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class DtoException {
    private final String menssagem;
    private final HttpStatus httpStatus;
    private final ZonedDateTime timestamp;

    public DtoException(String menssagem, HttpStatus httpStatus, ZonedDateTime timestamp) {
        this.menssagem = menssagem;
        this.httpStatus = httpStatus;
        this.timestamp = timestamp;
    }

    public String getMenssagem(){
        return menssagem;
    }

    public HttpStatus getHttpStatus(){
        return httpStatus;
    }

    public ZonedDateTime getTimestamp(){
        return timestamp;
    }

}
