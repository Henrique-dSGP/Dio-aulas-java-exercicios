package dio.aula.java.collections.exercicios;

import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        treeCapitais.add("São Paulo");
        treeCapitais.add("Parana");
        treeCapitais.add("Santa Catarina");
        treeCapitais.add("Bahia");
        treeCapitais.add("Minas Gerais");
        treeCapitais.add("Amazonas");
        treeCapitais.add("Acre");
        treeCapitais.add("Goiás");


        System.out.println(treeCapitais);

        System.out.println(treeCapitais.first());
        System.out.println(treeCapitais.last());
        System.out.println(treeCapitais.lower("Amazonas"));
        System.out.println(treeCapitais.higher("Minas Gerais"));
        System.out.println(treeCapitais);
        System.out.println(treeCapitais.pollFirst());
        System.out.println(treeCapitais);
        System.out.println(treeCapitais.pollFirst());
        System.out.println(treeCapitais);
        System.out.println(treeCapitais.pollFirst());
        System.out.println(treeCapitais);
        System.out.println(treeCapitais.pollFirst());
        System.out.println(treeCapitais);
        System.out.println(treeCapitais.pollFirst());
        System.out.println(treeCapitais);
        System.out.println(treeCapitais.pollFirst());
        System.out.println(treeCapitais);

    }
}
