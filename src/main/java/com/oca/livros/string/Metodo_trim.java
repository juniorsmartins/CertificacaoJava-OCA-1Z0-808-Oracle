package com.oca.livros.string;

public class Metodo_trim 
{
    public static void main(String[] args) 
    {
        // Metodo Trim - retorna a string inteira menos os caracteres de espaço em branco iniciais e finais do objeto string referenciado
        // A única declaração do método é: public String trim()
        String message, resultadoTrim; 
        message = " O MariaDB é um Sistema Gerenciador de Banco de Dados Relacional (SGBDR) fork do MySQL ";
        resultadoTrim = message.trim();
        
        System.out.println("Resultado: " + resultadoTrim);
    }
}