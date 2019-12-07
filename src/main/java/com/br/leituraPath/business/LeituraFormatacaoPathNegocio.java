package com.br.leituraPath.business;

import com.br.leituraPath.model.annotation.ContextoFuncao;
import com.br.leituraPath.model.annotation.FuncaoSistema;
import com.br.leituraPath.model.annotation.Perfil;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;

import javax.ws.rs.Path;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class LeituraFormatacaoPathNegocio {

    public List<Class> obterListaClassesProjeto(String diretorio){
        Reflections reflections = new Reflections(
                diretorio,
                new SubTypesScanner(false),
                ClasspathHelper.forClassLoader());
        List<Class> classes =  new ArrayList<>(reflections.getSubTypesOf(Object.class));
        return classes;
    };

    private String substituirParametrosParaAlfanumerico(String pathSemFormatacao) {
        return Pattern.compile("\\{(.*?)\\}").matcher(pathSemFormatacao).replaceAll("{alfanumerico}");
    }

    public Path obterPathClass(Class clazz){
        return (Path) clazz.getDeclaredAnnotation(Path.class);
    }

    public ContextoFuncao obtercontextoFuncaoClass(Class clazz){
        return (ContextoFuncao) clazz.getAnnotation(ContextoFuncao.class);
    }

    public FuncaoSistema obterFuncaoSistema( Method method){
        return (FuncaoSistema) method.getAnnotation(FuncaoSistema.class);
    }

    public String obterTipoServico(Method method){
        return method.getAnnotations()[0].annotationType().getSimpleName();
    }

    public String obterPathMethod( Method method){
        return substituirParametrosParaAlfanumerico(
                obterTipoServico(method) + " " + method.getAnnotation(Path.class).value());
    }

    public ContextoFuncao obtercontextoFuncaoMetodo(Method method){
        return (ContextoFuncao) method.getAnnotation(ContextoFuncao.class);
    }

}
