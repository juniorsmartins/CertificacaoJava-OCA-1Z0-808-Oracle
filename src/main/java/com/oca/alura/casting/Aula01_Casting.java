package com.oca.alura.casting;

public class Aula01_Casting
{
    public static void main(String[] args)
    {
        double dobro = 15.3;
        int inteiro = (int) dobro; // O inteiro recebe o valor de dobro apenas se houver cast (int) - Por perda de precisão
        System.out.println(inteiro);
    }
}
