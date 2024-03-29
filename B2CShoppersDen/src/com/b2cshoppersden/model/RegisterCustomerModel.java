package com.b2cshoppersden.model;

import org.apache.log4j.Logger;

import com.b2cshoppersden.view.ViewTransactionsView;

public class RegisterCustomerModel {
	
	
	private String userName;
	private String password;
	private String email;
	private int age;
	private String gender;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "AddCustomerModel [userName=" + userName + ", password=" + password + ", email=" + email + ", age=" + age
				+ ", gender=" + gender + "]";
	}


}
