package com.krivis.collection.list;

import java.util.ArrayList;
import java.util.List;

public class CollectionHelper {
	
	public static List<Customer> getCustomers(){
		
		List<Customer> customerList = new ArrayList<Customer>();
		
		Customer customer1 = new Customer(1,"Arjun");
		Customer customer2 = new Customer(2,"Harvi");
		//Customer customer3 = new Customer(3,"Lakshmi","Reddy","lakshmi@gmail.com");
		
		customerList.add(customer1);
		customerList.add(customer2);
		//customerList.add(customer3);
		
		return customerList;
	}

}
