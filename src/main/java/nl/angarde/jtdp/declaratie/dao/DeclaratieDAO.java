package nl.angarde.jtdp.declaratie.dao;

import java.util.List;

import nl.angarde.jtdp.declaratie.domain.Declaratie;

public interface DeclaratieDAO {
	void addDeclaratie(Declaratie declaratie);
	
	List<Declaratie> findAll();

}
