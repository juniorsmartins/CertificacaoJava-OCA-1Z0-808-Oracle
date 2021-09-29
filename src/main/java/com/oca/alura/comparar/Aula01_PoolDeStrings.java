package com.oca.alura.comparar;

public class Aula01_PoolDeStrings
{
    public static void main(String[] args)
    {
        String nome1 = new String("Pedro");
        String nome2 = "Pedro";
        String nome3 = "Pedro";
        String nome4 = new String("Pedro");

        System.out.println(nome1 == nome2);
        System.out.println(nome2 == nome3); // Aqui ocorre pool de strings - a JVM economiza memória com objetos iguais
        System.out.println(nome1 == nome3);
        System.out.println(nome1 == nome4);

        System.out.println("-----------------");

        System.out.println(nome1.equals(nome2));
        System.out.println(nome2.equals(nome3));
        System.out.println(nome1.equals(nome3));
        System.out.println(nome1.equals(nome4));

        /*
        Pool de Strings
        O Java mantém um ::pool:: de objetos do tipo String. Antes de criar uma nova String, primeiro o Java
        verifica neste pool se uma String com o mesmo conteúdo já existe; caso sim, ele a reutiliza, evitando
        criar dois objetos exatamente iguais na memória. Como as duas referências estão apontando para o mesmo
        objeto do pool, o == retorna true.

        Mas por que isso não aconteceu antes, com nosso primeiro exemplo? O Java só coloca no pool as Strings
        criadas usando literais. Strings criadas com o operador new não são colocadas no pool automaticamente.
        */
    }
}
