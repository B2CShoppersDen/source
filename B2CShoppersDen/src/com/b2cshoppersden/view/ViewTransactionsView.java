package com.b2cshoppersden.view;

import java.util.Scanner;

import com.b2cshoppersden.controller.AdminController;

public class ViewTransactionsView {

	public void mainViewTransactionsView() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);

		System.out.println("======= Transactions View======");
		System.out.println("Enter Transaction Id");
		int transactionId=sc.nextInt();
		System.out.println("Enter Payment Id");
		int paymentId=sc.nextInt();
		System.out.println("Enter Payment Type");
		String paymentType=sc.next();
		
		AdminController adminController=new AdminController();
		adminController.viewTransactions(transactionId,paymentId,paymentType);	
		
		
	}

	
}
