package entidades;

public class Produto {
    private String nome;
    private double preço;
    private int qtd;

    public Produto( String nome, double valor, int qtd){
        this.nome = nome;
        this.preço = valor;
        this.qtd = qtd;
    }

    public double total(){
        return getPreço() * getQtd();
    }

    public String getNome() {
        return nome;
    }

    public double getPreço() {
        return preço;
    }

    public int getQtd() {
        return qtd;
    }

}
