package com.b2cshoppersden.model;

import org.apache.log4j.Logger;

import com.b2cshoppersden.view.ViewTransactionsView;

public class DataModel {
	
	
	public boolean booleanStatus;
	private String userName;
	
	public  DataModel(boolean booleanStatus,String userName) {
		this.booleanStatus=booleanStatus;
		this.userName=userName;
	}
	
	public boolean isBooleanStatus() {
		return booleanStatus;
	}
	public void setBooleanStatus(boolean booleanStatus) {
		this.booleanStatus = booleanStatus;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
