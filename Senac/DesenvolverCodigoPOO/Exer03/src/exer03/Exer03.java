
package exer03;

import java.util.Scanner;


public class Exer03 {

    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in, "latin1");
     String nome;
     float totalValor = 0, valorDiaria;
     int totalGratui = 0, totalMeia = 0, idade;
        
        System.out.println("Valor da diária");
        valorDiaria = entrada.nextFloat();
        
        do {
            entrada.nextLine();
            System.out.println("Nome do Hóspede? ");
            nome = entrada.nextLine();
            
           if (nome.equalsIgnoreCase("PARE")) {
               break;
           }
           
            System.out.println("Qual é a idade do Hóspede? ");
            idade = entrada.nextInt();
            
          if (idade > 0 && idade < 4) {
              System.out.println(nome + " possui gratuidade.");
              totalGratui++;
          } else if (idade > 80) {
              System.out.println(nome + " paga meia.");
              totalValor = totalValor + valorDiaria / 2;
              totalMeia++;
          } else {
              totalValor = valorDiaria + totalValor;
          }
        } while (true);
        System.out.println("Total de hospedagens: " + totalValor + "; " + totalGratui + " Gartuidade(s); " + totalMeia + " meia(s)");
        
    }
    
}
