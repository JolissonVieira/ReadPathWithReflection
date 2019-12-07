package com.br.leituraPath.business;


import com.br.leituraPath.model.annotation.ContextoFuncao;
import com.br.leituraPath.model.annotation.FuncaoSistema;
import com.br.leituraPath.model.entity.ContextoFuncaoEntity;
import com.br.leituraPath.model.entity.FuncaoSistemaEntity;
import com.br.leituraPath.model.entity.SistemaEntity;

import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ManterFluxoPermissaoUnoNegocio {


    public void cadastrarPermissoesUno(String diretorio) {
        LeituraFormatacaoPathNegocio pathNegocio = new LeituraFormatacaoPathNegocio();

        for (Class clazz: pathNegocio.obterListaClassesProjeto(diretorio)){
            List<FuncaoSistemaEntity> funcoesParaCadastro = montarFuncaoSistema(clazz);
        }
    }

    private List<FuncaoSistemaEntity> montarFuncaoSistema(Class clazz) {
        LeituraFormatacaoPathNegocio pathNegocio = new LeituraFormatacaoPathNegocio();
        List<FuncaoSistemaEntity> listaFuncoes = new ArrayList<>();
        ContextoFuncao contextoFuncaoClass = pathNegocio.obtercontextoFuncaoClass(clazz);

        for (Method method: clazz.getDeclaredMethods()) {
            FuncaoSistemaEntity funcaoSistemaEntity = montarFuncaoSistema(pathNegocio.obterFuncaoSistema(method));
            funcaoSistemaEntity.setUrl(pathNegocio.obterPathMethod(method));
            ContextoFuncao contextoFuncaoMetodo = pathNegocio.obtercontextoFuncaoMetodo(method);
            if (contextoFuncaoMetodo != null){
                funcaoSistemaEntity.setContextoFuncaoEntity(montarContextoFuncao(contextoFuncaoMetodo));
            }else{
                funcaoSistemaEntity.setContextoFuncaoEntity(montarContextoFuncao(contextoFuncaoClass));
            }
            listaFuncoes.add(funcaoSistemaEntity);
        }
        return listaFuncoes;
    }

    private ContextoFuncaoEntity montarContextoFuncao(ContextoFuncao contextoFuncao) {
        return new ContextoFuncaoEntity.Builder()
                .setNome(contextoFuncao.nome())
                .setDescricao(contextoFuncao.descricao())
                .setSistemaEntity(montarSistema())
                .build();
    }

    private FuncaoSistemaEntity montarFuncaoSistema(FuncaoSistema funcaoSistema){
        return new FuncaoSistemaEntity.Builder()
                .setNome(funcaoSistema.nomeFuncao())
                .setDescricao(funcaoSistema.descFuncao())
                .setDataCriacao(LocalDate.now())
                .setDataIncativacao(null)
                .build();
    }

    private SistemaEntity montarSistema(){
        return new SistemaEntity.Builder()
                .setNome("Sistema de Leitura de Path")
                .setDescricao("Sistema Para Leitura de path e cadastro no UNO")
                .setSigla("SLP")
                .setDataCriacao(LocalDate.now())
                .setDataInativacao(null)
                .build();
    }

}
