package com.oca.alura.arrays;

import java.util.Arrays;

public class Aula02_Arrays
{
    public static void main(String[] args)
    {
        // Declarações válidas de array
        int[] arrayDeInteiro;
        double arrayDeDouble[];
        long []numeros;
        long[]tamanhos;

        // Instanciações/Inicializações válidas de array - Por padrão, o array já inicializa valores padrões na instanciação
        int[] arrayInteiro = new int[3]; // O três define o tamanho do array - Por padrão int, já inicializa com valores zero
        System.out.println(arrayInteiro[0] + " " + arrayInteiro[1] + " " + arrayInteiro[2]);

        // Valores padrão somente para atributos ou com o uso do new. Se não usar o new, no caso de variáveis locais, não há valor padrão.
        // Outra coisa, o array aceita ser declarado com tamanho 0 e até com tamanho negativo
        //compila e roda - gerará exceção quando for usado pelo indice
        int[] nos = new int[0];
        //compila, mas joga NegativeArraySizeException
        nos = new int[-1];

        double[] arrayDouble = new double[2];
        System.out.println(arrayDouble[0] + " " + arrayDouble[1]);

        String[] arrayString = new String[2]; // Por padrão String, já inicializa com valores null
        System.out.println(arrayString[0] + " " + arrayString[1]);

        boolean[] arrayBoolean = new boolean[2]; // Por padrão boolean, já inicializa com valores false
        System.out.println(arrayBoolean[0] + " " + arrayBoolean[1]);

        int[] idades = new int[]{20, 24, 27, 32, 40, 45, 50, 47, 52, 68, 61, 79, 70, 82, 53};
        for(int idade : idades)
        {System.out.print(idade + " ");}

        Aula01_Conta[] conta = new Aula01_Conta[]{new Aula01_Conta(), null, new Aula01_Conta(), null, null, new Aula01_Conta()};
        Arrays.stream(conta).toList().forEach(System.out::println);

        int[] nums = {20, 32, 40, 50, 68, 79, 82, 53};
        for(int i = 0; i < nums.length; i++)
        {System.out.print(nums[i] + " ");}

        Aula01_Conta[] contas = {new Aula01_Conta(), null, new Aula01_Conta(), null, null, new Aula01_Conta()};
        Arrays.stream(contas).toList().forEach(System.out::println);

        // Cuidado com inicializar em partes - esse abaixo não pode
        // int[] tamanho;
        // tamanho = {2, 3, 5, 9};

        int[] tam;
        tam = new int[]{2, 3, 5, 9};

        // Inclusão
        tam[1] = 7;
        tam[3] = 10;
        for(int t : tam){System.out.print(t + " ");}

/*
        A prova de certificação verifica se o candidato está apto a manipular tanto arrays de tipos
        primitivos quanto de tipos não primitivos.
        Os quatro pontos importantes sobre arrays são:
        Declarar
        Inicializar
        Acessar
        Percorrer
*/

    }
}
