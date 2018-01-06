package com.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ClientIDao;
import com.model.Client;
import com.util.Message;
import com.util.MessageBean;

@Repository
@Transactional
public class ClientDaoImpl extends GenericDaoImpl implements ClientIDao {

	@Override
	public MessageBean login(String login, String password) {
		// TODO Auto-generated method stub
		List objects = null;
		Client user = null;
		MessageBean msgbean;
		Message msg;
		Query query = getSession().createQuery("from " + Client.class.getName() + " where login like '" + login
				+ "' and password like '" + password + "'");
		objects = query.list();
		for (Object aRow : objects) {
			user = (Client) aRow;

			System.out.println(user.getId().getLogin() + " - " + user.getPassword());
		}
		if (user != null) {
			msg = new Message();
			msg.setText("success");
			msgbean = new MessageBean(msg, true);
		} else {
			query = getSession().createQuery("from " + Client.class.getName() + " where login='" + login + "'");
			objects = query.list();
			for (Object aRow : objects) {
				user = (Client) aRow;

				System.out.println(user.getId().getLogin() + " - " + user.getPassword());
			}
			if (user != null) {
				msg = new Message();
				msg.setText("Problem with your password");
				msgbean = new MessageBean(msg, false);
			} else {
				msg = new Message();
				msg.setText("Invalid Credentials");
				msgbean = new MessageBean(msg, false);
			}
		}

		return msgbean;
	}

}
