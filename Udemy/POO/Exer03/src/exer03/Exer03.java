/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer03;

import entities.Student;
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
        Student x = new Student();
        
        x.name = sc.nextLine();
        x.n1 = sc.nextDouble();
        x.n2 = sc.nextDouble();
        x.n3 = sc.nextDouble();
        
        x.status();
    }
    
}
