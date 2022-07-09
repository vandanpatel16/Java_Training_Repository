//7. Write a Java program to display the elements and their positions in a linked list.

package com.java.linkedlist;

import java.util.LinkedList;

public class Assignment7 {

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
		
		for (int i=0; i<list.size();i++) {
			System.out.println("Element at index "+i+": "+list.get(i));
		}
	}

}
