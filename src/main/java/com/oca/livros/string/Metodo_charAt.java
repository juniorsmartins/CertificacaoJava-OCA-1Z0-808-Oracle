package com.oca.livros.string;

public class Metodo_charAt 
{ 
    public static void main(String[] args) // Estilo Allman de chaves
    {
        // Como utilizar o método de String chamado charAt
        String message = " Deep Purple é uma banda super quente";
        char c1, c2, c3, c4;     

        // O método charAt da classe String retorna um valor char primitivo a partir do valor de índice int relacionado ao objeto string referenciado   
        c1 = message.charAt(1);
        c2 = message.charAt(6); 
        c3 = message.charAt(13);
        c4 = message.charAt(25);
       System.out.println("Letras recuperadas por charAt: " + c1 + c2 + " " + c3 + " " + c4 + "uper");
    }
}