package com.projetocinema.application;

import com.projetocinema.controller.sessao.dto.CriarSessaoDto;
import com.projetocinema.domain.filme.SessaoDeFilme;

import java.util.UUID;

public class SessaoDeFilmeApplication {
    public SessaoDeFilme criarSessaoFilme(CriarSessaoDto dto){
        SessaoDeFilme sessao= new SessaoDeFilme();

        sessao.setIdSessao(UUID.fromString(dto.getIdFilme()));
        sessao.setNomeDoFilme((sessao.nomeDoFilme));
        sessao.setNumeroDaSala(sessao.getNumeroDaSala());
            return sessao;
    }
}
