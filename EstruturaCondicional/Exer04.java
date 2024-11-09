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
    int total;
        System.out.println("Informe hora inicial do jogo:");
        int horaInicio = entrada.nextInt();
        System.out.println("Informe hora final do jogo:");
        int horaFinal = entrada.nextInt();
        
        if(horaInicio < horaFinal){
            total = horaFinal - horaInicio;
        }else {
            total = 24 - horaInicio + horaFinal;
        }
        System.out.println("O JOGO DUROU " + total + " HORA(S)");
        entrada.close();
}
}
