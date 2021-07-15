package dio.aula.java.collections.exercicios;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<Integer> sequencialNumerico = new LinkedHashSet<>();

        sequencialNumerico.add(6);
        sequencialNumerico.add(5);
        sequencialNumerico.add(7);
        sequencialNumerico.add(4);
        sequencialNumerico.add(4);
        sequencialNumerico.add(66);
        sequencialNumerico.add(34);

        System.out.println(sequencialNumerico);

        sequencialNumerico.remove(4);
        System.out.println(sequencialNumerico);
        System.out.println(sequencialNumerico.size());
        Iterator<Integer> iterator = sequencialNumerico.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Integer numero:
             sequencialNumerico) {
            System.out.println(numero);
        }
    }
}
