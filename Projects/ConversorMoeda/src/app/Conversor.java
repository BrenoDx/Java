package app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Conversor {

    public Conversor() {
    }
    // Método que busca a taxa de conversão pela API FrankFurter
    public static double BuscarTaxa(String moedaOrigem, String moedaDestino){
        try{
            // Monta a URL que vai acessar
            String urlApi = "https://api.frankfurter.app/latest?from=" + moedaOrigem + "&to=" + moedaDestino;

            //Objeto URL e abrindo conexão com internet
            URL urL = new URL(urlApi);
            HttpURLConnection conexao = (HttpURLConnection) urL.openConnection();
            conexao.setRequestMethod("GET");

            //Lê a resposta que veio da API
            BufferedReader leitor = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
            StringBuffer resposta = new StringBuffer();
            String linha;

            while((linha = leitor.readLine()) != null ){
                resposta.append(linha);
            }
            leitor.close();

            // Retirar a taxa de câmbio
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
