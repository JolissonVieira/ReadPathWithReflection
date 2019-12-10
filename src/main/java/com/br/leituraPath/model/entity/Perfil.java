package com.br.leituraPath.model.entity;

public class Perfil {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Perfil(String nome) {
        this.nome = nome;
    }

    public static class Builder{

        private String nome;

        public Builder() {
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Perfil build(){
            return new Perfil(nome);
        }

    }
}
