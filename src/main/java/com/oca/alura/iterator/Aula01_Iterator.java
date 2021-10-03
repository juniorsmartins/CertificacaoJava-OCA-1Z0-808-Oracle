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
    }
}
