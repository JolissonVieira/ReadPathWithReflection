package com.br.leituraPath.business;

import com.br.leituraPath.model.annotation.UnoContextoPermissao;
import com.br.leituraPath.model.annotation.UnoFuncaoSistema;
import com.br.leituraPath.model.annotation.UnoPerfil;
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

    public UnoContextoPermissao obtercontextoFuncaoClass(Class clazz){
        return (UnoContextoPermissao) clazz.getAnnotation(UnoContextoPermissao.class);
    }

    public UnoFuncaoSistema obterFuncaoSistema(Method method){
        return (UnoFuncaoSistema) method.getAnnotation(UnoFuncaoSistema.class);
    }

    public String obterTipoServico(Method method){
        return method.getAnnotations()[0].annotationType().getSimpleName();
    }

    public String obterPathMethod( Method method){
        return substituirParametrosParaAlfanumerico(
                obterTipoServico(method) + " " + method.getAnnotation(Path.class).value());
    }

    public UnoContextoPermissao obtercontextoFuncaoMetodo(Method method){
        return (UnoContextoPermissao) method.getAnnotation(UnoContextoPermissao.class);
    }

    public UnoPerfil obterPerfis(Class clazz){
        return (UnoPerfil) clazz.getAnnotation(UnoPerfil.class);
    }

}
