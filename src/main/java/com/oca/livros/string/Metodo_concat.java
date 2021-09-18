package com.oca.livros.string;

public class Metodo_concat 
{
    public static void main(String[] args) 
    {
        // Metodo concat da classe String. Ele adiciona uma string ao final da string original
        // String original
        String message = "Scorpions é uma banda irada! ";
        // O concat irá acrescentar uma string ao final da original
        String messageConcat = message.concat("Cool");
        
        System.out.println("\n" + messageConcat);
        
        // Exemplo 2
        String mensagem = "Cool";
        String message2 = "Led Zeppeling é a maior banda de todos os tempos! ";
        String messageConcat2 = message2.concat(mensagem);
        System.out.println("\n" + messageConcat2 + "\n");
    }
}