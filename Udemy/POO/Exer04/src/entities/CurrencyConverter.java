/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author breno
 */
public class CurrencyConverter {
    public double dolar;
    public double cotacao;
    public static double iof = 0.06;
    
    public double converter(){
        double valorEmReal = dolar*cotacao;
        double valorTotal = valorEmReal+valorEmReal*iof;
        
        return valorTotal;
    }
    
}
