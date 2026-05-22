import entidades.Cliente;
import entidades.Pedido;
import entidades.PedidoItem;
import entidades.Produto;
import enums.StatusPedido;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws ParseException {
    Scanner sc = new Scanner(System.in);
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/YYYY");

    System.out.print("Nome: ");
    String nome = sc.nextLine();
    System.out.print("Email: ");
    String email = sc.nextLine();
    System.out.print("Data de nascimento (DD/MM/YYYY): ");
    String data = sc.nextLine();

    System.out.println("Insere os dados do pedido:");
    System.out.print("Status: (PAGAMENTO_PENDENTE; PROCESSANDO; ENVIADO; ENTREGUE)");
    String status = sc.nextLine();

    Date data_p = new Date();
    Date nasc = sdf2.parse(data);

    Pedido p = new Pedido(data_p, StatusPedido.valueOf(status),
                               new Cliente(nome,email, nasc)  );

    System.out.print("Quantos itens vai ter no pedido? ");
    int qtd = sc.nextInt();

    for (int i = 0; i < qtd; i++){
        System.out.println("Dados #" +(i+1)+ " item do pedido:");
        sc.nextLine();

        System.out.print("Nome do produto: ");
        String nome_p = sc.nextLine();
        System.out.print("Preço do pedido: ");
        double preco = sc.nextDouble();
        System.out.print("Quantidade: ");
        int qtd_p = sc.nextInt();

        p.adicionarItem(new PedidoItem(qtd_p, preco, new Produto(nome_p, preco)));
    }

    System.out.println(p.toString());

}
