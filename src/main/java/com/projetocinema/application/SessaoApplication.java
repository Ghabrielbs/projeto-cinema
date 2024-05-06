package com.projetocinema.application;

import com.projetocinema.controller.sessao.dto.CriarSessaoDto;
import com.projetocinema.domain.sessao.Sessao;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class SessaoApplication {
    public Sessao criarSessao(CriarSessaoDto dto){
        Sessao sessao= new Sessao();

        sessao.setId(UUID.fromString(dto.getIdFilme()));
        sessao.setIdFilme((sessao.idFilme));
        sessao.setIdSala(Integer.parseInt(sessao.getIdSala()));

        return sessao;
    }
}
