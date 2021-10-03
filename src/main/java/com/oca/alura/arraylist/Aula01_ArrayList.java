package com.oca.alura.arraylist;

import java.util.ArrayList;

public class Aula01_ArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> listaInt = new ArrayList<>();
        listaInt.add(20);
        listaInt.add(15);
        listaInt.add(9);
        listaInt.add(10);
        listaInt.add(17);
        listaInt.add(22);
        listaInt.add(5);
        listaInt.stream().sorted().forEach(System.out::println);

        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("certificação");
        nomes.add("java");

        System.out.println("Contém Java: " + nomes.contains("java")); // true
        System.out.println("Contém C#: " + nomes.contains("c#")); // false

        // true, encontrado e removido
        System.out.println("Java foi removido: " + nomes.remove("java"));

        nomes.add("Python");
        nomes.add("Java");
        nomes.add("C++");
        nomes.add("JavaScript");

        System.out.println("Qual o tamanho da ArrayList: " + nomes.size());

        // Converter ArrayList para Array de objetos
        Object[] nomesComoString = nomes.toArray();


        // Converter ArrayList de String para Array de String
        ArrayList<String> listaNomes = new ArrayList<>();
        nomes.add("Pedro");
        nomes.add("Mário");
        nomes.add("Maria");
        nomes.add("Carlos");
        nomes.add("Isabelle");
        nomes.add("Michele");

        String[] nomes2 = listaNomes.toArray(new String[0]); // forma 1 - indicando zero para se adaptar automático ao tamanho da lista de nomes
        String[] nomes3 = nomes.toArray(new String[nomes.size()]); // forma 2 - indicando o tamanho da lista de nomes
    }
}
