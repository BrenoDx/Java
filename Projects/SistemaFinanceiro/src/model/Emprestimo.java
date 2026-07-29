package model;

import java.util.List;

public class Emprestimo {
    private double valorTotal;
    private boolean seguro;

    private List<Parcelas> listaParcelas;

    public Emprestimo(double valorTotal, boolean seguro, List<Parcelas> parcelas){
        this.valorTotal = valorTotal;
        this.seguro = seguro;
        this.listaParcelas = parcelas;
    }


}
