package dio.aula.java.avancado.exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class ExemploInferencia {
    public static void main(String[] args) {
        PrintJavaOracleSite();
        /*
        padrão
        URL url = new URL(null, "https://docs.oracle.com/javase/10/language");
        URLConnection urlConnection = url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
         */

        //usando var



    }

    private static void PrintJavaOracleSite() {
        try{
            var url = new URL(null, "https://docs.oracle.com/javase/10/language");
            var urlConnection = url.openConnection();
            var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    //var não pode ser utilizado em nivel de classe
    //var não pode ser utilizado como parametro type
    public static void printFullName(String nome, String sobrenome){
        var nomeCompleto = String.format("%s %s", nome, sobrenome);
        System.out.println(nomeCompleto);
    }
    //var não pode ser utilizado em variaveis locais não inicializadas
    public static void printSum(Integer... numeros){
        int sum;
        if (numeros.length >0){
            sum = 0;
            for (var numero:numeros) {
                sum+=numero;
            }
            System.out.println(sum);
        }
    }
}
