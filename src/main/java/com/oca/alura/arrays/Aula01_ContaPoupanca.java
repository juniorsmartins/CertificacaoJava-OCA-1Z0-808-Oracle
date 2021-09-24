package com.oca.alura.arrays;

public class Aula01_ContaPoupanca extends Aula01_Conta
{
    // Atributos
    private float rendaMensal;

    // Construtor
    public Aula01_ContaPoupanca(int agencia, int numero, float rendaMensal)
    {
        super.setAgencia(agencia);
        super.setNumero(numero);
        this.setRendaMensal(rendaMensal);
    }

    // Getters e Setters
    public float getRendaMensal()
    {return rendaMensal;}
    public void setRendaMensal(float rendaMensal)
    {this.rendaMensal = rendaMensal;}

    // Métodos Sobreescritos
    @Override
    public String toString()
    {
        return "\nContaPoupanca \nAgência: " + super.getAgencia()
                + "\nNúmero: " + super.getNumero()
                + "\nRendaMensal: " + this.getRendaMensal();
    }
}
