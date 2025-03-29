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
        int n, x, in =0, out = 0;
        
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            x = sc.nextInt();
            if(x >= 10 && x <= 20){
                in += 1;
            }else{
                out += 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        
    }
    
}
