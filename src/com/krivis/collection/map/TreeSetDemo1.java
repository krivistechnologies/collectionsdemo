package com.krivis.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		

			// Map maintains unique key
		   // TreeMap - sorted order - keys sorting
		Person p1 = new Person("Arjun", 7, "male");
		Person p2 = new Person("Harvi", 2, "Female");
		Person p3 = new Person("Arvi", 4, "Female");
		Person p4 = new Person("Abc",5,"male");
		Person p5 = new Person("Abc",5,"male");
		
		
		
		Map<Person,String> treeMap = new TreeMap<Person,String>();
		
		treeMap.put(p1,"arjun");
		treeMap.put(p2,"harvi");
		treeMap.put(p3,"arvi");
		treeMap.put(p4,"arjun");
		treeMap.put(p5,"krivis");
		
		
		//System.out.println(treeMap);
		
		treeMap.forEach( (key,value) -> {
			System.out.println("Key = " + key);
			System.out.println("Value = " + value);
		});
		
		
	}

}
