package com.b2cshoppersden.controller;

import com.b2cshoppersden.model.AddProductModel;
import com.b2cshoppersden.model.AdminLoginModel;
import com.b2cshoppersden.model.DeleteProductModel;
import com.b2cshoppersden.model.ViewTransactionsModel;
import com.b2cshoppersden.service.AdminServiceImpl;
import com.b2cshoppersden.view.AddProductView;
import com.b2cshoppersden.view.AdminLoginView;
import com.b2cshoppersden.view.AdminOptionsView;
import com.b2cshoppersden.view.DeleteProductView;
import com.b2cshoppersden.view.ErrorView;
import com.b2cshoppersden.view.ViewTransactionsView;

public class AdminController {

	public void Verification(String adminUserName, String password) {
		// TODO Auto-generated method stub

		AdminLoginModel adminLoginModel=new AdminLoginModel();
		adminLoginModel.setAdminUserName(adminUserName);
		adminLoginModel.setPassword(password);
		boolean verf ;
		AdminServiceImpl userService=new AdminServiceImpl(); 
	
		try {
	
	verf=userService.Verification(adminLoginModel);	
	
	System.out.println(verf);
		
		if(verf==true) {
			System.out.println("Admin Login Successfull");
			AdminOptionsView adminView=new AdminOptionsView();
			adminView.mainAdminOptionsView();
		}else {
			AdminLoginView adminLoginView=new AdminLoginView(); 
			adminLoginView.mainAdminView();
		}
		
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("User Authentication failed.");
			//AdminLoginView adminLoginView=new AdminLoginView(); 
			//adminLoginView.mainAdminView();
		
		}
		
	}

	//public void deleteProduct(String productImageUrl,int productId,String productDescription,double productPrice, String productCategory,String productName) 
	public void deleteProduct(int productId)
	{
		// TODO Auto-generated method stub
		DeleteProductModel deleteProductModel = new DeleteProductModel();																					
		deleteProductModel.setProductId(productId);
		//deleteProductModel.setProductImageUrl(productImageUrl);
		//deleteProductModel.setProductDescription(productDescription);
		//deleteProductModel.setProductPrice(productPrice);
		//deleteProductModel.setProductCategory(productCategory);
		//deleteProductModel.setProductName(productName);
		
     	 boolean verf2;
		AdminServiceImpl adminService=new AdminServiceImpl(); 
		try 
		{
			verf2 =  adminService.deleteProductVerification(deleteProductModel);
			if(verf2==true)
			{
				System.out.println("Products are deleted successfully");
				AdminOptionsView adminOptionsView=new AdminOptionsView();
				adminOptionsView.mainAdminOptionsView();
			}
			else
			{
				ErrorView errorView=new ErrorView();
				errorView.deleteProductError();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Products are not deleted");
			DeleteProductView deleteProductView=new DeleteProductView();
			deleteProductView.mainDeleteProductView();
	
		}
		
	}

	public void addProduct(String productImageUrl,int productId,String productDescription,double productPrice,String productCategory,String productName) {
		// TODO Auto-generated method stub

			AddProductModel addProductModel = new AddProductModel();
			addProductModel.setProductImageUrl(productImageUrl);
			addProductModel.setProductId(productId);
			addProductModel.setProductDescription(productDescription);
			addProductModel.setProductPrice(productPrice);
			addProductModel.setProductCategory(productCategory);
			addProductModel.setProductName(productName);
			
	     	 boolean verf3;
			AdminServiceImpl adminService=new AdminServiceImpl(); 
			try 
			{
				verf3 =  adminService.addProductVerification(addProductModel);
				if(verf3==true)
				{
					System.out.println("Products are Added Successfully");
					AdminOptionsView adminOptionsView=new AdminOptionsView();
					adminOptionsView.mainAdminOptionsView();
				}
				else
				{
					ErrorView errorView=new ErrorView();
					errorView.addProductError();
				}
			}catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("Products are not added");
				AddProductView addProductView=new AddProductView();
				addProductView.mainAddProductView();
		
			}
			
	
	}

	public void viewTransactions(int transactionId, int paymentId, String paymentType) {
		// TODO Auto-generated method stub
		
		ViewTransactionsModel viewTransactionsModel = new ViewTransactionsModel();
		viewTransactionsModel.setTransactionId(transactionId);
		viewTransactionsModel.setPaymentId(paymentId);
		viewTransactionsModel.setPaymentType(paymentType);
		
     	 boolean verf4;
		AdminServiceImpl adminService=new AdminServiceImpl(); 
		try 
		{
			verf4= adminService.viewTransactionsVerification(viewTransactionsModel);
			if(verf4==true)
			{
				System.out.println("Transactions are Viewed Successfully");
				AdminOptionsView adminOptionsView=new AdminOptionsView();
				adminOptionsView.mainAdminOptionsView();
			}
			else
			{
				ErrorView errorView=new ErrorView();
				errorView.viewTransactionsError();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Transactions cannot be Displayed");
			ViewTransactionsView viewTransactionsView=new ViewTransactionsView();
			viewTransactionsView.mainViewTransactionsView();
	
		}
	
	}
}


