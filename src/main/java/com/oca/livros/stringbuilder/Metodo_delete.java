package com.oca.livros.stringbuilder;

public class Metodo_delete 
{
    public static void main(String[] args) 
    {
        StringBuilder sb = new StringBuilder("Estrela é um tipo de arquitetura de DataWarehouse.");
        // O método delete remove caracteres de uma substring do objeto StringBuilder
        // Há uma única declaração:
        // public StringBuilder delete(int start, int end)
        System.out.println(sb.delete(9, 20));
    }
}