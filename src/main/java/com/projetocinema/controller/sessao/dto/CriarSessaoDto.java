package com.projetocinema.controller.sessao.dto;

public class CriarSessaoDto {
    private String id;
    private int idSala;
    private String idFilme;

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public String getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(String idFilme) {
        this.idFilme = idFilme;
    }

    CriarSessaoDto(String id, int idSala, String idFilme){
        this.idFilme = idFilme;
        this.idSala = idSala;
        this.id = id;
    }
}
