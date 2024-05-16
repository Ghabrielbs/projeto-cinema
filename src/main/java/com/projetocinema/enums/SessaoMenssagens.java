package com.projetocinema.enums;

public enum SessaoMenssagens {
    TABELA_SESSAO_VAZIA("nenhuma sessão cadastrada"),
    ID_SESSAO_INVALIDO("O ID INFORMADO JÁ FOI CADASTRADO"),
    ID_SESSAO_VAZIO("O ID NÃO PODE SER VAZIO"),
    ID_SESSAO_FILME_INVALIDO("O ID DO FILME NÃO FOI ENCONTRADO"),
    SESSAO_NAO_ENCONTRADA("Sessão não encontrada");

    private final String menssagem;

    SessaoMenssagens(String menssagem){

        this.menssagem = menssagem;
    }
    public String getMenssagem(){

        return menssagem;
    }
}
