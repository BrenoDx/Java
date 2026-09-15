package util;

import entidades.Produto;

import java.util.function.Consumer;

public class VlrUpdate implements Consumer<Produto> {

    @Override
    public void accept(Produto p) {
        p.setVlr(p.getVlr() * 1.1);
    }
}
