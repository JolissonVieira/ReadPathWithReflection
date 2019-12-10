package com.br.leituraPath.model.entity;

import java.time.LocalDate;

public class Sistema {

    private String sigla;
    private String nome;


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

    public Sistema(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public static class Builder{

        private String nome;
        private String sigla;

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

        public Sistema build(){
            return new Sistema(nome, sigla );
        }
    }
}
