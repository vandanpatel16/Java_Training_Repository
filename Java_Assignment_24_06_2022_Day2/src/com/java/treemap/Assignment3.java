//3. Write a Java program to get a reverse order view of the keys contained in a given map. 

package com.java.treemap;

import java.util.TreeMap;

public class Assignment3 {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		map.put(1, "Apple");
		map.put(2, "Orange");
		map.put(3, "Pineapple");
		map.put(4, "Mango");
		map.put(5, "Cherry");
		map.put(6, "blueberries");
		map.put(7, "Avocado");
		System.out.println("TreeMap list: "+map);
		
		System.out.println("Reverse order view of the Keys: "+ map.descendingKeySet());
	}

}
