package com.projetocinema.service.sessao;

import com.projetocinema.controller.sessao.dto.CriarSessaoDto;
import com.projetocinema.domain.filme.SessaoDeFilme;
import org.springframework.stereotype.Service;

@Service
public class SessaoService {
    public SessaoDeFilme buscarSessao(CriarSessaoDto dto){
        return buscarSessao(dto);
    }

    public SessaoDeFilme criarSessao(SessaoDeFilme sessaoDeFilme){
        return null;
    }

    public SessaoDeFilme listarSessao(CriarSessaoDto dto) {
        return listarSessao(dto);
    }

}
