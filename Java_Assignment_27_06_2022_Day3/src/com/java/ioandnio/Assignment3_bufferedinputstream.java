/*Java BufferedInputStream class is used to read information from stream.
It internally uses buffer mechanism to make the performance fast.
When the bytes from the stream are skipped or read, the internal buffer automatically refilled from the contained input stream, many bytes at a time.
When a BufferedInputStream is created, an internal buffer array is created.*/

package com.java.ioandnio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Assignment3_bufferedinputstream {

	public static void main(String[] args) {
		
		int data = 0;
		
		try {
			FileInputStream file = new FileInputStream("D:\\STS_4\\Java_Training\\Java_Assignment_27_06_2022_Day3\\src\\com\\java\\bufferedinput.txt");
			BufferedInputStream buffer = new BufferedInputStream(file);
			
			while((data = buffer.read())!=-1) {
				System.out.print((char)data);
			}
			buffer.close();
			file.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
