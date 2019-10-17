package com.b2cshoppersden.service;

import java.sql.SQLException;
import java.util.Comparator;

import com.b2cshoppersden.dao.CustomerDAO;
import com.b2cshoppersden.entities.Customer;
import com.b2cshoppersden.model.AddCustomerModel;
import com.b2cshoppersden.model.AddToCartModel;
import com.b2cshoppersden.model.CustomerLoginModel;
import com.b2cshoppersden.model.PaymentModel;
import com.b2cshoppersden.model.ViewCartProductsModel;
import com.b2cshoppersden.model.ViewProductsModel;


public class CustomerService_Imp  implements CustomerService,Comparator<Customer>{
     
	
	CustomerDAO customerDAO=new CustomerDAO();
	public boolean Verification(CustomerLoginModel customerLoginModel) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		
		return customerDAO.customerVerification(customerLoginModel);
		
	}

	public boolean customerStoreVerification(AddCustomerModel addcustomerModel) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		return  customerDAO.customerStoreVerification(addcustomerModel);
		
	}

	public boolean viewProductsVerification(ViewProductsModel viewProductsModel) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		return customerDAO.viewProductsVerification(viewProductsModel);
	}

	public boolean addToCartVerification(AddToCartModel addToCartModel) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		return customerDAO.addtoCartVerification(addToCartModel);
		
	}

	
	@Override
	public int compare(Customer arg0, Customer arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean paymentVerification(PaymentModel paymentModel) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean ViewCartProductsVerification(ViewCartProductsModel viewCartProductsModel) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return customerDAO.viewCartProductsVerification(viewCartProductsModel);
		
		
	}

}
