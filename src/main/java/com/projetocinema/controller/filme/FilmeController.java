package com.projetocinema.controller.filme;

import com.projetocinema.application.FilmeApplication;
import com.projetocinema.controller.filme.dto.CriarFilmeDto;
import com.projetocinema.domain.filme.Filme;
import com.projetocinema.service.filme.FilmeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filme")
public class FilmeController {
    @Autowired
    private FilmeService filmeService;

    @Autowired
    private FilmeApplication filmeApplication;

    @GetMapping
    public ResponseEntity <List<Filme>> listar(){
        //enviando para o service
        return ResponseEntity.status(HttpStatus.OK).body(filmeService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity  <Filme> buscar (@PathVariable (value ="id") String id){
        //enviando para o service
        return ResponseEntity.status(HttpStatus.OK).body(filmeService.buscar(id));
    }

    @PostMapping
    public ResponseEntity <Filme> criar(@RequestBody CriarFilmeDto dto){

        //convertendo dto em entidade
        Filme filme = filmeApplication.criarFilme(dto);
        //enviando para o service
        filmeService.criar(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(filmeService.criar(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Filme>atualizarFilme(@PathVariable(value ="id")String id,
                                               @RequestBody @Valid CriarFilmeDto filmeDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(filmeService.atualizarFilme(id,filmeDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Filme>deletarFilme(@PathVariable(value ="id")String id) {
        return ResponseEntity.status(HttpStatus.CREATED).body(filmeService.deletarFilme(id));
    }

}


