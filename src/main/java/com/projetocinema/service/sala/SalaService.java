package com.projetocinema.service.sala;

import com.projetocinema.domain.sala.SalaDeExibicao;
import com.projetocinema.repository.sala.SalaRepository;
import com.projetocinema.repository.sessao.SessaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaService {

    @Autowired
    private SalaRepository salaRepository;

    public List<SalaDeExibicao> listar(){
        List<SalaDeExibicao> salaDeExibicao = salaRepository.listar();

        return salaDeExibicao;
    }

    public SalaDeExibicao buscar(String id) {
        SalaDeExibicao salaDeExibicao = salaRepository.buscar(id);

        return salaDeExibicao;
    }

    public SalaDeExibicao criar(SalaDeExibicao salaDeExibicao) {
        salaRepository.criar(salaDeExibicao);


        return salaDeExibicao;
    }
}
