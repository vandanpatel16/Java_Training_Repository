//3. Write a Java program to insert an element into the array list at the first position. 

package com.java.arraylist;

import java.util.ArrayList;

public class Assignment3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> itr = new ArrayList<>();
		itr.add(10);
		itr.add(20);
		itr.add(30);
		itr.add(40);
		itr.add(50);
		System.out.println("Array List: "+itr);
		
		// it will add the value 5 on that particular index
		itr.add(0, 5);
		System.out.println("Entering value at 1st element of the Array List: "+itr);
		
		itr.add(3, 25);
		System.out.println("Entering value at 3rd position of the Array List: "+itr);
	}

}
