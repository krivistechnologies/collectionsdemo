package com.krivis.collection.objecteqaulity;

public class Customer {
	
	int id;
	String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	 public boolean equals(Object obj) {

		    if (obj == null) return false;

		    if (!(obj instanceof Customer))

		        return false;

		   if (obj == this) return true;

		    Customer customer = (Customer) obj;
		    return this.id == customer.getId() && this.name.equals(customer.getName());
		}
	 
	 public int hashCode() {
		 return  23 + 43 * this.id + 100; 
	 }

}
