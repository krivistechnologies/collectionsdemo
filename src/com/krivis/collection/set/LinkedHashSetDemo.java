package com.krivis.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		/*
		 
	
		Set<String> linkedHashSet =new LinkedHashSet<String>();
		linkedHashSet.add("one");
		linkedHashSet.add("two");
		linkedHashSet.add("three");
		linkedHashSet.add("four");
		linkedHashSet.add("five");
		linkedHashSet.add("one");
		
		System.out.println(linkedHashSet);
		
		// Iterate using Iterator 
		System.out.println("======= Iterate using Iterator  =======");
		Iterator<String> itr = linkedHashSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("======= Iterate using forEach  =======");
		//linkedHashSet.forEach(System.out::println);
		//linkedHashSet.forEach( element -> System.out.println(element));
		//linkedHashSet.forEach( (element) -> {  System.out.println(element); }); 
		
		linkedHashSet.forEach( (String element)-> { System.out.println(element); } );
		*/
		Set<Employee> linkedHashSet = new LinkedHashSet<Employee>();
		
		Employee e1 =  new Employee(10,"Arjun reddy");
	    Employee e2	 = new Employee(11,"Harvi reddy");
	    Employee e3 =  new Employee(12,"Lakshmi reddy") ;
	   // Employee e4 =  new Employee(10,"Arjun reddy");
	    		
	    linkedHashSet.add(e3);
	    linkedHashSet.add(e2); 
	    linkedHashSet.add(e1); 
	    //linkedHashSet.add(e4);
		
		System.out.println(linkedHashSet.size());
		
		linkedHashSet.forEach( (Employee employee) -> {
								employee.displayDetails();
								System.out.println("=========");
							});
	
		
	}

}
