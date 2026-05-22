package entidades;

public class ContaPoupanca extends Conta{
    private double taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros){
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public void atualizarSaldo(){
        saldo += saldo * taxaJuros;
    }
}
