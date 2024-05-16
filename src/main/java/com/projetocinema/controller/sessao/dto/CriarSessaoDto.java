package com.projetocinema.controller.sessao.dto;

public class CriarSessaoDto {
    private String id;
    private String idSala;
    private String idFilme;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdSala() {
        return idSala;
    }

    public void setIdSala(String idSala) {
        this.idSala = idSala;
    }

    public String getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(String idFilme) {
        this.idFilme = idFilme;
    }

    public CriarSessaoDto(String id, String idSala, String idFilme){
        this.idFilme = idFilme;
        this.idSala = idSala;
        this.id = id;
    }
}
