package com.oca.livros.variaveis;

public class Byte 
{
	public static void main(String[] args)
	{
		byte variavelPequena = 2; // Tamanho de 1 byte = 8 bits
		
		// Declaração 
		byte pequena;
		
		// Inicialização - variáveis locais precisam ser inicializadas. 
		pequena = 0; // Variáveis locais não possuem valor padrão
		
		// Valor mínimo de um byte
		byte minimo = -128;
		// valor máximo de um byte
		byte maximo = 127;
		
		// Coerção implícita
		byte coercao = 4;
		// Coercao explícita
		byte coercaoExp = (byte) 8;
		
		System.out.println(maximo);
		
	}
}
