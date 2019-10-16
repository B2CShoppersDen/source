package com.b2cshoppersden.controller;

import com.b2cshoppersden.model.AddProductModel;
import com.b2cshoppersden.model.AdminLoginModel;
import com.b2cshoppersden.model.DeleteProductModel;
import com.b2cshoppersden.service.AdminServiceImpl;
import com.b2cshoppersden.view.AdminLoginView;
import com.b2cshoppersden.view.AdminOptionsView;
import com.b2cshoppersden.view.DeleteProductView;
import com.b2cshoppersden.view.ErrorView;

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
			ErrorView errorView=new ErrorView();
			errorView.authenticationError();
		}
		
		}catch(Exception e) {
			System.out.println("User Authentication failed.");
			AdminLoginView adminLoginView=new AdminLoginView(); 
			adminLoginView.mainAdminView();
		
		}
		
	}

	public void deleteProduct(String productImageUrl,int productId,String productDescription,double productPrice,String productCategory,String productName) 
	{
		// TODO Auto-generated method stub
		DeleteProductModel deleteProductModel = new DeleteProductModel();
		deleteProductModel.setProductImageUrl(productImageUrl);
		deleteProductModel.setProductId(productId);
		deleteProductModel.setProductDescription(productDescription);
		deleteProductModel.setProductPrice(productPrice);
		deleteProductModel.setProductCategory(productCategory);
		deleteProductModel.setProductName(productName);
		
     	 boolean verf2;
		AdminServiceImpl adminService=new AdminServiceImpl(); 
		try 
		{
			verf2 =  adminService.addServiceVerification(deleteProductModel);
			if(verf2==true)
			{
				System.out.println("Entered Services are Added Successfully");
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
			System.out.println("Sevices are not added");
			DeleteProductView deleteProductView=new DeleteProductView();
			deleteProductView.mainDeleteProductView();
	
		}
		
	}

	public void addProduct() {
		// TODO Auto-generated method stub
		public void addProduct(String productImageUrl,int productId,String productDescription,double productPrice,String productCategory,String productName) 
		{
			// TODO Auto-generated method stub
			AddProductModel addProductModel = new AddProductModel();
			addProductModel.setProductImageUrl(productImageUrl);
			addProductModel.setProductId(productId);
			addProductModel.setProductDescription(productDescription);
			addProductModel.setProductPrice(productPrice);
			addProductModel.setProductCategory(productCategory);
			addProductModel.setProductName(productName);
			
	     	 boolean verf2;
			AdminServiceImpl adminService=new AdminServiceImpl(); 
			try 
			{
				verf2 =  adminService.addServiceVerification(deleteProductModel);
				if(verf2==true)
				{
					System.out.println("Entered Services are Added Successfully");
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
				System.out.println("Sevices are not added");
				DeleteProductView deleteProductView=new DeleteProductView();
				deleteProductView.mainDeleteProductView();
		
			}
			
		}


	}

}
