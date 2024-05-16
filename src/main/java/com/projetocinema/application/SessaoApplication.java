package com.projetocinema.application;

import com.projetocinema.controller.sessao.dto.CriarSessaoDto;
import com.projetocinema.domain.sessao.Sessao;
import org.springframework.stereotype.Component;

@Component
public class SessaoApplication {
    public Sessao criarSessao(CriarSessaoDto dto){
        Sessao sessao= new Sessao();

        sessao.setId(dto.getIdFilme());
        sessao.setIdFilme((dto.getIdFilme()));
        sessao.setIdSala((dto.getIdSala()));

        return sessao;
    }
}
