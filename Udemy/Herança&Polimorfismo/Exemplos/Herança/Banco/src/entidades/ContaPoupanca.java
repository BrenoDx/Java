package entidades;

public class ContaPoupanca extends Conta{
    private double taxaJuros;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros){
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void saque(double valor) {
        saldo -= valor;
    }

    public void atualizarSaldo(){
        saldo += saldo * taxaJuros;
    }
}
