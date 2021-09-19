package com.oca.alura.escopo;

public class ConstrutorComReturn 
{
    int j = -100;

    ConstrutorComReturn(int i) { // Pode haver construtor com return, desde que seja um return vazio
        if (i > 1)
            return;
        j = i;
    }  
}
