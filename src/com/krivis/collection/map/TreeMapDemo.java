package com.krivis.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		Person p1 = new Person("Arjun", 7, "male");
		Person p2 = new Person("Harvi", 2, "Female");
		Person p3 = new Person("arvi", 4, "Female");
		Person p4 = new Person("abc",5,"male");
		
		Map<String,Person> treeMap = new TreeMap<String,Person>();
		
		treeMap.put("arjun", p1);
		treeMap.put("harvi", p2);
		treeMap.put("arvi", p3);
		treeMap.put("arjun", p4);
		
		System.out.println(treeMap);
		
		//Set<String> keys = hashMap.keySet();
		
		Person p = treeMap.get("harvi");
		System.out.println(p);
		
		System.out.println(treeMap.isEmpty());
		
		System.out.println(treeMap.containsKey("arviiiii"));
		System.out.println(treeMap.containsValue(p3));
		
		//hashMap.clear();
		
		//System.out.println(hashMap.isEmpty());
		
		// iterat the HahsMap 
		System.out.println("========== using KeySet===============");
		Set<String> keys = treeMap.keySet();
		
		for(String key : keys) {
			System.out.println(treeMap.get(key));
		}
		
		System.out.println("========== using forEach ===============");
		treeMap.forEach( (key,value) -> {
			System.out.println("key = " + key );
			System.out.println("value = ”"+ value);
		});

	}

}
