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
    
        System.out.println("Informe seu numero da matricula:");
        int mat = entrada.nextInt();
        System.out.println("informe sua quantidade de horas trabalhadas:");
        int qntdHoras = entrada.nextInt();
        System.out.println("Informe o valor da hora para calcular o salario:");
        double valorHora = entrada.nextDouble();
        
        double valorTotal = qntdHoras * valorHora;
        
        System.out.println("Number: " + mat);
        System.out.printf("Salary:U$ %.2f%n", valorTotal);
        
}
}
