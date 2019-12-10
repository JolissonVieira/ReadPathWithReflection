package com.br.leituraPath.controllerProject;

import com.br.leituraPath.model.annotation.UnoContextoPermissao;
import com.br.leituraPath.model.annotation.UnoFuncaoSistema;
import com.br.leituraPath.model.annotation.UnoPerfil;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;


@Path(value = "pathClass")
@UnoContextoPermissao(nomeContexto = "Contexto Teste 1", descContexto = " Desc Context 1" ,nomePermissao = "Permissão 1", descPermissao = " desc Permissao 1" )
@UnoPerfil(nome = {"Administrador","Atendente"})
public class ServiceTeste   {

    @POST
    @Path("consultar")
    @UnoFuncaoSistema(nomeFuncao = "SERVICE_TESTE_consultar", descFuncao = "Consultar Dados da Service")
    public Response consultar() {
        return Response.ok().build();
    }

    @GET
    @Path("visualizar/{id}")
    @UnoFuncaoSistema(nomeFuncao = "SERVICE_TESTE_visualizar", descFuncao = "Consultar Dados da Service")
    public Response visualizar(@PathParam("id") Integer idChamado) {
        return Response.ok().build();
    }

    @POST
    @Path("analisar-atendimento")
    @UnoFuncaoSistema(nomeFuncao = "SERVICE_TESTE_analisarAtendimento",descFuncao = "Consultar Dados da Service")
    public Response analisarAtendimento() {
        return Response.ok().build();
    }

    @POST
    @Path("alterar-analise-atendimento")
    @UnoFuncaoSistema(nomeFuncao = "SERVICE_TESTE_alterarAnaliseAtendimeto",descFuncao = "Consultar Dados da Service")
    public Response alterarAnaliseAtendimeto() {
        return Response.ok().build();
    }

    @POST
    @Path("alterar-analise-pendencia")
    @UnoFuncaoSistema(nomeFuncao = "SERVICE_TESTE_alterarAnalisePendencia",descFuncao = "Consultar Dados da Service")
    public Response alterarAnalisePendencia() {
        return Response.ok().build();
    }

    @POST
    @Path("reabrir-chamado")
    @UnoFuncaoSistema(nomeFuncao = "SERVICE_TESTE_reabrirChamado",descFuncao = "Consultar Dados da Service")
    public Response reabrirChamado(){
        return Response.ok().build();
    }

}
