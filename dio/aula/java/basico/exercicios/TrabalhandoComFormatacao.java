package dio.aula.java.exercicios;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TrabalhandoComFormatacao {
    public static void main(String[] args){

        Date now = new Date();

        String dateStr = DateFormat.getInstance().format(now);

        System.out.println(dateStr);
        //output:

        dateStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(now);
        System.out.println(dateStr);
        //output

        dateStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(now);
        System.out.println(dateStr);
        //output

        /*
        DIFERENÇAS:
            getDateTimeInstance(LONG, SHORT) -> 12 de julho de 2021 16:48 "dd of month of yyyy hh:mm"
            getDateTimeInstance(LONG, LONG) -> 12 de julho de 2021 16:48 "dd of month of yyyy hh:mm TZ"
            getInstance() -> 12/07/2021 16:48 "dd/MM/yyyy hh:mm"
        Tambem há a possibilidade de criar sua própria formatação de datas para saida.
         */
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = format.format(now);
        System.out.println(formattedDate);
        //SimpleDateFormat pode ser usado para criar um padrão para formatação.
    }
}
