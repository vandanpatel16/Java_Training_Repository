/*Java FilterInputStream class implements the InputStream.
It contains different sub classes as BufferedInputStream, DataInputStream for providing additional functionality.
So it is less used individually.*/


package com.java.ioandnio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class Assignment10_filterinputstream {

	public static void main(String[] args) {
		
		int data = 0;
		try {
			FileInputStream file = new FileInputStream("D:\\STS_4\\Java_Training\\Java_Assignment_27_06_2022_Day3\\src\\com\\java\\dataoutput.txt");
			FilterInputStream fis = new BufferedInputStream(file);
			
			while((data = fis.read())!=-1) {
				System.out.print((char)data);
			}
			fis.close();
			file.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
