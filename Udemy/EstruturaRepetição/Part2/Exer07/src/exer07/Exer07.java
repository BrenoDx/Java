/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer07;

import java.util.Scanner;

/**
 *
 * @author breno
 */
public class Exer07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, soma;
        
        n = sc.nextInt();
        for(int i =1; i <=n; i++){
            soma = 1;
          for(int j = 0; j < 3; j++){
              soma *= i;
              System.out.printf("%d ",soma);
          }
            System.out.println("\n");
        }
        
        sc.close();
        
    }
    
}
