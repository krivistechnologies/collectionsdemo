package com.krivis.collection.list;


import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		List<String> vector = new Vector<String>();

		//adding string objects using add
		vector.add("one"); // o index
		vector.add("two"); // 1 index
		vector.add("three"); // 2 index
		vector.add("four"); // 3 index
		vector.add("five"); // 4th index
		vector.add("six"); // 5 index
		
		//System.out.println(vector);
		

		//vector.add("five"); // 6 index
		
		//System.out.println("list = " + vector);
		
		
		int vectorSize = vector.size(); // to get size or number of elements
		//System.out.println("Size = " +  vectorSize);
		
		//System.out.println(vector.indexOf("five"));
		//boolean objectAvalability = vector.contains("threeeee");
		//System.out.println(objectAvalability);
		
		//System.out.println(vector.isEmpty());
		//vector.clear();
		//System.out.println(vector.isEmpty());
		
		/*
		for(String element : vector) {
			System.out.println(element);
		}

		
		for(int index = 0;index < vectorSize ;  index++) {
			System.out.println(vector.get(index));
		}

		
		Iterator<String> iterator = vector.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		
		
		ListIterator<String> listIterator = vector.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
			
		}
		
		*/
		
		//vector.forEach(System.out::println);
		//vector.forEach( element -> System.out.println(element));
		//vector.forEach((element) -> { System.out.println(element); }); 
		vector.forEach((String element) -> { System.out.println(element);});
		
		
		

	}

}
