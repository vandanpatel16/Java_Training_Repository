//1. Write a Java program to create a new array list, add some colors (string) and print out the collection.

package com.java.arraylist;

import java.util.ArrayList;

public class Assignment1 {

	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<>();
		str.add("Red");
		str.add("blue");
		str.add("Yellow");
		str.add("Green");
		str.add("Orange");
		str.add("White");
		str.add("Black");
		System.out.println("Collection of colours: "+str);
		
	}

}
