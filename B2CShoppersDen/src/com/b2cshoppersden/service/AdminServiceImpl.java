package com.b2cshoppersden.service;

import com.b2cshoppersden.dao.AdminDAO;
import com.b2cshoppersden.model.AddProductModel;
import com.b2cshoppersden.model.AdminLoginModel;
import com.b2cshoppersden.model.DeleteProductModel;
public class AdminServiceImpl {

	AdminDAO adminDAO=new AdminDAO();
	public boolean Verification(AdminLoginModel adminLoginModel) {
		// TODO Auto-generated method stub
	
		return adminDAO.adminVerification(adminLoginModel);
		
	}

	public boolean addProductVerification(AddProductModel addProductModel) {
		// TODO Auto-generated method stub
		
		return adminDAO.addProductVerification(addProductModel);
	}

	public boolean deleteProductVerification(DeleteProductModel deleteProductModel) {
		// TODO Auto-generated method stub
		
		return adminDAO.deleteProductVerification(deleteProductModel);
	
	}

	

}
