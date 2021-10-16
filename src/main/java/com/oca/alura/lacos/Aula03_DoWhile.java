package com.oca.alura.lacos;

public class Aula03_DoWhile
{
    public static void main(String[] args)
    {
        // Neste cenário, ambos os Whiles (while e doWhile) imprimiriam o mesmo resultado
        int a = 0;
        while(a < 10)
        {
            System.out.println(a);
            a++;
        }

        System.out.println("----------");

        int b = 0;
        do {
            System.out.println(b);
            b++;
        }while(b < 10);

        System.out.println("----------");

        // Neste cenário, a diferença de ambos se apresenta e apenas o segundo while (doWhile) imprime resultado (20)
        // O doWhile permite executar o bloco de código ao menos uma vez. Verificará a condição apenas a partir da segunda vez
        int c = 20;
        while(c < 10)
        {
            System.out.println(c);
            c++;
        }

        System.out.println("----------");

        int d = 20;
        do {
            System.out.println(d);
            d++;
        }while(d < 10);

    }
}
