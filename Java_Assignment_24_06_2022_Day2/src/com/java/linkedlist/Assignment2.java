//2. Write a Java program to insert elements into the linked list at the first and last position. 

package com.java.linkedlist;

import java.util.LinkedList;

public class Assignment2 {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("Orange");
		list.add("Pineapple");
		list.add("Mango");
		list.add("Cherry");
		list.add("blueberries");
		System.out.println("Linked list: "+list);
		
		list.addFirst("Apple");
		System.out.println("Adding one value on 1st element: "+list);
		
		list.addLast("Avocado");
		System.out.println("Adding one value on last element: "+list);
	}

}
