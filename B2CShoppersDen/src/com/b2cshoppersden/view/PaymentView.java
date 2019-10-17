package com.b2cshoppersden.view;

import java.util.Scanner;

import com.b2cshoppersden.controller.PaymentController;


public class PaymentView {

	public void mainPaymentView() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("=======Payment Form======");
		    System.out.println("enter Card Holder Name");
		    String cardHolderName=sc.next();
		    System.out.println("enter Credit Card Number");
		    int creditCardNumber=sc.nextInt();
		    System.out.println("enter CVV");
		    int CVV=sc.nextInt();
		    System.out.println("enter Total Fare Amount");
		    int totalFareAmount=sc.nextInt();
		    
		    PaymentController paymentController=new PaymentController();
			paymentController.payment(cardHolderName,creditCardNumber,CVV,totalFareAmount);
		    
		    
		
	}



}
