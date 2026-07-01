package models.entidades;

import java.time.LocalDateTime;

public class AluguelCarro {
    private LocalDateTime saida;
    private LocalDateTime retorno;

    private Veiculo veiculo;
    private Fatura fatura;

    public AluguelCarro(LocalDateTime saida, LocalDateTime retorno, Veiculo veiculo){
        this.saida = saida;
        this.retorno = retorno;
        this.veiculo = veiculo;
    }
}
