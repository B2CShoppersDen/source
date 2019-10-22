package com.b2cshoppersden.service;

import java.sql.SQLException;
import java.util.Comparator;

import org.apache.log4j.Logger;

import com.b2cshoppersden.dao.CustomerDAO;

import com.b2cshoppersden.model.AddToCartModel;
import com.b2cshoppersden.model.CustomerLoginModel;
import com.b2cshoppersden.model.PaymentModel;
import com.b2cshoppersden.model.RegisterCustomerModel;
import com.b2cshoppersden.model.ViewCartProductsModel;
import com.b2cshoppersden.model.ViewProductsModel;


public class CustomerService_Imp  implements CustomerService{
     
	
	CustomerDAO customerDAO=new CustomerDAO();
	Logger logger=Logger.getLogger(AdminServiceImpl.class.getName());
	public boolean Verification(CustomerLoginModel customerLoginModel) throws ClassNotFoundException,SQLException{
		// TODO Auto-generated method stub
		logger.info("Verification called");
		return customerDAO.customerVerification(customerLoginModel);
		
	}

	
	

	public boolean viewProductsVerification(ViewProductsModel viewProductsModel) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		logger.info("ViewProducts called");
		return customerDAO.viewProductsVerification(viewProductsModel);
	}

	public boolean addToCartVerification(AddToCartModel addToCartModel) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		logger.info("addTo Cart Varification called");
		return customerDAO.addtoCartVerification(addToCartModel);
		
	}
	@Override
	public boolean paymentVerification(PaymentModel paymentModel) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		logger.info("payment Verification called");
		return false;
	}

	public boolean ViewCartProductsVerification(ViewCartProductsModel viewCartProductsModel) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		logger.info("ViewCartProducts Verification called");
		return customerDAO.viewCartProductsVerification(viewCartProductsModel);
		
		
	}





}
