package com.projetocinema.domain.sessao;

import java.util.UUID;

public class Sessao {
    private UUID id;
    private String idSala;
    public String idFilme;
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = String.valueOf(idSala);
    }

    public String getnomeDoFilme(String nomeDoFilme) {
        return nomeDoFilme;
    }

    public void setIdFilme(String idFilme) {
        this.idFilme = idFilme;
    }
}
