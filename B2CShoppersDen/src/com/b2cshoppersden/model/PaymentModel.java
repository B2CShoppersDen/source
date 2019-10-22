package com.b2cshoppersden.model;

import org.apache.log4j.Logger;

import com.b2cshoppersden.view.ViewTransactionsView;

public class PaymentModel {
	
	
	private String CardHolderName;
	private long CreditCardNumber;
	private int CVV;
	public String getCardHolderName() {
		return CardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		CardHolderName = cardHolderName;
	}
	public long getCreditCardNumber() {
		return CreditCardNumber;
	}
	public void setCreditCardNumber(long creditCardNumber) {
		CreditCardNumber = creditCardNumber;
	}
	public int getCVV() {
		return CVV;
	}
	public void setCVV(int cVV) {
		CVV = cVV;
	}
	@Override
	public String toString() {
		return "PaymentModel [CardHolderName=" + CardHolderName + ", CreditCardNumber=" + CreditCardNumber + ", CVV="
				+ CVV + "]";
	}
	public void setToatlFareAmount(int totalFareAmount) {
		// TODO Auto-generated method stub
		
	}
	
	
}
