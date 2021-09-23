package com.oca.alura.excecao;

public class Aula01_MinhaExcecao extends RuntimeException
{
    // Consturtores
    public Aula01_MinhaExcecao(){}
    public Aula01_MinhaExcecao(String mensagem)
    {super(mensagem);}
}
