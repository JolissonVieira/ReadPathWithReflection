package com.br.leituraPath.business;


import com.br.leituraPath.model.entity.ContextoFuncao;

import java.util.List;

public class ManterFluxoPermissaoUnoNegocio {


    public void cadastrarPermissoesUno(String diretorio) {
        LeituraFormatacaoPathNegocio pathNegocio = new LeituraFormatacaoPathNegocio();

        for (Class clazz: pathNegocio.obterListaClassesProjeto(diretorio)){
            ContextoFuncao contextoFuncao = new ContextoFuncao();
            contextoFuncao.setNome(pathNegocio.obtercontextoFuncaoClass(clazz).nome());
            contextoFuncao.setDescricao(pathNegocio.obtercontextoFuncaoClass(clazz).descricao());
        }
    }
}
