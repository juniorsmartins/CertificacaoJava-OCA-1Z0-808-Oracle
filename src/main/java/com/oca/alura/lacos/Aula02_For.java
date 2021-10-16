package com.oca.alura.lacos;

public class Aula02_For
{
    public static void main(String[] args)
    {
        // Rodada 1
        // Parte 1 = declaração e inicialização de variável int a = 1;
        // Parte 2 = condição a < 10
        // Parte 3 = execução do bloco de código dentro das chaves {}
        // Parte 4 = incremento a++
        // Rodada 2
        // Parte 2 = condição a < 10
        // Parte 3 = execução do bloco de código dentro das chaves {}
        // Parte 4 = incremento a++
        // Rodada 3 (repete a rodada 2 até a satisfação da condição)...
        for(int a = 1; a < 10; a++)
        {
            System.out.println(a);
        }

        // não será executado - a condição não foi satisfeita
        for(int b = 1; b > 10; b++)
        {
            System.out.println(b);
        }

        // Todas as três partes do for são opcionais - mas é preciso manter os ponto e vírgulas
        for(int c = 11; c < 20;)
        {
            System.out.println(c);
            c++;
        }

        // Todas as três partes do for são opcionais - mas é preciso manter os ponto e vírgulas
        int d = 21;
        for(; d < 30;)
        {
            System.out.println(d);
            d++;
        }

        // Gerará looping infinito. Quando não há condição, o true substitui a condição por padrão
//        for(;;)
//            System.out.println("Oi");

        // O for permite declarar e inicializar duas variáveis na primeira parte-dependencia - Porém, precisam ter o mesmo tipo
        for(int e = 0, f = 10; e < 10; e++)
        {
            System.out.println(e + " + " + f + " = " + (e + f));
        }

        // O for permite acrescentar uma segunda operação na terceira parte-dependencia
        for(int g = 0, h = 100; g < 10; g++, --h)
        {
            System.out.println(g + " + " + h + " = " + (g + h));
        }

        // O for permite apenas inicializar na primeira parte, caso declare as variáveis anteriormente
        int aa, bb;
        for(aa = 0, bb = 1100; aa < 10; aa++, --bb)
        {
            System.out.println(aa + " + " + bb + " = " + (aa + bb));
        }

        // O for permite apenas inicializar na primeira parte, caso declare as variáveis anteriormente. E, somente nesse caso,
        // permite que as variáveis sejam de tipos diferentes.
        int cc;
        long dd;
        for(cc = 0, dd = 2000; cc < 10; cc++, --dd)
        {
            System.out.println(cc + " + " + dd + " = " + (cc + dd));
        }

        // A terceira parte do for permite a execução de instruções/metodos
        int z, v;
        for(z = 0, v = 3000; z < 10; z++, --v, System.out.println(z + v));


    }
}







