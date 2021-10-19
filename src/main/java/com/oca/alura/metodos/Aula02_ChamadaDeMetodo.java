package com.oca.alura.metodos;

public class Aula02_ChamadaDeMetodo
{
    public static void main(String[] args)
    {
        Calculador calc = new Calculador();
        double resultado = calc.somarDoubles(2.2, 12.8);
        System.out.println(resultado);

        // Os parâmetros do método aceitam Promoção de tipos
        Integer a = 12, b = 3;
        System.out.println(calc.somarDoubles(a, b)); // usando inteiros/integers
        System.out.println(calc.somarDoubles(9.5f, 5.5f)); // usando float
        System.out.println(calc.somarDoubles(10L, 5L)); // usando long
        System.out.println(calc.somarDoubles((short)10, (short)5)); // usando short
        System.out.println(calc.somarDoubles((byte)10, (byte)5)); // usando byte
        System.out.println(calc.somarDoubles('z', 'b')); // usando char
        // a mesma coisa ocorre com objetos. Um método com parâmetro do tipo object aceita qualquer objeto(carro, moto, pessoa e etc)
    }
}

class Calculador
{
    protected double somarDoubles(double a, double b)
    {
        return (a + b);
    }


    String metodo(int a)
    {
        if(a > 0) {
            return "positivo";
        } else if(a <= 0) {
            return "negativo ou zero";
        }
        //não compila, o que acontece se não for nem if nem else if?
        //o compilador não consegue analisar os dois casos
    }

    // Métodos que não retornam nada não podem ter seu resultado atribuído a uma variável
    void metodo() {
        System.out.println("oi");
    }
    void metodo2() {
        // não compila, o método acima não retorna nada
        int i = metodo();
    }
    // Pelo outro lado, mesmo que um método retorne algo, seu retorno pode ser ignorado:
    int metodo() {
        System.out.println("oi");
        return 5;
    }
    void metodo2() {
        int i = metodo(); // i = 5
        // chamei novamente e não retornei nada, sem problemas
        metodo();
    }


}