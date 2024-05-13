package com.projetocinema.enums;

public enum SalaMenssagens {
    ID_INVALIDO("o id já está cadastrado"),
    TABELA_SALA_VAZIA("A TABELA ESTÁ VAZIA."),
    ID_SALA_VAZIO("o id não pode ser vazio"),
    NUMERO_SALA_VAZIO("o numero da sala não pode ser vazio"),
    SALA_NAO_ENCONTRADA("sala não encontrada");

    private String menssagem;

    SalaMenssagens(String menssagem)
    {this.menssagem = menssagem;}

    public String getMenssagem(){
        return menssagem;
    }
}
