package models.entidades;

public class Fatura {
    private double pagamento;
    private double taxa;

    public Fatura(double pagamento, double taxa){
        this.pagamento = pagamento;
        this.taxa = taxa;
    }

    public double getPagamento() {
        return pagamento;
    }

    public double getTaxa() {
        return taxa;
    }

    public double getTotalPagamento(){
        return getPagamento() + getTaxa();
    }
}
