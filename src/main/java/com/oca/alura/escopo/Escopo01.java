package com.oca.alura.escopo;

public class Escopo01 
{
    public static int a = 201;

    public static void main(String[] args) 
    {
        System.out.println("\nResultado somar: " + somar(2, 3));
        Escopo01 escopo = new Escopo01();
        System.out.println("\nResultado diminuir: " + escopo.diminuir(10, 2));

        int a = 20, b = 5; // Variáveis locais do método Main
        System.out.println("\nResultado dividir: " + (a / b));
        
        System.out.println("");
        
        escopo.casoForEspecial();
    }

    static int somar(int a, int b)
    {
        // Todas locais do método Somar
        int imposto = 2; // Variavel local - fica disponível apenas entre as chaves - não pode ser usada fora
        return a + b + imposto; // Dois argumentos + uma variável local - parêmetros também são variáveis locais
    }
    
    int diminuir(int a, int c)
    {
        // Locais do método diminuir
        return a - c; // Parâmetros a e c são variáveis locais
    }
    
    void casoForEspecial()
    {
        for(int i = 0, j = 0; i < 10; i++) j++;
        // System.out.println("Imprimir: " + i); Erro de compilação - i é variável local do for - está dentro das chaves implícitas dele
        // System.out.println("Imprimir: " + j); Erro de compilação - j está dentro das chaves implícitas - não aparece, mas as chaves estao ao redor do j++;
    }
}







