package dio.aula.java.avancado.exercicios;

import java.util.Scanner;
import java.util.function.Consumer;

public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo soma = (a, b) -> a + b;
        Calculo divide = (a, b) -> a / b;
        Calculo subtrai = (a, b) -> a - b;
        Calculo multiplica = (a, b) -> a * b;

        System.out.println(executarOperacao(soma, 4, 5));

        System.out.println(executarOperacao(divide, 4, 5));
        System.out.println(executarOperacao(subtrai, 4, 5));
        System.out.println(executarOperacao(multiplica, 4, 5));


    }

    public static int executarOperacao(Calculo calculo, int a, int b) {
        return calculo.calculo(a, b);
    }

    interface Calculo {
        int calculo(int a, int b);
    }

}