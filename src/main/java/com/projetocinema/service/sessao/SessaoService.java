package com.projetocinema.service.sessao;

import com.projetocinema.domain.sessao.Sessao;
import com.projetocinema.repository.sessao.SessaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessaoService {

    @Autowired
    private SessaoRepository sessaoRepository;
    public Sessao buscar(String id){
        Sessao sessao = sessaoRepository.buscar(id);

        return sessao;
    }

    public Sessao criar(Sessao sessao){
        sessaoRepository.criar(sessao);

        return sessao;
    }

    public List <Sessao> listar() {
        List<Sessao> sessao = sessaoRepository.listar();

        return sessao;
    }

}
