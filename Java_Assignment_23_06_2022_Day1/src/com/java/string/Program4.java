//4. Write a Java program to create a new String object with the contents of a character array. 

package com.java.string;

public class Program4 {

	public static void main(String[] args) {

		char[] chr = new char[] {'1','2','3','4','5'};
		
		String st = String.copyValueOf(chr, 1, 4);
		System.out.println("Character Array from index 1 to next 4 values: "+st+".");
	}

}
