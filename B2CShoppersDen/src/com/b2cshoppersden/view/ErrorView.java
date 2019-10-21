package com.b2cshoppersden.view;

import org.apache.log4j.Logger;

public class ErrorView {
	
	Logger logger=Logger.getLogger(ErrorView.class.getName());

	public void authenticationError() {
		// TODO Auto-generated method stub
		logger.info("Error View started");
		System.out.println("User Authentication Failed.");
	}


	public void deleteProductError() {
		// TODO Auto-generated method stub
		System.out.println("Deleting product Error");
	}
	
	public void addProductError() {
		// TODO Auto-generated method stub
		
		System.out.println("Adding product Error");

}


	public void viewTransactionsError() {
		// TODO Auto-generated method stub
		
	}

	
}

