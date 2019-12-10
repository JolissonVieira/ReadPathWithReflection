package com.br.leituraPath.business;


import com.br.leituraPath.model.annotation.UnoContextoPermissao;
import com.br.leituraPath.model.annotation.UnoFuncaoSistema;
import com.br.leituraPath.model.annotation.UnoPerfil;
import com.br.leituraPath.model.entity.*;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManterFluxoPermissaoUnoNegocio {


    public void cadastrarPermissoesUno(String diretorio) {
        LeituraFormatacaoPathNegocio pathNegocio = new LeituraFormatacaoPathNegocio();

        for (Class clazz: pathNegocio.obterListaClassesProjeto(diretorio)){
            List<PermissaoAcessoUno> permissoesAcessoUno = montarPermissoesAcessoUno(clazz);
        }
    }

    private List<PermissaoAcessoUno> montarPermissoesAcessoUno(Class clazz) {
        List<PermissaoAcessoUno> listaPermissoesAcessoUno = new ArrayList<>();
        for (Method method: clazz.getDeclaredMethods()) {
            PermissaoAcessoUno permissaoAcessoUno = montarObjetoInicialPermissaoAcesoUno(clazz);
            permissaoAcessoUno.setFuncaoSistema(montarFuncaoSistema(method));
            listaPermissoesAcessoUno.add(permissaoAcessoUno);
        }
        return listaPermissoesAcessoUno;
    }

    private PermissaoAcessoUno montarObjetoInicialPermissaoAcesoUno(Class clazz) {
        LeituraFormatacaoPathNegocio pathNegocio = new LeituraFormatacaoPathNegocio();
        return new PermissaoAcessoUno.Builder()
                .setSistema(montarSistema())
                .setPerfil(montarPerfis(pathNegocio.obterPerfis(clazz)))
                .setContextoFuncao(montarContextoFuncao(pathNegocio.obtercontextoFuncaoClass(clazz)))
                .setPermissaoSeguranca(montarPermissaoSeguranca(pathNegocio.obtercontextoFuncaoClass(clazz)))
                .build();
    }

    private FuncaoSistema montarFuncaoSistema(Method method) {
        LeituraFormatacaoPathNegocio pathNegocio = new LeituraFormatacaoPathNegocio();
        UnoFuncaoSistema unoFuncaoSistema = pathNegocio.obterFuncaoSistema(method);
        return new FuncaoSistema.Builder()
                .setNome(unoFuncaoSistema.nomeFuncao())
                .setDescricao(unoFuncaoSistema.descFuncao())
                .setUrl(pathNegocio.obterPathMethod(method))
                .build();
    }

    private PermissaoSeguranca montarPermissaoSeguranca(UnoContextoPermissao permissao) {
        return new PermissaoSeguranca.Builder()
                .setNome(permissao.nomePermissao())
                .setDescricao(permissao.nomePermissao())
                .build();
    }

    private ContextoFuncao montarContextoFuncao(UnoContextoPermissao contexto) {
        return new ContextoFuncao.Builder()
                .setNome(contexto.nomeContexto())
                .setDescricao(contexto.descContexto())
                .build();
    }

    private List<String> montarPerfis(UnoPerfil perfis) {
        return Arrays.asList(perfis.nome());
    }

    private Sistema montarSistema() {
        return new Sistema.Builder()
                .setNome("Sistema de Gestão")
                .setSigla("SG")
                .build();
    }


}
