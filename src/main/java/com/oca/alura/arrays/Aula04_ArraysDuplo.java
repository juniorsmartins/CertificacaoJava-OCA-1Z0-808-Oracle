package com.oca.alura.arrays;

public class Aula04_ArraysDuplo
{
    public static void main(String[] args)
    {
        // Declarações válidas de arrays de mais dimensões
        int[][] tabela; // duas dimensões
        int[][] cubo[]; // três dimensões
        int [][] hipercubo[][]; // quatro dimensões

        // Inicializações válidas de arrays de multiplas dimensões
        tabela = new int[10][5];
        cubo = new int[10][][]; // Pode escolher definir o tamanho de apenas a primeira dimensão

        int[][] hiper[][] = new int[5][][][];
        int[] h[][][] = new int[5][4][2][5];

        int[] a1[] = new int[][]{{1,3},{4,5}};

        int[][] teste = new int[][]{{1,2,3},{3,2,1},{1,1,1}, {3,3,3}, {5,5,5}};
        for(int linha = 0; linha < teste.length; linha++)
        {
            for(int coluna = 0; coluna < 3; coluna++)
            {
                     System.out.print(teste[linha][coluna]);
             }
            System.out.println("");
        }

    }
}
