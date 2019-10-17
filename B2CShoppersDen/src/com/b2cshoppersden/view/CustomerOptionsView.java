package com.b2cshoppersden.view;

import java.util.Scanner;


public class CustomerOptionsView {
	
	public void mainCustomerOptionsView()
	{
		
		System.out.println("Select the option\n");
		System.out.println("1.Add Customer");
		System.out.println("2.View Products");
		System.out.println("3.Add Products To Cart ");
		System.out.println("4.View Cart Products");
		System.out.println("5.Payment");
		
		Scanner in = new Scanner(System.in); 
		int option=in.nextInt();
		
		switch(option)
		{
			case 1:AddCustomerView addCustomerView=new AddCustomerView();
			       addCustomerView.mainAddCustomerView();
					break;
			case 2:	ViewProductsView viewProductsView=new ViewProductsView();
					viewProductsView.mainViewProductsView();
					break;
			case 3:AddToCartView addToCartView=new  AddToCartView();
					addToCartView.mainAddToCartView();
					break;
			case 4:ViewCartProductsView viewCartProductsView=new ViewCartProductsView();
					viewCartProductsView.mainViewCartProductsView();
					break;
			case 5:PaymentView paymentView=new PaymentView();
			      paymentView.mainPaymentView();
			      break;
		
		}
		
	}

}
