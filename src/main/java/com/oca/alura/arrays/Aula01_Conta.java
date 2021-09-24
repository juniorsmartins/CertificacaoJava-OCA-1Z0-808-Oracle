package com.oca.alura.arrays;

public class Aula01_Conta
{
    // Atributos de Instância
    private int agencia;
    private int numero;

    // Construtor
    protected Aula01_Conta(){}
    public Aula01_Conta(int agencia, int numero)
    {
        this.agencia = agencia;
        this.numero = numero;
    }

    // Métodos Getters e Setters
    public int getAgencia()
    {return agencia;}
    public void setAgencia(int agencia)
    {this.agencia = agencia;}
    public int getNumero()
    {return numero;}
    public void setNumero(int numero)
    {this.numero = numero;}
}
