import entidades.ContratoHora;
import entidades.Departamento;
import entidades.Funcionario;
import enums.Cargo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws ParseException {
  Scanner sc = new Scanner(System.in);

  System.out.println("Departamento");
  String dpto = sc.nextLine();

  System.out.println("Dados Funcionário");
  System.out.println("Nome: ");
  String nome = sc.nextLine();
  System.out.println("Nível do cargo: ");
  String nivel = sc.nextLine();
  System.out.println("Salário base: ");
  double salario = sc.nextDouble();

  Funcionario func = new Funcionario(nome,Cargo.valueOf(nivel), salario, new Departamento(dpto) );

  System.out.println("Quantos contratos esse funcionário possui:");
  int qtd = sc.nextInt();

  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  for(int i = 0; i < qtd; i++){

    sc.nextLine();

    System.out.println("Contrato "+(i+1));
    System.out.println("Data (DD/MM/YYYY)");
    String dataString = sc.nextLine();

    System.out.println("Valor por hora:");
    double vlrHora = sc.nextDouble();
    System.out.println("Duração (horas)");
    int horas = sc.nextInt();

    Date data = sdf.parse(dataString);
    func.adicionarContrato(new ContratoHora(data,vlrHora,horas));
  }
  
}
