package com.cg.gtf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.gtf.dao.IQueryDAO;
import com.cg.gtf.dto.Client;

@Service("querymasterservice")
@Transactional
public class QueryServiceImpl implements IQueryService{

	@Autowired
	IQueryDAO querymasterdao;
	
	@Override
	public Client searchId(int Id) {
		return querymasterdao.searchId(Id);
	}

	@Override
	public void updateClient(Client client) {
		querymasterdao.updateClient(client);
	}

}
