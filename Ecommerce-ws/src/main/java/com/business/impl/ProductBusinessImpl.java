package com.business.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.business.ProductBusiness;
import com.dao.ProductIDao;
import com.model.Product;

@Repository
@Transactional
public class ProductBusinessImpl implements ProductBusiness {
	@Autowired
	private ProductIDao _productDao;

	@Override
	public void addProduct(Product person) {
		// TODO Auto-generated method stub
		_productDao.save(person);

	}

	@Override
	public void modifyProduct(Product person) {
		// TODO Auto-generated method stub
		_productDao.update(person);
	}

	@Override
	public void removeProduct(Product person) {
		// TODO Auto-generated method stub
		_productDao.delete(person);
	}

	@Override
	public List<Product> getAllProduct(Class clazz) {
		// TODO Auto-generated method stub
		return (List<Product>) (Object) _productDao.findAll(Product.class);

	}

	@Override
	public Product getProductById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return (Product) _productDao.findById(Product.class, id);
	}
}
