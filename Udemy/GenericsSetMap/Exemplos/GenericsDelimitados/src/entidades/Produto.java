package entidades;

public class Produto implements Comparable<Produto> {
    private String nome;
    private Double vlr;

    public Produto(String nome, Double vlr){
        this.nome=nome;
        this.vlr=vlr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVlr() {
        return vlr;
    }

    public void setVlr(Double vlr) {
        this.vlr = vlr;
    }

    @Override
    public String toString() {
        return nome + ", " + String.format("%.2f", vlr);
    }

    @Override
    public int compareTo(Produto o) {
        return vlr.compareTo(o.getVlr());
    }
}
