import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws ParseException {
    Scanner sc = new Scanner(System.in);
    List<Produto> lista = new ArrayList<>();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    System.out.print("Informe quantos produtos deseja cadastrar: ");
    int n = sc.nextInt();


    for(int i = 0; i< n; i++){
        System.out.println("Produto #" + (i+1) + ":");
        System.out.print("Comun, usado ou importado (c/u/i)? ");
        char opcao = sc.next().toLowerCase().charAt(0);

        System.out.print("Nome: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.print("Valor: ");
        double vlr = sc.nextDouble();

        if(opcao == 'i'){
            System.out.print("Taxa de alfândega: ");
            double taxa =  sc.nextDouble();
            lista.add(new ProdutoImportado(nome,vlr,taxa));
        }else if(opcao == 'u'){
            System.out.print("Data de fabricação (DD/MM/YYYY)");
            sc.nextLine();
            String data = sc.nextLine();


            lista.add(new ProdutoUsado(nome,vlr,sdf.parse(data)));
        }else{
            lista.add(new Produto(nome, vlr));
        }

    }

    System.out.println("Etiquetas de preços:");
    for(Produto prod : lista){
        System.out.println(prod.etiquetaPreco());
    }

}
