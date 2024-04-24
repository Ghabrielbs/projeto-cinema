package com.projetocinema.controller.sessao;

import com.projetocinema.application.SessaoApplication;
import com.projetocinema.controller.sessao.dto.CriarSessaoDto;
import com.projetocinema.domain.filme.SessaoDeFilme;
import com.projetocinema.service.sessao.SessaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Sessao")
public class SessaoController {
    @Autowired
    private SessaoApplication sessaoApplication;
    @Autowired
    private SessaoService sessaoService;
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
        SessaoDeFilme sessaoDeFilme = sessaoApplication.criarSessaoFilme(dto);
        sessaoService.criarSessao(sessaoDeFilme);
        return "sessao criada";
    }
}
