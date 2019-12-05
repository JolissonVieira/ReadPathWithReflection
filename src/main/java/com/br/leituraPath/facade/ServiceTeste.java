package com.br.leituraPath.facade;

import javax.ws.rs.*;
import javax.ws.rs.core.Application;


@Path(value = "pathClass")
public class ServiceTeste   {

    public ServiceTeste() {
    }

    @GET
    @Path(value = "primeiro/{parametro}")
    public void primeiroMetodo(){
    }

    @POST
    @Path(value = "segundo/{parametro}/depois/{parametro}")
    public void segundoMetodo(){
    }

    @PUT
    @Path(value = "terceiro")
    public void terceiroMetodo(){
    }

    @DELETE
    @Path(value = "terceiro")
    public void quartoMetodo(){
    }
}
