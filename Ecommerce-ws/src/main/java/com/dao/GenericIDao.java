package com.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericIDao {
	public void save(Object entity);
	
	public void update(Object entity);

	public void delete(Object entity);

	public List<Object> findAll(Class clazz);

	public Object findById(Class clazz, Serializable id);
}