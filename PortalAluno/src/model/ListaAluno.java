/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author breno
 */
public class ListaAluno {
    private static final List<Aluno> lista = new ArrayList<>();
    
    public static List<Aluno> listar(){
        return lista;
    }
   
    public static void adicionar(Aluno aluno){
        lista.add(aluno);
    }
}
