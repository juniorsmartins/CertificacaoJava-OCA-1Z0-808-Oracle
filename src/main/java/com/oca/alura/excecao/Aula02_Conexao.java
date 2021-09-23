package com.oca.alura.excecao;

public class Aula02_Conexao implements AutoCloseable {
    public Aula02_Conexao() {
        System.out.println("Conexao estabelecida!");
    }

    public void leDados() {
        System.out.println("Receber dados!");
        throw new IllegalStateException();
    }

    @Override
    public void close()
    {
        System.out.println("Fechar conexao!");
    }
}
