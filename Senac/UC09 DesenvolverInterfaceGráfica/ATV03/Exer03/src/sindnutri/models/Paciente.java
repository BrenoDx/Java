/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sindnutri.models;

/**
 *
 * @author breno
 */
public class Paciente {
    private String nome;
    private String telefone;
    private String cpf;
    private String data;
    private String receita;
    private boolean isPaciente;
    private boolean isStatus;

    
    public boolean validarCPF(String cpf){
        return cpf.matches("[0-9]{3}[.][0-9]{3}[.][0-9]{3}[-][0-9]{2}");
    }
    
    public boolean validarTelefone(String Telefone){
    return telefone.matches("\\d{11}");   
    }
    
    public boolean validarData(String data){
        return data.matches("\\d{2}/\\d{2}/\\d{4}");
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean getIsPaciente() {
        return isPaciente;
    }

    public void setIsPaciente(boolean isPaciente) {
        this.isPaciente = isPaciente;
    }

    public boolean getIsStatus() {
        return isStatus;
    }

    public void setIsStatus(boolean isStatus) {
        this.isStatus = isStatus;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }
    
    
    
}
