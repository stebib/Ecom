package com.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dao.ProductIDao;
import com.model.Product;
import com.util.Message;
import com.util.MessageBean;

@Controller
@RequestMapping(value = "/product", produces = "application/hal+json")
public class ProductController {
	@Autowired
	private ProductIDao _productDao;

	@RequestMapping(value = "/deletProduct", method = RequestMethod.POST)
	@ResponseBody
	public String delete(String idproduct) {
		try {
			Product product = new Product();
			product.setIdProduct(idproduct);
			_productDao.delete(product);
		} catch (Exception ex) {
			return ex.getMessage();
		}
		return "product succesfully deleted!";
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
	@ResponseBody
	public com.util.ResponseBody getAllProducts() {

		List<Product> product = null;
		com.util.ResponseBody rspb = new com.util.ResponseBody();
		Message msg = new Message();

		try {

			product = (List<Product>) (Object) _productDao.findAll(Product.class);

			// productId = String.valueOf(product.getId());
		} catch (Exception ex) {
			msg.setText("product not found");
			MessageBean msgbean = new MessageBean(msg, false);
			rspb.setMsgbean(msgbean);
			return rspb;
		}
		rspb.setList(product);
		MessageBean msgbean = new MessageBean();
		msgbean.setSuccess(true);
		rspb.setMsgbean(msgbean);
		return rspb;
	}

	@RequestMapping(value = "/getProductById", method = RequestMethod.GET)
	@ResponseBody
	public com.util.ResponseBody getProductById(String idproduct) {
		String productId;
		com.util.ResponseBody rspb = new com.util.ResponseBody();
		Message msg = new Message();
		MessageBean msgbean = new MessageBean();
		List<Product> listproduct = new ArrayList<Product>();
		try {

			Product product = (Product) _productDao.findById(Product.class, idproduct);

			listproduct.add(product);
		} catch (Exception ex) {
			msgbean.setSuccess(false);
			msg.setText("product not found");
			msgbean.setMsg(msg);
			rspb.setMsgbean(msgbean);
			return rspb;
		}
		msgbean.setSuccess(true);
		rspb.setMsgbean(msgbean);
		rspb.setList(listproduct);
		return rspb;
	}

	@RequestMapping(value = "/registerProduct", method = RequestMethod.POST)
	@ResponseBody
	public com.util.ResponseBody create(String idProduct, String name, double price) {
		com.util.ResponseBody rspb = new com.util.ResponseBody();
		Message msg = new Message();
		MessageBean msgbean = new MessageBean();
		// List<Product> listproduct = new ArrayList<Product>();
		try {

			Product product = new Product();
			product.setIdProduct(idProduct);
			product.setName(name);
			product.setPrice(price);
			_productDao.save(product);
		} catch (Exception ex) {
			msg.setText(ex.getMessage());
			msgbean.setMsg(msg);
			msgbean.setSuccess(false);
			rspb.setMsgbean(msgbean);
			return rspb;
		}
		msg.setText("product succesfully saved");
		msgbean.setMsg(msg);
		msgbean.setSuccess(true);
		rspb.setMsgbean(msgbean);
		return rspb;

	}

}