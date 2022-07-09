//4. Write a Java program to retrieve an element (at a specified index) from a given array list.

package com.java.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Assignment4 {

	public static void main(String[] args) {

		List<Integer> itr = new ArrayList<>();
		itr.add(10);
		itr.add(20);
		itr.add(30);
		itr.add(40);
		itr.add(50);
		System.out.println("Array List: "+itr);
		
		Integer i = itr.get(0);
		System.out.println("First element of Arraylist: "+i);
		
		System.out.println("Last element of Arraylist: "+itr.get(4));
	}

}
