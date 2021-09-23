package com.oca.alura.excecao;

public class Aula01_TestaExcecao
{
    public static void main(String[] args)
    {
        System.out.println("Início do main");

        try {
            metodo1();
        }catch(Aula01_MinhaExcecao ex) {
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("Exceção encerrada!");
        }

        System.out.println("Fim do main");
    }

    private static void metodo1()
    {
        System.out.println("Início do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2()
    {
        System.out.println("Início do metodo2");
        throw new Aula01_MinhaExcecao("MinhaExcecao funciona!");
    }
}
