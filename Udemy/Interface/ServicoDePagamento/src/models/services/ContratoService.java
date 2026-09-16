package models.services;

import models.entidades.Contrato;
import models.entidades.Parcelas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ContratoService {
    private ServicoPagamentoService sps;

    public ContratoService(ServicoPagamentoService sps){
        this.sps = sps;
    }

    public void processarContrato(Contrato contrato, int mes) throws ParseException {
        Calendar cal = Calendar.getInstance();
        cal.setTime(contrato.getData());
        double vlr = contrato.getVlrContr() / mes;

        for(int i =1; i <= mes; i++){

            double juros = vlr + sps.calcularJuros(vlr, i);
            double total = juros + sps.taxaPagamento(juros);

            cal.add(Calendar.MONTH, 1);
            Date dataVenc = cal.getTime();
            contrato.setParc(new Parcelas(dataVenc,total));
        }

    }

}
