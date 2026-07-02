package models.services;

public class TaxaService {

    public double taxa(double valor){
        if(valor <= 100.0)
            return valor*0.2;
        return valor * 0.15;
    }

}
