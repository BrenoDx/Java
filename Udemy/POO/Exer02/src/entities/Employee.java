/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author breno
 */
public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    
    public double NetSalary(){
        return grossSalary - tax;
    }
    
    public void increaseSalary(double percentage){
        grossSalary += grossSalary*(percentage/100);
    }
}
