/*Java BufferedReader class is used to read the text from a character-based input stream.
It can be used to read data line by line by readLine() method.
It makes the performance fast. 
It inherits Reader class.*/

package com.java.ioandnio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Assignment17_bufferedreader {

	public static void main(String[] args) {
		
		int data = 0;
		try {
			FileReader file = new FileReader("D:\\STS_4\\Java_Training\\Java_Assignment_27_06_2022_Day3\\src\\com\\java\\bufferedwriter.txt");
			BufferedReader buff = new BufferedReader(file);
			while((data = buff.read())!=-1) {
				System.out.print((char)data);
			}
			buff.close();
			file.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
