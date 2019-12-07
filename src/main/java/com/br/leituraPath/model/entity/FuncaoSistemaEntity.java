package com.br.leituraPath.model.entity;

import com.br.leituraPath.model.annotation.FuncaoSistema;

import java.time.LocalDate;

public class FuncaoSistemaEntity {

    private String nome;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate dataIncativacao;
    private String url;
    private ContextoFuncaoEntity contextoFuncaoEntity;

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

    public ContextoFuncaoEntity getContextoFuncaoEntity() {
        return contextoFuncaoEntity;
    }

    public void setContextoFuncaoEntity(ContextoFuncaoEntity contextoFuncaoEntity) {
        this.contextoFuncaoEntity = contextoFuncaoEntity;
    }

    public FuncaoSistemaEntity(String nome, String descricao, LocalDate dataCriacao, LocalDate dataIncativacao, String url, ContextoFuncaoEntity contextoFuncaoEntity) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.dataIncativacao = dataIncativacao;
        this.url = url;
        this.contextoFuncaoEntity = contextoFuncaoEntity;
    }

    public static class Builder{
        private String nome;
        private String descricao;
        private LocalDate dataCriacao;
        private LocalDate dataIncativacao;
        private String url;
        private ContextoFuncaoEntity contextoFuncaoEntity;

        public Builder() {
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder setDescricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public Builder setDataCriacao(LocalDate dataCriacao) {
            this.dataCriacao = dataCriacao;
            return this;
        }

        public Builder setDataIncativacao(LocalDate dataIncativacao) {
            this.dataIncativacao = dataIncativacao;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setContextoFuncaoEntity(ContextoFuncaoEntity contextoFuncaoEntity) {
            this.contextoFuncaoEntity = contextoFuncaoEntity;
            return this;
        }

        public FuncaoSistemaEntity build(){
            return new FuncaoSistemaEntity(nome,descricao,dataCriacao, dataIncativacao, url,contextoFuncaoEntity);
        }
    }
}
