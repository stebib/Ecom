package com.model;
// Generated Nov 18, 2017 10:10:38 PM by Hibernate Tools 5.2.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Product generated by hbm2java
 */
@Entity
@Table(name = "product")
public class Product implements java.io.Serializable {

	private String idProduct;
	private String name;
	private Double price;

	public Product() {
	}

	public Product(String idProduct) {
		this.idProduct = idProduct;
	}

	public Product(String idProduct, String name, Double price) {
		this.idProduct = idProduct;
		this.name = name;
		this.price = price;
	}

	@Id

	@Column(name = "id_product", unique = true, nullable = false, length = 64)
	public String getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}

	@Column(name = "name", length = 64)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "price", precision = 8, scale = 0)
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
