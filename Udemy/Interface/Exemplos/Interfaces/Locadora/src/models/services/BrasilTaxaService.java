package models.services;

public class BrasilTaxaService implements TaxaService {

    public double taxa(double valor){
        if(valor <= 100.0)
            return valor*0.2;
        return valor * 0.15;
    }
}
