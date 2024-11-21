/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portalaluno.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author breno
 */
public class ListaAluno {
    private static final List<Aluno> lista = new ArrayList<>();
    
    public static List<Aluno> Listar(){
        return lista;
    }
    
    public static void Adicionar(Aluno aluno){
        lista.add(aluno);
    }
}
