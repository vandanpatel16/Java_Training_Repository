//4. Write a Java program to insert the specified element at the end of a linked list.

package com.java.linkedlist;

import java.util.LinkedList;

public class Assignment4 {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Orange");
		list.add("Pineapple");
		list.add("Mango");
		list.add("Cherry");
		list.add("blueberries");
		System.out.println("Linked list: "+list);
		
		list.offerLast("Apple");
		System.out.println("New list: "+list);
	}

}
