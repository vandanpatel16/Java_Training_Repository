//6. Write a Java program to get the first and last occurrence of the specified elements in a linked list. 

package com.java.linkedlist;

import java.util.LinkedList;

public class Assignment6 {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("Apple");
		list.add("Orange");
		list.add("Pineapple");
		list.add("Mango");
		list.add("Cherry");
		list.add("blueberries");
		list.add("Avocado");
		System.out.println("Linked List: "+list);
		
		Object a = list.getFirst();
		System.out.println("1st element in the linked list: "+ a);
		
		System.out.println("last element in the linked list: "+list.getLast());
	}

}
