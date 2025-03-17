/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tela.model;

/**
 *
 * @author breno
 */
public class Paciente {
    private String data, hora, situacao;
    private int pressaoS, pressaoD;

    public boolean validarData(String data){
        return data.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}");
    }
    
    public boolean validarHora(String hora){
        return hora.matches("[0-9]{2}[:][0-9]{2}");
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getPressaoS() {
        return pressaoS;
    }

    public void setPressaoS(int pressaoS) {
        this.pressaoS = pressaoS;
    }

    public int getPressaoD() {
        return pressaoD;
    }

    public void setPressaoD(int pressaoD) {
        this.pressaoD = pressaoD;
    }
    
    
}
