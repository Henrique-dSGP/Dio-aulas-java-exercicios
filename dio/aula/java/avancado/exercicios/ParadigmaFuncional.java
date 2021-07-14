package dio.aula.java.avancado.exercicios;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class ParadigmaFuncional {
    public static void main(String[] args){
        int[] valores = {1,2,3,4};
        Arrays.stream(valores).filter(numero -> numero % 2 == 0).map(numero -> numero*2).forEach(numero-> System.out.println(numero));

        BiPredicate<Integer, Integer> verificarSeEMaior = (parametro, valorComparacao) -> parametro > valorComparacao;
        System.out.println(verificarSeEMaior.test(1,2));
        System.out.println(verificarSeEMaior.test(2,1));


    }
}
