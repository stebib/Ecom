package com.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.OrdersIDao;
import com.model.Orders;

@Repository
@Transactional
public class OrdersDaoImpl extends GenericDaoImpl implements OrdersIDao {

	@Override
	public List<Orders> findOrdersByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Orders> findOrdersByName(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
