/*Write A array list program using these methods

size()    Returns the length of the array list.
sort()    Sort the array list elements.
clone()    Creates a new array list with the same element, size, and capacity.
contains()    Searches the array list for the specified element and returns a boolean result.
ensureCapacity()    Specifies the total element the array list can contain.
isEmpty()    Checks if the array list is empty.
indexOf()    Searches a specified element in an array list and returns the index of the element.*/

package com.java.arraylist;

import java.util.ArrayList;
import java.util.Comparator;

public class ArraylistProgram1 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		
//		1. ensureCapacity()    Specifies the total element the array list can contain.
		list.ensureCapacity(3);
		System.out.println("1. Minimum Capacity in the Array List: "+list);
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("Array List: "+list);
		
//		2. size()    Returns the length of the array list.
		System.out.println("2. size of the Array list: "+ list.size());
		
//		3. contains()    Searches the array list for the specified element and returns a boolean result.
		System.out.println("3. Does Arraylist have value 2: "+list.contains(2));
		System.out.println("   Does Arraylist have value 10: "+list.contains(10));
		
//		4. isEmpty()    Checks if the array list is empty.
		System.out.println("4. Checking the Arraylist is empty? "+list.isEmpty());
		
//		5. indexOf()    Searches a specified element in an array list and returns the index of the element.
		System.out.println("5. Searches a specified element in an array list is in which postion: "+list.indexOf(3));
		
//		6. clone()    Creates a new array list with the same element, size, and capacity.
		ArrayList<Integer> list1 = (ArrayList<Integer>)list.clone();
		System.out.println("6. Old Arraylist: "+list);
		System.out.println("   New Cloned Arraylist: "+list1);
		
//		7. sort()    Sort the array list elements.
		list.sort(Comparator.reverseOrder());
		System.out.println("7. Sorting in reverse order: "+list);
//		other way to clone
		System.out.println("8. latest cloned Arraylist: "+list.clone());
			
	}

}
