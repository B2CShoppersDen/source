package com.b2cshoppersden.view;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.b2cshoppersden.controller.CustomerController;

public class ViewProductsView {

	Logger logger=Logger.getLogger(ViewProductsView.class.getName());
	public void mainViewProductsView() {
		logger.info("View products View started");
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		System.out.println("======= View Product View======");
		
		
		//System.out.println("Enter Product Image Url ");
	//	String productImageUrl=sc.next();
		
		System.out.println("enter Product Id ");
		int productId=sc.nextInt();
		
	//	System.out.println("enter Product Description ");
		//String productDescription=sc.next();
		
		//System.out.println("enter Product Price ");
		//double productPrice=sc.nextDouble();
		
		//System.out.println("enter Product Category");
		//String productCategory=sc.next();
		
		//System.out.println("enter Product Name ");
		//String productName=sc.next();
		logger.info("View Products View ended");
	
	
	CustomerController customerController=new CustomerController();
	//customerController.ViewProducts(productImageUrl, productId, productDescription, productPrice,productCategory, productName);	
	customerController.ViewProducts(productId);
	}



}

