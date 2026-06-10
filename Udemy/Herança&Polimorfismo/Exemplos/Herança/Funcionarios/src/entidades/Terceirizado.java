package entidades;

public class Terceirizado extends Funcionario{
    private Double adicional;

    public Terceirizado(String nome, Integer horas, double valorHora, double adicional){
        super(nome, horas, valorHora);
        this.adicional = adicional;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + adicional*1.1;
    }
}
