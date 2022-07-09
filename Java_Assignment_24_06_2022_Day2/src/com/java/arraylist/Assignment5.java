//5. Write a Java program to update specific array element by given element. 

package com.java.arraylist;

import java.util.ArrayList;

public class Assignment5 {

	public static void main(String[] args) {
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("Apple");
		str.add("Orange");
		str.add("Mango");
		str.add("Pineapple");
		str.add("Cherry");
		str.add("blueberries");
		str.add("avocado");
		System.out.println("Elements of the Array list: "+str);
		
		// it will replace the value of 2nd index with the new value
		str.set(2, "watermelon");
		System.out.println("3rd Elements is updated in the Array list: "+str);
	}

}
