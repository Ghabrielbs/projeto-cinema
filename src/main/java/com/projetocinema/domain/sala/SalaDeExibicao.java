package com.projetocinema.domain.sala;

import org.springframework.stereotype.Component;

@Component
public class SalaDeExibicao {
    private String idSala;
    private int numero;
    public String getIdSala() {
        return idSala;
    }

    public void setIdSala(String idSala) {
        this.idSala = idSala;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
