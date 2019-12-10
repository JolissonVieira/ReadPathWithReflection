package com.br.leituraPath.model.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface UnoContextoPermissao {
    public String nomeContexto();
    public String descContexto();
    public String nomePermissao();
    public String descPermissao();
}
