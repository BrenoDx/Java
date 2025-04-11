/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program;

import entities.Account;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author breno
 */
public class Exer05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account x;

        System.out.print("Enter account number: ");
        int numberAccount = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char op = sc.next().charAt(0);

        if (op == 'y') {
            System.out.print("Enter initial deposit value: ");
            double balance = sc.nextDouble();
            x = new Account(numberAccount, name, balance);

        } else {
            x = new Account(numberAccount, name);

        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(x);
        
        System.out.println();
        System.out.print("Enter a deposit value: ");
        x.deposit(sc.nextDouble());
        System.out.println("Update account data:");
        System.out.println(x);

        System.out.println("Enter a withdraw value: ");
        x.withdraw(sc.nextDouble());
        System.out.println("Update account data:");
        System.out.println(x);
        
        
        sc.close();
    }

}
