package service;

import model.Conta;

public class ContaService {

    public void depositar(Conta conta, double vlr){
        conta.setSaldo(vlr);
        mostrarSaldo(conta);
    }

    public void mostrarSaldo(Conta conta){
        System.out.printf("Conta: %s Saldo: %.2f%n", conta.getNumero(), conta.getSaldo());
    }

    public void sacar(Conta conta, double vlr){
        if (conta.getSaldo() < vlr){
            System.out.println("Saldo insuficiente!");
            mostrarSaldo(conta);
            return ;
        }

        System.out.println("Finalizando a operação");
        double saldoAtualizado = conta.getSaldo() - vlr;
        conta.setSaldo(saldoAtualizado);
        mostrarSaldo(conta);
    }
}
