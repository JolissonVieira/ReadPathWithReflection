package com.br.leituraPath.controllerProject;

import com.br.leituraPath.model.annotation.ContextoFuncao;
import com.br.leituraPath.model.annotation.FuncaoSistema;
import com.br.leituraPath.model.annotation.Perfil;
import io.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;


@Path(value = "pathClass")
@ContextoFuncao(nome = "Primeiro Contexto Para Teste", descricao = "Contexto Utilizado Para testes")
@Perfil(nome = {"Administrador","Atendente"})
public class ServiceTeste   {

    @POST
    @Path("consultar")
    @FuncaoSistema(nomeFuncao = "SERVICE_TESTE_consultar",descFuncao = "Consultar Dados da Service")
    public Response consultar() {
        return Response.ok().build();
    }

    @GET
    @Path("visualizar/{id}")
    @FuncaoSistema(nomeFuncao = "SERVICE_TESTE_visualizar",descFuncao = "Consultar Dados da Service")
    public Response visualizar(@PathParam("id") Integer idChamado) {
        return Response.ok().build();
    }

    @POST
    @Path("analisar-atendimento")
    @FuncaoSistema(nomeFuncao = "SERVICE_TESTE_analisarAtendimento",descFuncao = "Consultar Dados da Service")
    public Response analisarAtendimento() {
        return Response.ok().build();
    }

    @POST
    @Path("alterar-analise-atendimento")
    @FuncaoSistema(nomeFuncao = "SERVICE_TESTE_alterarAnaliseAtendimeto",descFuncao = "Consultar Dados da Service")
    public Response alterarAnaliseAtendimeto() {
        return Response.ok().build();
    }

    @POST
    @Path("alterar-analise-pendencia")
    @FuncaoSistema(nomeFuncao = "SERVICE_TESTE_alterarAnalisePendencia",descFuncao = "Consultar Dados da Service")
    public Response alterarAnalisePendencia() {
        return Response.ok().build();
    }

    @POST
    @Path("reabrir-chamado")
    @FuncaoSistema(nomeFuncao = "SERVICE_TESTE_reabrirChamado",descFuncao = "Consultar Dados da Service")
    public Response reabrirChamado(){
        return Response.ok().build();
    }

}
