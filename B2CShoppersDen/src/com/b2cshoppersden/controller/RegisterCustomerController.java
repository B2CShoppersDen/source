package com.b2cshoppersden.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.b2cshoppersden.model.RegisterCustomerModel;


import com.b2cshoppersden.service.RegisterService;
import com.b2cshoppersden.service.RegisterServiceImpl;
import com.b2cshoppersden.ui.ConsoleUI;
import com.b2cshoppersden.utilities.ConnectionManager;
import com.b2cshoppersden.view.ErrorView;
import com.b2cshoppersden.view.RegisterCustomerView;

public class RegisterCustomerController {

	public boolean registerCustomer(String userName, String password, String email, int age, String gender) {
		// TODO Auto-generated method stub
			RegisterCustomerModel  registerCustomerModel=new RegisterCustomerModel();
			registerCustomerModel.setUserName(userName);
			registerCustomerModel.setPassword(password);
			registerCustomerModel.setEmail(email);
			registerCustomerModel.setAge(age);
			registerCustomerModel.setGender(gender);
			boolean verf4=false;
			RegisterService registerService=new RegisterServiceImpl();
			
			try {
				
				verf4=registerService.customerStoreVerification(registerCustomerModel);	
		
		// AddAdminView adminView=new AddAdminView();
		
		System.out.println(verf4);
		System.out.println(registerCustomerModel.getUserName());
		System.out.println(registerCustomerModel.getPassword());
			if(verf4) {
				System.out.println("Customer added Successfully");
				verf4=true;
				ConsoleUI ui=new ConsoleUI();
				ui.mainMenu();
			}else {
				ErrorView errorView=new ErrorView();
				errorView.authenticationError();
			}
			
			}catch(Exception e) {
				System.out.println("new customer is not added");
				ConsoleUI ui=new ConsoleUI();
				ui.mainMenu();
			}
			return verf4;
			
			}
	
			public boolean customerStoreVerification(RegisterCustomerModel registerCustomerModel) throws ClassNotFoundException,SQLException{
				// TODO Auto-generated method stub
				
				try 
				{
					ConnectionManager connectionUtility=new ConnectionManager();
					Connection con=connectionUtility.openConnection1();
				
					String querys = "INSERT INTO Customer VALUES ("
					    + " ?, ?, ?, ?, ?)";
				// set all the preparedStatement parameters
				PreparedStatement st = con.prepareStatement(querys);

				st.setString(1, registerCustomerModel.getUserName());
				st.setString(2, registerCustomerModel.getPassword());
				st.setString(3, registerCustomerModel.getEmail());
				st.setInt(4, registerCustomerModel.getAge());
				st.setString(5, registerCustomerModel.getGender());

				// execute the preparedStatement insert
				st.executeUpdate();

				// st.close();
				
				st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

						return true;
				}

	}


