package com.b2cshoppersden.service;

import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.b2cshoppersden.dao.RegistrationDAO;
import com.b2cshoppersden.model.RegisterCustomerModel;

public class RegisterServiceImpl implements RegisterService{

	public boolean customerStoreVerification(RegisterCustomerModel registerCustomerModel) throws ClassNotFoundException,SQLException {
		
		RegistrationDAO dao=new RegistrationDAO();
		// TODO Auto-generated method stub
		Logger logger=Logger.getLogger(RegisterServiceImpl.class.getName());
		logger.info("Register verification called");
		boolean result=dao.customerStoreVerification(registerCustomerModel);
		return result;
	}	
}
