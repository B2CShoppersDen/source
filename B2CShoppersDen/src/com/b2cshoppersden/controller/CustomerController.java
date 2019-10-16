package com.b2cshoppersden.controller;

<<<<<<< HEAD
import com.b2cshoppersden.model.AddCustomerModel;
import com.b2cshoppersden.model.AddToCartModel;
import com.b2cshoppersden.model.CustomerLoginModel;
import com.b2cshoppersden.model.PaymentModel;
import com.b2cshoppersden.model.ViewProductsModel;
import com.b2cshoppersden.service.CustomerService_Imp;
import com.b2cshoppersden.view.AddCustomerView;
import com.b2cshoppersden.view.CustomerLoginView;
import com.b2cshoppersden.view.CustomerOptionsView;
import com.b2cshoppersden.view.ErrorView;
import com.b2cshoppersden.view.PaymentView;
import com.b2cshoppersden.view.ViewProductsView;

public class CustomerController {

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
			CustomerLoginView adminLoginView=new CustomerLoginView(); 
			adminLoginView.mainCustomerView();
		}
		
		}catch(Exception e) {
			System.out.println("User Authentication failed.");
			
		
		}
	}

	public void registerCustomer(String userName,String Password,String email,int age ,String gender)
	{
		AddCustomerModel  addcustomerModel=new AddCustomerModel();
		addcustomerModel.setUserName(userName);
		addcustomerModel.setPassword(Password);
		addcustomerModel.setEmail(email);
		addcustomerModel.setAge(age);
		addcustomerModel.setGender(gender);
		boolean verf1;
		CustomerService_Imp customerService=new CustomerService_Imp(); 
		
		try {
	verf1=customerService.customerStoreVerification(addcustomerModel);	
	
	// AddAdminView adminView=new AddAdminView();
	
	System.out.println(verf1);
	System.out.println(addcustomerModel.getUserName());
	System.out.println(addcustomerModel.getPassword());
		if(verf1==true) {
			System.out.println("Customer added Successfully");
			
			CustomerOptionsView customerOptionView=new CustomerOptionsView();
			customerOptionView.mainCustomerOptionsView();
		}else {
			ErrorView errorView=new ErrorView();
			errorView.authenticationError();
		}
		
		}catch(Exception e) {
			System.out.println("new customer is not added");
			AddCustomerView addCustomerView=new AddCustomerView();
			addCustomerView.mainAddCustomerView();
		}
	}
	
	public void ViewProducts(int productId,String productImageUrl,String productDescription,String productPrice,String productCategory,String productName) 
	// TODO Auto-generated method stub
	
	
	{
		ViewProductsModel viewProductsModel = new ViewProductsModel();
		viewProductsModel.setProductId(productId);
		viewProductsModel.setProductImageUrl(productImageUrl);
		viewProductsModel.setProductDescription(productDescription);
		viewProductsModel.setProductPrice(productPrice);
		viewProductsModel.setProductCategory(productCategory);
		viewProductsModel.setProductName(productName);
		
        boolean verf2;
		CustomerService_Imp customerService=new CustomerService_Imp(); 
		try 
		{
			verf2 =customerService.viewProductsVerification(viewProductsModel);
			if(verf2==true)
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
	
	}
	
	
	public void AddToCart(int productId,String productImageUrl,String productDescription,String productPrice,String productCategory,String productName) 
	// TODO Auto-generated method stub
	
	
	{
		AddToCartModel addToCartModel = new AddToCartModel();
		addToCartModel.setProductId(productId);
		addToCartModel.setProductImageUrl(productImageUrl);
		addToCartModel.setProductDescription(productDescription);
		addToCartModel.setProductPrice(productPrice);
		addToCartModel.setProductCategory(productCategory);
		addToCartModel.setProductName(productName);
		
        boolean verf3;
		CustomerService_Imp customerService=new CustomerService_Imp(); 
		try 
		{
			verf3 =customerService.addToCartVerification(addToCartModel);
			if(verf3==true)
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
	
	}
	
	
	
	public void Payment(String CardHolderName,long CreditCardNumber,int CVV) 
	// TODO Auto-generated method stub
	
	
	{
		PaymentModel paymentModel = new PaymentModel();
		paymentModel.setCardHolderName(CardHolderName);
		paymentModel.setCreditCardNumber(CreditCardNumber);
		paymentModel.setCVV(CVV);
		
        boolean verf4;
		CustomerService_Imp customerService=new CustomerService_Imp(); 
		try 
		{
			verf4 =customerService.paymentVerification(paymentModel);
			if(verf4==true)
			{
				System.out.println("payment successful");
				CustomerOptionsView customerOptionsView=new CustomerOptionsView();
				customerOptionsView.mainCustomerOptionsView();
			}
			else
			{
				System.out.println("payment not successful");
				PaymentView paymentView=new PaymentView();
				paymentView.mainpaymentView();
		
			}
		}catch(Exception e)
		{
			System.out.println("Invalid Selection");

			
		}
	
	}
		
}


=======
public class CustomerController {

}
>>>>>>> branch 'master' of https://github.com/B2CShoppersDen/source.git
