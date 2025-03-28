/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer02;

import java.util.Scanner;

/**
 *
 * @author breno
 */
public class Exer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int x,y;
       
        System.out.println("--------sistema cartesiano--------");
        x = sc.nextInt();
        y = sc.nextInt();
        
        while(x != 0 && y != 0){
            if(x > 0 && y > 0){
                System.out.println("Primeiro");
            }else if(x < 0 && y >0){
                System.out.println("Segundo");
            }else if(x < 0 && y < 0){
                System.out.println("Terceiro");
            }else{
                System.out.println("Quarto");
            }
            
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
    
}
