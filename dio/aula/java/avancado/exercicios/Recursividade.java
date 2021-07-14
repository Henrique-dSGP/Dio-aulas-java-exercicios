package dio.aula.java.avancado.exercicios;

import java.util.HashMap;
import java.util.Map;

public class Recursividade {

    static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<>();

    public static void main(String[] args){

        long I = System.nanoTime();
        System.out.println(fatorialComMemoization(7));
        long F = System.nanoTime();
        System.out.println("Fatorial 1: " + (F-I));


        //System.out.println(fatorial(5));

        I = System.nanoTime();
        System.out.println(fatorialComMemoization(7));
        F = System.nanoTime();
        System.out.println("Fatorial 2: " + (F-I));

        I = System.nanoTime();
        System.out.println(fatorialComMemoization(7));
        F = System.nanoTime();
        System.out.println("Fatorial 3: " + (F-I));

        I = System.nanoTime();
        System.out.println(fatorialComMemoization(7));
        F = System.nanoTime();
        System.out.println("Fatorial 4: " + (F-I));

        I = System.nanoTime();
        System.out.println(fatorial(7));
        F = System.nanoTime();
        System.out.println("Fatorial sem memo: " + (F-I));
    }
    public static int fatorial(int valor){
        if(valor == 1){
            return valor;
        }else{
            return valor * fatorial((valor - 1));
        }
    }
    public static Integer fatorialComMemoization(Integer value){
        if (value == 1)
        {
            return value;
        }else{
            if(MAPA_FATORIAL.containsKey(value)){
                return MAPA_FATORIAL.get(value);
            } else{
                Integer result = value * fatorialComMemoization(value -1);
                MAPA_FATORIAL.put(value, result);
                return result;
            }
        }
    }
}
