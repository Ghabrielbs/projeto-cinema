package com.projetocinema.application;

import com.projetocinema.controller.sala.Dto.CriarSalaDto;
import com.projetocinema.domain.sala.SalaDeExibicao;

import java.util.UUID;

public class SalaDeExibicaoApplication {
    public SalaDeExibicao criarSala(CriarSalaDto dto){
        SalaDeExibicao sala = new SalaDeExibicao();

        sala.setIdSalaDeExibicao(UUID.fromString(dto.getId()));
        sala.setNumeroDaSala(dto.getNumero());
            return sala;
    }
}
