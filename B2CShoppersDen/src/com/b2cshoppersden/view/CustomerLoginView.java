package com.b2cshoppersden.view;


import java.util.Scanner;

import org.apache.log4j.Logger;

import com.b2cshoppersden.controller.CustomerController;
    @SuppressWarnings("unused")
		public class CustomerLoginView {
    	  
    	Logger logger=Logger.getLogger(CustomerLoginView.class.getName());

			@SuppressWarnings("resource")
			public void mainCustomerView() {
				
				logger.info("Customer login View started");
			/*	CustomerLoginValidation addLoginValidation = new CustomerLoginValidation();
				Scanner sc=new Scanner(System.in);
				System.out.println("=======Customer View======");
				String username;
				boolean userNameValidation = false;
				do {
				System.out.println("enter username");
				username=sc.next();
				userNameValidation= addLoginValidation.validString(username);
				
				if(userNameValidation==false)
					System.out.println("Enter valid UserName");
					
				}while(!userNameValidation);
				
				String Password;
				boolean passwordValidation = false;
				do
				{
				System.out.println("enter password");
				Password=sc.next();
				passwordValidation= addLoginValidation.validString(username);
				
				if(passwordValidation==false)
					System.out.println("Enter valid password");
				}while(!passwordValidation);
				CustomerController customerController=new CustomerController();
				customerController.Verification(username,Password);
			*/	
				Scanner sc=new Scanner(System.in);
				System.out.println("=======Customer View======");
				String username,Password;
				System.out.println("enter username");
				username=sc.next();
				System.out.println("enter password");
				Password=sc.next();
				CustomerController customerController=new CustomerController();
				customerController.Verification(username,Password);
				
			}

			
		
	}

