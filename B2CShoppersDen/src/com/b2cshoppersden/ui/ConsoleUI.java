package com.b2cshoppersden.ui;

import java.text.ParseException;
import java.util.Scanner;

import com.b2cshoppersden.view.AdminLoginView;
import com.b2cshoppersden.view.CustomerLoginView;
import com.b2cshoppersden.view.RegisterCustomerView;


public class ConsoleUI {
public void mainMenu() {
		
		System.out.println("Enter 1 if you are Admin");
		System.out.println("Enter 2 if you are already existing Customer");
		System.out.println("Enter 3 if you are new Customer");
		System.out.println("Enter your option");
		
		 Scanner in=new Scanner(System.in);
		 int option=in.nextInt();
		 
		 switch(option)
		 {
		 
		 case 1:AdminLoginView adminLoginView=new AdminLoginView();
		            adminLoginView.mainAdminView();
		            break;
		 case 2:CustomerLoginView customerLoginView=new CustomerLoginView();
                customerLoginView.mainCustomerView();
                   break;
		 case 3: RegisterCustomerView registerCustomerView=new RegisterCustomerView();
		 			registerCustomerView.mainRegisterCustomerView();
			break;          
		 
           default:System.out.println("please enter valid number");
		 
	}}}



