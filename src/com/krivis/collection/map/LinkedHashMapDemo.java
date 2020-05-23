package com.krivis.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		Person p1 = new Person("Arjun", 7, "male");
		Person p2 = new Person("Harvi", 2, "Female");
		Person p3 = new Person("arvi", 4, "Female");
		Person p4 = new Person("abc",5,"male");
		
		Map<String,Person> LinkedHashMap = new LinkedHashMap<String,Person>();
		
		LinkedHashMap.put("arjun", p1);
		LinkedHashMap.put("harvi", p2);
		LinkedHashMap.put("arvi", p3);
		LinkedHashMap.put("arjun", p4);
		
		System.out.println(LinkedHashMap);
		
		//Set<String> keys = hashMap.keySet();
		
		Person p = LinkedHashMap.get("harvi");
		System.out.println(p);
		
		System.out.println(LinkedHashMap.isEmpty());
		
		System.out.println(LinkedHashMap.containsKey("arviiiii"));
		System.out.println(LinkedHashMap.containsValue(p3));
		
		//hashMap.clear();
		
		//System.out.println(hashMap.isEmpty());
		
		// iterat the HahsMap 
		System.out.println("========== using KeySet===============");
		Set<String> keys = LinkedHashMap.keySet();
		
		for(String key : keys) {
			System.out.println(LinkedHashMap.get(key));
		}
		
		System.out.println("========== using forEach ===============");
		LinkedHashMap.forEach( (key,value) -> {
			System.out.println("key = " + key );
			System.out.println("value = ”"+ value);
		});

	}

}
