package com.projetocinema.application;

import com.projetocinema.controller.sala.Dto.CriarSalaDto;
import com.projetocinema.domain.sala.SalaDeExibicao;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class SalaApplication {
    public SalaDeExibicao criar(CriarSalaDto dto){
        SalaDeExibicao sala = new SalaDeExibicao();

        sala.setIdSalaDeExibicao(UUID.fromString(dto.getId()));
        sala.setNumeroDaSala(dto.getNumero());

        return sala;
    }
}
