package com.oca.alura.casting;

public class Aula01_Casting
{
    public static void main(String[] args)
    {
        double dobro = 15.3;
        int inteiro = (int) dobro; // O inteiro recebe o valor de dobro apenas se houver cast (int) - Por perda de precisão
        System.out.println(inteiro);

        float pontoFlutuante = 0.999999f;
        int inteiro2 = (int) pontoFlutuante; // Casting corta os valores na direita da vírgula/ponto. Não há nenhum arredondamento
        System.out.println(inteiro2);

        long longo = 2_100_999_999l;
        int inteiro3 = (int) longo;
        System.out.println(inteiro3);

        double longinho = 0.0;
        float ponto = (float) longinho; // Mesmo no caso do valor ser zero ou dentro dos limites, sempre precisará do casting, no caso da conversão de maior para menor
        System.out.println(ponto);
    }
}
