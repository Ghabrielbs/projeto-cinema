package com.projetocinema.controller.sessao;

import com.projetocinema.application.SessaoApplication;
import com.projetocinema.controller.sessao.dto.CriarSessaoDto;
import com.projetocinema.domain.sessao.Sessao;
import com.projetocinema.service.sessao.SessaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sessaodofilme")
public class SessaoController {
    @Autowired
    private SessaoApplication sessaoApplication;

    @Autowired
    private SessaoService sessaoService;

    @GetMapping
    public ResponseEntity<List<Sessao>> listar(){

        return ResponseEntity.status(HttpStatus.OK).body(sessaoService.listar());
    }

    @GetMapping ("/{id}")
    public ResponseEntity <Sessao> buscar(@PathVariable String id){

        return ResponseEntity.status(HttpStatus.OK).body(sessaoService.buscar(id));
    }

    @PostMapping
    public ResponseEntity <Sessao> criar(@RequestBody CriarSessaoDto dto){

        Sessao sessao = sessaoApplication.criarSessao(dto);
        sessaoService.criar(sessao);

        return ResponseEntity.status(HttpStatus.CREATED).body(sessaoService.criar(sessao));
    }
}
