/*Java FileOutputStream is an output stream used for writing data to a file.
If you have to write primitive values into a file, use FileOutputStream class.
You can write byte-oriented as well as character-oriented data through FileOutputStream class.
*/

package com.java.ioandnio;

import java.io.FileOutputStream;
import java.io.IOException;

public class Assignment2_fileoutputstream {

	public static void main(String[] args) {
			
		String str = "Thank you for attending the Java Session.";
	
		try {
		FileOutputStream fileout = new FileOutputStream("D:\\STS_4\\Java_Training\\Java_Assignment_27_06_2022_Day3\\src\\com\\java\\fileoutput.txt");
		
		byte data[] = str.getBytes();
		fileout.write(data);
		fileout.close();
		System.out.println("Check the fileoutput.txt file");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
