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
        double media = 0, prct = 0;
        
        System.out.print("Quantas pessoas serao digitadas: ");
        n = sc.nextInt();
        
        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];
        
        for(int i =0; i < n; i++ ){
            System.out.printf("Dados da %d pessoa: %n", i+1);
            
            System.out.println("Nome:");
            sc.nextLine();
            nome[i] = sc.nextLine();
            System.out.println("Idade:");
            idade[i] = sc.nextInt();
            System.out.println("Altura:");
            altura[i] = sc.nextDouble();
        }
        
        for(int i =0; i < n; i++ ){
            media += altura[i];
            
            if(idade[i] < 16){
                prct += 1;
            }
        }
        
        media /= n;
        prct = prct * 100 / n;
        
        System.out.printf("Altura media: %.2f %n", media);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", prct);
        
        for(int i=0; i<n; i++) {
	    if (idade[i] < 16) {
	        System.out.printf("%s\n", nome[i]);
	    }
	}
        sc.close();
    }
    
}
