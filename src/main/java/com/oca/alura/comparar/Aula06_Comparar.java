package com.oca.alura.comparar;

import java.util.Objects;

public class Aula06_Comparar
{
    public static void main(String[] args)
    {
        C a = new C();
        C b = new B();
        a.x = 1;
        b.x = 1;
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}


    class B extends C{}
    class C {
        int x;
        public boolean equals(C c) {
            return c.x==x;
        }

    }
