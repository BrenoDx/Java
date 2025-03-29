/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author breno
 */
public class Exer03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n;
        double valor1, valor2, valor3, resultado;
        
        n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            valor1 = sc.nextDouble();
            valor2 = sc.nextDouble();
            valor3 = sc.nextDouble();
            
            resultado = (valor1 * 2 + valor2 * 3 + valor3 * 5)/10;
            System.out.printf("Media: %.1f\n", resultado);
        }
        
    }
    
}
