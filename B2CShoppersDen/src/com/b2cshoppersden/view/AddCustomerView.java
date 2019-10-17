package com.b2cshoppersden.view;

import java.util.Scanner;

import com.b2cshoppersden.controller.CustomerController;



public class AddCustomerView {

	public void mainAddCustomerView() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		System.out.println("======= Add Customer View======");
		
		String userName;
		boolean validUserName=false;
		
		System.out.println("enter username");
		userName=sc.next();
		
		System.out.println("enter password");
		String  Password=sc.next();
		
		
		System.out.println("enter Email");
		String  email=sc.next();
		
		System.out.println("enter age");
		int age=sc.nextInt();
		
		System.out.println("enter Gender");
		String gender=sc.next();
		
	
	
	CustomerController customerController=new CustomerController();
	customerController.registerCustomer(userName, Password, email, age,gender);	
	

}
		
	}


