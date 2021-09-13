package com.oca.string;

public class Metodo_equalsIgnoreCase 
{
    public static void main(String[] args) 
    {
        // O método equalsIgnoreCase retorna um boolean após comparar duas strings sem levar em consideração a diferença entre maiúsculas e minúsculas
        // Única declaração: public boolean equalsIgnoreCase (String str)
        String message1, message2, message3;
        message1 = "O MongoDB é um dos SGBDOR (NoSQL) com melhor performance em larga escala";
        message2 = "O MongoDB é um dos SGBDOR (NoSQL) com melhor performance em larga escala";
        message3 = "O MONGODB é um dos SGBDOR (NOSQL) com melhor performance em LARGA ESCALA";

        boolean resultado1, resultado2, resultado3;

        resultado1 = message1.equalsIgnoreCase(message2);
        System.out.println("Resultado 1: " + resultado1);

        resultado2 = message1.equalsIgnoreCase("Abracadabra!");
        System.out.println("Resultado 2: " + resultado2);
        
        resultado3 = message1.equalsIgnoreCase(message3);
        System.out.println("Resultado 3: " + resultado3);
    }
}