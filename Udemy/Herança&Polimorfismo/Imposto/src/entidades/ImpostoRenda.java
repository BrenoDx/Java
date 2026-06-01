package entidades;

public abstract class ImpostoRenda {
    private String nome;
    private double rendaAnual;

    public ImpostoRenda(String nome, double rendaAnual){
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public abstract double calcularImposto();

}
