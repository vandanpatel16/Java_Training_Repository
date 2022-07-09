//2. Write a Java program to iterate through all elements in a array list. 

package com.java.arraylist;

import java.util.ArrayList;

public class Assignment2 {

	public static void main(String[] args) {
		
		ArrayList<String> str = new ArrayList<>();
		str.add("Red");
		str.add("blue");
		str.add("Yellow");
		str.add("Green");
		str.add("Orange");
		str.add("White");
		str.add("Black");

		for (String s:str) {
			System.out.println("Colour is: "+s);
		}
		
	}

}
