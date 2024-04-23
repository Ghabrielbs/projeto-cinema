package com.projetocinema.domain.filme;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

public class Filme {
    private UUID idFilme;
    public String nome;
    private String descricao;

    public String getNomeFilme() {
        return nome;
    }

    public void setNomeFilme(String nome) {
        this.nome = nome;
    }

    public String getDescricaoFilme() {
        return descricao;
    }

    public void setDescricaoFilme(String descricao) {
        this.descricao = descricao;
    }

    public void setIdFilme(UUID uuid) {
    }

    public UUID getIdFilme() {
        return idFilme;
    }
}
