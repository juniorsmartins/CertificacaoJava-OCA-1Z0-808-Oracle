package com.oca.alura.importar;

import com.oca.alura.importar.Endereco; // É opcional importar classes do mesmo pacote. Não precisa, mas compila e roda.

public class Importar 
{
    public static void main(String[] args) 
    {
        Endereco endereco = new Endereco();
        endereco.rua = "Rua Cornélio Procópio";
        endereco.numero = "1500";
        endereco.bairro = "Porto";
        System.out.println(": " + endereco.rua + " : " + endereco.numero + " : ".concat(endereco.bairro));
    }
}