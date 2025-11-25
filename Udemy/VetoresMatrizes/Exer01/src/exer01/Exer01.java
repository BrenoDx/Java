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
        int n;
        System.out.println("Quantos numeros voce vai digitar: ");
        n = sc.nextInt();
        
        int[] vet = new int[n];
        
        for(int i = 0; i < vet.length; i++ ){
            System.out.println("Digite um numero INTEIRO: ");
            vet[i] = sc.nextInt();
        }
        
        System.out.println("NUMEROS NEGATIVOS");
        for(int i = 0; i < vet.length; i++ ){
            if(vet[i] < 0 ){
                System.out.println(vet[i]);
            }
        }
        
    }
    
}
