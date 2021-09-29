package com.oca.alura.comparar;

public class Aula01_Comparar
{
    public static void main(String[] args)
    {
        String nome1 = new String("Pedro");
        String nome2 = "Pedro";
        String nome3 = "Pedro";
        String nome4 = new String("Pedro");

        System.out.println(nome1 == nome2);
        System.out.println(nome2 == nome3);
        System.out.println(nome1 == nome3);
        System.out.println(nome1 == nome4);

        System.out.println("-----------------");

        System.out.println(nome1.equals(nome2));
        System.out.println(nome2.equals(nome3));
        System.out.println(nome1.equals(nome3));
        System.out.println(nome1.equals(nome4));
    }
}
