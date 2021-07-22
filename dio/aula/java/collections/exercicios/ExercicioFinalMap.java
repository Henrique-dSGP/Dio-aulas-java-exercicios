package dio.aula.java.collections.exercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExercicioFinalMap {
    public static void main(String[] args) {
        /*
        Exercicio Final
            Crie um Map e execute as seguintes operações:
                Adicione os 26 estados Brasileiros no map, onde a sigla será a chave e o nome do estado o valor.
                Remova o estado de Minas Gerais.
                Adicione o Distrito Federal.
                Verificque o tamanho do mapa
                Remova o estado de Mato Grosso do Sul usando o nome.
                Navegue em todos os registros do map, mostrando no console no seguinte formato: NOME(SIGLA)
                Verifique se o estado de Santa Catarina existe no map buscando por sua sigla(SC)
                Verifique se o estado de Maranhão existe no map buscando por seu nome.

                Opcional ******** Preencha os campos (SIGLA,NOME) automaticamente pegando a informação de algum site.
         */
        Map<String, String> estados = new HashMap<>();
        estados.put("AC", "Acre");
        estados.put("AL", "Alagoas");
        estados.put("AP", "Amapá");
        estados.put("AM", "Amazonas");
        estados.put("BA", "Bahia");
        estados.put("CE", "Ceará");
        estados.put("ES", "Espírito Santo");
        estados.put("GO", "Goiás");
        estados.put("MA", "Maranhão");
        estados.put("MT", "Mato Grosso");
        estados.put("MS", "Mato Grosso do Sul");
        estados.put("MG", "Minas Gerais");
        estados.put("PA", "Pará");
        estados.put("PB", "Paraíba");
        estados.put("PR", "Paraná");
        estados.put("PE", "Pernambuco");
        estados.put("PI", "Piauí");
        estados.put("RJ", "Rio de Janeiro");
        estados.put("RN", "Rio Grande do Norte");
        estados.put("RS", "Rio Grande do Sul");
        estados.put("RO", "Rondônia");
        estados.put("RR", "Roraima");
        estados.put("SC", "Santa Catarina");
        estados.put("SE", "Sergipe");
        estados.put("SP", "São Paulo");
        estados.put("TO", "Tocantins");
        System.out.println(estados + "\n " + estados.size());
        estados.remove("MG");
        System.out.println(estados + "\n " + estados.size());
        estados.put("DF", "Distrito Federal");
        System.out.println(estados + "\n " + estados.size());
        estados.remove(estados.values().removeIf("Mato Grosso do Sul"::equals));
        System.out.println(estados + "\n " + estados.size());
        for (Map.Entry<String,String> entry : estados.entrySet())
            System.out.println(entry.getValue() +
                    "(" + entry.getKey() + ")");
        System.out.println(estados.containsKey("SC"));
        System.out.println(estados.containsValue("Maranhão"));
    }
}
