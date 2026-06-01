import entidades.ImpostoRenda;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    List<ImpostoRenda> lista = new ArrayList<>();

    System.out.print("Quantidade para declarar: ");
    int qtd = sc.nextInt();

    for(int i = 0; i<qtd; i++) {
        System.out.println("Imposto #" +(i+1));
        System.out.print("PF/PJ ? ");
        sc.nextLine();
        String opcao = sc.nextLine().toUpperCase();

        if(opcao.equals("PF")) {

            System.out.print("nome: ");
            String nome = sc.nextLine();
            System.out.print("Renda Anual: ");
            double renda = sc.nextDouble();
            System.out.print("Gasto com saúde: ");
            double saude = sc.nextDouble();

            lista.add(new PessoaFisica(nome,renda,saude));

        }else{
            System.out.print("nome: ");
            String nome = sc.nextLine();
            System.out.print("Renda Anual: ");
            double renda = sc.nextDouble();
            System.out.print("Quantidade de funcionários ");
            int qtdFunc = sc.nextInt();

            lista.add(new PessoaJuridica(nome,renda,qtdFunc));
        }

    }

    System.out.println("Imposto a pagar:");
    double total = 0;
    for(ImpostoRenda ip: lista){
        total += ip.calcularImposto();
        System.out.printf("%s: $%.2f%n", ip.getNome(),ip.calcularImposto());
    }
    System.out.printf("Total: %.2f",total);
}
