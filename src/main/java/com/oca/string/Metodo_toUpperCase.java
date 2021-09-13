package com.oca.string;

import java.util.Locale;

public class Metodo_toUpperCase 
{
    public static void main(String[] args) 
    {
        // Faz retornar a string inteira em caracteres maiúsculos
        // Esse método possui duas declarações:
        // Declaração 1: public String toUpperCase ()
        String message = "O retângulo simboliza uma entidade no Diagrama Entidade-Relacionamento (DER) de Peter Chen";
        String resultado1 = message.toUpperCase();
        System.out.println("Resultado 1: " + resultado1);
        // Declaração 2: public String toUpperCase (Locale locale)
        String resultado2 = message.toUpperCase(Locale.ITALY);
        System.out.println("Resultado 2: " + resultado2);
    }
}