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
        int senha;

        System.out.println("Informe senha numerica!");
        senha = sc.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Invalida!");
            System.out.println("Informe senha numerica novamente!");
            senha = sc.nextInt();
        }
        System.out.println("Acesso permitido");
    }

}
