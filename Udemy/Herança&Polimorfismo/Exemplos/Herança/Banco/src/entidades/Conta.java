package entidades;

public class Conta {
    private int numero;
    private String titular;
    protected double saldo;

    public Conta(int numero, String titular, double saldo){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void saque(double valor){
        saldo -= valor + 5.0;
    }

    public void deposito(double valor){
        saldo += valor;
    }
}
