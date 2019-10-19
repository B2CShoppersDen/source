package com.b2cshoppersden.model;

import java.sql.Blob;

public class ViewProductsModel {
	
   private int productId;
   private String productImageUrl;
   private String productDescription;
   private double productPrice;
   private String productCategory;
   private String productName;
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductImageUrl() {
	return productImageUrl;
}
public void setProductImageUrl(String productImageUrl2) {
	this.productImageUrl = productImageUrl2;
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
	return "ViewProductsModel [productId=" + productId + ", productImageUrl=" + productImageUrl
			+ ", productDescription=" + productDescription + ", productPrice=" + productPrice + ", productCategory="
			+ productCategory + ", productName=" + productName + "]";
}
public String getProductDescription() {
	return productDescription;
}
public void setProductDescription(String productDescription) {
	this.productDescription = productDescription;
}


}
