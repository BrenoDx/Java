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
        
        System.out.println("Insira primeiro numero:");
        int numero1 = entrada.nextInt();
        
        System.out.println("Insira o segundo numero:");
        int numero2 = entrada.nextInt();
        
        int total = numero1 +  numero2;
        
        System.out.println("Soma = " + total);
}
}
