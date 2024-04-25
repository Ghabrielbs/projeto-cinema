package com.projetocinema.application;

import com.projetocinema.controller.sessao.dto.CriarSessaoDto;
import com.projetocinema.domain.sessao.Sessao;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class SessaoApplication {
    public Sessao criarSessaoFilme(CriarSessaoDto dto){
        Sessao sessao= new Sessao();

        sessao.setIdSessao(UUID.fromString(dto.getIdFilme()));
        sessao.setNomeDoFilme((sessao.nomeDoFilme));
        sessao.setNumeroDaSala(sessao.getNumeroDaSala());
            return sessao;
    }
}
