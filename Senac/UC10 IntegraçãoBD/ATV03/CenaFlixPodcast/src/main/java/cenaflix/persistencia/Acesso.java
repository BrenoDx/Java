/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cenaflix.persistencia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author breno
 */

/**
 * Classe que representa um usuário no sistema, contendo informações básicas
 */
@Entity
public class Acesso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; //Identificador único do usuarios
    
    private String nome, login, senha, tipo; // Informações básicas (Nome do usuário, login de acesso, senha e o nível do acesso)

    /**
     * Obtém o identificador único.
     */
    public int getId() {
        return id;
    }
    
    /**
     * Define o identificador único
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém o nome do usuário
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do usuário
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o login do usuário
     */
    public String getLogin() {
        return login;
    }

    /**
     * Define o login do usuário
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Obtém senha do usuário
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define a senha do usuario 
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Obtém nível de acesso do usuário
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define o nível de acesso do usuário
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
