package com.projetocinema.service.filme;

import com.projetocinema.domain.filme.Filme;
import com.projetocinema.repository.filme.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {
    @Autowired
    FilmeRepository filmeRepository;

    public List<Filme> listar(){
        List<Filme> filme = filmeRepository.listar();

        return filme;
    }

    public Filme criar(Filme filme){
        filmeRepository.criar(filme);

        return filme;
    }

    public Filme buscar(String id){
        Filme filme = filmeRepository.buscar(id);

        return filme;
    }
}
