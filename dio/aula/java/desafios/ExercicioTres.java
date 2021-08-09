package dio.aula.java.desafios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ExercicioTres {
    public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int cont = 0;
    int pos_contador = 0;
    while(cont < 6)

    {
        StringTokenizer st = new StringTokenizer(br.readLine());
        float x = Float.parseFloat(st.nextToken());
        if (x > 0) {
            pos_contador++;
        }
        cont++;
    }
        System.out.println(pos_contador + " valores positivos");
    }
}
