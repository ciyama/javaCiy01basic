package ciy01.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ciy01.domain.Pessoa;

public class Porgrama {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ciy01-jpa");
		EntityManager em = emf.createEntityManager();

		Pessoa p = em.find(Pessoa.class, 2);
		
		System.out.println(p);
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
		
	}

}
