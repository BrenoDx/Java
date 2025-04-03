/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer02;

import entities.Employee;
import java.util.Locale;
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
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee x = new Employee();
        
        System.out.print("Name: ");
        x.name = sc.nextLine();
        
        System.out.print("Gross salary: ");
        x.grossSalary = sc.nextDouble();
        
        System.out.print("Tax: ");
        x.tax = sc.nextDouble();
        
        System.out.printf("Employee: %s, $%.2f", x.name, x.NetSalary());
        
        System.out.print("\nWhich percentage to increase salary? ");
        x.increaseSalary(sc.nextDouble());
        
        System.out.printf("Updated data: %s, $%.2f", x.name, x.NetSalary());
    }
    
}
