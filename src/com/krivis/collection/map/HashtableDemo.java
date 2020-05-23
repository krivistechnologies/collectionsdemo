package com.krivis.collection.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashtableDemo {

	public static void main(String[] args) {
		Person p1 = new Person("Arjun", 7, "male");
		Person p2 = new Person("Harvi", 2, "Female");
		Person p3 = new Person("arvi", 4, "Female");
		Person p4 = new Person("abc",5,"male");
		
		Map<String,Person> hashTable = new Hashtable<String,Person>();
		
		hashTable.put("arjun", p1);
		hashTable.put("harvi", p2);
		hashTable.put("arvi", p3);
		//hashTable.put("arjun", null);
		//hashTable.put(null, p4);

		
		System.out.println(hashTable);
		
		//Set<String> keys = hashMap.keySet();
		
		Person p = hashTable.get("harvi");
		System.out.println(p);
		
		System.out.println(hashTable.isEmpty());
		
		System.out.println(hashTable.containsKey("arviiiii"));
		System.out.println(hashTable.containsValue(p3));
		
		//hashMap.clear();
		
		//System.out.println(hashMap.isEmpty());
		
		// iterat the HahsMap 
		System.out.println("========== using KeySet===============");
		Set<String> keys = hashTable.keySet();
		
		for(String key : keys) {
			System.out.println(hashTable.get(key));
		}
		
		System.out.println("========== using forEach ===============");
		hashTable.forEach( (key,value) -> {
			System.out.println("key = " + key );
			System.out.println("value = ”"+ value);
		});

	}

}
