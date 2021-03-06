package com.oca.alura.lacos;

public class Aula04_BreakRotulado
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println(i);
            for(int z = 0; z < 10; z++)
            {
                if(z == 5) break;
                System.out.println("\t" + z);
            }
        }

        System.out.println("----------------------");

        externo: for(int i = 0; i < 10; i++)
        {
            System.out.println(i);
            for(int z = 0; z < 10; z++)
            {
                if(z == 5) break externo;
                System.out.println("\t" + z);
            }
        }

        System.out.println("-------------------------");
        int q = 0, w = 0;
        externo: while(q < 10)
        {
            System.out.println(q++);
            while(w < 5)
            {
                System.out.println("\t" + w++);
                if(w == 3) break externo;
            }
        }
    }
}
