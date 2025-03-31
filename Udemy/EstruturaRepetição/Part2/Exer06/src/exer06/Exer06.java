/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer06;

import java.util.Scanner;

/**
 *
 * @author breno
 */
public class Exer06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        n = sc.nextInt();
        for(int i = 1; i <=n; i++){
            if(n % i == 0){
            System.out.println(i);
            }
        }
        
        sc.close();
    }
    
}
