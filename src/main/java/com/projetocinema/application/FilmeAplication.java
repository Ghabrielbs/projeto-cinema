package com.projetocinema.application;

import com.projetocinema.controller.filme.Dto.CriarFilmeDto;
import com.projetocinema.domain.filme.Filme;
import jakarta.persistence.*;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.UUID;
@Component
public class FilmeAplication {
    public Filme criarFilme (CriarFilmeDto dto){
        Filme filme = new Filme();

        filme.setIdFilme(UUID.fromString(dto.getId()));
        filme.setDescricaoFilme(dto.getDescricao());
        filme.setNomeFilme(dto.getNome());;
        return filme;
    }



}
