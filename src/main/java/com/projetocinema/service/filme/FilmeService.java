package com.projetocinema.service.filme;

import com.projetocinema.controller.filme.dto.CriarFilmeDto;
import com.projetocinema.domain.filme.Filme;
import org.springframework.stereotype.Service;

@Service
public class FilmeService {
    public Filme listarFilme(CriarFilmeDto dto){
        return listarFilme(dto);
    }

    public Filme criarFilme(Filme filme){
        return null;
    }

    public Filme buscarFilme(CriarFilmeDto dto){
        return buscarFilme(dto);
    }
}
