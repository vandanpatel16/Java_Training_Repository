/*Java FileWriter class is used to write character-oriented data to a file.
It is character-oriented class which is used for file handling in java.
Unlike FileOutputStream class, you don't need to convert string into byte array because it provides method to write string directly.
*/

package com.java.ioandnio;

import java.io.FileWriter;
import java.io.IOException;

public class Assignment14_filewriter {

	public static void main(String[] args) {
		
		String data = "Good Night";
		try {
			FileWriter out = new FileWriter("D:\\STS_4\\Java_Training\\Java_Assignment_27_06_2022_Day3\\src\\com\\java\\filewriter.txt");
			out.write(data);
			System.out.println("Please check the filewriter.txt file.");
			out.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
