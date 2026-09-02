package entidades;

import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private String nome;
    private double vlr;

    public Produto(String nome, double vlr) {
        this.nome = nome;
        this.vlr = vlr;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVlr() {
        return vlr;
    }

    public void setVlr(double vlr) {
        this.vlr = vlr;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Double.compare(vlr, produto.vlr) == 0 && Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, vlr);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", vlr=" + vlr +
                '}';
    }

    @Override
    public int compareTo(Produto p) {
        return nome.toUpperCase().compareTo(p.getNome().toUpperCase());
    }
}
