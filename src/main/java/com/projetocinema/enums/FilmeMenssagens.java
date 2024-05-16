package com.projetocinema.enums;

public enum FilmeMenssagens {

    ID_INVALIDO("ID já cadastrado na tabela"),
    TABELA_VAZIA("A TABELA ESTÁ VAZIA."),
    FILME_NAO_ENCONTRADO("ID Não encontrado."),
    NOME_DO_FILME_VAZIO("o nome do filme não pode ser vazio");

    private final String menssagem;
    FilmeMenssagens(String menssagem){

        this.menssagem = menssagem;
    }
    public String getmenssagem(){

        return menssagem;
    }
}
