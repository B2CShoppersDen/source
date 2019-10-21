package com.b2cshoppersden.view;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class AdminOptionsView {
	
	Logger logger=Logger.getLogger(AdminOptionsView.class.getName());

	@SuppressWarnings("resource")
	public void mainAdminOptionsView()
	{
	
	logger.info("Admin Options View started");
	
		
		System.out.println("Select the option\n");
		System.out.println("1.Add product");
		System.out.println("2.delete product");
		System.out.println("3.view transactions");
		
		Scanner in = new Scanner(System.in); 
		int option=in.nextInt();
		
		switch(option)
		{
			
			case 1:	AddProductView addProductView=new AddProductView();
					addProductView.mainAddProductView();
					break;
			case 2: DeleteProductView deleteProductView=new DeleteProductView();
					deleteProductView.mainDeleteProductView();
					break;
			case 3: ViewTransactionsView viewTransactionsView=new ViewTransactionsView();
					viewTransactionsView.mainViewTransactionsView();
					break;
									
}
}
}
