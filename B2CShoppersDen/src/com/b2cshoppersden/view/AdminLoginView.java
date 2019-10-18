package com.b2cshoppersden.view;




import java.util.Scanner;

import com.b2cshoppersden.controller.AdminController;

public class AdminLoginView {

	public void mainAdminView() {
		// TODO Auto-generated method stub
			
			Scanner sc=new Scanner(System.in);
			System.out.println("**************");
			System.out.println("======Admin View======");
			System.out.println("**************");
			System.out.println("enter username");
			String adminUserName=sc.next();
			System.out.println("enter password");
			String password=sc.next();
			
			AdminController adminController=new AdminController();
			adminController.Verification(adminUserName,password);
			
		}
}

