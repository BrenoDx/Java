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
    
        System.out.println("Informe número A:");
        int a = entrada.nextInt();
        System.out.println("Informw número B:");
        int b = entrada.nextInt();
        
        if(a % b == 0 || b % a == 0 ){
            System.out.println("São Multiplos");
        }else{
            System.out.println("Não são Multiplos");
        }
        entrada.close();
}
}
