package dio.aula.java.exercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

//LOCALDATE E LOCALTIME E LOCALDATETIME
public class TrabalhandoComLocalDate {
    public static void main(String[] args){

        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);

        System.out.println(today);
        System.out.println(yesterday);
        /*
        output:
            2021-07-12
            2021-07-11
         */

        LocalTime now = LocalTime.now();
        System.out.println(now);
        /*
        output:
        17:22:58.023441500
         */
        LocalTime plusOne = now.plusHours(1);
        System.out.println(plusOne);

        /*
        output:
        18:23:55.199901800
         */
        now.plusHours(1);
        System.out.println(now);
        /*
        output:
        mesmo do sout anterior do now, porque o localTime é imutável
         */

        LocalDateTime nowLDT = LocalDateTime.now();
        System.out.println(nowLDT);
        /*
        output:
        2021-07-12T17:27:14.193987800
         */

        LocalDateTime future = nowLDT.plusHours(1).plusDays(2).plusSeconds(12);
        System.out.println(future);
        /*
        output:
        2021-07-14T18:27:26.193987800
         */
    }
}
