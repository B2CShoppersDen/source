package com.b2cshoppersden.view;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.b2cshoppersden.controller.CustomerController;

public class AddToCartView {

	public void mainAddToCartView() {
		// TODO Auto-generated method stub
		Logger logger=Logger.getLogger(AddToCartView.class.getName());	
		Scanner sc=new Scanner(System.in);
		logger.info("Add to Cart View started");

		System.out.println("======= Add To Cart View======");
		
		
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
		
	
	
	CustomerController customerController=new CustomerController();
	customerController.AddToCart(productImageUrl, productId, productDescription, productPrice,productCategory, productName);	
	
	}

		
	}


