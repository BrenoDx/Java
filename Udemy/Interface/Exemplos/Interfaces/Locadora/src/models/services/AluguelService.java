package models.services;

import models.entidades.AluguelCarro;
import models.entidades.Fatura;

import java.time.Duration;

public class AluguelService {
    private double valorHora;
    private double valorDia;

    private TaxaService taxaService;

    public AluguelService(double valorHora, double valorDia, TaxaService taxaService){
        this.valorHora = valorHora;
        this.valorDia = valorDia;
        this.taxaService = taxaService;
    }

    public void processarFatura(AluguelCarro al){

        double minutos = Duration.between(al.getSaida(), al.getRetorno()).toMinutes();
        double horas = minutos/60.;

        double pagamentoBasico;
        if(horas <= 12){
            pagamentoBasico = valorHora * Math.ceil(horas);
        }else{
            pagamentoBasico = valorDia * Math.ceil(horas/24);
        }

        double taxa = taxaService.taxa(pagamentoBasico);
        al.setFatura(new Fatura(pagamentoBasico, taxa));
    }
}
