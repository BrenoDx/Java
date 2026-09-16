package models.services;

public interface ServicoPagamentoService {

    public double calcularJuros(double vlr, int mes);
    public double taxaPagamento(double vlr);
}
