package com.projetocinema.service.sala;

import com.projetocinema.controller.sala.Dto.CriarSalaDto;
import com.projetocinema.controller.sala.SalaController;
import com.projetocinema.domain.sala.SalaDeExibicao;

public class SalaService {
    public SalaDeExibicao listarSala(CriarSalaDto dto){
        return listarSala(dto);
    }

    public SalaDeExibicao buscar(CriarSalaDto dto) {
        return buscar(dto);
    }

    public SalaDeExibicao criar(CriarSalaDto dto) {
        return criar(dto);
    }
}
