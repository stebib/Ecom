package com.controllers;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.OrdersIDao;
import com.model.Orders;
import com.model.OrdersId;
import com.util.Message;
import com.util.MessageBean;

@Controller
@RequestMapping(value = "/orders", produces = "application/hal+json")
public class OrdersController {
	@Autowired
	private OrdersIDao _ordersDao;

	@RequestMapping(value = "/deletOrders", method = RequestMethod.POST)
	@ResponseBody
	public String delete(String idcard, int idProduct, double cost, Date date, Date time, int quantity) {
		try {
			Orders orders = new Orders();
			OrdersId ordersid = new OrdersId();
			ordersid.setIdCard(idcard);
			ordersid.setIdProduct(idProduct);
			ordersid.setCost(cost);
			ordersid.setDate(date);
			ordersid.setTime(time);
			ordersid.setQuantity(quantity);
			orders.setId(ordersid);
			_ordersDao.delete(orders);
		} catch (Exception ex) {
			return ex.getMessage();
		}
		return "orders succesfully deleted!";
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/getAllOrders", method = RequestMethod.GET)
	@ResponseBody
	public com.util.ResponseBody getAllOrderss() {

		List<Orders> orders = null;
		com.util.ResponseBody rspb = new com.util.ResponseBody();
		Message msg = new Message();

		try {

			orders = (List<Orders>) (Object) _ordersDao.findAll(Orders.class);

			// ordersId = String.valueOf(orders.getId());
		} catch (Exception ex) {
			msg.setText("orders not found");
			MessageBean msgbean = new MessageBean(msg, false);
			rspb.setMsgbean(msgbean);
			return rspb;
		}
		rspb.setList(orders);
		MessageBean msgbean = new MessageBean();
		msgbean.setSuccess(true);
		rspb.setMsgbean(msgbean);
		return rspb;
	}

	@RequestMapping(value = "/getOrdersById", method = RequestMethod.GET)
	@ResponseBody
	public com.util.ResponseBody getOrdersById(String idorders) {
		String ordersId;
		com.util.ResponseBody rspb = new com.util.ResponseBody();
		Message msg = new Message();
		MessageBean msgbean = new MessageBean();
		List<Orders> listorders = new ArrayList<Orders>();
		try {

			Orders orders = (Orders) _ordersDao.findById(Orders.class, idorders);

			listorders.add(orders);
		} catch (Exception ex) {
			msgbean.setSuccess(false);
			msg.setText("orders not found");
			msgbean.setMsg(msg);
			rspb.setMsgbean(msgbean);
			return rspb;
		}
		msgbean.setSuccess(true);
		rspb.setMsgbean(msgbean);
		rspb.setList(listorders);
		return rspb;
	}

	@RequestMapping(value = "/registerOrders", method = RequestMethod.POST)
	@ResponseBody
	public com.util.ResponseBody create(String idcard, int idProduct, double cost, Date date, Date time, int quantity) {
		com.util.ResponseBody rspb = new com.util.ResponseBody();
		Message msg = new Message();
		MessageBean msgbean = new MessageBean();
		// List<Orders> listorders = new ArrayList<Orders>();
		try {

			Orders orders = new Orders();
			OrdersId ordersid = new OrdersId();
			ordersid.setIdCard(idcard);
			ordersid.setIdProduct(idProduct);
			ordersid.setCost(cost);
			ordersid.setDate(date);
			ordersid.setTime(time);
			ordersid.setQuantity(quantity);
			orders.setId(ordersid);
			_ordersDao.save(orders);
		} catch (Exception ex) {
			msg.setText(ex.getMessage());
			msgbean.setMsg(msg);
			msgbean.setSuccess(false);
			rspb.setMsgbean(msgbean);
			return rspb;
		}
		msg.setText("orders succesfully saved");
		msgbean.setMsg(msg);
		msgbean.setSuccess(true);
		rspb.setMsgbean(msgbean);
		return rspb;

	}

}
