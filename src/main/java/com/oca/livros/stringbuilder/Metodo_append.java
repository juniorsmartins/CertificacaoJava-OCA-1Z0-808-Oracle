package com.oca.livros.stringbuilder;

public class Metodo_append 
{
    public static void main(String[] args) 
    {
        // O método append acrescenta os dados fornecidos como uma cadeia de caracteres
        // São 13 declarações:
        // public StringBuilder append(Object o) 

        // public StringBuilder append(String str) - Serve para acrescentar uma string ao final de outra - tipo concatenar
        StringBuilder message1 = new StringBuilder("\nMariaDB");
        System.out.println(message1.append(" é fork do MySQL!"));

        // public StringBuilder append(CharSequence s) 
        // public StringBuilder append(CharSequence s, int start, int end) 
        // public StringBuilder append(char[] str) 
        // public StringBuilder append(char[] str, int offset, int len) 

        StringBuilder e = new StringBuilder("Exemplos:");
        // public StringBuilder append(String str)
        e.append(" ").append("1");
        // public StringBuilder append(StringBuffer sb) 
        e.append(" ").append(new StringBuilder("2"));
        // public StringBuilder append(char c) 
        e.append(" ").append('\u0031');
        // public StringBuilder append(int i) 
        e.append(" ").append((int)2);
        // public StringBuilder append(long l) 
        e.append(" ").append(1L);
        // public StringBuilder append(float f) 
        e.append(" ").append(2F);
        // public StringBuilder append(double d)
        e.append(" ").append(1D);
        // public StringBuilder append(boolean b) 
        e.append(" ").append(true);

        System.out.println("\n" + e);
    }
}