package com.mvcapp;

import java.util.ArrayList;
import java.util.List;

public class CustomerDataUtil {

	public static List<Customer> getCustomers(){
		
		// empty list created
		List<Customer> customers = new ArrayList<>();
		
		// adding data in the list
		customers.add(new Customer("Michael", "Bah", "michaelbah@newemail.com"));
		customers.add(new Customer("John", "Doe", "johndoe@newemail.com"));
		customers.add(new Customer("Mary", "Thomas", "marythomas@newemail.com"));
		
		// returning the list 
		return customers;

	}
}
