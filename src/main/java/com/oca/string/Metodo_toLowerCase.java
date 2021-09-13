package com.oca.string;

import java.util.Locale;

public class Metodo_toLowerCase 
{
    public static void main(String[] args) 
    {
        // Faz retornar a string inteira em caracteres minúsculos
        // Esse método possui duas declarações:
        // Declaração 1: public String toLowerCase ()
        String message = "Peter Chen desenvolveu uma técnica chamada Diagrama Entidade-Relacionamento (DER)";
        String resultado = message.toLowerCase();
        System.out.println("Resultado: " + resultado);
        // Declaração 2: public String toLowerCase (Locale locale)
        String resultado2 = message.toLowerCase(Locale.ENGLISH); // A definição do padrão local serve como regra de mudança para as minúsculas
        System.out.println("Resultado 2: " + resultado2);
    }
}