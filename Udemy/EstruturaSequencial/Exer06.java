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
        
        System.out.println("Informe valor do A:");
        double a = entrada.nextDouble();
        System.out.println("Informe valor do B:");
        double b = entrada.nextDouble();
        System.out.println("Informe valor do C:");
        double c = entrada.nextDouble();
        
        double triangulo = a * c / 2;
        double circulo = c * c * 3.14159;
        double trapezio = (a+b)/2.0 * c;
        double quadrado = b * b;
        double retangulo = a * b;   
        
        System.out.printf("Triangulo: %.3f%n", triangulo);
        System.out.printf("Circulo: %.3f%n", circulo);
        System.out.printf("Trapezio: %.3f%n", trapezio);
        System.out.printf("Quadrado: %.3f%n", quadrado);
        System.out.printf("Retangulo: %.3f%n", retangulo);  
        entrada.close();
}
}
