package com.business;

import java.io.Serializable;
import java.util.List;

import com.model.Client;

public interface ClientBusiness {

	public void signUpClient(Client client);

	public void modifyClient(Client client);

	public void removeClient(Client client);

	public List<Client> getAllClient(Class clazz);

	public Client getClientById(Class clazz, Serializable id);
}
