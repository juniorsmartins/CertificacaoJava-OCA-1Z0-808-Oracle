package com.oca.alura.comparar;

import java.util.Objects;

public class Aula05_Comparar
{
    public static void main(String[] args)
    {
        Cliente cliente1 = new Cliente("Pedro");
        Cliente cliente2 = new Cliente("Manoel");
        Cliente cliente3 = new Cliente("Pedro");

        // Compara as referências dos objetos. Compara se os endereços apontam para o mesmo local.
        System.out.println(cliente1 == cliente1);
        System.out.println(cliente1 == cliente2);
        System.out.println(cliente2 == cliente3);
        System.out.println(cliente1 == cliente3);

        System.out.println("--------------------");

        // Compara o conteúdo dos objetos, mas precisa sobrescrever o equals. Caso contrário, também comparará endereços
        System.out.println(cliente1.equals(cliente1));
        System.out.println(cliente1.equals(cliente2));
        System.out.println(cliente2.equals(cliente3));
        System.out.println(cliente1.equals(cliente3));

    }
}

class Cliente
{
    private String nome;
    public Cliente (String nome)
    {this.nome = nome;}

    @Override
    public boolean equals(Object o)
    {
        Cliente cliente = (Cliente) o;
        return this.nome.equals(cliente.nome);
    }
}
