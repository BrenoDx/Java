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
    float total = 0f;
        System.out.println("Informe codigo do item:");
        int cod = entrada.nextInt();
        System.out.println("Informe quantidade do item");
        int qntd = entrada.nextInt();
        
        switch (cod){
            case 1:
              total = qntd * 4.0f; 
              break;
            case 2:
              total = qntd * 4.5f;
              break;
            case 3:
              total = qntd * 5.0f;
              break;
            case 4:
              total = qntd * 2.0f;
              break;
            case 5:
              total = qntd * 1.5f;
              break;
            default:
                System.out.println("Codigo Inválido");
        }
        System.out.printf("Total: R$%.2f%n", total);
        entrada.close();
}
}
