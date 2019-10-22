package com.b2cshoppersden.view;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.b2cshoppersden.controller.PaymentController;


public class PaymentView {
	Logger logger=Logger.getLogger(PaymentView.class.getName());

	public void mainPaymentView() {
		logger.info("payment View started");
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
		    logger.info("payment View ended");
		    PaymentController paymentController=new PaymentController();
			paymentController.payment(cardHolderName,creditCardNumber,CVV,totalFareAmount);
			logger.info("payment View ended");
		    
		    
		
	}



}
