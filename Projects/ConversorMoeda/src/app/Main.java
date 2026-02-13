package app;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("============================================");
        System.out.println("Olá, seja bem-vindo ao Conversor de Moedas!");
        System.out.println("Escolha moeda que deseja fazer converter:");
        System.out.println("Moedas disponíveis 'USD' Dólar, 'EUR' Euro, 'GBP' libra");
        System.out.println("============================================");

        System.out.println("Selecione moeda desejada(Ex: USD, EUR, GBP):");
        String moeda = sc.nextLine().toUpperCase();

        System.out.println("Informe o valor que deseja converter:");
        double valor = sc.nextDouble();

        double taxa = Conversor.BuscarTaxa(moeda, "BRL");

        if(taxa > 0 ){
            double convertido = valor * taxa;
            System.out.printf("%.2f %s equivalem a R$ %.2f", valor,moeda,convertido);
        }else{
            System.out.println("Não foi possível converter!");
        }

        sc.close();



    }




}
