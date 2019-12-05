package com.br.leituraPath.model.entity;

public class ContextoFuncao {
    private String nome;
    private String descricao;
    private Sistema sistema;

    public String getNome(String nome) {
        return this.nome;
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

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }
}
