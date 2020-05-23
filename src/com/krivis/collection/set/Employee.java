package com.krivis.collection.set;

public class Employee implements Comparable{
	
	int id;
	String name;
	
	Employee(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	public void displayDetails() {
		
		System.out.println("id = " + this.id);
		System.out.println("name = " + this.name);
	}

	@Override
	public int compareTo(Object o) {
		
		Employee emp = (Employee) o;
		 if(this.id == emp.id)
			 return 0;
		 else if(this.id > emp.id)
			 return 1;
		 else
			 return -1;
	}
	
}
