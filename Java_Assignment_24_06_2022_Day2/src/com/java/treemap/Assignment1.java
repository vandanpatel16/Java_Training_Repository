//1. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map

package com.java.treemap;

import java.util.TreeMap;

public class Assignment1 {

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
		
		Object a = map.firstEntry();
		System.out.println("Greatest Key: "+a);
		
		System.out.println("Least Key: "+map.lastEntry());
		
	}

}
