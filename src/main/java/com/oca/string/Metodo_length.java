package com.oca.string;

public class Metodo_length 
{
    public static void main(String[] args) 
    {
        // O método length da classe String retorna um valor primitivo int que representa o tamanho do objeto string referenciado
        String message = "Domingo, 12/09/21, 15h08, estudando Java!";
        String message2 = "Junior Martins";
        
        // Esse método só possui uma única declaração
        int tamanho = message.length();
        int tamanho2 = message2.length();
        
        System.out.println("\nTamanho: " + tamanho);
        System.out.println("\nTamanho2: " + tamanho2);
    }
}