package com.oca.livros.stringbuilder;

public class Metodo_reverse 
{
    public static void main(String[] args) 
    {
        // O método reverse inverte a ordem da sequência de caracteres
        // Há única declaração: public StringBuilder reverse ()
        StringBuilder palavras = new StringBuilder("Alura Multiverso");
        palavras = palavras.reverse();
        System.out.println("Resultado do reverse: " + palavras);
    }
}