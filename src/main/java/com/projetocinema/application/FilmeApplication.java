package com.projetocinema.application;

import com.projetocinema.controller.filme.dto.CriarFilmeDto;
import com.projetocinema.domain.filme.Filme;

import java.util.UUID;

public class FilmeApplication {
    public Filme criarFilme (CriarFilmeDto dto){
        Filme filme = new Filme();

        filme.setIdFilme(UUID.fromString(dto.getId()));
        filme.setDescricaoFilme(dto.getDescricao());
        filme.setNomeFilme(dto.getNome());;
            return filme;
    }



}
