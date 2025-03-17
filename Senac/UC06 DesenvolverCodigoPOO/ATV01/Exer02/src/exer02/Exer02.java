
package exer02;

import java.util.Scanner;


public class Exer02 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in, "latin1");
      /* Explicação das variaveis.
      As variaveis idadeA e idadeB para representar as 
      idades de acordo com o quarto, por isso o A e B no final, mesma
      coisa com nomes dos hospedes A e B */
        int idadeA = 0, idadeB = 0, idade;
        String nome, hospedeA = "", hospedeB = "";
      
        for (int contador = 0; contador < 2; contador++) {
            System.out.println("Qual é seu nome? ");
            nome = entrada.nextLine();
            System.out.println("Qual é sua idade? ");
            idade = entrada.nextInt();
                    
            entrada.nextLine();
            if (idade > idadeA ) {
                idadeB = idadeA;
                hospedeB = hospedeA;
                idadeA = idade;  
                hospedeA = nome;
            } else {
               idadeB = idade;
               hospedeB = nome;
          
            }
            
       
        }
        if(idadeA >= 60){
        System.out.println("Quarto A: " + hospedeA + " com 40% de desconto.");
        } else{
            System.out.println("Quarto A: " + hospedeA);
        }
        System.out.println("Quarto B: " + hospedeB);
    }
    
}
