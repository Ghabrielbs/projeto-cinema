package com.projetocinema.controller.sala.Dto;

public class CriarSalaDto {
    private String id;
    private int numero;
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


    CriarSalaDto(int numero, String id){
        this.numero =numero;
        this.id = id;
    }
}
