package com.br.leituraPath.business;


import com.br.leituraPath.model.annotation.ContextoFuncao;
import com.br.leituraPath.model.entity.FuncaoSistema;

import java.util.List;

public class ManterFluxoPermissaoUnoNegocio {


    public void cadastrarPermissoesUno(String diretorio) {
        LeituraFormatacaoPathNegocio pathNegocio = new LeituraFormatacaoPathNegocio();

        for (Class clazz: pathNegocio.obterListaClassesProjeto(diretorio)){
            List<FuncaoSistema> funcoesParaCadastro = montarFuncaoSistema(clazz);
        }
    }

    private List<FuncaoSistema> montarFuncaoSistema(Class clazz) {
        LeituraFormatacaoPathNegocio pathNegocio = new LeituraFormatacaoPathNegocio();
        ContextoFuncao contextoFuncao =  pathNegocio.obtercontextoFuncaoClass(clazz);
        ContextoFuncao funcao = new ContextoFuncao.ContextoFuncaoBuilder().
    }
}
