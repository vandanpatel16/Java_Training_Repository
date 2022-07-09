//7. Write a Java program to search an element in a array list. 

package com.java.arraylist;

import java.util.ArrayList;

public class Assignment7 {

	public static void main(String[] args) {
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("Apple");
		str.add("Orange");
		str.add("Pineapple");
		str.add("Mango");
		str.add("Cherry");
		str.add("blueberries");
		str.add("avocado");
		System.out.println("Elements of the Array list: "+str);
		
		if (str.contains("Apple")) {
			System.out.println("Found the element");
		}
		else {
			System.out.println("There is no such element");
		}
	}

}
