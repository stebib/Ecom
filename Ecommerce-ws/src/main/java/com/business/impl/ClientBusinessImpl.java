package com.business.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.business.ClientBusiness;
import com.dao.ClientIDao;
import com.model.Client;
import com.util.MessageBean;

@Repository
@Transactional
public class ClientBusinessImpl implements ClientBusiness {
	@Autowired
	private ClientIDao _clientDao;

	@Override
	public void signUpClient(Client client) {
		// TODO Auto-generated method stub
		_clientDao.save(client);

	}

	@Override
	public void modifyClient(Client client) {
		// TODO Auto-generated method stub
		_clientDao.update(client);
	}

	@Override
	public void removeClient(Client client) {
		// TODO Auto-generated method stub
		_clientDao.delete(client);

	}

	@Override
	public List<Client> getAllClient(Class clazz) {
		// TODO Auto-generated method stub
		return (List<Client>) (Object) _clientDao.findAll(Client.class);

	}

	@Override
	public Client getClientById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return (Client) _clientDao.findById(Client.class, id);
	}

	@Override
	public MessageBean login(String login, String password) {
		// TODO Auto-generated method stub
		return _clientDao.login(login, password);
	}
}
