package com.projetocinema.application;

import com.projetocinema.controller.sala.Dto.CriarSalaDto;
import com.projetocinema.domain.sala.SalaDeExibicao;
import org.springframework.stereotype.Component;

@Component
public class SalaApplication {
    public SalaDeExibicao criar(CriarSalaDto dto){
        SalaDeExibicao sala = new SalaDeExibicao();

        sala.setIdSala(dto.getId());
        sala.setNumero(dto.getNumero());

        return sala;
    }
}
