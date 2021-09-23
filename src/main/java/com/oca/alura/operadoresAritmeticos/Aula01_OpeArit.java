package com.oca.alura.operadoresAritmeticos;

public class Aula01_OpeArit
{
    public static void main(String[] args)
    {
        int a = 2;
        System.out.println((a / 0.0) / 0); // Imprime infinity

        double positivoInfinito = 5.0 / 0.0;
        double negativoInfinito = -5.0 / 0.0;
        System.out.println(positivoInfinito + negativoInfinito); // Imprime NaN - não é um número
    }
}