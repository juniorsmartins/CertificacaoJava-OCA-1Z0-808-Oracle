package com.oca.livros.string;

public class Atencao_encadearMetodos 
{
    public static void main(String[] args) 
    {
        // Os métodos da classe String podem ser encadeados ao invés de usados individualmente. Por exemplo: 
        // Vamos retirar espaços em branco no início e fim da string, depois substituir um trecho por outro e capturar uma parte da string
        String message = "  O PostgreeSQL foi um SGBDR até a versão 9.6, quando se tornou um SGBD-OR ";
        System.out.println("0: " + message);

        String resultado = message.trim();
        System.out.println("1: " + resultado);

        resultado = resultado.replace("SGBDR", "SGBD-R");
        System.out.println("2: " + resultado);
        
        resultado = resultado.substring(0, 44);
        System.out.println("3: " + resultado);
        
        String resultado2 = message.trim().replace("SGBDR", "SGBD-R").substring(0, 44);
        System.out.println("4: Resultado encadeando métodos: " + resultado);
    }
}