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
    double pi = 3.14159; 
    
        System.out.println("Insira Valor do raio de um círculo:");
        double raio = entrada.nextDouble();
        
        double a = pi * (raio * 2);
        System.out.printf("A=%.4f%n", a);
}
}
