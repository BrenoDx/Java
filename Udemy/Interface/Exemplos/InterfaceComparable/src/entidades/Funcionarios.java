package entidades;

public class Funcionarios implements Comparable<Funcionarios>{
    private String nome;
    private double salario;

    public Funcionarios(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public int compareTo(Funcionarios o) {
        return nome.compareTo(o.getNome());
    }
}
