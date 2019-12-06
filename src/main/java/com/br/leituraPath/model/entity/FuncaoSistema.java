package com.br.leituraPath.model.entity;

import java.time.LocalDate;

public class FuncaoSistema {

    private String nome;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate dataIncativacao;
    private String url;
    private ContextoFuncao contextoFuncao;

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

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataIncativacao() {
        return dataIncativacao;
    }

    public void setDataIncativacao(LocalDate dataIncativacao) {
        this.dataIncativacao = dataIncativacao;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ContextoFuncao getContextoFuncao() {
        return contextoFuncao;
    }

    public void setContextoFuncao(ContextoFuncao contextoFuncao) {
        this.contextoFuncao = contextoFuncao;
    }
}
