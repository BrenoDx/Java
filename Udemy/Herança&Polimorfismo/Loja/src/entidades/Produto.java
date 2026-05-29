package entidades;

public class Produto {
    private String nome;
    private double vlr;

    public Produto(String nome, double vlr){
        this.nome = nome;
        this.vlr = vlr;
    }

    public String getNome() {
        return nome;
    }

    public double getVlr() {
        return vlr;
    }

    public String etiquetaPreco(){
        return getNome() + " $" + getVlr();
    }
}
