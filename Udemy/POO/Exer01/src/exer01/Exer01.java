/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer01;

import entities.Rectangle;
import java.util.Locale;
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
        Locale.setDefault(Locale.US);
        Rectangle x = new Rectangle();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter rectangle width and height:");
        x.width = sc.nextDouble();
        x.height = sc.nextDouble();
        
        System.out.printf("Area: %.2f\n", x.area());
        System.out.printf("Perimeter: %.2f\n", x.perimeter());
        System.out.printf("Diagonal: %.2f\n", x.diagonal());
        sc.close();
    }
    
}
