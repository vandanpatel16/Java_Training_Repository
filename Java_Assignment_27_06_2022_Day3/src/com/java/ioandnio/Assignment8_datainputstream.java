/*Java DataInputStream class allows an application to read primitive data from the input stream in a machine-independent way.
Java application generally uses the data output stream to write data that can later be read by a data input stream.
*/


package com.java.ioandnio;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Assignment8_datainputstream {

	public static void main(String[] args) {
		
		try {
			InputStream input = new FileInputStream("D:\\STS_4\\Java_Training\\Java_Assignment_27_06_2022_Day3\\src\\com\\java\\bufferedoutput.txt");
			DataInputStream dis = new DataInputStream(input);
			
			int cnt = input.available();
			byte[] byt = new byte[cnt];
			dis.read(byt);
			
			for (byte array:byt) {
				System.out.print((char)array);
			}
			dis.close();
			input.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
