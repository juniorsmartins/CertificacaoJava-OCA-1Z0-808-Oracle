package com.oca.alura.arrays;

public class Aula01_TestaPersonalizado
{
    public static void main(String[] args)
    {
        Aula01_ArrayPersonalizado guardador = new Aula01_ArrayPersonalizado();

        Aula01_ContaCorrente cc1 = new Aula01_ContaCorrente(95, 11223344, "Ludwig Von Misses");
        Aula01_ContaCorrente cc2 = new Aula01_ContaCorrente(47, 44442211, "Michael Faucoult");
        Aula01_ContaPoupanca pp1 = new Aula01_ContaPoupanca(33, 22223333, 0.7f);
        Aula01_ContaPoupanca pp2 = new Aula01_ContaPoupanca(12, 77788899, 0.65f);
        Aula01_ContaCorrente cc3 = new Aula01_ContaCorrente(18, 55544499, "Alanis Morissette");
        Aula01_ContaCorrente cc4 = new Aula01_ContaCorrente(82, 667779992, "Franz Kafka");
        guardador.adiciona(cc1);
        guardador.adiciona(cc2);
        guardador.adiciona(pp1);
        guardador.adiciona(cc3);
        guardador.adiciona(cc4);
        guardador.adiciona(pp2);

        int tamanho = guardador.getQtdeElementos();
        System.out.println(tamanho);

        Aula01_Conta ref1 = guardador.getReferencia(1);
        System.out.println(ref1);

        Aula01_Conta ref2 = guardador.getReferencia(2);
        System.out.println(ref2);
    }
}
