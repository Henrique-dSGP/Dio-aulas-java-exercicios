import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ExercicioFinalCalendar {

    public static void main(String[] args) {

        //Exercicio final
        /*
        Um cliente tem 10 dias para pagar uma fatura após sua data de vnecimento semq ue os juros sejam cobrados.
        Caso essa data caia em um sabado ou domingo o cliente pode pagar na segunda-feira seguinte.
        Crie uma estrutura que receba uma data de vencimento e calcule quantos dias ele tem para pagar.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano de vencimento...");
        String anoVencimento = sc.nextLine();
        System.out.println("Digite o mes de vencimento...");
        String mesVencimento = sc.nextLine();
        System.out.println("Digite o dia de vencimento...");
        String diaVencimento = sc.nextLine();

        Calendar hoje = Calendar.getInstance();
        String dataVencimento = diaVencimento + "-" + mesVencimento + "-" + anoVencimento;

        try {
            DateFormat format;
            Date date;

            format = new SimpleDateFormat("dd-MM-yyyy");
            date = format.parse(dataVencimento);
            Calendar calendar = Calendar.getInstance();

            calendar.setTime(date);

            System.out.println("\n Dia de vencimento: " + calendar.getTime());

            if (hoje.getTime().before(calendar.getTime())){
                if(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
                {
                    calendar.add(Calendar.DATE, 2);
                }
                if(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
                {
                    calendar.add(Calendar.DATE, 1);
                }
                System.out.println("\n Dia de pagamento após verificação de dias úteis: " + calendar.getTime());

                long diferenca = calendar.getTimeInMillis() - hoje.getTimeInMillis();

                Calendar diasRestantes = Calendar.getInstance();

                diasRestantes.setTimeInMillis(diferenca);

                System.out.println("\n Dias restantes para o pagamento: " + diasRestantes.get(Calendar.DATE));

            }else{

                long difVencida = hoje.getTimeInMillis() - calendar.getTimeInMillis();
                Calendar atrasado = Calendar.getInstance();
                atrasado.setTimeInMillis(difVencida);
                System.out.println("\n Atrasado, vencimento ocorreu há: " + atrasado.get(Calendar.DATE) + " dias.");

            }


        }catch (ParseException e){
            System.out.print("Exception :" + e);
        }


    }
}