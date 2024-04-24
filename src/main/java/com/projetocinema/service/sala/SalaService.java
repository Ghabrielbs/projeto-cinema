package com.projetocinema.service.sala;

import com.projetocinema.controller.sala.Dto.CriarSalaDto;
import com.projetocinema.controller.sala.SalaController;
import com.projetocinema.domain.sala.SalaDeExibicao;
import org.springframework.stereotype.Service;

@Service
public class SalaService {
    public SalaDeExibicao listarSala(CriarSalaDto dto){
        return listarSala(dto);
    }

    public SalaDeExibicao buscar(CriarSalaDto dto) {
        return buscar(dto);
    }

    public SalaDeExibicao criarSala(SalaDeExibicao salaDeExibicao) {
        return null;
    }
}
