package entidades;

public class PedidoItem {
    private int qtd;
    private double preco;

    private Produto produto;

    public PedidoItem(int qtd, double preco, Produto produto){
        this.qtd = qtd;
        this.preco = preco;
        this.produto = produto;
    }

    public double subTotal(){
            return preco * qtd;
    }

    public double getPreco() {
        return preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQtd() {
        return qtd;
    }
}
