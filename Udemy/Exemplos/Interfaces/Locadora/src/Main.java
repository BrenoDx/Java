import models.entidades.AluguelCarro;
import models.entidades.Veiculo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Entre com os dados do aluguel");
    System.out.print("Modelo do carro: ");
    String modelo = sc.nextLine();

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
    LocalDateTime retirada = LocalDateTime.parse(sc.nextLine(), dtf);

    System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
    LocalDateTime retorno = LocalDateTime.parse(sc.nextLine(), dtf);

    AluguelCarro ac = new AluguelCarro(retirada, retorno, new Veiculo(modelo));

    sc.close();
}
