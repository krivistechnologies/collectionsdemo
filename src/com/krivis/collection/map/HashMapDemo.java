package com.krivis.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("Arjun", 7, "male");
		Person p2 = new Person("Harvi", 2, "Female");
		Person p3 = new Person("Arvi", 4, "Female");
		Person p4 = new Person("Abc",5,"male");
		Person p5 = new Person("Abc",5,"male");
		
		Map<Person,String> hashMap = new HashMap<Person,String>();
		
		hashMap.put(p1,"arjun");
		hashMap.put(p2,"harvi");
		hashMap.put(p3,"arvi");
		hashMap.put(p4,"arjun");
		hashMap.put(p5,"krivis");



		
		System.out.println("========== using forEach ===============");
		hashMap.forEach( (key,value) -> {
			System.out.println("key = " + key );
			System.out.println("value = ”"+ value);
		});
		
	}

}
