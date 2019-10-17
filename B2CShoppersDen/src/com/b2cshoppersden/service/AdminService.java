package com.b2cshoppersden.service;

import java.sql.SQLException;

import com.b2cshoppersden.model.AddProductModel;
import com.b2cshoppersden.model.AdminLoginModel;
import com.b2cshoppersden.model.DeleteProductModel;

public interface AdminService {

	public boolean Verification(AdminLoginModel adminLoginModel) throws ClassNotFoundException, SQLException;
	public boolean addProductVerification(AddProductModel addProductModel) throws ClassNotFoundException,SQLException;
	public boolean deleteProductVerification(DeleteProductModel deleteProductModel) throws ClassNotFoundException, SQLException;
}
