package com.oca.alura.lacos;

public class Aula05_ContinueRotulado
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println(i);
            for(int z = 0; z < 10; z++)
            {
                if(z == 5) continue;
                System.out.println("\t" + z);
            }
        }

        System.out.println("----------------------");

        externo: for(int i = 0; i < 10; i++)
        {
            System.out.println(i);
            for(int z = 0; z < 10; z++)
            {
                if(z == 5) continue externo;
                System.out.println("\t" + z);
            }
        }
    }
}
