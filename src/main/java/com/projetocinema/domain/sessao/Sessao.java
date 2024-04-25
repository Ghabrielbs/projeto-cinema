package com.projetocinema.domain.sessao;

import java.util.UUID;

public class Sessao {
    private UUID idSessao;
    private int numeroDaSala;
    public String nomeDoFilme;
    public UUID getIdSessao() {
        return idSessao;
    }

    public void setIdSessao(UUID idSessao) {
        this.idSessao = idSessao;
    }

    public int getNumeroDaSala() {
        return numeroDaSala;
    }

    public void setNumeroDaSala(int numeroDaSala) {
        this.numeroDaSala = numeroDaSala;
    }

    public String getnomeDoFilme(String nomeDoFilme) {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }
}
