package entidades;

public class Funcionario {
    private String nome;
    private Integer horas;
    private Double valorHora;

    public Funcionario(String nome, Integer horas, double valorHora){
        this.nome = nome;
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public String getNome() {
        return nome;
    }

    public Integer getHoras(){
        return horas;
    }
    public double getValorHora(){
        return valorHora;
    }
    public double pagamento(){
        return getHoras()*getValorHora();
    }
}
