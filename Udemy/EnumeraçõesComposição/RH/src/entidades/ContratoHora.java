package entidades;

import java.util.Date;

public class ContratoHora {
    private Date data;
    private Double valorHora;
    private int horas;

    public ContratoHora(Date data, double valorHora, int horas){
        this.data = data;
        this.valorHora = valorHora;
        this.horas = horas;

    }

    public Double total(){
        return valorHora * horas;

    }

    public Date getData() {
        return data;
    }
}
