package empresa;

public abstract class Funcionario {
    private String nome, cpf, endereco, telefone, setor;

    public Funcionario(String _nome, String _cpf, String _endereco, String _telefone, String _setor){
        this.nome = _nome;
        this.cpf = _cpf;
        this.endereco = _endereco;
        this.telefone = _telefone;
        this.setor = _setor;
    }
    
    public abstract float calcularSalario();
        
    public void descrever(){
    }
    public void aplicarAumento(float aumento){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
      
    
}
