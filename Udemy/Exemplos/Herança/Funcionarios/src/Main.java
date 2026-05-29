import entidades.Funcionario;
import entidades.Terceirizado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Quantos funcionários? ");
    int qtd = sc.nextInt();
    List<Funcionario> lista = new ArrayList<>();

    for(int i =0; i < qtd; i++) {
        System.out.println("Funcionário #" + (i + 1));
        System.out.println("Terceirizado (Y/N):");
        char opcao = sc.next().toUpperCase().charAt(0);

        sc.nextLine();

        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Horas: ");
        Integer horas = sc.nextInt();
        System.out.println("Valor por hora");
        double vlr = sc.nextDouble();

        if (opcao == 'Y') {
            System.out.println("Adicional: ");
            double adicional = sc.nextDouble();
            lista.add(new Terceirizado(nome, horas, vlr, adicional));
        } else {
            lista.add(new Funcionario(nome, horas, vlr));
        }
    }
    System.out.println("Pagamentos:");
    for(Funcionario func : lista){
        System.out.printf("%s - $ %.2f\n", func.getNome(), func.pagamento());
    }
}
