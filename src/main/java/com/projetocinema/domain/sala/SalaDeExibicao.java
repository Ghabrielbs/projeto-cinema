package com.projetocinema.domain.sala;

import java.util.UUID;

public class SalaDeExibicao {
    private UUID idSala;
    private int numero;
    public UUID getIdSalaDeExibicao() {
        return idSala;
    }

    public void setIdSalaDeExibicao(UUID idSalaDeExibicao) {
        this.idSala = idSala;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumeroDaSala(int numero) {
        this.numero = numero;
    }
}
