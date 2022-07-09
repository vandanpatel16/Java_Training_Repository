/*Java SequenceInputStream class is used to read data from multiple streams.
It reads data sequentially (one by one).*/

package com.java.ioandnio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class Assignment5_sequenceinputstream {

	public static void main(String[] args) {
		
		int data = 0;
		
		try {
			FileInputStream file = new FileInputStream("D:\\STS_4\\Java_Training\\Java_Assignment_27_06_2022_Day3\\src\\com\\java\\bufferedinput.txt");
			FileInputStream file1 = new FileInputStream("D:\\STS_4\\Java_Training\\Java_Assignment_27_06_2022_Day3\\src\\com\\java\\bufferedoutput.txt");
			SequenceInputStream sis = new SequenceInputStream(file, file1);
			
			while((data=sis.read())!=-1) {
				System.out.print((char)data);
			}
			sis.close();
			file1.close();
			file.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
