package com.oca.livros.string;

public class Metodo_startsWith 
{
    public static void main(String[] args) 
    {
        // Método startsWith - verifica se o prefixo de uma string corresponde com uma string fornecida e retorn boolean como resultado
        String message = "SQL é uma linguagem de programação de paradigma declarativo das mais conhecida no mundo";
        String inicio = "SQL";
        String inicio2 = "linguagem";
        // public boolean startsWith(String prefix)
        boolean resultado = message.startsWith(inicio);
        if(resultado == true)
        {System.out.println("Verdadeiro! A string inicia com " + inicio);}
        else {System.out.println("Falso! A string não inicia com " + inicio);}
        // O método startsWith possui duas declarações. A segunda é: public boolean startsWith(String prefix, int toffset)
        boolean resultado2 = message.startsWith(inicio2, 10);
        System.out.println("Resultado2: " + resultado2 + "\n");
    }
}