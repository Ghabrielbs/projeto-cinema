package com.projetocinema.domain.sala;

import java.util.UUID;

public class SalaDeExibicao {
    private UUID idSalaDeExibicao;
    private int numeroDaSala;
    public UUID getIdSalaDeExibicao() {
        return idSalaDeExibicao;
    }

    public void setIdSalaDeExibicao(UUID idSalaDeExibicao) {
        this.idSalaDeExibicao = idSalaDeExibicao;
    }

    public int getNumeroDaSala() {
        return numeroDaSala;
    }

    public void setNumeroDaSala(int numeroDaSala) {
        this.numeroDaSala = numeroDaSala;
    }
}
