//1. Write a Java program to insert the specified element at the specified position in the linked list.

package com.java.linkedlist;

import java.util.LinkedList;

public class Assignment1 {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		list.add("Apple");
		list.add("Orange");
		list.add("Pineapple");
		list.add("Mango");
		list.add("Cherry");
		list.add("blueberries");
		list.add("avocado");
		System.out.println("Linked list: "+list);
		
		// it will add the new value on that element
		list.add(3, "Watermelon");
		System.out.println("After modification in the Linked list: "+list);
		
	}

}
