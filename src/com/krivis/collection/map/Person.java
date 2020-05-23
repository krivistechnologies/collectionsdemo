package com.krivis.collection.map;

public class Person implements Comparable{

	String name;
	int age;
	String gender;
	
	Person(String name,int age,String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String toString() {
		return " Person Object Data : Name = "+ this.name + " age = "+ this.age + " gender = " + this.gender ;
				
	}

	@Override
	public int compareTo(Object o) {
		
		Person p = (Person)o;
		/*
		 Person p = (Person)o;
		 if(this.age == p.age)
			 return 0;
		 else if(this.age > p.age)
			 return 1;
		 else
			 return -1;
			 */
		
		return this.name.compareTo(p.name);
	}
}
