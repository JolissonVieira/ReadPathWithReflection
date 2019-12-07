package com.br.leituraPath.model.entity;

import java.time.LocalDate;

public class SistemaEntity {

    private String nome;
    private String sigla;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate dataInativacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
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

    public LocalDate getDataInativacao() {
        return dataInativacao;
    }

    public void setDataInativacao(LocalDate dataInativacao) {
        this.dataInativacao = dataInativacao;
    }

    public SistemaEntity(String nome, String sigla, String descricao, LocalDate dataCriacao, LocalDate dataInativacao) {
        this.nome = nome;
        this.sigla = sigla;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.dataInativacao = dataInativacao;
    }

    public static class Builder{

        private String nome;
        private String sigla;
        private String descricao;
        private LocalDate dataCriacao;
        private LocalDate dataInativacao;

        public Builder() {
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder setSigla(String sigla) {
            this.sigla = sigla;
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

        public Builder setDataInativacao(LocalDate dataInativacao) {
            this.dataInativacao = dataInativacao;
            return this;
        }

        public SistemaEntity build(){
            return new SistemaEntity(nome, sigla, descricao, dataCriacao, dataInativacao);
        }
    }
}
