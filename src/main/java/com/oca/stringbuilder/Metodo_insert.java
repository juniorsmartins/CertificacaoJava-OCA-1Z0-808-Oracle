package com.oca.stringbuilder;

public class Metodo_insert 
{
    public static void main(String[] args) 
    {
        StringBuilder message = new StringBuilder("O metodo insert serve");
        // O método insert insere a representação em formato string dos dados fornecidos começando na posição especificada
        // Há 12 declarações:        
        
        // public StringBuilder insert(int index, char[]str, int offset, int len)
        // public StringBuilder insert(int offset, Object obj) 
        
        // public StringBuilder insert(int offset, String str) 
        message.insert(21, " para inserir uma string noutra string a partir de uma posição especifica");
        System.out.println(message);
        
        // public StringBuilder insert(int offset, char []str) 
        // public StringBuilder insert(int dstOffset, CharSequence) 
        // public StringBuilder insert(int dstOffset, CharSequence s, int start, int end) 
        // public StringBuilder insert(int offset, boolean b) 
        // public StringBuilder insert(int offset, char c) 
        // public StringBuilder insert(int offset, int i) 
        // public StringBuilder insert(int offset long l) 
        // public StringBuilder insert(int offset float f) 
        // public StringBuilder insert(int offset, double d) 

    }
}