package com.projetocinema.application;

import com.projetocinema.controller.filme.dto.CriarFilmeDto;
import com.projetocinema.domain.filme.Filme;
import org.springframework.stereotype.Component;

@Component
public class FilmeApplication {
    public  Filme criarFilme(CriarFilmeDto dto){
        Filme filme = new Filme();

        filme.setId(dto.getId());
        filme.setDescricao(dto.getDescricao());
        filme.setNome(dto.getNome());

        return filme;
    }
}
