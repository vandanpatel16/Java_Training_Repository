//7. Write a Java program to compare a given string to another string, ignoring case considerations. 

package com.java.string;

public class Program7 {

	public static void main(String[] args) {

		String str1 = "India";
		String str2 = "United Kingdom";
		String str3 = "United States of America";
		String str4 = "india";
		
		boolean eq1 = str1.equalsIgnoreCase(str2);
		boolean eq2 = str1.equalsIgnoreCase(str3);
		boolean eq3 = str2.equalsIgnoreCase(str3);
		boolean eq4 = str1.equalsIgnoreCase(str4);
		
		System.out.println("\"" + str1 + "\"" + " equals " + "\"" + str2 + "\"" +"? "+eq1);
		System.out.println("\"" + str1 + "\"" + " equals " + "\"" + str3 + "\"" +"? "+eq2);
		System.out.println("\"" + str2 + "\"" + " equals " + "\"" + str3 + "\"" +"? "+eq3);
		System.out.println("\"" + str1 + "\"" + " equals " + "\"" + str4 + "\"" +"? "+eq4);
	}

}
