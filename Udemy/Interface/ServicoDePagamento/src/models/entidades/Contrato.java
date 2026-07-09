package models.entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
    private int numContr;
    private Date data;
    private double vlrContr;

    private List<Parcelas> parc = new ArrayList<>();

    public Contrato(int numContr, Date data, double vlrContr){
        this.numContr = numContr;
        this.data = data;
        this.vlrContr = vlrContr;
    }

    public double getVlrContr() {
        return vlrContr;
    }

    public Date getData() {
        return data;
    }

    public List<Parcelas> getParc() {
        return parc;
    }

    public void setParc(Parcelas parc) {
        this.parc.add(parc);
    }
}
