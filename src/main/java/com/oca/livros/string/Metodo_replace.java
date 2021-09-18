package com.oca.livros.string;

public class Metodo_replace 
{
    public static void main(String[] args) // Uso de chaves ao estilo Allman
    {
        // Método Replace - substitui caracteres da string original por novos caracteres e retorna a nova string
        String messageOrigin = "Johnny Cash fez sucesso com a música, Hurt";
        // String replace(char oldChar, char newChar) 
        String messageNew = messageOrigin.replace('o', 'x');
        // Letras O foram substituídas por x
        System.out.println(messageNew);
        
        // Exemplo 2: o método replace possui duas declarações. A segunda é String replace(CharSequence target, CharSequence replacement)
        String messageNew2 = messageOrigin.replace("a música", "o lendário som");
        
        System.out.println(messageNew2);
    }
}