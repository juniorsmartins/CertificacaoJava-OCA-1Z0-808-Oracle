package com.oca.livros.string;

public class Metodo_endsWith 
{
    public static void main(String[] args) 
    {
        // O método endsWith verifica se o objeto string referenciado termina com o sufixo fornecido
        // Esse método possui apenas uma declaração: public boolean endsWith(String suffix)
        String messagem = "Domingão de estudo de Java para o exame OCA";
        boolean resultado = messagem.endsWith("OCA");
        System.out.println("Resultado1: " + resultado);
        
        // Exemplo 2
        String verificar = "Java";
        boolean resultado2 = messagem.endsWith(verificar);
        System.out.println("Resultado2: " + resultado2);
        
    }
}