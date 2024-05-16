package com.projetocinema.service.sessao;

import com.projetocinema.application.SessaoApplication;
import com.projetocinema.controller.sessao.dto.CriarSessaoDto;
import com.projetocinema.domain.sala.SalaDeExibicao;
import com.projetocinema.domain.sessao.Sessao;
import com.projetocinema.enums.SessaoMenssagens;
import com.projetocinema.exception.RequisicaoApiExpetion;
import com.projetocinema.repository.filme.FilmeRepository;
import com.projetocinema.repository.sala.SalaRepository;
import com.projetocinema.repository.sessao.SessaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessaoService {

    @Autowired
    private SessaoRepository sessaoRepository;

    @Autowired
    private FilmeRepository filmeRepository;

    @Autowired
    private SalaRepository salaRepository;
    public Sessao buscar(String id){
     if(sessaoRepository.buscar(id).equals(0))
         throw new RequisicaoApiExpetion(SessaoMenssagens.SESSAO_NAO_ENCONTRADA.getMenssagem());
        Sessao sessao = sessaoRepository.buscar(id);

        return sessao;
    }

    public Sessao criar(CriarSessaoDto sessaoDto){
        Sessao sessao = new Sessao();
        sessao.setId(sessaoDto.getId());
        sessao.setIdFilme(sessaoDto.getIdFilme());
        sessao.setIdSala(sessaoDto.getIdSala());

        if(sessao.getId() == null)
            throw new RequisicaoApiExpetion(SessaoMenssagens.ID_SESSAO_INVALIDO.getMenssagem());
        if (sessao.getId() == null)
            throw new RequisicaoApiExpetion(SessaoMenssagens.ID_SESSAO_VAZIO.getMenssagem());
        // Ao invés de validar numericamente, validar se o filme existe pelo repository dele
        if (sessao.getIdFilme()== null)
            throw new RequisicaoApiExpetion(SessaoMenssagens.ID_SESSAO_FILME_INVALIDO.getMenssagem());

        sessaoRepository.criar(sessao);

        return sessao;
    }

    public List <Sessao> listar() {
        if (sessaoRepository.listar().equals(0))
            throw new RequisicaoApiExpetion(SessaoMenssagens.TABELA_SESSAO_VAZIA.getMenssagem());
        List<Sessao> sessao = sessaoRepository.listar();

        return sessao;
    }

    public Sessao atualizarSessao(String id, CriarSessaoDto sessaoDto){
        if (sessaoDto.getIdFilme().equals(null))
            throw new RequisicaoApiExpetion(SessaoMenssagens.ID_SESSAO_FILME_INVALIDO.getMenssagem());

        Sessao sessao = new Sessao();
        sessaoRepository.atualizar(sessao);

        return sessao;
    }

    public Sessao deletarSessao(String id){
        Sessao sessao = buscar(id);
        sessaoRepository.deletar(sessao);

        return sessao;
    }

}
