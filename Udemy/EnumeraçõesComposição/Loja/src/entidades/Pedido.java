package entidades;

import enums.StatusPedido;

import java.util.Date;

public class Pedido {
    private Date data;
    private StatusPedido status;

    public Pedido(Date data, StatusPedido status){
        this.data = data;
        this.status = status;
    }

    public void adicionarItem(){

    }

    public void removeItem(){

    }

    public Double total(){

    }
}
