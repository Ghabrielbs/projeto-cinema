package com.projetocinema.application;

import com.projetocinema.controller.sessao.Dto.CriarSessaoDto;
import com.projetocinema.domain.filme.SessaoDeFilme;

import java.util.UUID;

public class SessaoDeFilmeAplication {
    public SessaoDeFilme criarSessaoFilme(CriarSessaoDto dto){
        SessaoDeFilme sessaoDeFilme= new SessaoDeFilme();

        sessaoDeFilme.setIdSessao(UUID.fromString(dto.getIdFilme()));
        sessaoDeFilme.setNomeDoFilme(dto.()));
        sessaoDeFilme.setNumeroDaSala(sessaoDeFilme.getNumeroDaSala());
        return sessaoDeFilme;
    }
}
