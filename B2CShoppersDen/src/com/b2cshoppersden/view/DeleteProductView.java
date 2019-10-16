package com.b2cshoppersden.view;

import java.util.Scanner;

import com.b2cshoppersden.controller.AdminController;

public class DeleteProductView {

	public void mainDeleteProductView() {
		// TODO Auto-generated method stub
	
			Scanner sc=new Scanner(System.in);

			System.out.println("======= Add Product View======");
			
			
			System.out.println("Enter Product Image Url ");
			String productImageUrl=sc.next();
			
			System.out.println("enter Product Id ");
			int Password=sc.nextInt();
			
			System.out.println("enter Product Description ");
			String productDescription=sc.next();
			
			System.out.println("enter Product Category");
			String productCatrgory=sc.next();
			
			System.out.println("enter Product Name ");
			String productName=sc.next();
			
		
		
		AdminController adminController=new AdminController();
		adminController.deleteProduct(productName, Password, productName, Password, productName, productName);	
		
	}

}
