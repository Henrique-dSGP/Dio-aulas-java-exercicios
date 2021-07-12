package dio.aula.java.exercicios;


import java.util.Calendar;
import java.util.Date;

public class TrabalhandoComDatas {
    public static void main(String[] args){
        //trabalhando com Date
        //Exercicio: Descubra o timeinmillis do dia que eu nasci
        //converta em um objeto date
        //verifique se ele é anterior ou posterior a 15 de maio de 2020
        Date nascimentoData = new Date();
        nascimentoData.setYear(1995);
        nascimentoData.setMonth(7);
        nascimentoData.setDate(7);
        System.out.println("TimeInMillis do meu nascimento: " + nascimentoData.getTime());
        Date nascDataConvertida = new Date();
        nascDataConvertida.setTime(nascimentoData.getTime());
        System.out.println("convertido: "+ nascDataConvertida);
        Date dataCompara = new Date(2020, 4, 15);
        System.out.println("Antes de 15 de maio de 2020?: " + nascDataConvertida.before(dataCompara));
        System.out.println("Depois de 15 de maio de 2020?: " + nascDataConvertida.after(dataCompara));



        //trabalhando com Calendar

        Calendar agora = Calendar.getInstance();
        System.out.println("\n" + agora.getTime());

        //agora.add(Calendar.DATE, -15);
        //System.out.println(agora.getTime());

        //agora.add(Calendar.MONTH, 4);
        //System.out.println(agora.getTime());

        //agora.add(Calendar.YEAR, 2);
        //System.out.println(agora.getTime());
        System.out.println("\n");

        //comandos para exibir coisas exatas no calendar dentro do soutf
        /*
            "%tc\n", var
            output: dom. jul. 11 14:44:23 BRT 2021
         */
        System.out.printf("%tc\n", agora);
        /*
            "%tF\n", var
            output: 2021-07-11
         */
        System.out.printf("%tF\n", agora);
        /*
            "%tD\n", var
            output: 07/11/21
         */
        System.out.printf("%tD\n", agora);
        /*
            "%tr\n", var
            output: 02:44:23 PM
         */
        System.out.printf("%tr\n", agora);
        /*
            "%tT\n", var
            output: 14:44:23
         */
        System.out.printf("%tT\n", agora);



    }
}
