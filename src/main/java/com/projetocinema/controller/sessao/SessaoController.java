package com.projetocinema.controller.sessao;

import com.projetocinema.application.SessaoApplication;
import com.projetocinema.controller.sessao.dto.CriarSessaoDto;
import com.projetocinema.domain.sessao.Sessao;
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
        sessaoService.listarSessao();
        return null;
    }

    @GetMapping ("/{id}")
    public String buscar(@PathVariable String id){
        sessaoService.buscarSessao(id);
        return null;
    }

    @PostMapping
    public String criar(@RequestBody CriarSessaoDto dto){
        Sessao sessao = sessaoApplication.criarSessaoFilme(dto);
        sessaoService.criarSessao(sessao);
        return null;
    }
}
