package nl.angarde.jtdp.declaratie.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import nl.angarde.jtdp.declaratie.domain.Declaratie;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DeclaratieDaoJpaIntegrationTest {
	
	
		 
	    private DeclaratieDaoJpa declaratieDaoJpa;
	    private EntityManagerFactory entityManagerFactory;
	    private EntityManager entityManager;
	 
	    @Before
	    public void setUp() {
	        entityManagerFactory = Persistence.createEntityManagerFactory("test");
	        entityManager = entityManagerFactory.createEntityManager();
	        declaratieDaoJpa = new DeclaratieDaoJpa(entityManager);
	    }
	 
	    @After
	    public void tearDown() {
	        entityManager.close();
	        entityManagerFactory.close();
	    }
	 
	    @Test
	    public void shouldFindPreviouslySavedDeclaratie() {
	    	// wordt meerdere malen gebruikt (voor test en toekenning), dus is het een goed gebruik om onderstaande twee variabelen een final te maken.
	        final int JAAR = 2015;
	        final int MAAND = 5; 
	    	
	    	
	    	// given
	        Declaratie declaratie = new Declaratie();
	        declaratie.setJaar(JAAR);
	        declaratie.setMaand(MAAND);
	 
	        declaratieDaoJpa.addDeclaratie(declaratie);
	 
	        // when
	        List<Declaratie> result = declaratieDaoJpa.findAll();
	 
	        // then
	        Assert.assertEquals(result.size(), 1);
	        Declaratie gevondenDecaDeclaratie = result.get(0);
	        Assert.assertEquals(JAAR, gevondenDecaDeclaratie.getJaar());
	        Assert.assertEquals(MAAND, gevondenDecaDeclaratie.getMaand());
	    }
	}


