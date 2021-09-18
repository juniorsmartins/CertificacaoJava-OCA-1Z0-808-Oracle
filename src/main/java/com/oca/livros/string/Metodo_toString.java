package com.oca.livros.string;

public class Metodo_toString 
{
    private String nome;
    private int idade;

    public static void main(String[] args) // Chaves ao estilo Allman
    {   
        Metodo_toString aula = new Metodo_toString();
        aula.nome = "Pedro";
        aula.idade = 28;
        
        // Uso do toString
        System.out.println(aula);

    }

        // Sobreescrição de método toString da classe Object
        @Override
        public String toString()
        {
            return "\nMétodo toString: \nNome: " + this.nome + "\nIdade: " + this.idade + "\n";
        }
}