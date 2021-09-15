package com.oca.string;

public class Metodo_compareTo 
{
    public static void main(String[] args) 
    {
        // Ele compara duas strings lexicograficamente. Ele funciona primeiro atribuindo a cada 
        // caractere na string um valor Unicode e, em seguida, comparando as strings. Este processo 
        // retorna o resultado como zero, um número positivo ou um número negativo.
        // 1 - O resultado é zero quando as duas strings comparadas são iguais lexicograficamente.
        // 2 - O resultado é positivo se a primeira string for maior do que a segunda string.
        // 3 - O resultado é negativo quando a segunda string é maior do que a primeira string.
               
        // Retorna zero
        String eggs1 = "Cackle Fruit";
        String eggs2 = "Cackle Fruit";
        System.out.println(eggs1.compareTo(eggs2));

        // Retorna positivo
        String eggs3 = "Cackle";
        System.out.println(eggs1.compareTo(eggs3));

        // Retorna negativo
        String eggs4 = "Cackle Fruit and Cakes!";
        System.out.println(eggs1.compareTo(eggs4));
    }
}