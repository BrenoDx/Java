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
        
        if(numero >= 0 ){
            System.out.println("NAO NEGATIVO");
        }else{
            System.out.println("NEGATIVO");
        }
        entrada.close();
}
}
