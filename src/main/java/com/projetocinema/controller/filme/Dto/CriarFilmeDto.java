package com.projetocinema.controller.filme.Dto;

public class CriarFilmeDto {
    private String id;
    private String nome;
    private String descricao;

    public CriarFilmeDto(String id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }
}
