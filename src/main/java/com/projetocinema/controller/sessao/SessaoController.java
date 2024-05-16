package com.projetocinema.controller.sessao;

import com.projetocinema.application.SessaoApplication;
import com.projetocinema.controller.sessao.dto.CriarSessaoDto;
import com.projetocinema.domain.sessao.Sessao;
import com.projetocinema.service.sessao.SessaoService;
import jakarta.validation.Valid;
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

        Sessao sessao = sessaoService.criar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(sessao);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Sessao>atualizarSessao(@PathVariable(value ="id")String id, @RequestBody @Valid CriarSessaoDto sessaoDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(sessaoService.atualizar(id, sessaoDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Sessao>deletarSessao(@PathVariable(value ="id")String id) {
        return ResponseEntity.status(HttpStatus.CREATED).body(sessaoService.deletar(id));
    }
}



