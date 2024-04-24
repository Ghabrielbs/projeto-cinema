package com.projetocinema.controller.sala;

import com.projetocinema.application.SalaApplication;
import com.projetocinema.controller.sala.Dto.CriarSalaDto;
import com.projetocinema.domain.sala.SalaDeExibicao;
import com.projetocinema.service.sala.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController("/SalaDeExibiçao")
public class SalaController {
    @Autowired
    private SalaApplication salaDeExibicaoApplication;

    @Autowired
    private SalaService salaService;
    @GetMapping
    public String listarSala(){
        return "listar Sala";
    }

    @GetMapping("/{id}")
    public String buscar(@PathVariable String id){
        return id;
    }

    @PostMapping
    public String criar(@RequestBody CriarSalaDto dto){
        //convertendo dto em entidade
       SalaDeExibicao sala = salaDeExibicaoApplication.criarSala(dto);
       //enviando para o service
       salaService.criarSala(sala);
       return  "sala criada";
    }
}
