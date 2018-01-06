package com.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.business.ClientBusiness;
import com.model.Client;
import com.model.ClientId;
import com.util.Message;
import com.util.MessageBean;

@RestController
@RequestMapping(value = "/client", produces = "application/x-www-form-urlencoded+json")
@CrossOrigin("*")
public class ClientController {
	@Autowired
	private ClientBusiness _clientBusiness;

	@RequestMapping(value = "/deleteClient", method = RequestMethod.POST)
	@ResponseBody
	public com.util.ResponseBody delete(String idcard, String login) {
		com.util.ResponseBody rspb = new com.util.ResponseBody();
		Message msg = new Message();
		MessageBean msgbean = new MessageBean();
		try {
			Client client = new Client();
			ClientId clientid = new ClientId();
			clientid.setIdCard(idcard);
			clientid.setLogin(login);
			client.setId(clientid);
			_clientBusiness.removeClient(client);
		} catch (Exception ex) {
			msg.setText(ex.getMessage());
			msgbean.setMsg(msg);
			msgbean.setSuccess(false);
			rspb.setMsgbean(msgbean);
			return rspb;
		}
		msg.setText("client succesfully deleted");
		msgbean.setMsg(msg);
		msgbean.setSuccess(true);
		rspb.setMsgbean(msgbean);
		return rspb;
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/getAllClients", method = RequestMethod.GET)
	@ResponseBody
	public com.util.ResponseBody getAllClients() {

		List<Client> client = null;
		com.util.ResponseBody rspb = new com.util.ResponseBody();
		Message msg = new Message();

		try {

			client = _clientBusiness.getAllClient(Client.class);

			// clientId = String.valueOf(client.getId());
		} catch (Exception ex) {
			msg.setText("client not found");
			MessageBean msgbean = new MessageBean(msg, false);
			rspb.setMsgbean(msgbean);
			return rspb;
		}
		rspb.setList(client);
		MessageBean msgbean = new MessageBean();
		msgbean.setSuccess(true);
		rspb.setMsgbean(msgbean);
		return rspb;
	}

	@RequestMapping(value = "/getClientById", method = RequestMethod.GET)
	@ResponseBody
	public com.util.ResponseBody getClientById(String login, String idcard) {
		String clientId;
		com.util.ResponseBody rspb = new com.util.ResponseBody();
		Message msg = new Message();
		MessageBean msgbean = new MessageBean();
		List<Client> listclient = new ArrayList<Client>();
		try {
			ClientId clid = new ClientId();
			clid.setIdCard(idcard);
			clid.setLogin(login);
			Client client = _clientBusiness.getClientById(Client.class, clid);
			clientId = String.valueOf(client.getId());
			listclient.add(client);
		} catch (Exception ex) {
			msgbean.setSuccess(false);
			msg.setText("client not found");
			msgbean.setMsg(msg);
			rspb.setMsgbean(msgbean);
			return rspb;
		}
		msgbean.setSuccess(true);
		rspb.setMsgbean(msgbean);
		rspb.setList(listclient);
		return rspb;
	}

	@RequestMapping(value = "/registerClient", method = RequestMethod.POST)
	@ResponseBody
	public com.util.ResponseBody create(String login, String idcard, String firstname, String lastname, String password,
			String profession, String socialstatus) {
		com.util.ResponseBody rspb = new com.util.ResponseBody();
		Message msg = new Message();
		MessageBean msgbean = new MessageBean();
		List<Client> listclient = new ArrayList<Client>();
		try {
			ClientId clientid = new ClientId(idcard, login);
			Client client = new Client();
			client.setId(clientid);
			client.setFirstname(firstname);
			client.setLastname(lastname);
			client.setPassword(password);
			client.setProfession(profession);
			client.setSocialstatus(socialstatus);
			_clientBusiness.signUpClient(client);
		} catch (Exception ex) {
			msg.setText(ex.getMessage());
			msgbean.setMsg(msg);
			msgbean.setSuccess(false);
			rspb.setMsgbean(msgbean);
			return rspb;
		}
		msg.setText("client succesfully saved");
		msgbean.setMsg(msg);
		msgbean.setSuccess(true);
		rspb.setMsgbean(msgbean);
		return rspb;

	}

	@PostMapping(value = "/loginClient")
	@ResponseBody
	public com.util.ResponseBody loginClient(@RequestBody Client clientBody) {
		com.util.ResponseBody rspb = new com.util.ResponseBody();
		Message msg = new Message();
		MessageBean msgbean = new MessageBean();
		try {
			ClientId clid = new ClientId();
			clid.setLogin(clientBody.getId().getLogin());
			Client client = new Client();
			client.setId(clid);
			client.setPassword(clientBody.getPassword());
			msgbean = _clientBusiness.login(client.getId().getLogin(), client.getPassword());
		} catch (Exception ex) {
			msgbean.setSuccess(false);
			msg.setText("Server problem");
			msgbean.setMsg(msg);
			rspb.setMsgbean(msgbean);
			return rspb;
		}
		rspb.setMsgbean(msgbean);
		return rspb;
	}

} // class clientController
