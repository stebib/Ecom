package com.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.ClientIDao;
import com.model.Client;
import com.model.ClientId;

import java.util.List;

@Controller
@RequestMapping(value = "/client", produces = "application/hal+json")
public class ClientController {
	@Autowired
	  private ClientIDao _clientDao;
	  
	  @RequestMapping(value="/deleteClient")
	  @ResponseBody
	  public String delete(String idcard,String login) {
	    try {
	      Client client = new Client();
	      ClientId clientid=new ClientId();
	      clientid.setIdCard(idcard);
	      clientid.setLogin(login);
	      client.setId(clientid);
	      _clientDao.delete(client);
	    }
	    catch(Exception ex) {
	      return ex.getMessage();
	    }
	    return "client succesfully deleted!";
	  }
	  @SuppressWarnings("unchecked")
	@RequestMapping(value="/getAllClients")
	  @ResponseBody
	  public List<Client> getAllClients() {
	   
	    List<Client> client=null;
	    try {
	    	
	  client =(List<Client>)(Object) _clientDao.findAll(Client.class);
	 
	      //clientId = String.valueOf(client.getId());
	    }
	    catch(Exception ex) {
	      return null;
	    }
	    return client;
	  }
	  
	  @RequestMapping(value="/getClientById")
	  @ResponseBody
	  public String getClientById(String login,String idcard) {
	    String clientId;
	    try {
	    	ClientId clid=new ClientId();
	    	clid.setIdCard(idcard);
	    	clid.setLogin(login);
	    Client client = (Client)(Object) _clientDao.findById(Client.class,clid);
	      clientId = String.valueOf(client.getId());
	    }
	    catch(Exception ex) {
	      return "client not found";
	    }
	    return "The client id is: " + clientId;
	  }

	  @RequestMapping(value="/registerClient")
	  @ResponseBody
	  public String create(String login, String idcard,String firstname,String lastname,String password,String profession,String socialstatus) {
	    try {
	    	ClientId clientid=new ClientId(idcard,login);
	      Client client = new Client();
	      client.setId(clientid);
	      client.setFirstname(firstname);
	      client.setLastname(lastname);
	      client.setPassword(password);
	      client.setProfession(profession);
	      client.setSocialstatus(socialstatus);
	      _clientDao.save(client);
	    }
	    catch(Exception ex) {
	      return ex.getMessage();
	    }
	    return "client succesfully saved!";
	  }

	} // class clientController

