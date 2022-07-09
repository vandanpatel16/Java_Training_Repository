//5. Write a Java program to check whether a given string ends with the contents of another string.

package com.java.string;

public class Program5 {

	public static void main(String[] args) {

		String st1 = "Trees";
		String st2 = "Tree";
		String endst = "ees";
		
		boolean end1 = st1.endsWith(endst);
		boolean end2 = st2.endsWith(endst);
		
		System.out.println("\"" + st1 + "\"" + " ends with " + "'" + endst + "'" +"? "+end1);
		System.out.println("\"" + st2 + "\"" + " ends with " + "'" + endst + "'" +"? "+end2);
	}

}
