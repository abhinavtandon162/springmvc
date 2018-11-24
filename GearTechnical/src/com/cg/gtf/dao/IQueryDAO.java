package com.cg.gtf.dao;

import com.cg.gtf.dto.Client;

public interface IQueryDAO {
	
	public Client searchId(int Id);
	public void updateClient(Client client);
}
