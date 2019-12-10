package com.br.leituraPath.model.entity;

public class FuncaoSistema {

    private String nome;
    private String descricao;
    private String url;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public FuncaoSistema(String nome, String descricao, String url) {
        this.nome = nome;
        this.descricao = descricao;
        this.url = url;
    }

    public static class Builder{
        private String nome;
        private String descricao;
        private String url;

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

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }


        public FuncaoSistema build(){
            return new FuncaoSistema(nome,descricao,url);
        }
    }
}
