package com.oca.string;

public class Metodo_substring 
{
    public static void main(String[] args) 
    {
        // O método substring retorna novas strings que sejam substrings do objeto string referenciado
        String message = "Alibaba e os 40 ladroes combina com Luladrao e os 400 corruptos";

        // Declaração 1: public String substring(int beginIndex)
        String resposta1 = message.substring(36);
        System.out.println("\nResultado1: " + resposta1);

        // Declaração 2: public String substring(int beginIndex, int endIndex)
        String resposta2 = message.substring(36, 44);
        System.out.println("Resultado2: " + resposta2 + "\n");
    }
}