//3. Write a Java program to insert the specified element at the front of a linked list. 

package com.java.linkedlist;

import java.util.LinkedList;

public class Assignment3 {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<String>();
		list.add("Orange");
		list.add("Pineapple");
		list.add("Mango");
		list.add("Cherry");
		list.add("blueberries");
		System.out.println("Linked list: "+list);
		
		list.offerFirst("Apple");
		System.out.println("New list: "+list);
	}

}
