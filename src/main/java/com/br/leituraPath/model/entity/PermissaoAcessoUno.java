package com.br.leituraPath.model.entity;

import java.util.List;

public class PermissaoAcessoUno {

    private Sistema sistema;
    private List<String> perfil;
    private ContextoFuncao contextoFuncao;
    private PermissaoSeguranca permissaoSeguranca;
    private FuncaoSistema funcaoSistema;

    public Sistema getSistema() {
        return sistema;
    }

    public void setSistema(Sistema sistema) {
        this.sistema = sistema;
    }

    public List<String> getPerfil() {
        return perfil;
    }

    public void setPerfil(List<String> perfil) {
        this.perfil = perfil;
    }

    public ContextoFuncao getContextoFuncao() {
        return contextoFuncao;
    }

    public void setContextoFuncao(ContextoFuncao contextoFuncao) {
        this.contextoFuncao = contextoFuncao;
    }

    public PermissaoSeguranca getPermissaoSeguranca() {
        return permissaoSeguranca;
    }

    public void setPermissaoSeguranca(PermissaoSeguranca permissaoSeguranca) {
        this.permissaoSeguranca = permissaoSeguranca;
    }

    public FuncaoSistema getFuncaoSistema() {
        return funcaoSistema;
    }

    public void setFuncaoSistema(FuncaoSistema funcaoSistema) {
        this.funcaoSistema = funcaoSistema;
    }

    public PermissaoAcessoUno(Sistema sistema, List<String> perfil, ContextoFuncao contextoFuncao, PermissaoSeguranca permissaoSeguranca, FuncaoSistema funcaoSistema) {
        this.sistema = sistema;
        this.perfil = perfil;
        this.contextoFuncao = contextoFuncao;
        this.permissaoSeguranca = permissaoSeguranca;
        this.funcaoSistema = funcaoSistema;
    }

    public static class Builder{

        private Sistema sistema;
        private List<String> perfil;
        private ContextoFuncao contextoFuncao;
        private PermissaoSeguranca permissaoSeguranca;
        private FuncaoSistema funcaoSistema;

        public Builder() {

        }

        public Builder setSistema(Sistema sistema) {
            this.sistema = sistema;
            return this;
        }

        public Builder setPerfil(List<String> perfil) {
            this.perfil = perfil;
            return this;
        }

        public Builder setContextoFuncao(ContextoFuncao contextoFuncao) {
            this.contextoFuncao = contextoFuncao;
            return this;
        }

        public Builder setPermissaoSeguranca(PermissaoSeguranca permissaoSeguranca) {
            this.permissaoSeguranca = permissaoSeguranca;
            return this;
        }

        public Builder setFuncaoSistema(FuncaoSistema funcaoSistema) {
            this.funcaoSistema = funcaoSistema;
            return this;
        }

        public PermissaoAcessoUno build(){
            return new PermissaoAcessoUno(sistema,  perfil , contextoFuncao, permissaoSeguranca, funcaoSistema);
        }
    }
}
