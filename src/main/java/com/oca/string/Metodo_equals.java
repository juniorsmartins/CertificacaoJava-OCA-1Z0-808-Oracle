package com.oca.string;

public class Metodo_equals 
{
    public static void main(String[] args) 
    {
        String msg1 = "Java é elegante e estiloso!";
        String msg2 = "Java é elegante e estiloso!";
        String msg3 = "JAVA É ELEGANTE E ESTILOSO!";
        String msg4 = ("Java é elegante e estiloso!");
        String msg5 = new String("Java é elegante e estiloso!");
        
        // O método equals compara o valor da string armazenado na memória heap - faz distinção de maiúsculas e minúsculas
        System.out.println("1 - " + msg1.equals(msg2)); // Igual
        System.out.println("2 - " + msg1.equals(msg3)); // Diferente
        System.out.println("3 - " + msg1.equals(msg4)); // Igual
        System.out.println("4 - " + msg1.equals(msg5)); // Igual
        
        // O == compara as referências/endereços armazenados na memória stack
        String msg6 = msg1;
        System.out.println("5 - " + (msg1 == msg2)); // Igual - Não recomendado - Não faça
        System.out.println("6 - " + (msg1 == msg6)); // Igual
    }
}