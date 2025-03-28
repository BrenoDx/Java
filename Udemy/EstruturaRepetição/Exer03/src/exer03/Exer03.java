/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer03;

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
        Scanner sc = new Scanner(System.in);
        int qntdGasolina = 0, qntdAlcool = 0, qntdDiesel = 0, op = 0;

        while (op != 4) {
            System.out.println("1 - Alcool; 2 - Gasolina; 3 - Diesel; 4 - Sair");
            op = sc.nextInt();

            if (op == 1) {
                qntdAlcool += 1;
            } else if (op == 2) {
                qntdGasolina += 1;
            } else if (op == 3) {
                qntdDiesel += 1;
            }
        }
        
        System.out.println("Muito Obrigado");
        System.out.println("Alcool: " + qntdAlcool);
        System.out.println("Gasolina: " + qntdGasolina);
        System.out.println("Diesel: " + qntdDiesel);
        
        sc.close();
    }

}
