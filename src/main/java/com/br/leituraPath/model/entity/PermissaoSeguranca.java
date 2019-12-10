package com.br.leituraPath.model.entity;

public class PermissaoSeguranca {
    private String nome;
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

    public PermissaoSeguranca(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public static class Builder{
        private String nome;
        private String descricao;

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

        public PermissaoSeguranca build(){
            return new PermissaoSeguranca(nome,descricao);
        }
    }
}
