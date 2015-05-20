package nl.angarde.jtdp.declaratie.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import nl.angarde.jtdp.declaratie.domain.Declaratie;

public class DeclaratieDaoJpa implements DeclaratieDAO {
	private EntityManager entityManager;
	 
    public DeclaratieDaoJpa(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	public void addDeclaratie(Declaratie declaratie) {
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			entityManager.persist(declaratie);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
		}

	}


	
	 public List<Declaratie> findAll() {
	        List<Declaratie> result = new ArrayList<Declaratie>();
	        EntityTransaction transaction = entityManager.getTransaction();
	        try {
	            transaction.begin();
	            result = entityManager.createQuery("SELECT d FROM Declaratie d").getResultList();
	            transaction.commit();
	        } catch (Exception e) {
	            transaction.rollback();
	        }
	        return result;
	    }
	

}
