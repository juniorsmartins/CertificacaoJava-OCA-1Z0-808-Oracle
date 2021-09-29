package com.oca.alura.comparar;

import java.util.Locale;

public class Aula03_PoolDeStrings
{
    public static void main(String[] args)
    {
        String texto = "um texto qualquer";
        String txt = texto.substring(3, 8);
        System.out.println(txt == "texto"); // False - Nunca irá para pool uma string criada a partir de um método

        System.out.println("------------------");

        // Exceção
        // true - São iguais, pois como o método não alterou a string, não foi preciso criar nova string. Então se fez pool.
        System.out.println(texto.toLowerCase() == texto); // true
        System.out.println(texto.toString() == texto); // true
    }
}
