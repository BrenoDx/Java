import entidades.Produtos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    // Produtos produto = new Produtos();

    System.out.print("Informe nome do produto:");
    String nome = sc.nextLine();

    System.out.print("Quantidade no estoque:");
    int qtd = sc.nextInt();

    System.out.print("Preço unitário:");
    double preco = sc.nextDouble();

    sc.nextLine();

    Produtos produto = new Produtos(nome, preco, qtd);
    System.out.println(produto.ToString());

    System.out.print("Informe novamente nome do produto:");
    produto.setName(sc.nextLine());
    System.out.println("Novo nome: " + produto.getNome());

    System.out.print("Adicionar mais quantidade no estoque:");
    produto.adicionarQtd(sc.nextInt());

    System.out.println(produto.ToString());

    System.out.print("Retirar quantidade do estoque:");
    produto.retirarQtd(sc.nextInt());

    System.out.println(produto.ToString());

    }

