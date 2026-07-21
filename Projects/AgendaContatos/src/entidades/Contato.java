package entidades;

public class Contato {
    private String nome;
    private int ddd;
    private int numero;

    public Contato(String nome, int ddd, int numero){
        this.nome = nome;
        this.ddd = ddd;
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    public String getNome(){
        return nome;
    }

    public int getDdd(){
        return ddd;
    }
}
