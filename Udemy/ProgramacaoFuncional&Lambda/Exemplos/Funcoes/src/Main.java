import entidades.Produto;
import model.services.ProdutoService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Locale.setDefault(Locale.US);
    List<Produto> list = new ArrayList<>();

    list.add(new Produto("Tv", 900.00));
    list.add(new Produto("Mouse", 50.00));
    list.add(new Produto("Tablet", 350.50));
    list.add(new Produto("HD Case", 80.90));

    ProdutoService ps = new ProdutoService();
    double sum = ps.filterSum(list,p -> p.getNome().charAt(0) == 'T');

    System.out.println("Soma = " + String.format("%.2f", sum));
}
