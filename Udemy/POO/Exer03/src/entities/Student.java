/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author breno
 */
public class Student {
    public String name;
    public double n1;
    public double n2;
    public double n3;

    public double average() {
        return n1 + n2 + n3;
    }

    public void status() {
        if (average() >= 60) {
            System.out.printf("Final Grade = %.2f\n", average());
            System.out.println("Pass");
        } else {
            System.out.printf("Fina Grade = %.2f\n", average());
            System.out.println("Failed");
            System.out.printf("Missing %.2f", 60-average()  );
        }
    }
}
