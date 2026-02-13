package app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Conversor {

    public Conversor() {
    }

    public static double BuscarTaxa(String moedaOrigem, String moedaDestino){
        try{
            String urlApi = "https://api.frankfurter.app/latest?from=" + moedaOrigem + "&to=" + moedaDestino;

            URL urL = new URL(urlApi);
            HttpURLConnection conexao = (HttpURLConnection) urL.openConnection();
            conexao.setRequestMethod("GET");

            BufferedReader leitor = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            StringBuffer resposta = new StringBuffer();
            String linha;

            while((linha = leitor.readLine()) != null ){
                resposta.append(linha);
            }
            leitor.close();

            String json = resposta.toString();
            if (json.contains("\"BRL\":")) {
                int inicio = json.indexOf("\"BRL\":") + 6;
                int fim = json.indexOf("}", inicio);
                String valorStr = json.substring(inicio, fim);
                return Double.parseDouble(valorStr);
            } else {
                System.out.println("Resposta inesperada:");
                System.out.println(json);
                return -1;
            }

        } catch(Exception e){
            System.out.println("Erro ao buscar taxa de câmbio" + e);
            return -1;
        }
    }
}
