package dio.aula.java.avancado.exercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStream {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Pedro");
        stringList.add("Jonas");
        stringList.add("Silvana");
        stringList.add("Eliana");
        stringList.add("Jairo");
        stringList.add("Joana");
        stringList.add("Thaysa");
        stringList.add("Rafael");

        System.out.println("Contagem: " + stringList.stream().count());

        System.out.println("Maior numero de letras: " + stringList.stream().max(Comparator.comparingInt(String::length)));

        System.out.println("Menor numero de letras: " + stringList.stream().min(Comparator.comparingInt(String::length)));

        System.out.println("Com letra r no nome: " + stringList.stream().filter((nome) -> nome.toLowerCase().contains("r")).collect(Collectors.toList()));

        System.out.println("Retorna uma nova coleção com a quantidade de letras: " +
                stringList.stream().map(nome -> nome.concat(" - ").concat(String.valueOf(nome.length()))).collect(Collectors.toList()));

        System.out.println("Retorna os elementos: " + stringList.stream().peek(System.out::println).collect(Collectors.toList()));

        System.out.println("Retorna os elementos novamente: ");
        stringList.stream().forEach(System.out::println);

        System.out.println("Tem algum elemento com W no nome? \n - " + stringList.stream().allMatch((nome) -> nome.contains("W")));

        System.out.println("Não tem nenhum elemento com a minúscula no nome? "+ stringList.stream().noneMatch((nome) -> nome.contains("a")));

        System.out.println("Não tem nenhum elemento com a minúscula no nome? "+ stringList.stream().allMatch((nome) -> nome.contains("a")));

        System.out.println("Retorna o primeiro elemento da coleção: ");
        stringList.stream().findFirst().ifPresent(System.out::println);

        System.out.println("Operação encadeada concatena o nome com o tamanho do nome para nomes que contenham 'r': ");
        System.out.println(stringList.stream()
                .peek(System.out::println)
                .map(nome -> nome.concat(" - ").concat(String.valueOf(nome.length())))
                .peek(System.out::println)
                .filter((nome) -> nome.toLowerCase().contains("r")).collect(Collectors.toList()));

    }
}
