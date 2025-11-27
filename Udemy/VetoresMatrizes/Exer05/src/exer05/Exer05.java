/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer05;

import entidades.Funcionario;
import java.util.ArrayList;
import java.util.List;
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
        
        List<Funcionario> funcionarios = new ArrayList<>();
        Funcionario funcionario;
        int id, n, opId;
        String nome;
        double salario = 0, prct;
        boolean status = false;
        
        System.out.print("Quantas funcionarios serao digitadas: ");
        n = sc.nextInt();
        
        for(int i = 1; i <= n; i++ ){
            System.out.println("Funcionario " + i + ":");
            System.out.print("ID: ");
            id = sc.nextInt();
            
            sc.nextLine();
            
            System.out.print("Nome: ");
            nome = sc.nextLine();
            
            System.out.print("Salario: ");
            salario = sc.nextDouble();
            
            funcionario = new Funcionario(nome, salario, id);
            funcionarios.add(funcionario);  
        }
        
        System.out.print("Informe ID do funcionario para aumentar o salario: ");
        opId = sc.nextInt();
        
        for(Funcionario fun : funcionarios){
            if(opId == fun.getId()){
                System.out.print("Informe porcetagem para aumento do salario: ");
                prct = sc.nextDouble();
                salario += prct/100*salario;
                fun.setSalario(salario);
                status = true;
                break;
            }
        }
        if(!status){
            System.out.println("ID Incorreto");
        }
        System.out.println("Lista de Funcionarios:");
        for(Funcionario fun : funcionarios){
            System.out.println(fun);
        }
    }
    
}
