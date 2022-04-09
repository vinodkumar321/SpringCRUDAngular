package com.jocata.amazon.request;

public class ProductRequest {
	private Integer Id;
	private Integer catId;
	private String productName;
	private Integer productPrice;
	private Integer productQuantity;
	private String productDescription;
	
	public Integer getId() {
		return Id;
	}
	
	public void setId(Integer id) {
		Id = id;
	}
	
	public Integer getCatId() {
		return catId;
	}
	
	public void setCatId(Integer catId) {
		this.catId = catId;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public Integer getProductPrice() {
		return productPrice;
	}
	
	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}
	
	public Integer getProductQuantity() {
		return productQuantity;
	}
	
	public void setProductQuantity(Integer productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	public String getProductDescription() {
		return productDescription;
	}
	
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
}
