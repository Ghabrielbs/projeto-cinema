package com.projetocinema.enums;

public enum SalaMenssagens {
    TABELA_SALA_VAZIA("A TABELA ESTÁ VAZIA."),
    NUMERO_SALA_VAZIO("o numero da sala não pode ser vazio"),
    SALA_NAO_ENCONTRADA("sala não encontrada");

    private final String menssagem;

    SalaMenssagens(String menssagem){
        this.menssagem = menssagem;
    }

    public String getMenssagem(){
        return menssagem;
    }
}
