package com.projetocinema.exception;

import org.springframework.http.HttpStatus;

public class RequisicaoApiExpetion extends RuntimeException{
    private HttpStatus httpStatus;

    public RequisicaoApiExpetion(String menssagem){
    super(menssagem);
    this.httpStatus = httpStatus.BAD_REQUEST;
    }
    public RequisicaoApiExpetion(String menssagem, HttpStatus httpStatus){
    super(menssagem);
    this.httpStatus = httpStatus;
    }

    public RequisicaoApiExpetion(String menssagem, Throwable causa){
    super(menssagem, causa);
    }

    public HttpStatus getHttpStatus(){
        return httpStatus;
    }
}
