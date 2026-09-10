package util;
import entidades.Produtos;

import java.util.function.Predicate;

public class ProdutoPredicate implements Predicate<Produtos> {

    @Override
    public boolean test(Produtos p) {
        return p.getVlr() >= 100.0;
    }
}
