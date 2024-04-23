package com.projetocinema.application;

import com.projetocinema.controller.sala.Dto.CriarSalaDto;
import com.projetocinema.domain.sala.SalaDeExibicao;

import java.util.UUID;

public class SalaDeExibicaoApplication {
    public SalaDeExibicao criarSala(CriarSalaDto dto){
        SalaDeExibicao salaDeExibicao = new SalaDeExibicao();

        salaDeExibicao.setIdSalaDeExibicao(UUID.fromString(dto.getId()));
        salaDeExibicao.setNumeroDaSala(dto.getNumero());
        return salaDeExibicao;
    }
}
