import java.util.Scanner;

/**
 *
 * @author breno
 */
public class AulaIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Informe um número:");
        int numero = entrada.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("PAR");
        }else{
            System.out.println("IMPAR");
        }
        entrada.close();
}
}
