package com.krivis.collection.objecteqaulity;

import java.util.HashSet;
import java.util.Set;

public class ObjectEqaulity {

	public static void main(String[] args) {
		
	
		Customer c1 = new Customer();
		c1.setId(10);
		c1.setName("Arjun");
		
		Customer c2 = new Customer();
		c2.setId(11);
		c2.setName("Harvi");
		
		Customer c3 = new Customer();
		c3.setId(10);
		c3.setName("Arjun");
		

		// no duplicates
		
		Set<Customer> hashSet = new HashSet<Customer>();
		hashSet.add(c1);
		hashSet.add(c2);
		hashSet.add(c3);
		
	
		//System.out.println(c1);
		//System.out.println(c3);
		System.out.println(hashSet.size());// 2 is the size
		
		
		

		
		

	}

}
