/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cenaflix.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

/**
 *
 * @author breno
 */

/**
 * Classe resposável para validar os acessos do usuários
 */
public class AcessoDAO {
    private EntityManager em; // Instância do EntityManager

    /**
     * Método do tipo Acesso para efetuar login do usuário 
     */
    public Acesso entrar(String l, String s) {
        Acesso acesso = null;
        try {
            em = JPAUtil.getEntityManager();

            Query consulta = em.createQuery("SELECT a FROM Acesso a WHERE a.login = :login AND a.senha = :senha");
            consulta.setParameter("login", l);
            consulta.setParameter("senha", s);
            acesso = (Acesso) consulta.getSingleResult();

            return acesso;
        } catch (NoResultException e) {
            JOptionPane.showMessageDialog(null, "Acesso inválido!");
        } finally {
            JPAUtil.closeEntityManager();
        }
        return acesso;
    }
    
    /**
     * Método do tipo String  para gerar Hash MD5
     */
    public String getMD5(String s) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

            byte[] messageDigest = md.digest(s.getBytes());
            BigInteger bi = new BigInteger(1, messageDigest);

            String hashText = bi.toString(16);
            while (hashText.length() < 32) {
                hashText = "0" + hashText;
            }
            return hashText;
        } catch (NoSuchAlgorithmException e) {
            return "";
        }
    }

}
