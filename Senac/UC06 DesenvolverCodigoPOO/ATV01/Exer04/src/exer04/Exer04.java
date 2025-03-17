
package exer04;

import java.util.Scanner;

public class Exer04 {


    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in, "latin1");
       int contH = 0, opcao = 0;
       String nome, hospEncon = "";
       String[] hospede = new String[15];
       
       while (opcao != 3) {
        System.out.println("Digite 1- Cadastrar; 2- Pequisar; 3- Sair");
        opcao = entrada.nextInt();
        entrada.nextLine();
        
        if (opcao == 1) {
         if(contH < 15) {
            System.out.println("Regista nome do hóspede. ");
            hospede[contH] = entrada.next();
            contH++;
         } else {
             System.out.println("Máximos de cadastros atingidos.");
         }
            }
        
        if (opcao == 2) {    
            System.out.println("Nome do hóspede.");
            nome = entrada.nextLine();
            
         for(int i = 0; i < contH; i++){
             if(nome.equalsIgnoreCase(hospede[i])){
                hospEncon = nome;
                System.out.println("Hóspede " + hospEncon + " foi encontrado no índice " + i);
             } else {
                 System.out.println("Hóspede não encontrado.");
             }
         }
        }
        
        if (opcao == 3) {
            System.out.println("Fim do programa.");  
            break;
        }
        
        
        }        
       }
    }
    

