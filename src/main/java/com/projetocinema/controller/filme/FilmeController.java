package com.projetocinema.controller.filme;

import com.projetocinema.controller.filme.Dto.CriarFilmeDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/filmes")
public class FilmeController {
    @GetMapping
    public String listar(){
        return "listar filme";
    }

    @GetMapping("/{id}")
    public String buscar(@PathVariable String id){
        return id;
    }

    @PostMapping
    public String criar(@RequestBody CriarFilmeDto dto){
        return "criar";
    }
}


