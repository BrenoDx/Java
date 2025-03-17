/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cenaflix.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author breno
 */

/**
 * Classe responsável para manipular dados podcast no banco de dados
 */
public class PodcastDAO {
    private EntityManager em; // Instância do EntityManager

    /**
     * Método para cadastrar podcast no banco de dados
     */
    public void cadastrar(Podcast podcast) {
        em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(podcast);
            em.getTransaction().commit();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar!");
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    /**
     * Método do tipo List para retorna informações do podcast  
     */
    public List<Podcast> listar(String produtor) {
        em = JPAUtil.getEntityManager();
        try {
            Query consulta = em.createQuery("SELECT p FROM Podcast p WHERE produtor LIKE :produtor");
            consulta.setParameter("produtor", "%" + produtor + "%");

            List<Podcast> lista = consulta.getResultList();
            return lista;
        } finally {
            JPAUtil.closeEntityManager();
        }
    }

    /**
     * Método para excluir podcast do banco de dados 
     */
    public void excluir(int linha) {
        em = JPAUtil.getEntityManager();
        try {
            Podcast pd = em.find(Podcast.class, linha);

                em.getTransaction().begin();
                em.remove(pd);
                em.getTransaction().commit();

        } catch (Exception e) {
        }finally{
            JPAUtil.closeEntityManager();
        }
    }

}
