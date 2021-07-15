package dio.aula.java.collections.exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(5.7);
        notasAlunos.add(3.8);
        notasAlunos.add(5.5);
        notasAlunos.add(10.0);
        notasAlunos.add(9.0);
        notasAlunos.add(7.5);
        notasAlunos.add(9.5);


        for (Double nota: notasAlunos
        ) {
            System.out.println(nota);

        }
        System.out.println(notasAlunos);
        notasAlunos.add(0.0);
        notasAlunos.add(2.9);
        Iterator<Double> iterator = notasAlunos.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
