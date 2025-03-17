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
    
        System.out.println("Informe valor do X:");
        float x = entrada.nextFloat();
        System.out.println("Informe valor do Y:");
        float y = entrada.nextFloat();
        
        if(x > 0 && y > 0){
            System.out.println("Q1");
        }else if(x > 0 && y < 0){
            System.out.println("Q4");
        }else if(x < 0 && y > 0){
            System.out.println("Q2");
        }else if(x < 0 && y < 0){
            System.out.println("Q3");
        }else{
            System.out.println("Origem");
        }
        entrada.close();
}
}
