package com.br.leituraPath.negocio;

import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;

import javax.ws.rs.Path;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class LeituraFormatacaoPathNegocio {

    public List<String> cadastrarPermissoesUno(String diretorioEndPoint){
        List<String> listaPathsRecuperados = new ArrayList<>();
        for (Class clazz : obterListaClassesProjeto(diretorioEndPoint)) {
            listaPathsRecuperados.addAll(obterListaPathsClasse(clazz));
        };
        return listaPathsRecuperados;
    }

    private List<Class> obterListaClassesProjeto(String diretorio){
        Reflections reflections = new Reflections(
                diretorio,
                new SubTypesScanner(false),
                ClasspathHelper.forClassLoader());
        List<Class> classes =  new ArrayList<>(reflections.getSubTypesOf(Object.class));
        return classes;
    };

    private List<String> obterListaPathsClasse(Class clazz) {
        Path pathClass = (Path) clazz.getDeclaredAnnotation(Path.class);
        List<String> pathsProject = new ArrayList<>();
        for ( Method method : clazz.getDeclaredMethods()) {
            String tipoServico = method.getAnnotations()[0].annotationType().getSimpleName();
            Path pathMetodos = method.getAnnotation(Path.class);
           pathsProject.add(tipoServico + " " + pathClass.value() + "/"+ substituirParametrosParaAlfanumerico(pathMetodos.value()));
        }
        return pathsProject;
    };

    private String substituirParametrosParaAlfanumerico(String pathSemFormatacao) {
        return Pattern.compile("\\{(.*?)\\}").matcher(pathSemFormatacao).replaceAll("{alfanumerico}");
    }


}
