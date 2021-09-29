package com.oca.alura.comparar;

public class Aula02_PoolDeStrings
{
    public static void main(String[] args)
    {
        String a = "a";
        String ab = a + "b";
        System.out.println(ab == "ab");

        ab = "a" + "b";
        System.out.println(ab == "ab");
    }
}
