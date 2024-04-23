package com.projetocinema.domain.filme;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

public class Filme {
    private UUID idFilme;
    public String nomeFilme;
    private String descricaoFilme;

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getDescricaoFilme() {
        return descricaoFilme;
    }

    public void setDescricaoFilme(String descricaoFilme) {
        this.descricaoFilme = descricaoFilme;
    }

    public void setIdFilme(UUID uuid) {
    }

    public UUID getIdFilme() {
        return idFilme;
    }
}
