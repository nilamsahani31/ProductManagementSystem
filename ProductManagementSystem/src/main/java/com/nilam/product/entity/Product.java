package com.nilam.product.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	private String productName;
	private String productCategory;
	private String mfgDate;
	private String expDate;
	private double productPrice;
	private int productQty;
	public Product(String productName, String productCategory, String mfgDate, String expDate,
			double productPrice, int productQty) {
		super();
		this.productName = productName;
		this.productCategory = productCategory;
		this.mfgDate = mfgDate;
		this.expDate = expDate;
		this.productPrice = productPrice;
		this.productQty = productQty;
	}
	public Product() {
		super();
		
	}
	
	
	public Product(int productId, String productName, String productCategory, String mfgDate, String expDate,
			double productPrice, int productQty) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.mfgDate = mfgDate;
		this.expDate = expDate;
		this.productPrice = productPrice;
		this.productQty = productQty;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getMfgDate() {
		return mfgDate;
	}
	public void setMfgDate(String mfgDate) {
		this.mfgDate = mfgDate;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQty() {
		return productQty;
	}
	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCategory="
				+ productCategory + ", mfgDate=" + mfgDate + ", expDate=" + expDate + ", productPrice=" + productPrice
				+ ", productQty=" + productQty + "]";
	}
	
}
