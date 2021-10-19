package com.oca.alura.metodos;

public class Aula01_DeclaracaoEAssinatura
{
    public static void main(String[] args)
    {
        Calculadora calc = new Calculadora();

        // chamada de método
        calc.nomeMetodo("Olá, Mundo!");
        int c = calc.somar(2, 3);
        System.out.println(c);
    }
}

class Calculadora
{
    // Declaração (modificadores<opcional> + tipo de retorno + nome do método + parâmetros + aviso de exceptions<opcional>)
    // Assinatura (nome do método + parâmetros(quantia, tipo e ordem de tipos))
    public void nomeMetodo(String qualquer)
    {System.out.println(qualquer);}

    // Declaração = public int somar(int a, int b)
    // Assinatura = somar(int a, int b)
    public int somar(int a, int b)
    {return a + b;}
}
