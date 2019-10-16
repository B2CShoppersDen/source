package com.b2cshoppersden.model;

public class AddProductModel {

	private String productImageUrl;
	private int productId;
	private String productDescription;
	private double productPrice;
	private String productCategory;
	private String productName;
	public String getProductImageUrl() {
		return productImageUrl;
	}
	public void setProductImageUrl(String productImageUrl) {
		this.productImageUrl = productImageUrl;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "AddProductModel [productImageUrl=" + productImageUrl + ", productId=" + productId
				+ ", productDescription=" + productDescription + ", productPrice=" + productPrice + ", productCategory="
				+ productCategory + ", productName=" + productName + "]";
	}
	
}
