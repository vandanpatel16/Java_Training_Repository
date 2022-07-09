//2. Write a Java program to compare a given string to the specified character sequence. 

package com.java.string;

public class Program2 {

	public static void main(String[] args) {

		String s1 = "www.google.com";
		String s2 = "WWW.google.com";
		
		CharSequence chr = "www.google.com";
		System.out.println("Comparing "+s1+" and "+chr+": " + s1.contentEquals(chr));
		System.out.println("Comparing "+s2+" and "+chr+": " + s2.contentEquals(chr));
	}

}
