package com.b2cshoppersden.controller;



import org.apache.log4j.Logger;

import com.b2cshoppersden.model.AddToCartModel;
import com.b2cshoppersden.model.CustomerLoginModel;
import com.b2cshoppersden.model.PaymentModel;
import com.b2cshoppersden.model.ViewCartProductsModel;
import com.b2cshoppersden.model.ViewProductsModel;
import com.b2cshoppersden.service.CustomerService_Imp;
import com.b2cshoppersden.view.AddProductView;
import com.b2cshoppersden.view.CustomerLoginView;
import com.b2cshoppersden.view.CustomerOptionsView;
import com.b2cshoppersden.view.ErrorView;
import com.b2cshoppersden.view.PaymentView;
import com.b2cshoppersden.view.ViewProductsView;

public class CustomerController {
	Logger logger=Logger.getLogger(CustomerController.class.getName());

	public static void Verification(String userName, String password) {
		
		// TODO Auto-generated method stub
	
		CustomerLoginModel customerLoginModel=new CustomerLoginModel();
		customerLoginModel.setUserName(userName);
		customerLoginModel.setPassword(password);
		boolean verf ;
		CustomerService_Imp userService=new CustomerService_Imp(); 
		try {
	
	verf=userService.Verification(customerLoginModel);	
	
	System.out.println(verf);
	//System.out.println(adminLoginModel.getUserName());
	//System.out.println(adminLoginModel.getPassword());
		
		if(verf==true) {
			System.out.println("Customer Login Successfull");
			CustomerOptionsView customerView=new CustomerOptionsView();
			customerView.mainCustomerOptionsView();
		}else {
			System.out.println("Login Unsuccessful");
			CustomerLoginView customerLoginView=new CustomerLoginView(); 
			customerLoginView.mainCustomerView();
		}
		
		}catch(Exception e) {
			System.out.println("User Authentication failed.");
			
		
		}
		
	}

	
	
//	public void ViewProducts(String productImageUrl,int productId,String productDescription,double productPrice,String productCategory,String productName) {
	// TODO Auto-generated method stub
	public void ViewProducts(int productId) {	
		logger.info("view products started");
	ViewProductsModel viewProductsModel = new ViewProductsModel();
		viewProductsModel.setProductId(productId);
		//viewProductsModel.setProductImageUrl(productImageUrl);
		//viewProductsModel.setProductDescription(productDescription);
		//viewProductsModel.setProductPrice(productPrice);
		//viewProductsModel.setProductCategory(productCategory);
		//viewProductsModel.setProductName(productName);
		
        boolean verf1;
		CustomerService_Imp customerService=new CustomerService_Imp(); 
		try 
		{
			verf1 =customerService.viewProductsVerification(viewProductsModel);
			if(verf1==true)
			{
				System.out.println("products are displayed");
				CustomerOptionsView customerOptionsView=new CustomerOptionsView();
				customerOptionsView.mainCustomerOptionsView();
			}
			else
			{
				System.out.println("products are not displayed");
				ViewProductsView viewProductsView=new ViewProductsView();
				viewProductsView.mainViewProductsView();
		
			}
		}catch(Exception e)
		{
			System.out.println("Invalid Selection");
			
		}
		logger.info("view products completed");
	
	}
	
	
	public void AddToCart(String productImageUrl,int productId,String productDescription,double productPrice,String productCategory,String productName) 
	// TODO Auto-generated method stub
	
	
	{
		logger.info("add products started");
		AddToCartModel addToCartModel = new AddToCartModel();
		addToCartModel.setProductImageUrl(productImageUrl);
		addToCartModel.setProductId(productId);
		addToCartModel.setProductDescription(productDescription);
		addToCartModel.setProductPrice(productPrice);
		addToCartModel.setProductCategory(productCategory);
		addToCartModel.setProductName(productName);
		
        boolean verf2;
		CustomerService_Imp customerService=new CustomerService_Imp(); 
		try 
		{
			verf2 =customerService.addToCartVerification(addToCartModel);
			if(verf2==true)
			{
				System.out.println("products are added successfuly");
				CustomerOptionsView customerOptionsView=new CustomerOptionsView();
				customerOptionsView.mainCustomerOptionsView();
			}
			else
			{
				System.out.println("products are not added");
				ViewProductsView viewProductsView=new ViewProductsView();
				viewProductsView.mainViewProductsView();
		
			}
		}catch(Exception e)
		{
			System.out.println("Invalid Selection");
			
		}
		logger.info("add products completed");
	
	}

	public void viewCartProducts(String productImageUrl, int productId, String productDescription, double productPrice,
			String productCategory, String productName) {
		// TODO Auto-generated method stub
		
		{
			logger.info("view cart products completed");
			ViewCartProductsModel viewCartProductsModel = new ViewCartProductsModel();
			viewCartProductsModel.setProductImageUrl(productImageUrl);
			viewCartProductsModel.setProductId(productId);
			viewCartProductsModel.setProductDescription(productDescription);
			viewCartProductsModel.setProductPrice(productPrice);
			viewCartProductsModel.setProductCategory(productCategory);
			viewCartProductsModel.setProductName(productName);
			
	        boolean verf3;
			CustomerService_Imp customerService=new CustomerService_Imp(); 
			try 
			{
				verf3 =customerService.ViewCartProductsVerification(viewCartProductsModel);
				if(verf3==true)
				{
					System.out.println("products are viewed successfuly");
					CustomerOptionsView customerOptionsView=new CustomerOptionsView();
					customerOptionsView.mainCustomerOptionsView();
				}
				else
				{
					System.out.println("products are not viewed");
					ViewProductsView viewProductsView=new ViewProductsView();
					viewProductsView.mainViewProductsView();
			
				}
			}catch(Exception e)
			{
				System.out.println("Invalid Selection");
				
			}
			logger.info("view cart products completed");
		
		}

		
	}

	
	
	


	

	
	}

	
	
	
	
