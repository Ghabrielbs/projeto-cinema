package com.projetocinema.controller.sessao.Dto;

public class CriarSessaoDto {
    private String id;
    private int idSala;
    private String idFilme;

    CriarSessaoDto(String id, int idSala, String idFilme){
        this.idFilme = idFilme;
        this.idSala = idSala;
        this.id = id;
    }
}
