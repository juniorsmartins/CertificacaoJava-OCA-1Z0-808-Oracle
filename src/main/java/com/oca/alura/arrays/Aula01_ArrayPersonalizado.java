package com.oca.alura.arrays;

public class Aula01_ArrayPersonalizado
{
    // Atributos
    private Aula01_Conta[] referencias;
    private int posicaoLivre;

    // Construtor
    public Aula01_ArrayPersonalizado()
    {
        referencias = new Aula01_Conta[10];
        posicaoLivre = 0;
    }

    public void adiciona(Aula01_Conta conta)
    {
        referencias[posicaoLivre] = conta;
        posicaoLivre++;
    }

    public int getQtdeElementos()
    {return posicaoLivre;}

    public Aula01_Conta getReferencia(int posicao)
    {return referencias[posicao];}
}
