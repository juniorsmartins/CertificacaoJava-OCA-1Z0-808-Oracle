package com.oca.alura.arrays;

public class Aula03_Arrays
{
    public static void main(String[] args) {
        String[] valores = new String[2];
        valores[0] = "Certificação";
        valores[1] = "Java";
        Object[] vals = (Object[]) valores;
        vals[1] = "Daniela";
        System.out.println(vals[1].equals(valores[1]));
    }
}
