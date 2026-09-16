import entidades.Contato;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    List<Contato> lista = new ArrayList<>();

    System.out.println("-----Agenda telefônica-----");
    System.out.println("(1)-Cadastrar; (2)-Contatos; (3)-Editar; (4)-Excluir");
    String op = sc.nextLine().toLowerCase();

    while(!op.equals("6")) {
        switch (op) {
            case "1", "cadastrar":
                System.out.println();
                System.out.println("-----Cadastramento-----");

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("ddd: ");
                int ddd = sc.nextInt();

                System.out.print("Numero: ");
                int numero = sc.nextInt();

                lista.add(new Contato(nome,ddd,numero));
                System.out.println("Contato salvo!");
                sc.nextLine();
                break;
            case "2", "contatos":
                System.out.println("teste2");
                break;
            case "3", "editar":
                System.out.println("teste3");
                break;
            case "4", "excluir":
                System.out.println("teste4");
                break;
            default:
                System.out.println("teste5");
                break;
        }
        System.out.println("continua");
        op = sc.nextLine();
    }
}
