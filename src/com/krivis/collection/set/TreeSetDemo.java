package com.krivis.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		/*
		Set<String> treeSet =new TreeSet<String>();
		treeSet.add("one");
		treeSet.add("two");
		treeSet.add("three");
		treeSet.add("four");
		treeSet.add("five");
		treeSet.add("one"); // "one".equlas("one")
		
		System.out.println(treeSet);
		

		Iterator<String> itr = treeSet.iterator();
		System.out.println("=====Iterate TreeSet using Iterator========");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		System.out.println("======= Iterate using forEach  =======");
		//treeSet.forEach(System.out::println);
		//treeSet.forEach( element -> System.out.println(element));
		treeSet.forEach( (element) -> {  System.out.println(element); }); 
		
		//treeSet.forEach( (String element)-> { System.out.println(element); } );
		*/
		
		Set<Employee> treeSet = new TreeSet<Employee>();
		
		Employee e1 =  new Employee(10,"Arjun reddy");
	    Employee e2	 = new Employee(11,"Harvi reddy");
	    Employee e3 =  new Employee(12,"Lakshmi reddy") ;
	    Employee e4 =  new Employee(10,"Arjun reddy");
	    		
	    treeSet.add(e3);
	    treeSet.add(e1); 
	    treeSet.add(e2); 
	    treeSet.add(e4);
		
		System.out.println(treeSet.size());
		
		treeSet.forEach( (Employee employee) -> {
								employee.displayDetails();
								System.out.println("=========");
							});
		
		
	}

}
