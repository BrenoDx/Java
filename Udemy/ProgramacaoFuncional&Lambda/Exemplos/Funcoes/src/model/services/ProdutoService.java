package model.services;

import entidades.Produto;

import java.util.List;
import java.util.function.Predicate;

public class ProdutoService {
    public double filterSum(List<Produto> list, Predicate<Produto> criterio){
        double sum = 0.0;
        for(Produto p : list){
            if(criterio.test(p)){
                sum += p.getVlr();
            }
        }
        return sum;
    }
}
