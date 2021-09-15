package com.oca.stringbuilder;

public class Exercicios_Construtores 
{
    public static void main(String[] args) 
    {
        // 1. Crie instâncias de StringBuilder com o construtor StringBuilder()
        StringBuilder palavra = new StringBuilder();
        palavra.append("Java");
        System.out.println("01 - " + palavra);
        
        // 2. Crie instâncias de StringBuilder com o construtor StringBuilder(String str)
        StringBuilder palavras = new StringBuilder("O MER é base para o Diagrama Entidade-Relacionamento.");
        System.out.println("02 - " + palavras + " " + palavras.length());
    }
}