import java.util.Locale;
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
    Locale.setDefault(Locale.US);
    Scanner entrada = new Scanner(System.in);
    
        System.out.println("Informe Código/Quantidade/Valor Unitário da peças 1 e 2");
        int codigo1 = entrada.nextInt();
        int qntd1 = entrada.nextInt();
        double valorUni1 = entrada.nextDouble();
        
        int codigo2 = entrada.nextInt();
        int qntd2 = entrada.nextInt();
        double valorUni2 = entrada.nextDouble();
        
        double valorTotal = (qntd1 * valorUni1) + (qntd2 * valorUni2);
        
        System.out.printf("VALOR A PAGAR: R$%.2f%n", valorTotal);
}
}
