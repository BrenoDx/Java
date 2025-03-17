/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cenaflix.persistencia;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Time;

/**
 *
 * @author breno
 */

/**
 * Classe que representa podcast no sistema, contendo algumas informações.
 */
@Entity
public class Podcast {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id; // Identificador único do podcast
   
   private String produtor, nomeEp, url, duracao; // Informações básicas do podcast (Ex: Nome do produtor, nome do episódio, URL do episódio e a duração)
   private int episodio; // Número do episódio
  // private Time duracao; // Duração do episódio

   /**
    * Obtém identificador único 
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
     * Obtém o nome do produtor
     */
    public String getProdutor() {
        return produtor;
    }

    /**
     * Define o nome do produtor
     */
    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    /**
     * Obtém o nome do episódio 
     */
    public String getNomeEp() {
        return nomeEp;
    }

    /**
     * Define o nome do episódio
     */
    public void setNomeEp(String nomeEp) {
        this.nomeEp = nomeEp;
    }

    /**
     * Obtém a URL do episódio
     */
    public String getUrl() {
        return url;
    }

    /**
     * Define a URL do episódio
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Obtém a duração do episódio 
     */
    public String getDuracao() {
        return duracao;
    }

    /**
     * Define a duração do episódio 
     */
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    /**
     * Obtém o número do episódio 
     */
    public int getEpisodio() {
        return episodio;
    }

    /**
     * Define o número do episódio 
     */
    public void setEpisodio(int ep) {
        this.episodio = ep;
    }
   
    
}
