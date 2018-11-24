package com.cg.gtf.service;

import com.cg.gtf.dto.Client;

public interface IQueryService {
	public Client searchId(int Id);
	public void updateClient(Client client);

	
}
