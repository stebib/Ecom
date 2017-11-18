package com.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.SessionFactoryUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.GenericIDao;
@Repository
@Transactional
public class GenericDaoImpl implements GenericIDao {


@Autowired
private org.hibernate.SessionFactory sessionfactory;

private Session getSession() {
    return sessionfactory.getCurrentSession();
  }


@Override
	public void save(Object entity) {
		getSession().save(entity);

	}
	@Override
	public void update(Object entity) {
		// TODO Auto-generated method stub
		getSession().update(entity);
	}

	@Override
	public void delete(Object entity) {
		getSession().delete(entity);
	}

	@Override
	public List<Object> findAll(Class clazz) {
		List objects = null;
		
			Query query =  sessionfactory.getCurrentSession().createQuery("from "
					+ clazz.getName());
			objects = query.list();
//			for (Object aRow : objects) {
//			    Utilisateur user = (Utilisateur) aRow;
//			   
//			    System.out.println(user.getLogin()+ " - " + user.getPassword());
//			}		
		
		return objects;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object findById(Class clazz, Serializable id) {
		Object obj = null;
	
			obj =  getSession().get(clazz, id);
		
		return obj;
	}



	

	
}