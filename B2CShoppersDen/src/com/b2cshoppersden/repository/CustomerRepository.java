package com.b2cshoppersden.repository;

import java.util.ArrayList;
import java.util.List;

import com.b2cshoppersden.entities.Customer;


public class CustomerRepository {
	
	private static List<Customer> customerRepository=
			new ArrayList<Customer>();
	static{
		Customer customer=new Customer();
		
		customer.setUserName("srujana");
		customer.setPassword("srujana");
		customer.setEmailId("srujana@.com");
		customer.setGender("female");
		customer.setAge(21);
		
		//admin.setUserType(UserTypes.CUSTOMER);
		customerRepository.add(customer);
	}
	public static List<Customer> getcustomerRepository() {
		return customerRepository;
	}
	public static void setCustomerRepository(List<Customer> customerRepository) {
		CustomerRepository.customerRepository = customerRepository;
	}
	public static boolean add(Customer customer) {
		// TODO Auto-generated method stub
		
		return customerRepository.add(customer);
		
	}		
	
	
}



