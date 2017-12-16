package com.business.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.business.OrdersBusiness;
import com.dao.OrdersIDao;
import com.model.Orders;

@Repository
@Transactional
public class OrdersBusinessImpl implements OrdersBusiness {
	@Autowired
	private OrdersIDao _ordersDao;

	@Override
	public void addOrders(Orders order) {
		// TODO Auto-generated method stub
		_ordersDao.save(order);
	}

	@Override
	public void modifyOrders(Orders order) {
		// TODO Auto-generated method stub
		_ordersDao.update(order);

	}

	@Override
	public void removeOrders(Orders order) {
		// TODO Auto-generated method stub
		_ordersDao.delete(order);
	}

	@Override
	public List<Orders> getAllOrders(Class clazz) {
		// TODO Auto-generated method stub
		return (List<Orders>) (Object) _ordersDao.findAll(Orders.class);
	}

	@Override
	public Orders getOrdersById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return (Orders) _ordersDao.findById(Orders.class, id);
	}

}
