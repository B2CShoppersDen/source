package com.b2cshoppersden.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.b2cshoppersden.model.AddToCartModel;
import com.b2cshoppersden.model.CustomerLoginModel;
import com.b2cshoppersden.model.PaymentModel;
import com.b2cshoppersden.model.ViewCartProductsModel;
import com.b2cshoppersden.model.ViewProductsModel;
import com.b2cshoppersden.utilities.ConnectionManager;

public class CustomerDAO {
     
	@SuppressWarnings({ "static-access", "unused" })
	public boolean customerVerification(CustomerLoginModel customerLoginModel) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		try 
		{

			//ConnectionManager connectionUtility=new ConnectionManager();
			Connection connection=ConnectionManager.openConnection1();
		
			String query="SELECT * FROM ShoppersDen.customer WHERE user_name='"+customerLoginModel.getUserName() +"' AND user_password= '"+customerLoginModel.getPassword()+"'";
			PreparedStatement statement=connection.prepareStatement(query);
		
			ResultSet rs=statement.executeQuery();
			while(rs.next())
			{
				String username=rs.getString("user_name");
				String password=rs.getString("user_password");
				System.out.println(username+""+password);
				return true;
				// validation logic
				
				
			}
			rs.close();
			connection.close();
		} catch (SQLException e) {

			System.out.println("UserName or password is Incorrect");
			
			}return false; 
}
	


	@SuppressWarnings("static-access")	
	public boolean viewProductsVerification(ViewProductsModel viewProductsModel) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		
		try {	
			ConnectionManager connectionManager= new ConnectionManager();
			Connection connection = connectionManager.openConnection1();
			String query="swlect into customer values(?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, viewProductsModel.getProductId());
			statement.setString(2,viewProductsModel.getProductImageUrl());
			statement.setString(3, viewProductsModel.getProductDescription());
			statement.setDouble(4, viewProductsModel.getProductPrice());		
			statement.setString(5, viewProductsModel.getProductCategory());
			statement.setString(6, viewProductsModel.getProductName());
			
			statement.executeUpdate();
					statement.close();
					} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}

						return true;
			}


	

	public boolean addtoCartVerification(AddToCartModel addToCartModel) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		
		
		try {	
			ConnectionManager connectionManager= new ConnectionManager();
			Connection connection = connectionManager.openConnection1();
			String query="insert into product values(?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1,addToCartModel.getProductId());
			statement.setString(2,addToCartModel.getProductImageUrl());
			statement.setString(3,addToCartModel.getProductDescription());
			statement.setDouble(4,addToCartModel.getProductPrice());		
			statement.setString(5,addToCartModel.getProductCategory());
			statement.setString(6,addToCartModel.getProductName());
			
			statement.executeUpdate();
					statement.close();
					} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}

						return true;
			}


	public boolean viewCartProductsVerification(ViewCartProductsModel viewCartProductsModel) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		
		
		try {	
			ConnectionManager connectionManager= new ConnectionManager();
			Connection connection = connectionManager.openConnection1();
			String query="insert into product values(?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1,viewCartProductsModel.getProductId());
			statement.setString(2,viewCartProductsModel.getProductImageUrl());
			statement.setString(3,viewCartProductsModel.getProductDescription());
			statement.setDouble(4,viewCartProductsModel.getProductPrice());		
			statement.setString(5,viewCartProductsModel.getProductCategory());
			statement.setString(6,viewCartProductsModel.getProductName());
			
			statement.executeUpdate();
					statement.close();
					} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}

						return true;
			}

		

	}
		
		
		
		
		

