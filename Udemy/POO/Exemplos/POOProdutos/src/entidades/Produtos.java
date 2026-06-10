package entidades;

public class Produtos {
    private String nome;
    private double preco;
    private int qtd;

    public Produtos(){

    }
    public Produtos(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public  String getNome(){ return nome;}

    public void setName(String nome){ this.nome = nome;}

    public double total(){
        return qtd*preco;
    }

    public void adicionarQtd(int qtd){
        this.qtd += qtd;
    }

    public void retirarQtd(int qtd){
        this.qtd -= qtd;
    }

    public String ToString(){
        return "Produto: " + nome + "; preço unitário: R$" + String.format("%.2f",preco) + "; quantidade: " + qtd + "; Total: R$" + String.format("%.2f",total());
    }
}
