package com.oca.alura.excecao;

import java.util.IllegalFormatException;

public class Aula02_TryResources
{
    public static void main(String[] args)
    {
        try(Aula02_Conexao con = new Aula02_Conexao())
        {
            con.leDados();
        } catch(IllegalStateException ise)
        {
            System.out.println("Excecao na conexao!");
            ise.printStackTrace();
        }
    }
}
