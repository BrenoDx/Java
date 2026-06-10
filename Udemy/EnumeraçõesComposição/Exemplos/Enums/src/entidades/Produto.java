package entidades;

import entidades.enums.Status;

import java.util.Date;

public class Produto {
    private int id;
    private Date data;
    private Status status;

    public Produto(int id,Date data, Status status) {
        this.id = id;
        this.data = data;
        this.status = status;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", data=" + data +
                ", status=" + status +
                '}';
    }
}
