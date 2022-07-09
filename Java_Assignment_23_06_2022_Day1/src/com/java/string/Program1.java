//1. Write a Java program to test if a given string contains the specified sequence of char values. 

package com.java.string;

public class Program1 {

	public static void main(String[] args) {
		
		String s1 = "PHP Exercises and Python Exercises";
		String s2 = "Python";
		System.out.println("Original String: "+s1);
		System.out.println("Specified sequence of char values: "+s2);
		System.out.println(s1.contains(s2));
	}

}
