package entidades;

public class Produtos {
    public String nome;
    public double preco;
    public int qtd;

    public Produtos(){

    }
    public Produtos(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

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
