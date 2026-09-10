import entidades.Produtos;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<Produtos> list = new ArrayList<>();

    list.add(new Produtos("TV", 900.00));
    list.add(new Produtos("Notebook", 1200.00));
    list.add(new Produtos("tablet", 450.00));

    //list.sort(new MyComparator()); -> Comparator classe separada

    /* Classe anônima
    Comparator<Produtos> comp = new Comparator<Produtos>() {
        @Override
        public int compare(Produtos p1, Produtos p2) {
            return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
        }
    };

    list.sort(comp);
    */
    Comparator<Produtos> comp = (p1,p2) -> {
        return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
    };
    list.sort(comp);

    for(Produtos p : list){
        System.out.println(p);
    }
}
