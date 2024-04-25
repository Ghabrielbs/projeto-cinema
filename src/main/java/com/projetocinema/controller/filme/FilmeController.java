package com.projetocinema.controller.filme;

import com.projetocinema.application.FilmeApplication;
import com.projetocinema.controller.filme.dto.CriarFilmeDto;
import com.projetocinema.domain.filme.Filme;
import com.projetocinema.service.filme.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/filmes")
public class FilmeController {
    @Autowired
    private FilmeService filmeService;

    @Autowired
    private Filme filme;

    @Autowired
    private FilmeApplication filmeApplication;

    @GetMapping
    public String listar(){
        //enviando para o service
        filmeService.listarFilme(filme);
        return null;
    }

    @GetMapping("/{id}")
    public String buscar(@PathVariable String id){
        //enviando para o service
        filmeService.buscarFilme(filme);
        return null;
    }

    @PostMapping
    public String criar(@RequestBody CriarFilmeDto dto){

        //convertendo dto em entidade
        Filme filme = filmeApplication.criarFilme(dto);
        //enviando para o service
        filmeService.criarFilme(filme);
        return null;
    }




}


