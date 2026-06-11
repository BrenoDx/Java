package model.entidades;

public class Conta {
    private int numero;
    private String titular;
    private double saldo = 0;
    private double saqueLimite;

    public Conta(int numero,String titular, double saldo, double saqueLimite){
        this.numero = numero;
        this.titular = titular;
        deposito(saldo);
        this.saqueLimite = saqueLimite;
    }

    public void deposito(double vlr){
        this.saldo += vlr;
    }

    public void saque(double vlr){

    }

    /*

    saque !> saqueLimite
    saque !> saldo

    */
}
