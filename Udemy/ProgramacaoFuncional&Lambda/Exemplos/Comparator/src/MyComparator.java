import entidades.Produtos;

import java.util.Comparator;

public class MyComparator implements Comparator<Produtos> {
    @Override
    public int compare(Produtos p1, Produtos p2) {
        return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
    }
}
