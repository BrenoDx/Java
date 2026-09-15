package entidades;

public class Produto {
    private String nome;
    private  double vlr;

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

    public static void staticVlrUpdate(Produto p){
        p.setVlr(p.getVlr() * 1.1);
    }

    public void noStaticVlrUpdate(){
        vlr = vlr * 1.1;
    }

    public void setVlr(double vlr) {
        this.vlr = vlr;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", vlr=" + String.format("%.2f", vlr) +
                '}';
    }
}
