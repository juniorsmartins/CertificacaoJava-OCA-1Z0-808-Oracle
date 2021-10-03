package com.oca.alura.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Aula01_Iterator
{
    public static void main(String[] args)
    {
        Collection<String> strings = new ArrayList<>();
        strings.add("Pedro");
        strings.add("Paulo");
        strings.add("Maria");

        Iterator<String> iterator = strings.iterator();

        while (iterator.hasNext())
        {
            String atual = iterator.next();
            System.out.println(atual);
        }



        // Vale lembrar que Java sempre trabalha com referências para objetos, e não cria cópias de objetos cada vez que os atribuímos a uma variável ou referência:
        Cliente guilherme = new Cliente();
        guilherme.setNome("guilherme");

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(guilherme);

        System.out.println(guilherme.getNome()); // guilherme
        System.out.println(clientes.get(0).getNome()); // guilherme

        guilherme.setNome("Silveira");

        System.out.println(guilherme.getNome()); // Silveira
        System.out.println(clientes.get(0).getNome()); // Silveira
    }
}
