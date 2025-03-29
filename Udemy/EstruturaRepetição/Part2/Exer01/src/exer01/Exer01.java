/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer01;

import java.util.Scanner;

/**
 *
 * @author breno
 */
public class Exer01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        
        x = sc.nextInt();
        
        for(int i = 1; i < x; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
        
    }
    
}
