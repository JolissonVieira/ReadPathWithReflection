package com.br.leituraPath.model.entity;

public class ContextoFuncaoEntity {
    private String nome;
    private String descricao;
    private SistemaEntity sistemaEntity;

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

    public SistemaEntity getSistemaEntity() {
        return sistemaEntity;
    }

    public void setSistemaEntity(SistemaEntity sistemaEntity) {
        this.sistemaEntity = sistemaEntity;
    }

    public ContextoFuncaoEntity(String nome, String descricao, SistemaEntity sistemaEntity) {
        this.nome = nome;
        this.descricao = descricao;
        this.sistemaEntity = sistemaEntity;
    }

    public static class Builder{
        private String nome;
        private String descricao;
        private SistemaEntity sistemaEntity;

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

        public Builder setSistemaEntity(SistemaEntity sistemaEntity) {
            this.sistemaEntity = sistemaEntity;
            return this;
        }

        public ContextoFuncaoEntity build(){
            return new ContextoFuncaoEntity(nome,descricao, sistemaEntity);
        }
    }
}
