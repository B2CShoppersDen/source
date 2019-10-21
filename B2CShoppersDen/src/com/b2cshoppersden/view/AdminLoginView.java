package com.b2cshoppersden.view;




import java.util.Scanner;

import org.apache.log4j.Logger;

import com.b2cshoppersden.controller.AdminController;

public class AdminLoginView {
	
	Logger logger=Logger.getLogger(AdminLoginView.class.getName());
	public void mainAdminView() {
		// TODO Auto-generated method stub
		logger.info("Admin login View started");
			
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

