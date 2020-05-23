package com.krivis.collection.list;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//List list1 = new ArrayList();
		
		List<String> list = new ArrayList<String>(); // created arraylist container object which deals with String object
		//adding string objects using add
		list.add("one"); // o index
		list.add("two"); // 1 index
		list.add("three"); // 2 index
		list.add("four"); // 3 index
		list.add("five"); // 4th index
		list.add("six"); // 5 index
		

		/*

		list.add("five"); // 6 index
		
		System.out.println("list = " + list);
		
		int arrayListSize = list.size(); // to get size or number of elements
		System.out.println("Size = " +  arrayListSize);
		
		list.add(1, "new elememnt");
		System.out.println("list = " + list);
		
		
		list.remove("five");
		System.out.println("list = " + list);
		
		list.remove(3);
		System.out.println("list = " + list);
		
		
		for(int index = 0; index < arrayListSize; index++)
				System.out.println(list.get(index));
		*/
		
		//ENHNACED FOR LOOP
		/*
		for(String element :  list) 
			System.out.println(element);
		
		*/
		//USING ITERATOR
		/*
		System.out.println("Using list iterator");
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) 
			System.out.println(iterator.next());
	
		
		System.out.println("Using list Listiterator forward ietrating");
		//List Iterator 
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext())
			System.out.println(listIterator.next());
		
		System.out.println("Using list Listiterator backword ietrating");
		while(listIterator.hasPrevious())
			System.out.println(listIterator.previous());
		*/
		
		//forEach
		
		//list.forEach(System.out::println);
		//list.forEach(element -> System.out.println(element));
		//list.forEach((element) -> { System.out.println(element); });
		//list.forEach((String element) -> { System.out.println(element); } );
		
	
		
		
		


	}

}
