package models.services;

public class PayPalService implements ServicoPagamentoService{

    public double calcularJuros(double vlr, int mes){
        double juros = vlr * 0.01*mes;
        return juros;
    }

    public double taxaPagamento(double vlr){
        double taxa = vlr * 0.02;
        return taxa;
    }
}
