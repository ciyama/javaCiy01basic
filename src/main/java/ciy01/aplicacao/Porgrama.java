package ciy01.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ciy01.domain.Pessoa;

public class Porgrama {

	public static void main(String[] args) {

		
		Pessoa p1 = new Pessoa(null, "Carlos da Sivla", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Maria da Sivla", "maria@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ciy01-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("Pronto!");
		em.close();
		emf.close();
		
	}

}
