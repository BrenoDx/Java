package models.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
    private int numContr;
    private Date data;
    private double vlrContr;

    List<Parcelas> parc = new ArrayList<>();

    public Contrato(int numContr, Date data, double vlrContr){
        this.numContr = numContr;
        this.data = data;
        this.vlrContr = vlrContr;
    }

    public double getVlrContr() {
        return vlrContr;
    }

    public void setParc(Parcelas parc) {
        this.parc.add(parc);
    }
}
