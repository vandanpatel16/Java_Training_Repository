//6. Write a Java program to remove the third element from a array list.

package com.java.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Assignment6 {

	public static void main(String[] args) {
		
		List<String> str = new ArrayList<String>();
		str.add("Apple");
		str.add("Orange");
		str.add("Pineapple");
		str.add("Mango");
		str.add("Cherry");
		str.add("blueberries");
		str.add("avocado");
		System.out.println("Elements of the Array list: "+str);
		
		str.remove(2);
		System.out.println("After removing the 3rd element from the array list: "+ str);
	}

}
