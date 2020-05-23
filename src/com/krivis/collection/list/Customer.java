package com.krivis.collection.list;

public class Customer {
	
	 int id;
	 String name;

	 
	 Customer(int id,String name){
		 this.id = id;
		 this.name = name;
		
	 }
	
	 
	public String toString() {
		 return "id = " + this.id + " Name = " + this.name;
	 }
	
}
