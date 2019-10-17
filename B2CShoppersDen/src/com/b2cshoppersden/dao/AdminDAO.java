package com.b2cshoppersden.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.b2cshoppersden.model.AddProductModel;
import com.b2cshoppersden.model.AdminLoginModel;
import com.b2cshoppersden.model.DeleteProductModel;
import com.b2cshoppersden.model.ViewTransactionsModel;
import com.b2cshoppersden.utilities.ConnectionManager;


public class AdminDAO {

	@SuppressWarnings({ "static-access", "unused" })
	public boolean adminVerification(AdminLoginModel adminLoginModel) throws ClassNotFoundException ,SQLException{
		// TODO Auto-generated method stub
		try 
		{

			ConnectionManager connectionUtility=new ConnectionManager();
			Connection connection=connectionUtility.openConnection1();
		
			String query="SELECT * FROM admin WHERE AdminUserName='"+adminLoginModel.getAdminUserName() +"' AND Password= '"+adminLoginModel.getPassword()+"'";
			PreparedStatement statement=connection.prepareStatement(query);
		
			
			
			ResultSet rs=statement.executeQuery();
			while(rs.next())
			{
				String username=rs.getString("Admin username");
				String password=rs.getString("Password");
				return true;
			}
			rs.close();
			connection.close();
		} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
			} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		return false;
	}

	@SuppressWarnings("static-access")
	public boolean addProductVerification(AddProductModel addProductModel) throws ClassNotFoundException ,SQLException{
		// TODO Auto-generated method stub
	
		try 
		{
			ConnectionManager connectionManager=new ConnectionManager();
			Connection con=connectionManager.openConnection1();
		
			String querys = "INSERT INTO product VALUES(?,?,?,?,?,?)";
		// set all the preparedstatement parameters
		PreparedStatement statement= con.prepareStatement(querys);

		statement.setString(1, addProductModel.getProductImageUrl());
		statement.setInt(2, addProductModel.getProductId());
		statement.setString(3, addProductModel.getProductDescription());
		statement.setDouble(4, addProductModel.getProductPrice());
		statement.setString(5, addProductModel.getProductCategory());
		statement.setString(6, addProductModel.getProductName());
		

		// execute the preparedstatement insert
		statement.executeUpdate();

		// st.close();
		
		statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

				return true;
	}
		
	

	@SuppressWarnings("static-access")
	public boolean deleteProductVerification(DeleteProductModel deleteProductModel) throws ClassNotFoundException ,SQLException{
		// TODO Auto-generated method stub
		
			try 
			{
				ConnectionManager connectionManager=new ConnectionManager();
				Connection connection=connectionManager.openConnection1();
			
				String querys = "DELETE FROM product WHERE PRODUCTID=("+"?)";
			// set all the preparedstatement parameters
		
				PreparedStatement statement = connection.prepareStatement(querys);

			statement.setString(1, deleteProductModel.getProductImageUrl());
			statement.setInt(2, deleteProductModel.getProductId());
			statement.setString(3, deleteProductModel.getProductDescription());
			statement.setDouble(4, deleteProductModel.getProductPrice());
			statement.setString(5, deleteProductModel.getProductCategory());
			statement.setString(6, deleteProductModel.getProductName());
			

			// execute the preparedstatement insert
			statement.executeUpdate();

			// st.close();
			
			statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

					return true;
		}

	public boolean viewTransactionsVerification(ViewTransactionsModel viewTransactionsModel) throws ClassNotFoundException ,SQLException{
		// TODO Auto-generated method stub
		
		try 
		{
			ConnectionManager connectionManager=new ConnectionManager();
			Connection connection=connectionManager.openConnection1();
		
			String querys = "";
		// set all the preparedstatement parameters
	
			PreparedStatement statement = connection.prepareStatement(querys);

		statement.setInt(1, viewTransactionsModel.getTransactionId());
		statement.setInt(2, viewTransactionsModel.getPaymentId());
		statement.setString(3, viewTransactionsModel.getPaymentType());
		

		// execute the preparedstatement insert
		statement.executeUpdate();

		// st.close();
		
		statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

				return true;
	}

	}	

