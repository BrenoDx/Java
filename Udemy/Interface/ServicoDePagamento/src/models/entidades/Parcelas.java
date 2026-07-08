package models.entidades;

import java.util.Date;

public class Parcelas {
    private Date dataVenc;
    private double vlr;

    public Parcelas(Date dataVenc, double vlr){
        this.dataVenc = dataVenc;
        this.vlr = vlr;
    }
}
