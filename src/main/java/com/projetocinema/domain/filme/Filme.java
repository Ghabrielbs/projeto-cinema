package com.projetocinema.domain.filme;


public class Filme {
    private String id;
    public String nome;
    private String descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id =id;
    }


}
