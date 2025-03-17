import java.util.Scanner;

/**
 *
 * @author breno
 */
public class Aula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Insira primeiro numero do produto:");
        int a = entrada.nextInt();
        System.out.println("Insira segundo numero do produto:");
        int b = entrada.nextInt();
        System.out.println("Insira o terceiro numero do produto:");
        int c = entrada.nextInt();
        System.out.println("Insira o quarto numero do produto");
        int d = entrada.nextInt();
        
        int diferenca = a*b - c*d;
        System.out.println("Diferenca = " + diferenca);
        
}
}
