import entidades.Produtos;
import util.ProdutoPredicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<Produtos> list = new ArrayList<>();

    list.add(new Produtos("Tv", 900.00));
    list.add(new Produtos("Mouse", 50.00));
    list.add(new Produtos("Tablet", 350.50));
    list.add(new Produtos("HD Case", 80.90));

    //list.removeIf(new ProdutoPredicate()); Implementação da interface

    //list.removeIf(Produtos::staticProdutoPredicate);  method Reference com método estático
    //list.removeIf(Produtos::noStaticProdutoPredicate);  method Reference sem método estático


    Predicate<Produtos> pred = p -> p.getVlr() >= 100; //Expressão labmda declarada
    list.removeIf(pred);

    for(Produtos p : list){
        System.out.println(p);
    }
}
