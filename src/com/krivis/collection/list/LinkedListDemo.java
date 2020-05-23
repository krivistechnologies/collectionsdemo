package com.krivis.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<String> linkedList = new LinkedList<String>();
		linkedList.add("One");
		linkedList.add("Two");
		linkedList.add("Three");
		linkedList.add("Four");
		linkedList.add("Five");
		linkedList.add("Six");
		
		System.out.println(linkedList);
		linkedList.add(1, "Seven");
		System.out.println(linkedList);
		
		linkedList.remove("Seven");
		System.out.println(linkedList);
		linkedList.remove(1);
		System.out.println(linkedList);
		System.out.println(linkedList.contains("Three"));
		System.out.println(linkedList.size());
		
		System.out.println("============ Enhance for loop===============");
		for(String element : linkedList) {
			System.out.println(element);
		}
		
		System.out.println("============ Iterator ===============");
		Iterator<String> itr= linkedList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("============ List Iterator ===============");
		ListIterator<String> listItr	= linkedList.listIterator();
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		
		System.out.println("============ using forEach method ===============");
		//linkedList.forEach(System.out::println);
		//linkedList.forEach(element -> System.out.println(element));
		//linkedList.forEach(  (element) ->{ System.out.println(element); }        );
		linkedList.forEach(  (String element)  -> { System.out.println(element); }   );
		
	}
	

}
