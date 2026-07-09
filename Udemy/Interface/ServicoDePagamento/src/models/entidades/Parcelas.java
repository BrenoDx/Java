package models.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Parcelas {
    private Date dataVenc;
    private double vlr;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Parcelas(Date dataVenc, double vlr){
        this.dataVenc = dataVenc;
        this.vlr = vlr;
    }

    public Date getDataVenc() {
        return dataVenc;
    }

    public double getVlr() {
        return vlr;
    }

    @Override
    public String toString() {
        return sdf.format(getDataVenc()) + " - " + String.format("%.2f",getVlr());
    }
}
