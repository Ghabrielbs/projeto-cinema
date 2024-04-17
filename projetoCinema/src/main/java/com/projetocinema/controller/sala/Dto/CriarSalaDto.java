package com.projetocinema.controller.sala.Dto;

public class CriarSalaDto {
    private String id;
    private int numero;

    CriarSalaDto(int numero, String id){
        this.numero =numero;
        this.id = id;
    }
}
