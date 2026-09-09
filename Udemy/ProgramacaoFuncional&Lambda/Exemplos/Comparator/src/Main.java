import entidades.Produtos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<Produtos> list = new ArrayList<>();

    list.add(new Produtos("TV", 900.00));
    list.add(new Produtos("Notebook", 1200.00));
    list.add(new Produtos("tablet", 450.00));

    list.sort(new MyComparator());

    for(Produtos p : list){
        System.out.println(p);
    }
}
