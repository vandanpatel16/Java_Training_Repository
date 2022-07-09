//5. Write a Java program to insert some elements at the specified position into a linked list.

package com.java.linkedlist;

import java.util.LinkedList;

public class Assignment5 {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Orange");
		list.add("Pineapple");
		list.add("Mango");
		list.add("Cherry");
		list.add("blueberries");
		System.out.println("Linked list: "+list);
		
		list.add(0, "Apple");
		System.out.println("New list: "+list);
		
		LinkedList<String> list1 = new LinkedList<String>();
		list1.add("Avocado");
		list1.add("Watermelon");
		
		list.addAll(3, list1);
		System.out.println("Latest list: "+list);
		
	}

}
