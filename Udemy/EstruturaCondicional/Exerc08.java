package 

//import java.util.Locale;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author breno
 */
public class UdemyAula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double salario, imposto, diferenca;

        System.out.println("------------Imposto------------");
        System.out.println("Informe seu salario:");
        salario = sc.nextDouble();

        if (salario <= 2000) {
            imposto = 0;

        } else if (salario <= 3000) {
            diferenca = salario - 2000;
            imposto = diferenca * 0.08;

        } else if (salario <= 4500) {
            diferenca = salario - 3000;
            imposto = 1000 * 0.08 + diferenca * 0.18;

        } else {
            diferenca = salario - 4500;
            imposto = 1000 * 0.08 + 1500 * 0.18 + diferenca * 0.28;

        }

        if (imposto == 0) {
            System.out.println("Isento");
        } else {
            System.out.printf("Imposto: R$%.2f", imposto);
        }
    }

}
