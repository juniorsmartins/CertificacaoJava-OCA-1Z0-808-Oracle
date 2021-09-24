package com.oca.alura.arrays;

public class Aula01_ContaCorrente extends Aula01_Conta
{
    // Atributo
    private String nome;

    // Construtor
    public Aula01_ContaCorrente(int agencia, int numero, String nome)
    {
        super.setAgencia(agencia);
        super.setNumero(numero);
        this.setNome(nome);
    }

    // Métodos Getters e Setters
    public String getNome()
    {return nome;}
    public void setNome(String nome)
    {this.nome = nome;}

    // Métodos sobreescritos
    @Override
    public String toString()
    {
        return "\nContaCorrente: \nAgência: " + super.getAgencia()
                + "\nNúmero: " + super.getNumero()
                + "\nNomeCliente: " + this.getNome();
    }
}
