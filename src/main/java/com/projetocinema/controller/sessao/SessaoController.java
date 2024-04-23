package com.projetocinema.controller.sessao;

import com.projetocinema.controller.sessao.dto.CriarSessaoDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Sessao")
public class SessaoController {
    @GetMapping
    public String listar(){
        return "listar sessão do filme";
    }

    @GetMapping ("/{id}")
    public String buscar(@PathVariable String id){
        return id;
    }

    @PostMapping
    public String criar(@RequestBody CriarSessaoDto dto){
        return "criar";
    }
}
