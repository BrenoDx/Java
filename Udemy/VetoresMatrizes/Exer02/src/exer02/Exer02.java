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
        int n;
        double media, soma = 0;
        
        System.out.print("Quantos valores voce vai digitar: ");
        n = sc.nextInt();
        
        double[] vet = new double[n];
        
        for(int i = 0; i < vet.length; i++ ){
            System.out.println("Digite um valor: ");
            vet[i] = sc.nextDouble();
        }
        
        System.out.print("VALORES: ");
        for(int i =0; i < vet.length; i++ ){
            System.out.print(vet[i] + " ");
            soma += vet[i];
        }
        
        media = soma/n;
        System.out.println("");
        System.out.printf("SOMA: %.2f %n", soma);
        System.out.printf("MEDIA: %.2f %n", media);
    }
    
}
