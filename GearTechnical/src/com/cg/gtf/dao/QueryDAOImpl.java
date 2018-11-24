package com.cg.gtf.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.gtf.dto.Client;

@Repository("querymasterdao")
public class QueryDAOImpl implements IQueryDAO{

	@PersistenceContext
	EntityManager entitymanager;
	
	@Override
	public Client searchId(int Id) {
		Client cli=entitymanager.find(Client.class, Id);
		return cli;
	}

	@Override
	public void updateClient(Client client) {
		Client updatedClient=entitymanager.merge(client);
		entitymanager.flush();
		
	}

}
