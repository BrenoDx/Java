package empresa;

public class Horista extends Funcionario {
    private float horas, valorHora;
    
    public Horista(String _nome, String _cpf, String _endereco, String _telefone, String _setor, float horas, float valorHora){
        super(_nome, _cpf, _endereco, _telefone, _setor);
        this.horas = horas;
        this.valorHora = valorHora;
    }
   
    public float calcularSemAumento(){
        float salario = this.horas*this.valorHora;
            return salario;
    }
    
    @Override
    public float calcularSalario(){
        float salario = this.horas*this.valorHora;
            return salario;
    }
    
    
    @Override
    public void descrever(){
        System.out.println("----------Funcionario----------");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Setor: " + getSetor());
        System.out.println("Salário: " + calcularSalario());
        System.out.println("------------------------------");
        System.out.println();
    }
    
    @Override
    public void aplicarAumento(float aumento){
      this.valorHora += valorHora*aumento/100; 
        System.out.println("----------Reajuste Salarial----------");
        System.out.println("Nome: " + getNome());
        System.out.println("Total a receber: " + valorHora);
        System.out.println();
    }
    
    public float getHoras() {
        return horas;
    }

    public void setHoras(float horas) {
        this.horas = horas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
    
    
    
    
}
