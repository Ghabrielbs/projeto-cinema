package com.projetocinema.domain.sessao;

import java.util.UUID;

public class Sessao {
    private String id;
    private String idSala;
    public String idFilme;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = String.valueOf(idSala);
    }

    public String getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(String idFilme) {
        this.idFilme = idFilme;
    }
}
