package com.b2cshoppersden.controller;

import org.apache.log4j.Logger;

import com.b2cshoppersden.model.PaymentModel;
import com.b2cshoppersden.view.AddProductView;

public class PaymentController {
	Logger logger=Logger.getLogger(PaymentController.class.getName());
	
	
	public void payment(String cardHolderName, int creditCardNumber, int cVV, int totalFareAmount) {
		// TODO Auto-generated method stub
		logger.info("Payment started");
		
		PaymentModel paymentmodel=new PaymentModel();
		paymentmodel.setCardHolderName(cardHolderName);
		paymentmodel.setCreditCardNumber(creditCardNumber);
		paymentmodel.setToatlFareAmount(totalFareAmount);
		logger.info("payment completed");	
	}
}



