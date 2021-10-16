package com.oca.alura.lacos;

import org.w3c.dom.ls.LSOutput;

public class Aula01_While
{
    public static void main(String[] args)
    {
        // while verifica a condição antes de executar as instruções de seu corpo
        int a = 1;
        while(a < 10)
        {
            System.out.println(a);
            a++;
        }

        int b = 11;
        while(b < 10)
        {
            System.out.println(b);
            b++;
        }

        int c = 1;
        while(c < 10)
            System.out.println(c++);

    }
}
