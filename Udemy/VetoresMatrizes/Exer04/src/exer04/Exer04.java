/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer04;

import entidades.Aluguel;
import java.util.Scanner;

/**
 *
 * @author breno
 */
public class Exer04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quarto, n;
        String nome, email;
        
        System.out.print("Quantas pessoas serao digitadas: ");
        n = sc.nextInt();
        
        Aluguel[] quartos = new Aluguel[10];       
        
        for(int i=0; i < n; i++ ){
            sc.nextLine();
            
            System.out.print("Nome: ");
            nome = sc.nextLine();
            
            System.out.print("Email: ");
            email = sc.nextLine();
            
            System.out.print("Numero do quarto:");
            quarto = sc.nextInt();
                       
            quartos[quarto] = new Aluguel(nome,email);
        }
        
        System.out.println("Quartos ocupados:");
        for(int i = 0; i < quartos.length; i++ ){
            if(quartos[i] != null){
                System.out.println(i + ": " + quartos[i]);
            }
        }
    }
    
}
