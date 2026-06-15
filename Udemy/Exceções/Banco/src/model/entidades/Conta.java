package model.entidades;

import model.exceptions.ContaException;

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

    public void saque(double vlr) throws ContaException {
        if(vlr > getSaldo()){
            throw new ContaException("Erro: saldo insuficiente");
        }else if(vlr > getSaqueLimite()){
              throw new ContaException("Erro: valor acima do limite estabelecido");
        }

        this.saldo -= vlr;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getSaqueLimite() {
        return saqueLimite;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Novo saldo: " + getSaldo());

        return sb.toString();
    }
}
