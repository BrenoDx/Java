package models.services;

public interface ServicoPagamentoService {

    public double calcularJuros(double vlr, int meses);
    public double taxaPagamento(double vlr);
}
