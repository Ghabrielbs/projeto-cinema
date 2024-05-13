package com.projetocinema.service.sala;

import com.projetocinema.controller.sala.Dto.CriarSalaDto;
import com.projetocinema.domain.sala.SalaDeExibicao;
import com.projetocinema.enums.SalaMenssagens;
import com.projetocinema.exception.RequisicaoApiExpetion;
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
        if (salaRepository.listar().equals(0))
            throw new RequisicaoApiExpetion(SalaMenssagens.TABELA_SALA_VAZIA.getMenssagem());
        List<SalaDeExibicao> salaDeExibicao = salaRepository.listar();

        return salaDeExibicao;
    }

    public SalaDeExibicao buscar(String id) {
        if (salaRepository.buscar(id).equals(0))
            throw new RequisicaoApiExpetion(SalaMenssagens.SALA_NAO_ENCONTRADA.getMenssagem());
        SalaDeExibicao salaDeExibicao = salaRepository.buscar(id);

        return salaDeExibicao;
    }

    public SalaDeExibicao criar(CriarSalaDto salaDto) {
        if (salaRepository.buscar(salaDto.getId()).equals(0))
            throw new RequisicaoApiExpetion(SalaMenssagens.ID_INVALIDO.getMenssagem());
        if (salaDto.getNumero() == 0 )
            throw new RequisicaoApiExpetion(SalaMenssagens.NUMERO_SALA_VAZIO.getMenssagem());
        if (salaDto.getId().equals(null))
            throw new RequisicaoApiExpetion(SalaMenssagens.ID_SALA_VAZIO.getMenssagem());
        SalaDeExibicao sala = new SalaDeExibicao();
        salaRepository.criar(sala);

        return sala;
    }
}
