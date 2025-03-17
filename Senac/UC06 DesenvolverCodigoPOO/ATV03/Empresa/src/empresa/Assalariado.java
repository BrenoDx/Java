package empresa;

public class Assalariado extends Funcionario{
    private float salarioMensal;
    
    public Assalariado(String _nome, String _cpf, String _endereco, String _telefone, String _setor, float _salarioMensal){
        super(_nome, _cpf, _endereco, _telefone, _setor);
        this.salarioMensal = _salarioMensal;
            }
    
    @Override
    public float calcularSalario(){
        return this.salarioMensal;
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
       this.salarioMensal += this.salarioMensal*aumento/100;
        System.out.println("----------Reajuste Salarial----------");
        System.out.println("Nome: " + getNome());
        System.out.println("Total a receber: " + salarioMensal);
        System.out.println();
    }
    
    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    
    
}
