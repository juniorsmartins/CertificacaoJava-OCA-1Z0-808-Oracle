package com.oca.livros.string;

public class Metodo_indexOf 
{
    public static void main(String[] args) 
    {
        // Estudo do método indexOf da classe String
        String message = "OCA - Treino para Certificacao Java OCA 1Z0-808";
        int i1, i2, i3, i4;
        i1 = message.indexOf('J'); // Retorna a posição da primeira letra J
        i2 = message.indexOf('a', i1); // Retorna a posição da primeira letra a após a posição i1
        i3 = message.indexOf("Java"); // Retorna a posição de início da string Java
        i4 = message.indexOf("OCA", i1); // Retorna a posição de início da string OCA após a posição i1        
                
        System.out.printf("i1: %d \ni2: %d \ni3: %d \ni4: %d", i1, i2, i3, i4);
    }
}