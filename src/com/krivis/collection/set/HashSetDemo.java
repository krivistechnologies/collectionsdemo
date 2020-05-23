package com.krivis.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
	
		/*
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("one");
		hashSet.add("two");
		hashSet.add("three");
		hashSet.add("four");
		hashSet.add("five");
		hashSet.add("one");
		
		System.out.println(hashSet);
		
		int length = hashSet.size();
		System.out.println(length);
		
		System.out.println(hashSet.contains("one"));
		hashSet.remove("one");
		
		System.out.println(hashSet);
		
		// Using iterator
		System.out.println("============= Using iterator================");
		Iterator<String> itr = hashSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		// ForEach method
		System.out.println("============= ForEach================");
		//hashSet.forEach(System.out::println);
		//hashSet.forEach( element -> System.out.println(element));
		//hashSet.forEach( (element) -> { System.out.println(element) ; }); 
		hashSet.forEach( (String element) -> { System.out.println(element) ;});
		
		*/
		
		Set<Employee> hashSet = new HashSet<Employee>();
		
		Employee e1 =  new Employee(10,"Arjun reddy");
	    Employee e2	 = new Employee(11,"Harvi reddy");
	    Employee e3 =  new Employee(12,"Lakshmi reddy") ;
	    //Employee e4 =  new Employee(10,"Arjun reddy");
	    		
		hashSet.add(e1);
		hashSet.add(e2); //e2.compareTo(e1)
		hashSet.add(e3); //e3.compareTo(e2)   e3.compareTo(e1)
		//hashSet.add(e4);//
		
		System.out.println(hashSet.size());
		
		hashSet.forEach( (Employee employee) -> {
								employee.displayDetails();
								System.out.println("=========");
							});
		
		
	}

}
