package entidades;

import enums.StatusPedido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

    private Date data;
    private StatusPedido status;

    private Cliente cliente;
    private List<PedidoItem> itens = new ArrayList<>();

    public Pedido(Date data, StatusPedido status, Cliente cliente){
        this.data = data;
        this.status = status;
        this.cliente = cliente;
    }

    public void adicionarItem(PedidoItem item){
        this.itens.add(item);
    }

    public void removeItem(PedidoItem item){
        this.itens.remove(item);
    }

    public Double total(){
        double total = 0;
        for (PedidoItem item : itens){
            total += item.subTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Período do pedido: "+ sdf.format(data) + "\n");
        sb.append("Status do pedido: " + status + "\n");
        sb.append("Cliente: " + cliente.getNome() + "(" + sdf2.format(cliente.getNascimento()) + ") - " + cliente.getEmail() + "\n");
        sb.append("Itens:\n");

        for (PedidoItem item : itens){
            sb.append(item.getProduto().getNome() + ", R$"+ String.format("%.2f ", item.getPreco()));
            sb.append("Quantidade: " + item.getQtd() + ", SubTotal: R$"+ String.format("%.2f\n", item.subTotal()));
        }
        sb.append("Total: R$" + String.format("%.2f", total()));

        return sb.toString();
    }
}
