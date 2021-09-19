package com.oca.alura.escopo;

public class DiversasEntidadesNoArquivo // Classe
{
    int A = 1; // Atributo

    DiversasEntidadesNoArquivo(){}; // Construtor

    void A(){}; // Método// Método
    
    public static void main(String[] args) 
    {
        System.out.println("Teste: " + new DiversasEntidadesNoArquivo().A); // Chama o atributo A pelo objeto construído
    }
} 
// Pode haver uma infinidade de entidades no arquivo, porém, somente uma delas 
// pode ter acesso public e essa precisa ter o mesmo nome do arquivo
class B{}
class C{}
class E{}
interface N{}
interface Z{}
