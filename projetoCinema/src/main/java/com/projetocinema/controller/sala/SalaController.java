package com.projetocinema.controller.sala;

import com.projetocinema.controller.sala.Dto.CriarSalaDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController("/SalaDeExibiçao")
public class SalaController {
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
       return "criar Sala";
    }
}
