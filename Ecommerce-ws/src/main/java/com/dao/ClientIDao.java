package com.dao;

import com.util.MessageBean;

public interface ClientIDao extends GenericIDao {
	MessageBean login(String login, String password);
}
