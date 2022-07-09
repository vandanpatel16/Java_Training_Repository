//3. Write a Java program to compare a given string to the specified string buffer. 

package com.java.string;

public class Program3 {

	public static void main(String[] args) {

		String s1 = "www.google.com";
		String s2 = "WWW.google.com";
		
		StringBuffer sb = new StringBuffer(s1);
		System.out.println("Comparing "+s1+" and "+sb+": " + s1.contentEquals(sb));
		System.out.println("Comparing "+s2+" and "+sb+": " + s2.contentEquals(sb));
	}

}
