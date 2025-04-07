/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer04;

import entities.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author breno
 */
public class Exer04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter x = new CurrencyConverter();
        
        System.out.println("What is the dollar price?");
        x.cotacao = sc.nextDouble();
        
        System.out.println("How many dollars will be bought?");
        x.dolar = sc.nextDouble();
        
        System.out.printf("Amount to be paid in reais = %.2f", x.converter());
        sc.close();
    }
    
}
