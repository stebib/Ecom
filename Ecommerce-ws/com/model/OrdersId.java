package com.model;
// Generated Nov 11, 2017 10:37:01 PM by Hibernate Tools 5.2.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * OrdersId generated by hbm2java
 */
@Embeddable
public class OrdersId implements java.io.Serializable {

	private Date date;
	private Date time;
	private Integer quantity;
	private Double cost;
	private String idCard;
	private Integer idProduct;

	public OrdersId() {
	}

	public OrdersId(Date date, Date time, Integer quantity, Double cost, String idCard, Integer idProduct) {
		this.date = date;
		this.time = time;
		this.quantity = quantity;
		this.cost = cost;
		this.idCard = idCard;
		this.idProduct = idProduct;
	}

	@Column(name = "Date", length = 4)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "Time", length = 8)
	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Column(name = "Quantity")
	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Column(name = "Cost", precision = 8, scale = 0)
	public Double getCost() {
		return this.cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	@Column(name = "ID_Card", length = 64)
	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	@Column(name = "ID_Product")
	public Integer getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OrdersId))
			return false;
		OrdersId castOther = (OrdersId) other;

		return ((this.getDate() == castOther.getDate()) || (this.getDate() != null && castOther.getDate() != null
				&& this.getDate().equals(castOther.getDate())))
				&& ((this.getTime() == castOther.getTime()) || (this.getTime() != null && castOther.getTime() != null
						&& this.getTime().equals(castOther.getTime())))
				&& ((this.getQuantity() == castOther.getQuantity()) || (this.getQuantity() != null
						&& castOther.getQuantity() != null && this.getQuantity().equals(castOther.getQuantity())))
				&& ((this.getCost() == castOther.getCost()) || (this.getCost() != null && castOther.getCost() != null
						&& this.getCost().equals(castOther.getCost())))
				&& ((this.getIdCard() == castOther.getIdCard()) || (this.getIdCard() != null
						&& castOther.getIdCard() != null && this.getIdCard().equals(castOther.getIdCard())))
				&& ((this.getIdProduct() == castOther.getIdProduct()) || (this.getIdProduct() != null
						&& castOther.getIdProduct() != null && this.getIdProduct().equals(castOther.getIdProduct())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getDate() == null ? 0 : this.getDate().hashCode());
		result = 37 * result + (getTime() == null ? 0 : this.getTime().hashCode());
		result = 37 * result + (getQuantity() == null ? 0 : this.getQuantity().hashCode());
		result = 37 * result + (getCost() == null ? 0 : this.getCost().hashCode());
		result = 37 * result + (getIdCard() == null ? 0 : this.getIdCard().hashCode());
		result = 37 * result + (getIdProduct() == null ? 0 : this.getIdProduct().hashCode());
		return result;
	}

}
