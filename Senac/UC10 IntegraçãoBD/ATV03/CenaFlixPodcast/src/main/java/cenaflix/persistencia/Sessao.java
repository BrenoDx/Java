/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cenaflix.persistencia;

/**
 *
 * @author breno
 */

/**
 * Classe responsável para retorna Usuario logado
 */
public class Sessao {
    private static Acesso userLogado = new Acesso(); // Instância Acesso

    /**
     * Obtém todos os dados do usuário logado 
     */
    public static Acesso getUserLogado() {
        return userLogado;
    }

    /**
     * Define o usuário logado 
     */
    public static void setUserLogado(Acesso userLogado) {
        Sessao.userLogado = userLogado;
    }
    

}
