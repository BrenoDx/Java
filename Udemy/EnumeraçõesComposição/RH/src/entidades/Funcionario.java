package entidades;
import enums.Cargo;
import java.util.List;

public class Funcionario {
    private String nome;
    private Cargo nivel;
    private double salario;
    private List<ContratoHora> contratos;
    private Departamento dpto;

    public Funcionario(String nome, Cargo nivel, double salario, Departamento dpto){
        this.nome = nome;
        this.nivel = nivel;
        this.salario = salario;
        this.dpto = dpto;
    }

    public void adicionarContrato(ContratoHora contratoHora){
        contratos.add(contratoHora);
    }

    public void removeContrato(ContratoHora contratoHora){
        contratos.remove(contratoHora);

    }
    public double renda(int ano, int mes){

    }
}
