package com.projetocinema.service.filme;

import com.projetocinema.controller.filme.dto.CriarFilmeDto;
import com.projetocinema.domain.filme.Filme;
import com.projetocinema.enums.FilmeMenssagens;
import com.projetocinema.exception.RequisicaoApiExpetion;
import com.projetocinema.repository.filme.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {
    @Autowired
    FilmeRepository filmeRepository;

    public List<Filme> listar(){
       if(filmeRepository.listar().equals(0))
           throw new RequisicaoApiExpetion(FilmeMenssagens.TABELA_VAZIA.getmenssagem());
        return filmeRepository.listar();
    }

    public Filme criar(CriarFilmeDto filmeDto){
        if(filmeDto.getNome().equals(null))
            throw new RequisicaoApiExpetion(FilmeMenssagens.NOME_DO_FILME_VAZIO.getmenssagem());
        if (filmeDto.getId().equals(null))
            throw new RequisicaoApiExpetion(FilmeMenssagens.ID_INVALIDO.getmenssagem());

        Filme filme = new Filme();
        filme.setId(filmeDto.getId());
        filme.setNome(filmeDto.getNome());
        filme.setDescricao(filmeDto.getDescricao());
        filmeRepository.criar(filme);

        return filme;
    }

    public Filme buscar(String id){
       if( filmeRepository.findByCountId(id) ==0)
           throw new RequisicaoApiExpetion(FilmeMenssagens.FILME_NAO_ENCONTRADO.getmenssagem());
        Filme filme = filmeRepository.buscar(id);

        return filme;
    }

    public Filme atualizarFilme(String id, CriarFilmeDto filmeDto){
        if(filmeRepository.findByCountId(id) == 0)
            throw new RequisicaoApiExpetion(FilmeMenssagens.FILME_NAO_ENCONTRADO.getmenssagem());
        if(filmeDto.getNome().equals(null))
            throw new RequisicaoApiExpetion(FilmeMenssagens.NOME_DO_FILME_VAZIO.getmenssagem());

        Filme filme = new Filme();
        filmeRepository.atualizar(filme);

        return filme;
    }

    public Filme deletarFilme(String id){
        Filme filme = buscar(id);
        filmeRepository.deletar(filme);

        return filme;
    }
}
