package com.jocata.amazon.dao.impl;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = -2422155302129704458L;
	
	private Integer id;
	private Integer catId;
	private String pname;
	private Integer price;
	private Integer quantity;
	private String description;
	
	public Product() {
		super();
	}
	
	
	
	public Product(Integer id, Integer catId, String pname, Integer price, Integer quantity, String description) {
		super();
		this.id = id;
		this.catId = catId;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCatId() {
		return catId;
	}
	public void setCatId(Integer catId) {
		this.catId = catId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
