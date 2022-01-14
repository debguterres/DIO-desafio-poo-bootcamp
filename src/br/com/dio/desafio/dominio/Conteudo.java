package br.com.dio.desafio.dominio;

import lombok.Getter;
import lombok.Setter;


public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    @Getter
    @Setter
    protected String titulo;

    @Getter
    @Setter
    protected String descricao;

    public abstract double calcularXp();

}
