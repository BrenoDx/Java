import entidades.Produto;
import util.VlrUpdate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Locale.setDefault(Locale.US);
    List<Produto> list = new ArrayList<>();

    list.add(new Produto("TV",900.00));
    list.add(new Produto("Mouse",50.00));
    list.add(new Produto("Tablet",350.50));
    list.add(new Produto("HD Case",80.90));

    //list.forEach(new VlrUpdate()); interface implementada

    //list.forEach(Produto::staticVlrUpdate); Reference method estático
    // list.forEach(Produto::noStaticVlrUpdate); Reference method não estático

    Consumer<Produto> cons = p -> p.setVlr(p.getVlr()*1.1); // Expressão lambda declarada
    list.forEach(p -> p.setVlr(p.getVlr()*1.1)); // Expressão lambda inline

    list.forEach(System.out::println);
}
