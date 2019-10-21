package com.b2cshoppersden.view;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.b2cshoppersden.controller.AdminController;

public class AddProductView {
	Logger logger=Logger.getLogger(AddProductView.class.getName());
	@SuppressWarnings("resource")
	public void mainAddProductView() {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		logger.info("Add Product View started");
		System.out.println("======= Add Product View======");
		
		System.out.println("Enter Product Image Url ");
		String productImageUrl=sc.next();
		
		System.out.println("enter Product Id ");
		int productId=sc.nextInt();
		
		System.out.println("enter Product Description ");
		String productDescription=sc.next();
		
		System.out.println("enter Product Price ");
		double productPrice=sc.nextDouble();
		
		System.out.println("enter Product Category");
		String productCategory=sc.next();
		
		System.out.println("enter Product Name ");
		String productName=sc.next();
		
	AdminController adminController=new AdminController();
	adminController.addProduct(	productImageUrl, productId, productDescription, productPrice,productCategory, productName);	
	
	}

}
