
package com.dao;

import java.util.List;

import com.model.Orders;


public interface OrdersIDao extends GenericIDao{
	List<Orders> findOrdersByID(String id);
	List<Orders> findOrdersByName(String id);
}