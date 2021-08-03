package ciy01.aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ciy01.domain.Pessoa;

public class Porgrama {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ciy01-jpa");
		EntityManager em = emf.createEntityManager();

		// para remover um dado do banco primeiro temos que buscar ele no banco para deixar ele MONITORADO depois podemos remover
		// o objeto destacado no JPA nao pode ser removido
		Pessoa p = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Pronto!");
		em.close();
		emf.close();
		
	}

}
