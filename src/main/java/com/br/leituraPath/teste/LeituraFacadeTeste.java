package com.br.leituraPath.teste;

import com.br.leituraPath.negocio.LeituraFormatacaoPathNegocio;

import java.util.List;

public class LeituraFacadeTeste {

    public static void main(String[] args) {
        LeituraFormatacaoPathNegocio negocio = new LeituraFormatacaoPathNegocio();
        List<String> pathsProjeto = negocio.cadastrarPermissoesUno("com.br.leituraPath.facade");

        for (String path: pathsProjeto) {
            System.out.println(path);
        }
    }


}
