package com.business;

import java.io.Serializable;
import java.util.List;

import com.model.Product;

public interface ProductBusiness {

	public void addProduct(Product product);

	public void modifyProduct(Product product);

	public void removeProduct(Product product);

	public List<Product> getAllProduct(Class clazz);

	public Product getProductById(Class clazz, Serializable id);

}
