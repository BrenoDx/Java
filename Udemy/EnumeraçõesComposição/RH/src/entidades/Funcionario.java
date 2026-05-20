package entidades;
import enums.Cargo;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Funcionario {
    private String nome;
    private Cargo nivel;
    private double salario;
    private List<ContratoHora> contratos = new ArrayList<>();
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

        double soma = salario;
        Calendar cal = Calendar.getInstance();

        for (ContratoHora c : contratos){
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1+ cal.get(Calendar.MONTH);

            if (ano == c_ano && mes == c_mes){

                soma += c.total();
            }
        }

        return soma;
    }

    public String getNome() {
        return nome;
    }

    public Departamento getDpto() {
        return dpto;
    }
}
