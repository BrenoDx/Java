package aplicativo;

import javax.persistence.EntityManagerFactory;

import dominio.Pessoa;
import javax.persistence.Persistence;
import javax.persistence.EntityManager;

public class Programa {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		/*
		Pessoa p1 = new Pessoa(null, "Breno Alves", "breno@email.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@email.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@email.com");
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		*/
		
		// Busca dados do banco no caso com ID igual à 2
		Pessoa p = em.find(Pessoa.class, 2);
		
		System.out.println(p);
		
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Pessoa apagada do banco de dados");
		
		em.close();
		emf.close();
	}

}