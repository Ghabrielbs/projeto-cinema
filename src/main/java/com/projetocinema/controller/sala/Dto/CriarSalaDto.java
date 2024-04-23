package com.projetocinema.controller.sala.Dto;

public class CriarSalaDto {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    private String id;
    private int numero;

    CriarSalaDto(int numero, String id){
        this.numero =numero;
        this.id = id;
    }
}
