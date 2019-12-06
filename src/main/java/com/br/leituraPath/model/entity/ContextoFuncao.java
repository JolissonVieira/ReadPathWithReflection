package com.br.leituraPath.model.entity;

public class ContextoFuncao {
    private String nome;
    private String descricao;
    private Sistema sistema;

    public String getNome() {
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

    private ContextoFuncao(ContextoFuncaoBuilder builder) {
        this.nome = builder.nome;
        this.descricao = builder.descricao;
        this.sistema = builder.sistema;
    }

    public static class ContextoFuncaoBuilder{

        private String nome;
        private String descricao;
        private Sistema sistema;

        public ContextoFuncaoBuilder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public ContextoFuncaoBuilder setDescricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public ContextoFuncaoBuilder setSistema(Sistema sistema) {
            this.sistema = sistema;
            return this;
        }

        public ContextoFuncao build(){
            return  new ContextoFuncao(this);
        }
    }
}
