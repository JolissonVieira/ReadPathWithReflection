package com.br.leituraPath.model.teste;

import com.br.leituraPath.business.LeituraFormatacaoPathNegocio;
import com.br.leituraPath.business.ManterFluxoPermissaoUnoNegocio;

import java.util.List;

public class LeituraFacadeTeste {

    public static void main(String[] args) {

        ManterFluxoPermissaoUnoNegocio manterFluxoPermissaoUnoNegocio = new ManterFluxoPermissaoUnoNegocio();

        manterFluxoPermissaoUnoNegocio.cadastrarPermissoesUno("com.br.leituraPath.controllerProject");

    }


}
