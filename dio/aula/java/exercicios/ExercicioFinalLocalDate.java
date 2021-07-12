package dio.aula.java.exercicios;

import java.time.LocalDateTime;
import java.util.Date;

public class ExercicioFinalLocalDate {
    public static void main(String[] args){
        //Exercicio Final
        /*
        Adicione 4 anos, 6 meses, 13 hrs ao momento 15/05/2010 10:00:00
         */

        LocalDateTime momento = LocalDateTime.of(2010, 05, 15, 10, 0);
        System.out.println("Verificando momento: "+ momento);
        LocalDateTime momentoAdicionado = momento.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println("Momento depois de adicionar: " + momentoAdicionado);
    }
}
