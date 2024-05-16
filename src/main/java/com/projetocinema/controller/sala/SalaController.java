package com.projetocinema.controller.sala;

import com.projetocinema.application.SalaApplication;
import com.projetocinema.controller.sala.Dto.CriarSalaDto;
import com.projetocinema.domain.sala.SalaDeExibicao;
import com.projetocinema.service.sala.SalaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/saladeexibicao")
public class SalaController {
    @Autowired
    private SalaApplication salaDeExibicaoApplication;
    @Autowired
    private SalaDeExibicao sala;
    @Autowired
    private SalaService salaService;

    @GetMapping
    public ResponseEntity<List<SalaDeExibicao>> listar(){
        return ResponseEntity.status(HttpStatus.OK).body(salaService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<SalaDeExibicao> buscar(@PathVariable String id){
        return ResponseEntity.status(HttpStatus.OK).body(salaService.buscar(id));
    }

    @PostMapping
    public ResponseEntity<SalaDeExibicao> criar(@RequestBody CriarSalaDto dto){

       SalaDeExibicao sala = salaDeExibicaoApplication.criar(dto);
       SalaDeExibicao salaDeExibicao =salaService.criar(dto);

       return ResponseEntity.status(HttpStatus.CREATED).body(salaDeExibicao);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SalaDeExibicao>atualizarSala(@PathVariable(value ="id")String id, @RequestBody @Valid CriarSalaDto salaDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(salaService.atualizar(id,salaDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<SalaDeExibicao>deletarSala(@PathVariable(value ="id")String id) {
        return ResponseEntity.status(HttpStatus.CREATED).body(salaService.deletar(id));
    }
}
