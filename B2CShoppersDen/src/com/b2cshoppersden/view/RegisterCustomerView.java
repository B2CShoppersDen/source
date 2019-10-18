package com.b2cshoppersden.view;

import java.util.Scanner;

import com.b2cshoppersden.controller.CustomerController;
import com.b2cshoppersden.controller.RegisterCustomerController;



public class RegisterCustomerView {

	public void mainRegisterCustomerView() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		System.out.println("======= Register Customer View======");
		
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
		
	
	
	RegisterCustomerController registerCustomerController=new RegisterCustomerController();
	registerCustomerController.registerCustomer(userName, Password, email, age,gender);	
	

}
		
	}


