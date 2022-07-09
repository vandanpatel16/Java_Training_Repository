/*Java BufferedOutputStream class is used for buffering an output stream.
It internally uses buffer to store data.
It adds more efficiency than to write data directly into a stream. 
So, it makes the performance fast.
*/


package com.java.ioandnio;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Assignment4_bufferedoutputstream {

	public static void main(String[] args) {
		
		String str = "Good Night, Everyone.";
		
		try {
			FileOutputStream file = new FileOutputStream("D:\\STS_4\\Java_Training\\Java_Assignment_27_06_2022_Day3\\src\\com\\java\\bufferedoutput.txt");
			BufferedOutputStream buffer = new BufferedOutputStream(file);
			
			byte data[] = str.getBytes();
			buffer.write(data);
			buffer.flush();
			file.close();
			System.out.println("Check the bufferedoutput.txt file");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
