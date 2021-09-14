package com.oca.stringbuilder;

public class Metodo_deleteCharAt 
{
    public static void main(String[] args) 
    {
        // O método deleteCharAt remove o caractere do índice especificado
        // Há uma declaração:
        // public StringBuilder deleteCharAt (int index)
        StringBuilder sb = new StringBuilder("No caminho da especialização em Java!");
        System.out.println(sb);
        System.out.println(sb.length()); // Tamanho da string
        System.out.println(sb.deleteCharAt(36)); // Retirar apenas o ponto de exclamação
    }
}