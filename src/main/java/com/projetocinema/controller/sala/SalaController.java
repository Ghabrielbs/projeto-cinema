package com.projetocinema.controller.sala;

import com.projetocinema.application.SalaApplication;
import com.projetocinema.controller.sala.Dto.CriarSalaDto;
import com.projetocinema.domain.sala.SalaDeExibicao;
import com.projetocinema.service.sala.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/SalaDeExibiçao")
public class SalaController {
    @Autowired
    private SalaApplication salaDeExibicaoApplication;

    @Autowired
    private SalaDeExibicao sala;

    @Autowired
    private SalaService salaService;



    @GetMapping
    public String listar(){
        salaService.listar();
        return null;
    }

    @GetMapping("/{id}")
    public String buscar(@PathVariable String id){
        salaService.buscar(id);

        return null;
    }

    @PostMapping
    public String criar(@RequestBody CriarSalaDto dto){
        //convertendo dto em entidade
       SalaDeExibicao sala = salaDeExibicaoApplication.criar(dto);
       //enviando para o service
       salaService.criar(sala);

       return null;
    }
}
