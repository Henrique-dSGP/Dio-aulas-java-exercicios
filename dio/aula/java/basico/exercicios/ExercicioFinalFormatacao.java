package dio.aula.java.exercicios;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ExercicioFinalFormatacao {
    public static void main(String[] args){

        //Exercício Final
        /*
        Converta a Data atual no formato DD/MM/YYYY HH:MM:SS:MMM
         (Prestar atenção nas notações e colocar da maneira correta.)
         */

        Date date = new Date();
        //usando delay e date2 para dar mais diferença de ms e comparar
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long time = 200;
        try{
        timeUnit.sleep(time);}catch (Exception e){}

        Date date2 = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS");
        String formatedDate = simpleDateFormat.format(date);
        String formatedDate2 = simpleDateFormat.format(date2);
        System.out.println(formatedDate);
        System.out.println(formatedDate2);


    }
}
