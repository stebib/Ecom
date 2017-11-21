package com.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.ClientIDao;
import com.model.Client;
import com.model.ClientId;
import com.util.Message;
import com.util.MessageBean;

@Controller
@RequestMapping(value = "/client", produces = "application/hal+json")
public class ClientController {
	@Autowired
	private ClientIDao _clientDao;

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
			_clientDao.delete(client);
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

			client = (List<Client>) (Object) _clientDao.findAll(Client.class);

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
			Client client = (Client) _clientDao.findById(Client.class, clid);
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
			_clientDao.save(client);
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

} // class clientController
