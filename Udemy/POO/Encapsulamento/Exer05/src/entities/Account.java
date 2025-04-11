/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author breno
 */
public class Account {
    private double balance;
    private String name;
    private int numberAccount;
    
    public Account(int numberAccount, String name, double initialDeposit){
        this.numberAccount = numberAccount;
        this.name = name;
        deposit(initialDeposit);
    }
    
    public Account(int numberAccount, String name){
        this.numberAccount = numberAccount;
        this.name = name;   
    }
    
    public void deposit(double deposit){
        balance += deposit;
    }
    
    public void withdraw(double withdraw){
        balance -= withdraw + 5; 
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String toString() {
        return "Account " + numberAccount +
                ", holder: " + name + ", balance: $ " + balance;
    }
    
    
}
