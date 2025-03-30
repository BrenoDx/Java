/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer05;

import java.util.Scanner;

/**
 *
 * @author breno
 */
public class Exer05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fatorial = 1, n;
        
        n = sc.nextInt();
        if(n > 1){
            for(int i = 1; i <=n; i++){
               fatorial *= i;
            }
            System.out.println(fatorial);
        }else{
            System.out.println("1");
        }
        
        sc.close();
    }
    
}
