/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sindnutri.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author breno
 */
public class ListaPaciente {
    private static final List<Paciente> lista = new ArrayList<>();
    
    public static List<Paciente> listar(){
        return lista;
    }
    
    public static void adicionar(Paciente paciente){
        lista.add(paciente);
    }
    
    public static void remover(Paciente paciente){
        lista.remove(paciente);
    }
}
