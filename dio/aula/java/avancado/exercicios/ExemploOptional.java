package dio.aula.java.avancado.exercicios;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptional {
    public static void main(String[] args) {
        Optional<String> optionalS = Optional.of("Valor presente");

        System.out.println("Valor opcional que está presente");
        optionalS.ifPresentOrElse(System.out::println, ()-> System.out.println("não está presente"));

        Optional<String> optionalS1 = Optional.ofNullable(null);

        System.out.println("Valor opcional que não está presente");
        optionalS1.ifPresentOrElse(System.out::println, ()-> System.out.println("null = não presente"));

        Optional<String> optionalS2 = Optional.empty();

        System.out.println("Valor opcional que não está presente");
        optionalS2.ifPresentOrElse(System.out::println, ()-> System.out.println("empty = não presente"));


        System.out.println("Valor inteiro opcional");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("valor decimal opcional");
        OptionalDouble.of(55.2).ifPresent(System.out::println);

        System.out.println("valor longo opcional");
        OptionalLong.of(12L).ifPresent(System.out::println);
        /*
         Podemos tambem utilizar o metodo do optional isPresent ou isEmpty para retornar um valor booleano de acordo com
        o metodo.
         */
        Optional<String> optionalString = Optional.of("Optional Value");

        System.out.println(optionalString.isPresent());
        System.out.println(optionalString.isEmpty());

        if (optionalString.isEmpty()){
            System.out.println("valor vazio");
        }else{
            System.out.println(optionalString.get());
        }

        /*
        Os ifPresentOrElse methods do Optional deve ser utilizado como parametro uma função lambda
         */

        //optionalString = Optional.empty();
        optionalString.ifPresentOrElse(System.out::println, ()-> System.out.println("something"));

        /*
        orElseThrow lança exceptions de acordo com o conteudo do Optional
         */

        //optionalString = Optional.empty();
        System.out.println(optionalString.orElseThrow(IllegalStateException::new));


        //Optional<String> optionalS3 = Optional.of(null);
        //System.out.println("Valor opcional que lança erro NullPointerException");
        //optionalS3.ifPresentOrElse(System.out::println, ()-> System.out.println("erro = não presente"));

    }
}
