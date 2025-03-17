package exer01;

import java.util.Scanner;


public class Exer01 {

    public static void main(String[] args) {
        int qntdConv;
        int totalCade;
        Scanner entrada = new Scanner(System.in, "latin1");
        
        System.out.println("---------------------");
        System.out.println("BEM VINDO AO HOTEL DX");
        System.out.println("---------------------");
        
        System.out.println("Qual seria a quantidade de convidados para o evento? ");
        qntdConv = entrada.nextInt();
        
        if (qntdConv > 0 && qntdConv <= 150) {
            System.out.println("Use auditório ALFA.");
        } else if (qntdConv > 150 && qntdConv <= 220) {
            totalCade = qntdConv - 150;
            System.out.println("Use auditório ALFA, e inclua mais " + totalCade + " cadeiras.");
        } else if (qntdConv > 220 && qntdConv <=350) {
            System.out.println("Use auditorio BETA.");
        }
        else {
               System.out.println("Número de convidados inválido."); 
        }
    }
    
}
