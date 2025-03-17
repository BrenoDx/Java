/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.sql.Date;

/**
 *
 * @author breno
 */
/**
 * Classe que representa um filme no sistema, contendo informações básicas
 */
public class Filme {

    private int id; // Identificador único do filme
    private String nome, categoria; // Nome e Categoria do filme (ex: ação, comédia, drama)
    private Date data; // Data de lançamento do filme

    /**
     * Obtém o Nome do Filme.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o Nome do Filme.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a Categoria.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define a Categoria do filme.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Obtém a Data de lançamento.
     */
    public Date getData() {
        return data;
    }

    /**
     * Define a data de lançamento.
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * Obtém o identificador único do Filme.
     */
    public int getId() {
        return id;
    }

    /**
     * Define o identificador único do filme.
     */
    public void setId(int id) {
        this.id = id;
    }

}
