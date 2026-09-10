package entidades;

public class Produtos {
    private String nome;
    private double vlr;

    public Produtos(String nome, double vlr) {
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

    // Estático trabalha com obj passado pelo params:
    public static boolean staticProdutoPredicate(Produtos p){
        return p.getVlr() >= 100.0;
    }

    // Método de instância
    public boolean noStaticProdutoPredicate(){
        return vlr >= 100.0;
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "nome='" + nome + '\'' +
                ", vlr=" + vlr +
                '}';
    }
}
