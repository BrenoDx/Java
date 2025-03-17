
package exer05;

import java.util.Scanner;


public class Exer05 {

    public static void main(String[] args) {
    String [][] hotel = new String [4][3];
    int andar = 0, quarto = 0;
    char continuar = 'S';
    Scanner entrada = new Scanner(System.in, "latin1");
        System.out.println("----BEM VINDO AO HOTEL DX----");
        System.out.println();
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 3; j++){
        hotel[i][j] = "Desocupado";
            }
        }
    do {
        System.out.println("Informe Andar e o Quarto. ");
        System.out.println();
        System.out.println("Qual andar? ");
        andar = entrada.nextInt() - 1;
        System.out.println("Número do quarto "); 
        quarto = entrada.nextInt() - 1;
        
        if(andar >= 0 && andar < 4 && quarto >= 0 && quarto < 3) {
            hotel[andar][quarto] = "Ocupado";
        }else{
            System.out.println("Número do andar ou do quarto inválido.");
        }
        System.out.println("Deseja informar outra ocupação? S/N");
        continuar = entrada.next().charAt(0);
    } while (continuar == 'S');
        for(int i = 0; i < 4; i++) {
               System.out.println("Andar:" + (i+1)+ ":");
           for(int j = 0; j < 3; j++)     {
                System.out.println(hotel[i][j]);
                
             
            }
        }
    
    }
    
}
