package com.business;

import java.io.Serializable;
import java.util.List;

import com.model.Orders;

public interface OrdersBusiness {

	public void addOrders(Orders order);

	public void modifyOrders(Orders order);

	public void removeOrders(Orders order);

	public List<Orders> getAllOrders(Class clazz);

	public Orders getOrdersById(Class clazz, Serializable id);

}
