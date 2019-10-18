package com.b2cshoppersden.view;

import java.util.Scanner;


public class CustomerOptionsView {
	
	public void mainCustomerOptionsView()
	{
		
		System.out.println("Select the option\n");
		
       System.out.println("1.View Products");
		System.out.println("2.Add Products To Cart ");
		System.out.println("3.View Cart Products");
		System.out.println("4.Payment");
		
		Scanner in = new Scanner(System.in); 
		int option=in.nextInt();
		
		switch(option)
		{
			
			case 1:	ViewProductsView viewProductsView=new ViewProductsView();
					viewProductsView.mainViewProductsView();
					break;
			case 2:AddToCartView addToCartView=new  AddToCartView();
					addToCartView.mainAddToCartView();
					break;
			case 3:ViewCartProductsView viewCartProductsView=new ViewCartProductsView();
					viewCartProductsView.mainViewCartProductsView();
					break;
			case 4:PaymentView paymentView=new PaymentView();
			      paymentView.mainPaymentView();
			      break;
		
		}
		
	}

}
