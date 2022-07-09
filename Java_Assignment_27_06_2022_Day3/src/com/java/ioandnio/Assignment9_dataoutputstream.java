/*Java DataOutputStream class allows an application to write primitive Java data types to the output stream in a machine-independent way.
Java application generally uses the data output stream to write data that can later be read by a data input stream.
*/


package com.java.ioandnio;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Assignment9_dataoutputstream {

	public static void main(String[] args) {
		
		String str = "Good Morning";
		byte[] byt = str.getBytes();
		try {
			FileOutputStream file = new FileOutputStream("D:\\STS_4\\Java_Training\\Java_Assignment_27_06_2022_Day3\\src\\com\\java\\dataoutput.txt");
			DataOutputStream data = new DataOutputStream(file);
			data.write(byt);
			System.out.println("Check the dataoutput.txt file");
			data.flush();
			file.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
