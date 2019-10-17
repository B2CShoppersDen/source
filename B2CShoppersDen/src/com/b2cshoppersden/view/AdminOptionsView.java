package com.b2cshoppersden.view;

import java.util.Scanner;

public class AdminOptionsView {

	public void mainAdminOptionsView()
	{
		
		System.out.println("Select the option\n");
		System.out.println("1.Add Admin");
		System.out.println("2.Add Services");
		System.out.println("3.Modify Services");
		System.out.println("4.View Feedback");
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
