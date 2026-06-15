import model.entidades.Conta;
import model.exceptions.ContaException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    try {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dados conta:");

        System.out.print("Número: ");
        int numero = sc.nextInt();

        System.out.println("Titular");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.println("Saldo inicial");
        double saldo = sc.nextDouble();

        System.out.println("Limite de saque");
        double limite = sc.nextDouble();

        Conta conta = new Conta(numero, nome, saldo, limite);

        System.out.print("Informe valor para saque: ");
        double vlr = sc.nextDouble();

        conta.saque(vlr);

    }catch (InputMismatchException e){
        System.out.println("Entrada inválida");
    }catch (ContaException e){
        System.out.println(e.getMessage());
    }

}
