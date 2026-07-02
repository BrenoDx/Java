import models.entidades.AluguelCarro;
import models.entidades.Veiculo;
import models.services.AluguelService;
import models.services.TaxaService;

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

    System.out.print("Preço por hora: ");
    double valorHora = sc.nextDouble();

    System.out.print("Preço por dia: ");
    double valorDia = sc.nextDouble();


    AluguelService aluguelService = new AluguelService(valorHora,valorDia, new TaxaService());
    aluguelService.processarFatura(ac);

    System.out.println("Fatura:");
    System.out.println("Pagamento básico: " + ac.getFatura().getPagamento());
    System.out.println("Imposto: " + ac.getFatura().getTaxa());
    System.out.println("Pagamento Total: " + ac.getFatura().getTotalPagamento());
    sc.close();
}
