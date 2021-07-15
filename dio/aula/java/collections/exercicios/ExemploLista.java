package dio.aula.java.collections.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();


        nomes.add("Carlos");
        nomes.add("Joao");
        nomes.add("Eduardo");
        nomes.add("Jairo");
        nomes.add("Elias");
        nomes.add("Ruan");
        nomes.add("Antonio");

        List<Integer> numeros = new ArrayList<>();

        numeros.add(2);
        numeros.add(24);
        numeros.add(32);
        numeros.add(54);
        numeros.add(12);
        numeros.add(3);


        System.out.println(nomes);

        Collections.sort(nomes);
        System.out.println(nomes);

        //System.out.println(numeros);

        //Collections.sort(numeros);
        //System.out.println(numeros);

        nomes.add(2,"Larissa");
        System.out.println(nomes);

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (String nome: nomes
             ) {
            System.out.println(nome);

        }

    }
}
