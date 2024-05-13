package com.projetocinema.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler(value = {RequisicaoApiExpetion.class})
    public ResponseEntity<Object> handleApiRequestException(RequisicaoApiExpetion e){
        DtoException dtoException = new DtoException(
                e.getMessage(),
                e.getHttpStatus(),
                ZonedDateTime.now(ZoneId.of("Z")));

        return new ResponseEntity<Object>(dtoException,e.getHttpStatus());

    }
}

