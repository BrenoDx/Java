/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer04;

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
        Scanner sc = new Scanner(System.in);
        int n, denominador, numerador;
        double resultado;

        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            numerador = sc.nextInt();
            denominador = sc.nextInt();

            if (denominador != 0) {
                resultado = numerador / denominador;
                System.out.printf("Resultado: %.1f\n", resultado);
            } else {
                System.out.println("Divisão impossivel");
            }
        }
        
        sc.close();

    }

}
