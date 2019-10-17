package com.b2cshoppersden.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.b2cshoppersden.model.AddCustomerModel;
import com.b2cshoppersden.model.AddToCartModel;
import com.b2cshoppersden.model.CustomerLoginModel;
import com.b2cshoppersden.model.PaymentModel;
import com.b2cshoppersden.model.ViewProductsModel;
import com.b2cshoppersden.utilities.ConnectionManager;

public class CustomerDAO {
     
	@SuppressWarnings({ "static-access", "unused" })
	public boolean customerVerification(CustomerLoginModel customerLoginModel) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		try 
		{

			ConnectionManager connectionUtility=new ConnectionManager();
			Connection connection=connectionUtility.openConnection();
		
			String query="SELECT * FROM Customer WHERE username='"+customerLoginModel.getUserName() +"' AND Password= '"+customerLoginModel.getPassword()+"'";
			PreparedStatement statement=connection.prepareStatement(query);
		
			ResultSet rs=statement.executeQuery();
			while(rs.next())
			{
				String username=rs.getString("username");
				String password=rs.getString("Password");
				return true;
				// validation logic
				
				
			}
			rs.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {

			System.out.println("UserName or password is Incorrect");
			
			}return false; 
}
	
	public boolean customerStoreVerification(AddCustomerModel addcustomerModel) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		
		try 
		{
			ConnectionManager connectionUtility=new ConnectionManager();
			Connection con=connectionUtility.openConnection();
		
			String querys = "INSERT INTO Customer VALUES ("
			    + " ?, ?, ?, ?, ?)";
		// set all the preparedstatement parameters
		PreparedStatement st = con.prepareStatement(querys);

		st.setString(1, addcustomerModel.getUserName());
		st.setString(2, addcustomerModel.getPassword());
		st.setString(3, addcustomerModel.getEmail());
		st.setInt(4, addcustomerModel.getAge());
		st.setString(5, addcustomerModel.getGender());

		// execute the preparedstatement insert
		st.executeUpdate();

		// st.close();
		
		st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

				return true;
		}


	@SuppressWarnings("static-access")	
	public boolean viewProductsVerification(ViewProductsModel viewProductsModel) {
		// TODO Auto-generated method stub
		
		try {	
			ConnectionManager connectionManager= new ConnectionManager();
			Connection connection = connectionManager.openConnection();
			String query="insert into buses values(?,?,?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, viewProductsModel.getProductId());
			statement.setString(2,viewProductsModel.getProductImageUrl());
			statement.setString(3, viewProductsModel.getProductDescription());
			statement.setString(4, viewProductsModel.getProductPrice());		
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


}

	public boolean addtoCartVerification(AddToCartModel addToCartModel) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean paymentVerification(PaymentModel paymentModel) {
		// TODO Auto-generated method stub
		return false;
	}

}
