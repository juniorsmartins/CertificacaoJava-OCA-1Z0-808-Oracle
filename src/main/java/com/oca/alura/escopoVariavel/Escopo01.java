package com.oca.alura.escopoVariavel;

public class Escopo01 
{
    public static void main(String[] args) 
    {
        System.out.println("Resultado: " + somar(2, 3));
    }

    static int somar(int a, int b)
    {
        int imposto = 2; // Variavel local
        return a + b + imposto; // Dois argumentos + uma variável local
    }
}