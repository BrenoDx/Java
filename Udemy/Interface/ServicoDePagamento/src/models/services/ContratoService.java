package models.services;

import models.entidades.Contrato;
import models.entidades.Parcelas;

public class ContratoService {
    private ServicoPagamentoService sps;

    public ContratoService(ServicoPagamentoService sps){
        this.sps = sps;
    }


}
