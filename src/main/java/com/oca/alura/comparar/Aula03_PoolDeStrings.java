package com.oca.alura.comparar;

public class Aula03_PoolDeStrings
{
    public static void main(String[] args)
    {
        String texto = "Um texto qualquer";
        String txt = texto.substring(3, 8);
        System.out.println(txt == "texto"); // False - Nunca irá para pool uma string criada a partir de um método
    }
}
